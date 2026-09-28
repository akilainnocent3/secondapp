package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.sportynews.data.PreviewImageItem;
import com.sporty.android.sportynews.data.RelatedItem;
import com.sporty.android.sportynews.data.TagItem;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n150 extends e64<ueb0> {
    public final RelatedItem d;
    public final ibs e;
    public final mr7 f;
    public jvd0 i;
    public jvd0 v;

    public n150(RelatedItem relatedItem, ibs ibsVar, mr7 mr7Var) {
        relatedItem.getClass();
        mr7Var.getClass();
        this.d = relatedItem;
        this.e = ibsVar;
        this.f = mr7Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        String url;
        Object next;
        ueb0 ueb0Var = (ueb0) g6i0Var;
        ueb0Var.getClass();
        TextView textView = ueb0Var.f;
        TextView textView2 = ueb0Var.i;
        RelatedItem relatedItem = this.d;
        textView.setText(relatedItem.getHeadline());
        TextView textView3 = ueb0Var.c;
        ConstraintLayout constraintLayout = ueb0Var.a;
        Context context = constraintLayout.getContext();
        context.getClass();
        textView3.setText(ytc0.b(context, relatedItem.getPublishTime()));
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: j150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n150 n150Var = this.a;
                mr7 mr7Var = n150Var.f;
                RelatedItem relatedItem2 = n150Var.d;
                mr7Var.b(relatedItem2.getId(), relatedItem2.getArticleType(), false);
            }
        });
        List<TagItem> tags = relatedItem.getTags();
        int i2 = 8;
        if (tags == null || !(!tags.isEmpty())) {
            textView2.setVisibility(8);
        } else {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            textView2.setText(ytc0.d(context2, (TagItem) CollectionsKt.firstOrNull(relatedItem.getTags()), this.f));
            textView2.setVisibility(0);
        }
        List<PreviewImageItem> previewImages = relatedItem.getPreviewImages();
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
        aVar.d = new m150(ueb0Var, ueb0Var, ueb0Var, ueb0Var, ueb0Var, ueb0Var, this);
        this.i = ej5.c(lrn.b(this.e), null, null, new k150(ueb0Var, aVar.a(), null), 3);
        AppCompatImageView appCompatImageView = ueb0Var.e;
        String articleType = relatedItem.getArticleType();
        ey0[] ey0VarArr = ey0.a;
        if (Intrinsics.g(articleType, "Video") && url.length() > 0) {
            i2 = 0;
        }
        appCompatImageView.setVisibility(i2);
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spm_item_sub_article;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        return ueb0.a(view);
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
