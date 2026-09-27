package dg;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventMessage[] f79141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f79142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f79144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f79145e;

    public f(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        this.f79143c = str;
        this.f79144d = str2;
        this.f79145e = j10;
        this.f79142b = jArr;
        this.f79141a = eventMessageArr;
    }

    public String a() {
        return this.f79143c + to.c.userBaseDel + this.f79144d;
    }
}
