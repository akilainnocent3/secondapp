package androidx.media3.session.legacy;

import android.media.VolumeProvider;
import android.os.Build;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public abstract class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16098g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16099h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16100i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f16103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public c f16105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public VolumeProvider f16106f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends VolumeProvider {
        public a(int i10, int i11, int i12, String str) {
            super(i10, i11, i12, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            k.this.c(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            k.this.d(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends VolumeProvider {
        public b(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            k.this.c(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            k.this.d(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c {
        public abstract void a(k kVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public k(int i10, int i11, int i12) {
        this(i10, i11, i12, null);
    }

    public final int a() {
        return this.f16102b;
    }

    public Object b() {
        k kVar;
        if (this.f16106f != null) {
            kVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            kVar = this;
            kVar.f16106f = kVar.new a(this.f16101a, this.f16102b, this.f16104d, this.f16103c);
        } else {
            kVar = this;
            kVar.f16106f = new b(kVar.f16101a, kVar.f16102b, kVar.f16104d);
        }
        return kVar.f16106f;
    }

    public void e(@Nullable c cVar) {
        this.f16105e = cVar;
    }

    public final void f(int i10) {
        this.f16104d = i10;
        ((VolumeProvider) b()).setCurrentVolume(i10);
        c cVar = this.f16105e;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    public k(int i10, int i11, int i12, @Nullable String str) {
        this.f16101a = i10;
        this.f16102b = i11;
        this.f16104d = i12;
        this.f16103c = str;
    }

    public void c(int i10) {
    }

    public void d(int i10) {
    }
}
