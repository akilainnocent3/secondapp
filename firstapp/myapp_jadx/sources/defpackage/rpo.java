package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
public final class rpo implements w420 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Function1<o00, Unit> g;

    /* JADX WARN: Multi-variable type inference failed */
    public rpo(long j, long j2, int i, int i2, int i3, int i4, Function1<? super o00, Unit> function1) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = function1;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        owoVar.getClass();
        asrVar.getClass();
        int i = owoVar.b;
        int i2 = owoVar.d;
        int i3 = (owoVar.a + owoVar.c) / 2;
        int i4 = (int) (this.a & 4294967295L);
        int i5 = (int) (j2 >> 32);
        long j3 = this.b;
        int i6 = this.c;
        int i7 = this.d;
        int iE = f.e(i3 - (i5 / 2), i6 + i7, ((((int) (j3 >> 32)) - i5) - this.e) - i7);
        int i8 = ((int) (j2 & 4294967295L)) + i4;
        boolean z = (((int) (j3 & 4294967295L)) - this.f) - i2 >= i8;
        int i9 = z ? i2 + i4 : i - i8;
        this.g.invoke(new o00(owoVar, z ? o00.a.a : o00.a.b));
        return (((long) iE) << 32) | (((long) i9) & 4294967295L);
    }
}
