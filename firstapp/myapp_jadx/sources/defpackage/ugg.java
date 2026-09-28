package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment$setNumbers$1", f = "EvenOddFragment.kt", l = {2344, 2345}, m = "invokeSuspend", v = 1)
public final class ugg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fgg b;

    @c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment$setNumbers$1$1", f = "EvenOddFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ fgg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fgg fggVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = fggVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            final fgg fggVar = this.a;
            ppe ppeVar = fggVar.b0;
            if (ppeVar == null) {
                Intrinsics.n("cubeRender1");
                throw null;
            }
            ppeVar.d = 3450;
            ppeVar.e = 50;
            ppeVar.w = 1;
            ppeVar.y = 1;
            ppeVar.z = 0;
            ppeVar.v = 0;
            ppeVar.i = fgg.w0(fggVar.U.get(0));
            jhg jhgVar = (jhg) fggVar.b;
            if (jhgVar != null) {
                fggVar.v0(fggVar.U.get(0), jhgVar.A);
            }
            jhg jhgVar2 = (jhg) fggVar.b;
            if (jhgVar2 != null) {
                fggVar.v0(fggVar.U.get(1), jhgVar2.B);
            }
            jhg jhgVar3 = (jhg) fggVar.b;
            if (jhgVar3 != null) {
                fggVar.v0(fggVar.U.get(2), jhgVar3.C);
            }
            final int[] iArr = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six};
            final int[] iArr2 = {R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice, R.drawable.six};
            jhg jhgVar4 = (jhg) fggVar.b;
            if (jhgVar4 != null) {
                jhgVar4.w.queueEvent(new Runnable() { // from class: rgg
                    @Override // java.lang.Runnable
                    public final void run() {
                        ppe ppeVar2 = fggVar.b0;
                        if (ppeVar2 == null) {
                            Intrinsics.n("cubeRender1");
                            throw null;
                        }
                        ppeVar2.a(iArr, iArr2, Float.valueOf(1.2f), Float.valueOf(1.0f));
                    }
                });
            }
            mpe mpeVar = fggVar.c0;
            if (mpeVar == null) {
                Intrinsics.n("cubeRender2");
                throw null;
            }
            mpeVar.d = 3480;
            mpeVar.e = 40;
            mpeVar.w = -1;
            mpeVar.y = -1;
            mpeVar.z = 0;
            mpeVar.v = 0;
            mpeVar.i = fgg.w0(fggVar.U.get(1));
            jhg jhgVar5 = (jhg) fggVar.b;
            if (jhgVar5 != null) {
                jhgVar5.y.queueEvent(new Runnable() { // from class: sgg
                    @Override // java.lang.Runnable
                    public final void run() {
                        mpe mpeVar2 = fggVar.c0;
                        if (mpeVar2 == null) {
                            Intrinsics.n("cubeRender2");
                            throw null;
                        }
                        mpeVar2.a(iArr, iArr2, Float.valueOf(1.2f), Float.valueOf(1.0f));
                    }
                });
            }
            npe npeVar = fggVar.d0;
            if (npeVar == null) {
                Intrinsics.n("cubeRender3");
                throw null;
            }
            npeVar.d = 3480;
            npeVar.e = 30;
            npeVar.w = 1;
            npeVar.y = 1;
            npeVar.z = 0;
            npeVar.v = 0;
            npeVar.i = fgg.w0(fggVar.U.get(2));
            jhg jhgVar6 = (jhg) fggVar.b;
            if (jhgVar6 != null) {
                jhgVar6.z.queueEvent(new Runnable() { // from class: tgg
                    @Override // java.lang.Runnable
                    public final void run() {
                        npe npeVar2 = fggVar.d0;
                        if (npeVar2 == null) {
                            Intrinsics.n("cubeRender3");
                            throw null;
                        }
                        npeVar2.a(iArr, iArr2, Float.valueOf(1.2f), Float.valueOf(1.0f));
                    }
                });
            }
            if (fggVar.getActivity() != null) {
                ypa0 ypa0VarD0 = fggVar.D0();
                String string = fggVar.requireContext().getString(R.string.dice_roll);
                string.getClass();
                ypa0VarD0.A1(2000L, string);
            }
            fggVar.S = new LinkedHashSet<>();
            fggVar.P = false;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugg(fgg fggVar, v1b<? super ugg> v1bVar) {
        super(2, v1bVar);
        this.b = fggVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ugg(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ugg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (defpackage.ej5.d(r7, r1, r6) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r7)
            goto L3d
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L17:
            defpackage.uj50.b(r7)
            goto L29
        L1b:
            defpackage.uj50.b(r7)
            r6.a = r4
            r4 = 50
            java.lang.Object r7 = defpackage.hkd.b(r4, r6)
            if (r7 != r0) goto L29
            goto L3c
        L29:
            pfd r7 = defpackage.fse.a
            wcl r7 = defpackage.gku.a
            ugg$a r1 = new ugg$a
            fgg r4 = r6.b
            r1.<init>(r4, r2)
            r6.a = r3
            java.lang.Object r6 = defpackage.ej5.d(r7, r1, r6)
            if (r6 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
