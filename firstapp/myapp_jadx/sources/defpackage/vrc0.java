package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.sporty.android.sportynews.data.ArticleDetailItem;
import com.sporty.android.sportynews.data.PreviewImageItem;
import com.sporty.android.sportynews.data.RelatedItem;
import com.sporty.android.sportynews.data.TagItem;
import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;
import com.sportybet.android.gp.tz.R;
import im.delight.android.webview.AdvancedWebView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment$collectData$2", f = "SportyNewsArticleDetailFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vrc0 extends tje0 implements Function2<dy0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SportyNewsArticleDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrc0(SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment, v1b<? super vrc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsArticleDetailFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vrc0 vrc0Var = new vrc0(this.b, v1bVar);
        vrc0Var.a = obj;
        return vrc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(dy0 dy0Var, v1b<? super Unit> v1bVar) {
        return ((vrc0) create(dy0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        String url;
        final SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment = this.b;
        mpe0 mpe0Var = sportyNewsArticleDetailFragment.B;
        dy0 dy0Var = (dy0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = 1;
        if (dy0Var instanceof dy0.a) {
            ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
            String str = "";
            sportyNewsArticleDetailFragment.n0("", false);
            ArticleDetailItem articleDetailItem = ((dy0.a) dy0Var).a;
            String shareLink = articleDetailItem.getShareLink();
            if (shareLink == null) {
                shareLink = "";
            }
            sportyNewsArticleDetailFragment.J = shareLink;
            SportyNewsArticleDetailFragment.b bVar = sportyNewsArticleDetailFragment.M;
            final keb0 keb0VarM0 = sportyNewsArticleDetailFragment.m0();
            List<PreviewImageItem> previewImages = articleDetailItem.getPreviewImages();
            if (previewImages != null) {
                Iterator<T> it = previewImages.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long width = ((PreviewImageItem) next).getWidth();
                        do {
                            Object next2 = it.next();
                            long width2 = ((PreviewImageItem) next2).getWidth();
                            if (width < width2) {
                                next = next2;
                                width = width2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                PreviewImageItem previewImageItem = (PreviewImageItem) next;
                if (previewImageItem != null && (url = previewImageItem.getUrl()) != null) {
                    str = url;
                }
            }
            Context context = sportyNewsArticleDetailFragment.m0().a.getContext();
            context.getClass();
            Drawable drawableC = s0b.c(context, R.drawable.spm_bg_no_data, null, null, 6);
            u7n u7nVarB = drawableC != null ? zbn.b(drawableC) : null;
            Context contextRequireContext = sportyNewsArticleDetailFragment.requireContext();
            contextRequireContext.getClass();
            nan.a aVar = new nan.a(contextRequireContext);
            aVar.c = str;
            abn.a(aVar, false);
            aVar.d(u7nVarB);
            aVar.b(u7nVarB);
            aVar.d = new zrc0(keb0VarM0, sportyNewsArticleDetailFragment, keb0VarM0, keb0VarM0);
            sportyNewsArticleDetailFragment.C = ej5.c(ebs.a(sportyNewsArticleDetailFragment.getLifecycle()), null, null, new xrc0(sportyNewsArticleDetailFragment, aVar.a(), null), 3);
            TextView textView = keb0VarM0.i;
            TextView textView2 = keb0VarM0.D;
            textView.setText(articleDetailItem.getHeadline());
            TextView textView3 = keb0VarM0.e;
            String byLine = articleDetailItem.getByLine();
            String str2 = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH).format(new Date(articleDetailItem.getPublishTime()));
            str2.getClass();
            textView3.setText(sn5.d(sportyNewsArticleDetailFragment, R.string.sporty_news__author_preposition, byLine, str2));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            Context contextRequireContext2 = sportyNewsArticleDetailFragment.requireContext();
            contextRequireContext2.getClass();
            List<TagItem> tags = articleDetailItem.getTags();
            if (tags == null) {
                tags = m2g.a;
            }
            ey0[] ey0VarArr = ey0.a;
            textView2.setText(ytc0.e(contextRequireContext2, tags, "Article", bVar));
            String strE = c8i0.e(keb0VarM0.a);
            str<String> strVar = sportyNewsArticleDetailFragment.E;
            if (strVar == null) {
                Intrinsics.n("contentUrl");
                throw null;
            }
            String str3 = strVar.get();
            String strA = ytc0.a(strE, ((Object) str3) + "/" + ((String) sportyNewsArticleDetailFragment.z.getValue()));
            AdvancedWebView advancedWebView = keb0VarM0.E;
            advancedWebView.setVisibility(0);
            WebSettings settings = advancedWebView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setDomStorageEnabled(true);
            gzi0 gzi0Var = sportyNewsArticleDetailFragment.I;
            if (gzi0Var == null) {
                Intrinsics.n("webViewConfigurator");
                throw null;
            }
            gzi0Var.a(advancedWebView);
            Context contextRequireContext3 = sportyNewsArticleDetailFragment.requireContext();
            contextRequireContext3.getClass();
            advancedWebView.setWebViewClient(new k0b(contextRequireContext3, strA, new mt40(sportyNewsArticleDetailFragment, i)));
            advancedWebView.loadUrl(strA);
            List<RelatedItem> related = articleDetailItem.getRelated();
            keb0 keb0VarM1 = sportyNewsArticleDetailFragment.m0();
            if (related == null || related.isEmpty()) {
                keb0VarM1.C.setVisibility(8);
                keb0VarM1.v.setVisibility(0);
            } else {
                ((x7l) mpe0Var.getValue()).k();
                a380 a380Var = new a380();
                a380Var.m(new vte());
                a380Var.m(new k250());
                Iterator<T> it2 = related.iterator();
                while (it2.hasNext()) {
                    a380Var.m(new n150((RelatedItem) it2.next(), sportyNewsArticleDetailFragment, bVar));
                }
                a380Var.m(new s6j0());
                ((x7l) mpe0Var.getValue()).i(a380Var);
                keb0VarM1.C.setVisibility(0);
                keb0VarM1.v.setVisibility(8);
            }
            keb0VarM0.f.setOnClickListener(new View.OnClickListener() { // from class: rrc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ohp<Object>[] ohpVarArr2 = SportyNewsArticleDetailFragment.N;
                    SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment2 = sportyNewsArticleDetailFragment;
                    Context contextRequireContext4 = sportyNewsArticleDetailFragment2.requireContext();
                    contextRequireContext4.getClass();
                    q090.a(contextRequireContext4, sportyNewsArticleDetailFragment2.J);
                }
            });
            keb0VarM0.A.setOnScrollChangeListener(new NestedScrollView.d() { // from class: src0
                @Override // androidx.core.widget.NestedScrollView.d
                public final void a(NestedScrollView nestedScrollView, int i2) {
                    ohp<Object>[] ohpVarArr2 = SportyNewsArticleDetailFragment.N;
                    if (i2 == 0) {
                        keb0VarM0.c.setExpanded(false, true);
                    }
                }
            });
            keb0VarM0.c.a(new AppBarLayout.g() { // from class: trc0
                @Override // com.google.android.material.appbar.AppBarLayout.b
                public final void a(int i2) {
                    ohp<Object>[] ohpVarArr2 = SportyNewsArticleDetailFragment.N;
                    if (i2 == 0) {
                        keb0VarM0.w.setScrollPosition(((Number) sportyNewsArticleDetailFragment.A.getValue()).intValue(), 0.0f, true);
                    }
                }
            });
        } else if (dy0Var instanceof dy0.b) {
            String strD = sn5.d(sportyNewsArticleDetailFragment, R.string.sporty_news__page_not_found, new Object[0]);
            ohp<Object>[] ohpVarArr2 = SportyNewsArticleDetailFragment.N;
            sportyNewsArticleDetailFragment.n0(strD, true);
        } else {
            if (!(dy0Var instanceof dy0.c)) {
                uhc.a();
                return null;
            }
            String strD2 = sn5.d(sportyNewsArticleDetailFragment, R.string.sporty_news__page_not_found, new Object[0]);
            ohp<Object>[] ohpVarArr3 = SportyNewsArticleDetailFragment.N;
            sportyNewsArticleDetailFragment.n0(strD2, true);
        }
        return Unit.a;
    }
}
