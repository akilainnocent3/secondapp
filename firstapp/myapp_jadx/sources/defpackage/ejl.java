package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.sportynews.data.ArticleItem;
import com.sporty.android.sportynews.data.PreviewImageItem;
import com.sporty.android.sportynews.data.TagItem;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ejl extends e64<peb0> {
    public final ArticleItem d;
    public final SportyNewsListFragment e;
    public final mr7 f;
    public jvd0 i;
    public jvd0 v;

    public ejl(ArticleItem articleItem, SportyNewsListFragment sportyNewsListFragment, mr7 mr7Var) {
        articleItem.getClass();
        mr7Var.getClass();
        this.d = articleItem;
        this.e = sportyNewsListFragment;
        this.f = mr7Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        String url;
        Object next;
        peb0 peb0Var = (peb0) g6i0Var;
        peb0Var.getClass();
        TextView textView = peb0Var.i;
        TextView textView2 = peb0Var.c;
        TextView textView3 = peb0Var.v;
        ConstraintLayout constraintLayout = peb0Var.a;
        ArticleItem articleItem = this.d;
        textView.setText(articleItem.getHeadline());
        String teaser = articleItem.getTeaser();
        int i2 = 8;
        if (teaser == null || teaser.length() <= 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(articleItem.getTeaser());
            textView2.setVisibility(0);
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ajl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ejl ejlVar = this.a;
                mr7 mr7Var = ejlVar.f;
                ArticleItem articleItem2 = ejlVar.d;
                mr7Var.b(articleItem2.getId(), articleItem2.getArticleType(), true);
            }
        });
        TextView textView4 = peb0Var.d;
        Context context = constraintLayout.getContext();
        context.getClass();
        textView4.setText(ytc0.b(context, articleItem.getPublishTime()));
        List<TagItem> tags = articleItem.getTags();
        if (tags == null || !(!tags.isEmpty())) {
            textView3.setVisibility(8);
        } else {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            textView3.setText(ytc0.d(context2, (TagItem) CollectionsKt.firstOrNull(articleItem.getTags()), this.f));
            textView3.setVisibility(0);
        }
        List<PreviewImageItem> previewImages = articleItem.getPreviewImages();
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
            if (previewImageItem == null || (url = previewImageItem.getUrl()) == null) {
                url = "";
            }
        } else {
            url = "";
        }
        Context context3 = constraintLayout.getContext();
        context3.getClass();
        Drawable drawableC = s0b.c(context3, R.drawable.spm_bg_no_data, null, null, 6);
        u7n u7nVarB = drawableC != null ? zbn.b(drawableC) : null;
        Context context4 = constraintLayout.getContext();
        context4.getClass();
        nan.a aVar = new nan.a(context4);
        aVar.c = url;
        abn.a(aVar, false);
        aVar.d(u7nVarB);
        aVar.b(u7nVarB);
        aVar.d = new djl(peb0Var, peb0Var, peb0Var, peb0Var, peb0Var, peb0Var, this);
        this.i = ej5.c(lrn.b(this.e), null, null, new bjl(peb0Var, aVar.a(), null), 3);
        AppCompatImageView appCompatImageView = peb0Var.e;
        String articleType = articleItem.getArticleType();
        ey0[] ey0VarArr = ey0.a;
        if (Intrinsics.g(articleType, "Video") && url.length() > 0) {
            i2 = 0;
        }
        appCompatImageView.setVisibility(i2);
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spm_item_hero_article;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        int i = R.id.article_blur_bg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.article_blur_bg, view);
        if (appCompatImageView != null) {
            i = R.id.article_container;
            if (((FrameLayout) h5e.a(R.id.article_container, view)) != null) {
                i = R.id.article_content;
                TextView textView = (TextView) h5e.a(R.id.article_content, view);
                if (textView != null) {
                    i = R.id.article_date;
                    TextView textView2 = (TextView) h5e.a(R.id.article_date, view);
                    if (textView2 != null) {
                        i = R.id.article_play;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.article_play, view);
                        if (appCompatImageView2 != null) {
                            i = R.id.article_preview_image;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.article_preview_image, view);
                            if (appCompatImageView3 != null) {
                                i = R.id.article_title;
                                TextView textView3 = (TextView) h5e.a(R.id.article_title, view);
                                if (textView3 != null) {
                                    i = R.id.article_type;
                                    TextView textView4 = (TextView) h5e.a(R.id.article_type, view);
                                    if (textView4 != null) {
                                        return new peb0((ConstraintLayout) view, appCompatImageView, textView, textView2, appCompatImageView2, appCompatImageView3, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.e64
    public final void j(a9l a9lVar) {
        ((b9l) a9lVar).a = null;
        jvd0 jvd0Var = this.i;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        jvd0 jvd0Var2 = this.v;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
    }
}
