package za;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f160926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Typeface f160927e;

    public c(String str, String str2, String str3, float f10) {
        this.f160923a = str;
        this.f160924b = str2;
        this.f160925c = str3;
        this.f160926d = f10;
    }

    public float a() {
        return this.f160926d;
    }

    public String b() {
        return this.f160923a;
    }

    public String c() {
        return this.f160924b;
    }

    public String d() {
        return this.f160925c;
    }

    @Nullable
    public Typeface e() {
        return this.f160927e;
    }

    public void f(@Nullable Typeface typeface) {
        this.f160927e = typeface;
    }
}
