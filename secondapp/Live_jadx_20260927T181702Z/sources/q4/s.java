package q4;

import android.media.VolumeProvider;
import android.os.Build;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.t;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f121554g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f121555h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f121556i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f121561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VolumeProvider f121562f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends VolumeProvider {
        public a(int i10, int i11, int i12, String str) {
            super(i10, i11, i12, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            s.this.f(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            s.this.g(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends VolumeProvider {
        public b(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            s.this.f(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            s.this.g(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class c {
        @t
        public static void a(VolumeProvider volumeProvider, int i10) {
            volumeProvider.setCurrentVolume(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d {
        public abstract void a(s sVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface e {
    }

    public s(int i10, int i11, int i12) {
        this(i10, i11, i12, null);
    }

    public final int a() {
        return this.f121560d;
    }

    public final int b() {
        return this.f121558b;
    }

    public final int c() {
        return this.f121557a;
    }

    @Nullable
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public final String d() {
        return this.f121559c;
    }

    public Object e() {
        s sVar;
        if (this.f121562f != null) {
            sVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            sVar = this;
            sVar.f121562f = sVar.new a(this.f121557a, this.f121558b, this.f121560d, this.f121559c);
        } else {
            sVar = this;
            sVar.f121562f = new b(sVar.f121557a, sVar.f121558b, sVar.f121560d);
        }
        return sVar.f121562f;
    }

    public void h(d dVar) {
        this.f121561e = dVar;
    }

    public final void i(int i10) {
        this.f121560d = i10;
        c.a((VolumeProvider) e(), i10);
        d dVar = this.f121561e;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public s(int i10, int i11, int i12, @Nullable String str) {
        this.f121557a = i10;
        this.f121558b = i11;
        this.f121560d = i12;
        this.f121559c = str;
    }

    public void f(int i10) {
    }

    public void g(int i10) {
    }
}
