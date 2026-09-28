package com.sportybet.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f00;
import defpackage.hwr;
import defpackage.mpe0;
import defpackage.pr60;
import defpackage.vgb0;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR)\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/sportybet/android/widget/SafeImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "", "d", "Lttr;", "getParamForDrawReport", "()Ljava/util/Map;", "paramForDrawReport", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SafeImageView extends AppCompatImageView {
    public static final /* synthetic */ int e = 0;
    public final mpe0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.d = hwr.b(new pr60());
    }

    private final Map<String, Object> getParamForDrawReport() {
        return (Map) this.d.getValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        try {
            super.onDraw(canvas);
        } catch (Exception e2) {
            getParamForDrawReport().put(AnalyticsParam.CONTENT_TYPE, e2.getMessage());
            f00 f00Var = vgb0.a;
            vgb0.c("safe_image_view_on_draw_error", getParamForDrawReport(), false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeImageView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SafeImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
