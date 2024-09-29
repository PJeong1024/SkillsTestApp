package com.jdw.skillstestapp.di


import android.content.ContentResolver
import android.content.Context
import androidx.room.Room
import com.google.ai.client.generativeai.GenerativeModel
import com.jdw.skillstestapp.BuildConfig
import com.jdw.skillstestapp.data.AppDatabase
import com.jdw.skillstestapp.data.ChatMessageDao
import com.jdw.skillstestapp.data.UserImgDao
import com.jdw.skillstestapp.repository.MyAppRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideContentResolver(@ApplicationContext context: Context): ContentResolver {
        return context.contentResolver
    }

    @Provides
    @Singleton
    fun provideMyAppRepository(
        contentResolver: ContentResolver,   // Inject ContentResolver here
        userImgDao: UserImgDao,
        chatMessageDao: ChatMessageDao
    ): MyAppRepository {
        return MyAppRepository(contentResolver, userImgDao, chatMessageDao)
    }

    @Provides
    @Singleton
    fun provideImgInfoDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "app_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideUserImgDao(appDatabase: AppDatabase): UserImgDao {
        return appDatabase.userImgDao()
    }

    @Provides
    @Singleton
    fun provideChatDao(appDatabase: AppDatabase): ChatMessageDao {
        return appDatabase.chatMessageDao()
    }

    @Provides
    @Singleton
    fun provideGenerativeModel(): GenerativeModel {
        return GenerativeModel(modelName = "gemini-1.5-flash", apiKey = BuildConfig.GEMINI_API_KEY)
    }

//    val generativeModel = GenerativeModel(
//        modelName = "gemini-pro",
//        apiKey = BuildConfig.GEMINI_API_KEY
//    )

//    @Singleton
//    @Provides
//    fun provideRecipeDao(recipeDatabase: RecipeDatabase): RecipeDao = recipeDatabase.recipeDao()
//
//    @Singleton
//    @Provides
//    fun provideRecipeDatabase(@ApplicationContext context: Context): RecipeDatabase =
//        Room.databaseBuilder(context, RecipeDatabase::class.java, "recipe_db")
//            .fallbackToDestructiveMigration().build()

//
//    @Singleton
//    @Provides
//    fun provideGeminiApiGenerativeModel(): GenerativeModel {
//        return GenerativeModel(
//            modelName = "gemini-pro",
//            apiKey = BuildConfig.GEMINI_API_KEY
//        )
//    }

//    @Singleton
//    @Provides
//    fun provideFirebaseBookRepository(): FirebaseBookRepository {
//        return FirebaseBookRepository(
//            queryBook = FirebaseFirestore.getInstance().collection("books")
//        )
//    }
//
//    @Singleton
//    @Provides
//    fun provideBookRepository(api: BooksApi): BookRepository {
//        return BookRepository(api)
//    }
//
//    @Singleton
//    @Provides
//    fun provideBookApi(): BooksApi {
//        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build().create(BooksApi::class.java)
//    }

}