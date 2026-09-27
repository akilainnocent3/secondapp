package p7;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f120408g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f120409h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f120410i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f120411j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f120412k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f120413l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f120414m = new b(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f120418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f120419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Typeface f120420f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public b(int i10, int i11, int i12, int i13, int i14, @Nullable Typeface typeface) {
        this.f120415a = i10;
        this.f120416b = i11;
        this.f120417c = i12;
        this.f120418d = i13;
        this.f120419e = i14;
        this.f120420f = typeface;
    }

    public static b a(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f120414m.f120415a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f120414m.f120416b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f120414m.f120417c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f120414m.f120418d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f120414m.f120419e, captionStyle.getTypeface());
    }
}
