package defpackage;

import androidx.compose.ui.layout.t;
import com.google.protobuf.Reader;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class b4b implements aiv {
    public final /* synthetic */ n6s a;
    public final /* synthetic */ Function1<ukf0, Unit> b;
    public final /* synthetic */ ijf0 c;
    public final /* synthetic */ mly d;
    public final /* synthetic */ mmd e;
    public final /* synthetic */ int f;

    /* JADX WARN: Multi-variable type inference failed */
    public b4b(n6s n6sVar, Function1<? super ukf0, Unit> function1, ijf0 ijf0Var, mly mlyVar, mmd mmdVar, int i) {
        this.a = n6sVar;
        this.b = function1;
        this.c = ijf0Var;
        this.d = mlyVar;
        this.e = mmdVar;
        this.f = i;
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        n6s n6sVar = this.a;
        n6sVar.a.a(nzoVar.getLayoutDirection());
        ckw ckwVar = n6sVar.a.j;
        if (ckwVar != null) {
            return cff0.a(ckwVar.b());
        }
        ib5.a("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0202  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [urr] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        ukf0 ukf0Var;
        asr asrVar;
        biv bivVar;
        ukf0 ukf0Var2;
        int i;
        b4b b4bVar;
        int iA;
        ?? r14;
        c5a0.a aVar = c5a0.e;
        n6s n6sVar = this.a;
        aVar.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            vkf0 vkf0VarD = n6sVar.d();
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            ukf0 ukf0Var3 = vkf0VarD != null ? vkf0VarD.a : null;
            bff0 bff0Var = n6sVar.a;
            asr layoutDirection = tVar.getLayoutDirection();
            int i2 = bff0Var.f;
            boolean z = bff0Var.e;
            int i3 = bff0Var.c;
            if (ukf0Var3 != null) {
                zjw zjwVar = ukf0Var3.b;
                tkf0 tkf0Var = ukf0Var3.a;
                nk0 nk0Var = bff0Var.a;
                imf0 imf0Var = bff0Var.b;
                List<nk0.d<ji10>> list2 = bff0Var.i;
                bivVar = null;
                mmd mmdVar = bff0Var.g;
                f8i.a aVar2 = bff0Var.h;
                ukf0 ukf0Var4 = ukf0Var3;
                if (!zjwVar.a.a()) {
                    nk0 nk0Var2 = tkf0Var.a;
                    long j2 = tkf0Var.j;
                    if (Intrinsics.g(nk0Var2, nk0Var) && tkf0Var.b.d(imf0Var) && Intrinsics.g(tkf0Var.c, list2) && tkf0Var.d == i3 && tkf0Var.e == z && tkf0Var.f == i2 && Intrinsics.g(tkf0Var.g, mmdVar)) {
                        asrVar = layoutDirection;
                        if (tkf0Var.h == asrVar && Intrinsics.g(tkf0Var.i, aVar2) && kxa.k(j) == kxa.k(j2) && ((!z && i2 != 2) || (kxa.i(j) == kxa.i(j2) && kxa.h(j) == kxa.h(j2)))) {
                            ukf0Var = ukf0Var4;
                            ukf0Var2 = new ukf0(new tkf0(tkf0Var.a, bff0Var.b, tkf0Var.c, tkf0Var.d, tkf0Var.e, tkf0Var.f, tkf0Var.g, tkf0Var.h, tkf0Var.i, j), zjwVar, oxa.d(j, (((long) cff0.a(zjwVar.e)) & 4294967295L) | (((long) cff0.a(zjwVar.d)) << 32)));
                        }
                    } else {
                        j = j;
                        ukf0Var = ukf0Var4;
                        asrVar = layoutDirection;
                    }
                    long j3 = ukf0Var2.c;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (Intrinsics.g(ukf0Var, ukf0Var2)) {
                        i = 0;
                        b4bVar = this;
                    } else {
                        if (vkf0VarD != null) {
                            r14 = vkf0VarD.c;
                        } else {
                            r14 = bivVar;
                        }
                        ((x5a0) n6sVar.i).setValue(new vkf0(r14, ukf0Var2));
                        i = 0;
                        n6sVar.p = false;
                        b4bVar = this;
                        b4bVar.b.invoke(ukf0Var2);
                        j4b.f(n6sVar, b4bVar.c, b4bVar.d);
                    }
                    if (b4bVar.f == 1) {
                        iA = cff0.a(ukf0Var2.b.b(i));
                    } else {
                        iA = i;
                    }
                    ((x5a0) n6sVar.g).setValue(new g7f(b4bVar.e.u1(iA)));
                    return tVar.e1(iIntValue, iIntValue2, kpu.f(new Pair(mt.a, Integer.valueOf(Math.round(ukf0Var2.d))), new Pair(mt.b, Integer.valueOf(Math.round(ukf0Var2.e)))), new a4b());
                }
                asrVar = layoutDirection;
                ukf0Var = ukf0Var4;
            } else {
                j = j;
                ukf0Var = ukf0Var3;
                asrVar = layoutDirection;
                bivVar = null;
            }
            bff0Var.a(asrVar);
            int iK = kxa.k(j);
            int i4 = ((z || i2 == 2) && kxa.e(j)) ? kxa.i(j) : Reader.READ_DONE;
            int i5 = (z || i2 != 2) ? i3 : 1;
            if (iK != i4) {
                ckw ckwVar = bff0Var.j;
                if (ckwVar == null) {
                    ib5.a("layoutIntrinsics must be called first");
                    return bivVar;
                }
                i4 = f.e(cff0.a(ckwVar.b()), iK, i4);
            }
            ckw ckwVar2 = bff0Var.j;
            if (ckwVar2 == null) {
                ib5.a("layoutIntrinsics must be called first");
                return bivVar;
            }
            zjw zjwVar2 = new zjw(ckwVar2, kxa.a.b(0, i4, 0, kxa.h(j)), i5, bff0Var.f);
            ukf0Var2 = new ukf0(new tkf0(bff0Var.a, bff0Var.b, bff0Var.i, bff0Var.c, bff0Var.e, bff0Var.f, bff0Var.g, asrVar, bff0Var.h, j), zjwVar2, oxa.d(j, (((long) cff0.a(zjwVar2.d)) << 32) | (((long) cff0.a(zjwVar2.e)) & 4294967295L)));
            long j4 = ukf0Var2.c;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (Intrinsics.g(ukf0Var, ukf0Var2)) {
                if (vkf0VarD != null) {
                    r14 = vkf0VarD.c;
                } else {
                    r14 = bivVar;
                }
                ((x5a0) n6sVar.i).setValue(new vkf0(r14, ukf0Var2));
                i = 0;
                n6sVar.p = false;
                b4bVar = this;
                b4bVar.b.invoke(ukf0Var2);
                j4b.f(n6sVar, b4bVar.c, b4bVar.d);
            } else {
                i = 0;
                b4bVar = this;
            }
            if (b4bVar.f == 1) {
                iA = cff0.a(ukf0Var2.b.b(i));
            } else {
                iA = i;
            }
            ((x5a0) n6sVar.g).setValue(new g7f(b4bVar.e.u1(iA)));
            return tVar.e1(iIntValue3, iIntValue4, kpu.f(new Pair(mt.a, Integer.valueOf(Math.round(ukf0Var2.d))), new Pair(mt.b, Integer.valueOf(Math.round(ukf0Var2.e)))), new a4b());
        } catch (Throwable th) {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            throw th;
        }
    }
}
