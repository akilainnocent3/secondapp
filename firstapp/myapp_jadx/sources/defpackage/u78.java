package defpackage;

import com.sporty.android.sportynews.data.NewsArticleList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u78 {

    public static final class a extends u78 {
        public static final a a = new a();
    }

    public static final class b extends u78 {
        public static final b a = new b();
    }

    public static final class c extends u78 {
        public final NewsArticleList a;

        static {
            int i = NewsArticleList.$stable;
        }

        public c(NewsArticleList newsArticleList) {
            newsArticleList.getClass();
            this.a = newsArticleList;
        }
    }
}
