package com.websarva.wings.android.testretrofit;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by snishimura on 16/04/09.
 */
public interface TestInterface {
    String END_POINT = "http://b.hatena.ne.jp";
    String TARGET_URL = "http://b.hatena.ne.jp/ctop/it";

    @GET("/entry/jsonlite/")
    Call<BookmarkContainer> getBookmarksWithUrl(@Query("url") String target);
}