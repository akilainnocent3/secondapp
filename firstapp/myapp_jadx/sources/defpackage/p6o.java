package defpackage;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p6o implements Function1 {
    public final /* synthetic */ Picture a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mr5 mr5Var = (mr5) obj;
        mr5Var.getClass();
        final int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (mr5Var.a.d() >> 32));
        final int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L));
        final Picture picture = this.a;
        return mr5Var.g(new Function1() { // from class: r6o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                lza lzaVar = (lza) obj2;
                lzaVar.getClass();
                Picture picture2 = picture;
                Canvas canvasBeginRecording = picture2.beginRecording(iIntBitsToFloat, iIntBitsToFloat2);
                canvasBeginRecording.getClass();
                h40 h40VarB = i40.b(canvasBeginRecording);
                asr layoutDirection = lzaVar.getLayoutDirection();
                long jD = lzaVar.d();
                mmd mmdVarB = lzaVar.F1().b();
                asr asrVarC = lzaVar.F1().c();
                lc6 lc6VarA = lzaVar.F1().a();
                long jD2 = lzaVar.F1().d();
                v6l v6lVar = lzaVar.F1().b;
                qc6.b bVarF1 = lzaVar.F1();
                bVarF1.f(lzaVar);
                bVarF1.g(layoutDirection);
                bVarF1.e(h40VarB);
                bVarF1.h(jD);
                bVarF1.b = null;
                h40VarB.p();
                try {
                    lzaVar.b2();
                    h40VarB.f();
                    qc6.b bVarF2 = lzaVar.F1();
                    bVarF2.f(mmdVarB);
                    bVarF2.g(asrVarC);
                    bVarF2.e(lc6VarA);
                    bVarF2.h(jD2);
                    bVarF2.b = v6lVar;
                    picture2.endRecording();
                    i40.c(lzaVar.F1().a()).drawPicture(picture2);
                    return Unit.a;
                } catch (Throwable th) {
                    h40VarB.f();
                    qc6.b bVarF3 = lzaVar.F1();
                    bVarF3.f(mmdVarB);
                    bVarF3.g(asrVarC);
                    bVarF3.e(lc6VarA);
                    bVarF3.h(jD2);
                    bVarF3.b = v6lVar;
                    throw th;
                }
            }
        });
    }
}
