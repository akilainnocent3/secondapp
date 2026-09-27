package fe;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f83906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.a f83907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe.a f83908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f83909e;

    public c(Context context, pe.a aVar, pe.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f83906b = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f83907c = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f83908d = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f83909e = str;
    }

    @Override // fe.i
    public Context c() {
        return this.f83906b;
    }

    @Override // fe.i
    @NonNull
    public String d() {
        return this.f83909e;
    }

    @Override // fe.i
    public pe.a e() {
        return this.f83908d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f83906b.equals(iVar.c()) && this.f83907c.equals(iVar.f()) && this.f83908d.equals(iVar.e()) && this.f83909e.equals(iVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // fe.i
    public pe.a f() {
        return this.f83907c;
    }

    public int hashCode() {
        return ((((((this.f83906b.hashCode() ^ 1000003) * 1000003) ^ this.f83907c.hashCode()) * 1000003) ^ this.f83908d.hashCode()) * 1000003) ^ this.f83909e.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f83906b + ", wallClock=" + this.f83907c + ", monotonicClock=" + this.f83908d + ", backendName=" + this.f83909e + "}";
    }
}
