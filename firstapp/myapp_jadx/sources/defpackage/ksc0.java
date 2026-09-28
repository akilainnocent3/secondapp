package defpackage;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.sportynews.data.ArticleItem;
import com.sporty.android.sportynews.data.HeroArticleList;
import com.sporty.android.sportynews.data.NewsArticleList;
import com.sporty.android.sportynews.data.SubArticleList;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsListFragment$collectData$2", f = "SportyNewsListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ksc0 extends tje0 implements Function2<u78, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SportyNewsListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksc0(SportyNewsListFragment sportyNewsListFragment, v1b<? super ksc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsListFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ksc0 ksc0Var = new ksc0(this.b, v1bVar);
        ksc0Var.a = obj;
        return ksc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u78 u78Var, v1b<? super Unit> v1bVar) {
        return ((ksc0) create(u78Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String string;
        List<ArticleItem> articleList;
        SportyNewsListFragment sportyNewsListFragment = this.b;
        a380 a380Var = sportyNewsListFragment.z;
        u78 u78Var = (u78) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String lowerCase = null;
        if (u78Var instanceof u78.c) {
            ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
            sportyNewsListFragment.s0("", false, false);
            if (!sportyNewsListFragment.J) {
                NewsArticleList newsArticleList = ((u78.c) u78Var).a;
                SubArticleList subArticleList = newsArticleList.getSubArticleList();
                String nextCursor = subArticleList != null ? subArticleList.getNextCursor() : null;
                sportyNewsListFragment.C = nextCursor != null ? nextCursor : "";
                sportyNewsListFragment.o0();
                sportyNewsListFragment.p0().k();
                a380Var.r();
                HeroArticleList heroArticleList = newsArticleList.getHeroArticleList();
                if (heroArticleList != null && (articleList = heroArticleList.getArticleList()) != null && !articleList.isEmpty()) {
                    for (ArticleItem articleItem : articleList) {
                        a380Var.m(new ejl(articleItem, sportyNewsListFragment, sportyNewsListFragment.P));
                        sportyNewsListFragment.K.add(articleItem.getId());
                    }
                    a380Var.m(new vte());
                }
                sportyNewsListFragment.t0(newsArticleList.getSubArticleList());
                sportyNewsListFragment.p0().i(a380Var);
                Bundle arguments = sportyNewsListFragment.getArguments();
                if (arguments != null && (string = arguments.getString("articleId")) != null && string.length() > 0) {
                    String string2 = arguments.getString("type");
                    if (string2 != null) {
                        lowerCase = string2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    ey0[] ey0VarArr = ey0.a;
                    String lowerCase2 = "Article".toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    NavHostFragment.a.a(sportyNewsListFragment).f(Intrinsics.g(lowerCase, lowerCase2) ? R.id.news_to_article_detail_fragment : R.id.news_to_video_detail_fragment, vj5.a(new Pair("articleId", arguments.getString("articleId"))));
                }
            }
            sportyNewsListFragment.F = false;
        } else if (u78Var instanceof u78.a) {
            String strD = sn5.d(sportyNewsListFragment, R.string.sporty_news__no_articles_found, new Object[0]);
            ohp<Object>[] ohpVarArr2 = SportyNewsListFragment.R;
            sportyNewsListFragment.s0(strD, true, false);
            sportyNewsListFragment.F = false;
        } else {
            if (!(u78Var instanceof u78.b)) {
                uhc.a();
                return null;
            }
            String strD2 = sn5.d(sportyNewsListFragment, R.string.sporty_news__no_articles_found, new Object[0]);
            ohp<Object>[] ohpVarArr3 = SportyNewsListFragment.R;
            sportyNewsListFragment.s0(strD2, true, false);
            sportyNewsListFragment.F = false;
        }
        return Unit.a;
    }
}
