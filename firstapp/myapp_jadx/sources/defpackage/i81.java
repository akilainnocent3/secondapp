package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.g;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i81 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i81(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        Integer num;
        f fVarD;
        Collection collection;
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                Function1 function1 = (Function1) obj2;
                Double d = (Double) ((ytw) obj).getValue();
                if (d != null) {
                    function1.invoke(d);
                }
                return Unit.a;
            default:
                b bVar = ((rma) obj2).a;
                g gVar = bVar.c;
                if (!bVar.C) {
                    return m2g.a;
                }
                f fVarD2 = gVar.d();
                try {
                    bq40 bq40Var = new bq40();
                    while (true) {
                        int i3 = bq40Var.a;
                        ecy ecyVar = null;
                        if (i3 < gVar.b) {
                            if (fVarD2.l(i3)) {
                                Object objN = fVarD2.n(bq40Var.a);
                                if (objN != obj) {
                                    k350 k350Var = objN instanceof k350 ? (k350) objN : null;
                                    if ((k350Var != null ? k350Var.a : null) == obj) {
                                    }
                                }
                                ecy ecyVar2 = new ecy(bq40Var.a, null);
                                fVarD2.c();
                                ecyVar = ecyVar2;
                                if (ecyVar != null) {
                                    return m2g.a;
                                }
                                i = ecyVar.a;
                                num = ecyVar.b;
                                if (bVar.C) {
                                    fVarD = gVar.d();
                                    try {
                                        ArrayList arrayListC = lka.c(fVarD, i, num);
                                        fVarD.c();
                                        collection = arrayListC;
                                    } catch (Throwable th) {
                                        fVarD.c();
                                        throw th;
                                    }
                                } else {
                                    collection = m2g.a;
                                }
                                return CollectionsKt.i0(bVar.m0(), collection);
                            }
                            int i4 = bq40Var.a;
                            int[] iArr = fVarD2.b;
                            int iC = j1a0.c(iArr, i4);
                            int i5 = i4 + 1;
                            int i6 = (i5 < fVarD2.c ? iArr[(i5 * 5) + 4] : fVarD2.e) - iC;
                            int i7 = 0;
                            while (true) {
                                int i8 = bq40Var.a;
                                if (i7 < i6) {
                                    Object objH = fVarD2.h(i8, i7);
                                    if (objH != obj) {
                                        k350 k350Var2 = objH instanceof k350 ? (k350) objH : null;
                                        if ((k350Var2 != null ? k350Var2.a : null) != obj) {
                                            i7++;
                                        }
                                    }
                                    ecyVar = new ecy(bq40Var.a, Integer.valueOf(i7));
                                } else {
                                    bq40Var.a = i8 + 1;
                                }
                            }
                        } else {
                            Unit unit = Unit.a;
                        }
                        fVarD2.c();
                        if (ecyVar != null) {
                            return m2g.a;
                        }
                        i = ecyVar.a;
                        num = ecyVar.b;
                        if (bVar.C) {
                            collection = m2g.a;
                        } else {
                            fVarD = gVar.d();
                            ArrayList arrayListC2 = lka.c(fVarD, i, num);
                            fVarD.c();
                            collection = arrayListC2;
                        }
                        return CollectionsKt.i0(bVar.m0(), collection);
                    }
                } catch (Throwable th2) {
                    fVarD2.c();
                    throw th2;
                }
        }
    }
}
