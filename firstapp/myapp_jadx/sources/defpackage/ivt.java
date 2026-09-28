package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ivt {
    public static final float a = 100.0f + 64.0f;

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ dq40 a;

        public a(dq40 dq40Var) {
            this.a = dq40Var;
        }

        /* JADX WARN: Type inference failed for: r7v10, types: [T, j8i0] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                zi50.a aVar3 = zi50.b;
                aVar2.N(1054886669);
                w8i0 w8i0VarA = zdt.a(aVar2);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                ?? A = p8i0.a(jq40.a(b3u.class), w8i0VarA, null, cll.a(w8i0VarA, aVar2), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar2);
                aVar2.H();
                this.a.a = A;
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.LoyaltyHomeScreenKt$LoyaltyHomeScreen$2$1", f = "LoyaltyHomeScreen.kt", l = {216}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ b3u b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ v3a0 e;
        public final /* synthetic */ Context f;

        public static final class a<T> implements myh {
            public final /* synthetic */ Function0<Unit> a;
            public final /* synthetic */ Function0<Unit> b;
            public final /* synthetic */ v3a0 c;
            public final /* synthetic */ Context d;

            /* JADX INFO: renamed from: ivt$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.LoyaltyHomeScreenKt$LoyaltyHomeScreen$2$1$1", f = "LoyaltyHomeScreen.kt", l = {221, 233}, m = "emit", v = 2)
            public static final class C0703a extends x1b {
                public /* synthetic */ Object a;
                public final /* synthetic */ a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0703a(a<? super T> aVar, v1b<? super C0703a> v1bVar) {
                    super(v1bVar);
                    this.b = aVar;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.c |= Integer.MIN_VALUE;
                    return this.b.emit(null, this);
                }
            }

            public a(Function0<Unit> function0, Function0<Unit> function1, v3a0 v3a0Var, Context context) {
                this.a = function0;
                this.b = function1;
                this.c = v3a0Var;
                this.d = context;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
            
                if (defpackage.v3a0.b(r8.c, r2, null, r9, null, r6, 10) == r0) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
            
                if (defpackage.v3a0.b(r8.c, r2, null, r4, null, r6, 10) == r0) goto L41;
             */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(defpackage.jgm r9, defpackage.v1b<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof ivt.b.a.C0703a
                    if (r0 == 0) goto L14
                    r0 = r10
                    ivt$b$a$a r0 = (ivt.b.a.C0703a) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.c = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    ivt$b$a$a r0 = new ivt$b$a$a
                    r0.<init>(r8, r10)
                    goto L12
                L1a:
                    java.lang.Object r10 = r6.a
                    y5b r0 = defpackage.y5b.a
                    int r1 = r6.c
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L38
                    if (r1 == r4) goto L34
                    if (r1 != r3) goto L2e
                    defpackage.uj50.b(r10)
                    goto Lb5
                L2e:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r8)
                    return r2
                L34:
                    defpackage.uj50.b(r10)
                    goto L79
                L38:
                    defpackage.uj50.b(r10)
                    jgm$a r10 = jgm.a.a
                    boolean r10 = kotlin.jvm.internal.Intrinsics.g(r9, r10)
                    if (r10 == 0) goto L49
                    kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r8.a
                    r8.invoke()
                    goto L56
                L49:
                    jgm$b r10 = jgm.b.a
                    boolean r10 = kotlin.jvm.internal.Intrinsics.g(r9, r10)
                    if (r10 == 0) goto L59
                    kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r8.b
                    r8.invoke()
                L56:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                L59:
                    boolean r10 = r9 instanceof jgm.d
                    android.content.Context r1 = r8.d
                    if (r10 == 0) goto L7c
                    jgm$d r9 = (jgm.d) r9
                    com.sporty.android.common_ui.uitext.UiText r10 = r9.a
                    java.lang.String r2 = r10.g(r1)
                    boolean r9 = r9.b
                    r6.c = r4
                    v3a0 r1 = r8.c
                    r3 = 0
                    r5 = 0
                    r7 = 10
                    r4 = r9
                    java.lang.Object r8 = defpackage.v3a0.b(r1, r2, r3, r4, r5, r6, r7)
                    if (r8 != r0) goto L79
                    goto Lb4
                L79:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                L7c:
                    boolean r10 = r9 instanceof jgm.c
                    if (r10 == 0) goto Lb8
                    jgm$c r9 = (jgm.c) r9
                    int r10 = r9.a
                    java.lang.Integer r2 = r9.b
                    r4 = 0
                    if (r2 == 0) goto L9d
                    int r2 = r2.intValue()
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    java.lang.String r2 = defpackage.sn5.b(r1, r2, r4)
                    java.lang.Object[] r2 = new java.lang.Object[]{r2}
                    java.lang.String r10 = defpackage.sn5.b(r1, r10, r2)
                L9b:
                    r2 = r10
                    goto La4
                L9d:
                    java.lang.Object[] r2 = new java.lang.Object[r4]
                    java.lang.String r10 = defpackage.sn5.b(r1, r10, r2)
                    goto L9b
                La4:
                    boolean r4 = r9.c
                    r6.c = r3
                    v3a0 r1 = r8.c
                    r3 = 0
                    r5 = 0
                    r7 = 10
                    java.lang.Object r8 = defpackage.v3a0.b(r1, r2, r3, r4, r5, r6, r7)
                    if (r8 != r0) goto Lb5
                Lb4:
                    return r0
                Lb5:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                Lb8:
                    defpackage.uhc.a()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: ivt.b.a.emit(jgm, v1b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b3u b3uVar, Function0<Unit> function0, Function0<Unit> function1, v3a0 v3a0Var, Context context, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = b3uVar;
            this.c = function0;
            this.d = function1;
            this.e = v3a0Var;
            this.f = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to ivt$b for r8v2 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r8.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r2
            L10:
                defpackage.uj50.b(r9)
                goto L33
            L14:
                defpackage.uj50.b(r9)
                b3u r9 = r8.b
                t340 r9 = r9.F
                ivt$b$a r1 = new ivt$b$a
                v3a0 r4 = r8.e
                android.content.Context r5 = r8.f
                kotlin.jvm.functions.Function0<kotlin.Unit> r6 = r8.c
                kotlin.jvm.functions.Function0<kotlin.Unit> r7 = r8.d
                r1.<init>(r6, r7, r4, r5)
                r8.a = r3
                a390<T> r9 = r9.a
                java.lang.Object r8 = r9.collect(r1, r8)
                if (r8 != r0) goto L33
                return r0
            L33:
                defpackage.fkd.a()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ivt.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<igm, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(igm igmVar) {
            igm igmVar2 = igmVar;
            igmVar2.getClass();
            ((b3u) this.receiver).P1(igmVar2);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d implements tse {
        public final /* synthetic */ b3u a;

        public d(b3u b3uVar) {
            this.a = b3uVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.P1(new igm.n(false));
        }
    }

    public static final void a(final nz3 nz3Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1515543570);
        int i2 = (bVarI.M(nz3Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qy3.b(0, 4, bVarI, null, nz3Var.a(), nz3Var.b(), nz3Var.c() == 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: rut
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ivt.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final uf00 uf00Var, final float f, final zzr zzrVar, final boolean z, final boolean z2, final boolean z3, final tyt tytVar, final boolean z4, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function0 function0, final Function0 function5, final Function2 function6, final az3 az3Var, final cr3 cr3Var, final rt3 rt3Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        int i2;
        v1b v1bVar;
        zzr zzrVar2;
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(292684529);
        int i4 = i | (bVarI.M(uf00Var) ? 4 : 2) | (bVarI.c(f) ? 32 : 16) | (bVarI.M(zzrVar) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z3) ? 131072 : 65536) | (bVarI.b(z4) ? 8388608 : 4194304) | (bVarI.A(function1) ? 67108864 : 33554432) | (bVarI.A(function2) ? 536870912 : 268435456);
        int i5 = (bVarI.A(function3) ? (char) 4 : (char) 2) | (bVarI.A(function4) ? ' ' : (char) 16) | (bVarI.A(function0) ? (char) 256 : (char) 128) | (bVarI.A(function5) ? 2048 : 1024) | (bVarI.A(function6) ? (char) 16384 : (char) 8192) | (bVarI.M(az3Var) ? (char) 0 : (char) 0) | (bVarI.M(cr3Var) ? 1048576 : 524288) | (bVarI.M(rt3Var) ? (char) 0 : (char) 0);
        if (bVarI.q(i4 & 1, ((i4 & 306259091) == 306259090 && (i5 & 4793491) == 4793490) ? false : true)) {
            Iterator<E> it = uf00Var.iterator();
            int i6 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i6 = -1;
                    break;
                } else if (((wvt) it.next()) instanceof wd8) {
                    break;
                } else {
                    i6++;
                }
            }
            Integer numValueOf = Integer.valueOf(i6);
            if (i6 <= 0) {
                numValueOf = null;
            }
            qyd0 qyd0Var = kna.h;
            int iC1 = (int) ((mmd) bVarI.O(qyd0Var)).C1(100.0f);
            int iC2 = (int) ((mmd) bVarI.O(qyd0Var)).C1(a);
            Unit unit = Unit.a;
            int i7 = i4 & 234881024;
            boolean z5 = i7 == 67108864;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z5 || objY == c0042a) {
                objY = new fvt(function1, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i8 = i4 & 896;
            boolean zM = (i8 == 256) | ((i4 & 57344) == 16384) | bVarI.M(numValueOf) | bVarI.d(iC1);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                i2 = i8;
                v1bVar = null;
                gvt gvtVar = new gvt(z2, zzrVar, numValueOf, iC1, null);
                zzrVar2 = zzrVar;
                bVarI.r(gvtVar);
                objY2 = gvtVar;
            } else {
                zzrVar2 = zzrVar;
                i2 = i8;
                v1bVar = null;
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY2);
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            int i9 = i4 & 14;
            boolean zD = (i2 == 256) | (i9 == 4) | bVarI.d(r18);
            Object objY3 = bVarI.y();
            if (zD || objY3 == c0042a) {
                objY3 = new hvt(uf00Var, zzrVar2, iC2, v1bVar);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, boolValueOf2, (Function2) objY3);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            mw90.a("https://s.sporty.net/cms/Fixed_Background_360x640_2_f0da14a704.png", "bg", dw.a(j.e(aVar2, 1.0f), f), null, null, d0b.a.g, null, bVarI, 1572918, 1976);
            bVar = bVarI;
            final zzr zzrVarA = e0s.a(0, 3, bVar);
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            umz umzVarB = h.b(0.0f, 0.0f, 0.0f, z4 ? 88.0f : 16.0f, 7);
            boolean zM2 = (i9 == 4) | bVar.M(zzrVarA) | (i7 == 67108864) | ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 112) == 32) | ((i4 & 7168) == 2048) | ((1879048192 & i4) == 536870912) | ((i5 & 7168) == 2048) | ((i5 & 57344) == 16384) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576) | ((i5 & 29360128) == 8388608);
            Object objY4 = bVar.y();
            if (zM2 || objY4 == c0042a) {
                i3 = i4;
                Function1 function7 = new Function1() { // from class: avt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i10;
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        uf00 uf00Var2 = uf00Var;
                        int i11 = 0;
                        for (Object obj2 : uf00Var2) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                b.q();
                                throw null;
                            }
                            wvt wvtVar = (wvt) obj2;
                            boolean z6 = wvtVar instanceof xd8;
                            final Function1 function8 = function1;
                            if (z6) {
                                String name = wvtVar.getClass().getName();
                                String name2 = wvtVar.getClass().getName();
                                final xd8 xd8Var = (xd8) wvtVar;
                                final zzr zzrVar3 = zzrVarA;
                                final Function1 function9 = function3;
                                szrVar.i(name, name2, new op8(1928341415, new gaj() { // from class: cvt
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar3 = (a) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((gwr) obj3).getClass();
                                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            xd8 xd8Var2 = xd8Var;
                                            String str = xd8Var2.c;
                                            String str2 = xd8Var2.d;
                                            krf0 krf0Var = xd8Var2.b;
                                            krf0 krf0Var2 = xd8Var2.a;
                                            ib50 ib50Var = xd8Var2.e;
                                            boolean z7 = xd8Var2.f;
                                            Function1 function10 = function8;
                                            boolean zM3 = aVar3.M(function10);
                                            Object objY5 = aVar3.y();
                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                            if (zM3 || objY5 == c0042a2) {
                                                objY5 = new ptt(function10, 0);
                                                aVar3.r(objY5);
                                            }
                                            Function1 function11 = (Function1) objY5;
                                            boolean zM4 = aVar3.M(function10);
                                            Object objY6 = aVar3.y();
                                            if (zM4 || objY6 == c0042a2) {
                                                objY6 = new qtt(function10, 0);
                                                aVar3.r(objY6);
                                            }
                                            fsf0.c(zzrVar3, krf0Var, krf0Var2, str, str2, z7, ib50Var, function11, function9, (Function0) objY6, aVar3, 48);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            } else if (Intrinsics.g(wvtVar, fbj.a)) {
                                wvt wvtVar2 = (wvt) CollectionsKt.V(i12, uf00Var2);
                                final boolean z7 = (wvtVar2 instanceof lnc) || (wvtVar2 instanceof e07);
                                String name3 = wvtVar.getClass().getName();
                                String name4 = wvtVar.getClass().getName();
                                final Function0 function10 = function0;
                                szrVar.i(name3, name4, new op8(-693089378, new gaj() { // from class: evt
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar3 = (a) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((gwr) obj3).getClass();
                                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar3, 0);
                                            int iHashCode = Long.hashCode(aVar3.m());
                                            ne00 ne00VarO = aVar3.o();
                                            d.a aVar4 = d.a.b;
                                            d dVarC = c.c(aVar3, aVar4);
                                            yka.k.getClass();
                                            tsr.a aVar5 = yka.a.b;
                                            if (aVar3.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar3.D();
                                            if (aVar3.g()) {
                                                aVar3.F(aVar5);
                                            } else {
                                                aVar3.p();
                                            }
                                            hlh0.a(aVar3, i78VarA, yka.a.f);
                                            hlh0.a(aVar3, ne00VarO, yka.a.e);
                                            yka.a.C1350a c1350a = yka.a.g;
                                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                                j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                            }
                                            hlh0.a(aVar3, dVarC, yka.a.d);
                                            kgh0.a(function10, aVar3, 0);
                                            if (z7) {
                                                aVar3.N(-1892382404);
                                                ty0.a(aVar3, j.i(aVar4, 16.0f));
                                                aVar3.H();
                                            } else {
                                                aVar3.N(-1892292070);
                                                aVar3.H();
                                            }
                                            aVar3.s();
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            } else if (Intrinsics.g(wvtVar, ebj.a)) {
                                szrVar.i(wvtVar.getClass().getName(), wvtVar.getClass().getName(), new op8(2074673823, new gaj() { // from class: htt
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar3 = (a) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((gwr) obj3).getClass();
                                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            Function1 function11 = function8;
                                            boolean zM3 = aVar3.M(function11);
                                            Object objY5 = aVar3.y();
                                            if (zM3 || objY5 == a.C0041a.a) {
                                                objY5 = new utt(function11, 0);
                                                aVar3.r(objY5);
                                            }
                                            qr1.a((Function0) objY5, aVar3, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            } else if (wvtVar instanceof yd8) {
                                final yd8 yd8Var = (yd8) wvtVar;
                                szrVar.i(wvtVar.getClass().getName() + yd8Var.a, wvtVar.getClass().getName(), new op8(547469728, new gaj() { // from class: itt
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar3 = (a) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((gwr) obj3).getClass();
                                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x0u.a(yd8Var.a.g((Context) aVar3.O(AndroidCompositionLocals_androidKt.b)), aVar3, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            } else if (wvtVar instanceof crf0) {
                                String name5 = wvtVar.getClass().getName();
                                String name6 = wvtVar.getClass().getName();
                                final crf0 crf0Var = (crf0) wvtVar;
                                szrVar.i(name5, name6, new op8(-979734367, new gaj() { // from class: jtt
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar3 = (a) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((gwr) obj3).getClass();
                                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            final Function1 function11 = function8;
                                            boolean zM3 = aVar3.M(function11);
                                            final crf0 crf0Var2 = crf0Var;
                                            boolean zM4 = zM3 | aVar3.M(crf0Var2);
                                            Object objY5 = aVar3.y();
                                            if (zM4 || objY5 == a.C0041a.a) {
                                                objY5 = new Function0() { // from class: stt
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        drf0 drf0Var = crf0Var2.c;
                                                        function11.invoke(new igm.r(drf0Var != null ? drf0Var.a : null));
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar3.r(objY5);
                                            }
                                            brf0.c(crf0Var2, (Function0) objY5, aVar3, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            } else {
                                boolean z8 = wvtVar instanceof lnc;
                                final Function1 function11 = function4;
                                if (z8) {
                                    String name7 = wvtVar.getClass().getName();
                                    String name8 = wvtVar.getClass().getName();
                                    final lnc lncVar = (lnc) wvtVar;
                                    szrVar.i(name7, name8, new op8(1788028834, new gaj() { // from class: ktt
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a aVar3 = (a) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            ((gwr) obj3).getClass();
                                            if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                lnc lncVar2 = lncVar;
                                                boolean z9 = lncVar2.a;
                                                boolean z10 = lncVar2.b;
                                                String str = lncVar2.c;
                                                Function1 function12 = function11;
                                                boolean zM3 = aVar3.M(function12);
                                                Object objY5 = aVar3.y();
                                                if (zM3 || objY5 == a.C0041a.a) {
                                                    objY5 = new yo1(function12, 1);
                                                    aVar3.r(objY5);
                                                }
                                                pnc.a(0, aVar3, str, (Function0) objY5, z9, z10);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                } else if (wvtVar instanceof e07) {
                                    String name9 = wvtVar.getClass().getName();
                                    String name10 = wvtVar.getClass().getName();
                                    final e07 e07Var = (e07) wvtVar;
                                    szrVar.i(name9, name10, new op8(260824739, new gaj() { // from class: ltt
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a aVar3 = (a) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            ((gwr) obj3).getClass();
                                            if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                e07 e07Var2 = e07Var;
                                                boolean z9 = e07Var2.a;
                                                ResourceUiText resourceUiText = e07Var2.b;
                                                boolean z10 = e07Var2.c;
                                                final Function1 function12 = function11;
                                                boolean zM3 = aVar3.M(function12);
                                                final Function1 function13 = function8;
                                                boolean zM4 = zM3 | aVar3.M(function13);
                                                Object objY5 = aVar3.y();
                                                if (zM4 || objY5 == a.C0041a.a) {
                                                    objY5 = new Function0() { // from class: ttt
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            function12.invoke(wae.CHALLENGE);
                                                            function13.invoke(new igm.s(aqt.a, kotlin.collections.a.c(k00.d)));
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar3.r(objY5);
                                                }
                                                d07.a(z9, resourceUiText, z10, (Function0) objY5, aVar3, 0);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                } else if (wvtVar instanceof wd8) {
                                    String name11 = wvtVar.getClass().getName();
                                    String name12 = wvtVar.getClass().getName();
                                    final wd8 wd8Var = (wd8) wvtVar;
                                    szrVar.i(name11, name12, new op8(-1266379356, new gaj() { // from class: mtt
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a aVar3 = (a) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            ((gwr) obj3).getClass();
                                            if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                wd8 wd8Var2 = wd8Var;
                                                d dVarJ = h.j(d.a.b, 0.0f, wd8Var2.b ? 28.0f : 24.0f, 0.0f, 0.0f, 13);
                                                m3f0 m3f0Var = wd8Var2.a;
                                                final Function1 function12 = function8;
                                                boolean zM3 = aVar3.M(function12);
                                                Object objY5 = aVar3.y();
                                                if (zM3 || objY5 == a.C0041a.a) {
                                                    objY5 = new Function1() { // from class: vtt
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            tyt tytVar2 = (tyt) obj6;
                                                            tytVar2.getClass();
                                                            ivt.e(tytVar2, function12);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar3.r(objY5);
                                                }
                                                e0u.b(dVarJ, m3f0Var, (Function1) objY5, aVar3, 64);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                } else {
                                    if (wvtVar instanceof gbj) {
                                        String name13 = wvtVar.getClass().getName();
                                        String name14 = wvtVar.getClass().getName();
                                        final gbj gbjVar = (gbj) wvtVar;
                                        szrVar.i(name13, name14, new op8(1501383845, new gaj() { // from class: ntt
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a aVar3 = (a) obj4;
                                                int iIntValue = ((Integer) obj5).intValue();
                                                ((gwr) obj3).getClass();
                                                if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    hx30.c(gbjVar, aVar3, 0);
                                                } else {
                                                    aVar3.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true));
                                    } else if (wvtVar instanceof vd8) {
                                        vd8 vd8Var = (vd8) wvtVar;
                                        final uf00<uyt> uf00Var3 = vd8Var.a;
                                        boolean z9 = vd8Var.b;
                                        tyt tytVar2 = vd8Var.c;
                                        uf00Var3.getClass();
                                        final Function1 function12 = function2;
                                        function12.getClass();
                                        function8.getClass();
                                        function11.getClass();
                                        final Function0 function13 = function5;
                                        function13.getClass();
                                        final Function2 function14 = function6;
                                        function14.getClass();
                                        boolean z10 = tytVar2 instanceof tyt.c;
                                        final boolean z11 = z;
                                        if (z10) {
                                            i10 = i12;
                                            vzt.d(szrVar, uf00Var3, z9, z11, function12, function8, function11, function13, function14, az3Var, cr3Var, null, 1024);
                                        } else {
                                            i10 = i12;
                                            if (tytVar2 instanceof tyt.b) {
                                                final rt3 rt3Var2 = rt3Var;
                                                if (z9) {
                                                    vzt.c(szrVar, uf00Var3, z9, tytVar2, z11, function12, function8, function11, function13, function14, rt3Var2);
                                                } else {
                                                    szrVar.i("reward_card", "rewardCard", new op8(561512875, new gaj() { // from class: rzt
                                                        @Override // defpackage.gaj
                                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                            a aVar3 = (a) obj4;
                                                            int iIntValue = ((Integer) obj5).intValue();
                                                            ((gwr) obj3).getClass();
                                                            if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                                final uf00 uf00Var4 = uf00Var3;
                                                                final boolean z12 = z11;
                                                                final Function1 function15 = function12;
                                                                final Function1 function16 = function8;
                                                                final Function1 function17 = function11;
                                                                final Function0 function18 = function13;
                                                                final Function2 function19 = function14;
                                                                final rt3 rt3Var3 = rt3Var2;
                                                                rrt.f(null, null, 0.0f, pp8.b(260498276, new gaj() { // from class: szt
                                                                    @Override // defpackage.gaj
                                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                                        a aVar4 = (a) obj7;
                                                                        int iIntValue2 = ((Integer) obj8).intValue();
                                                                        ((j78) obj6).getClass();
                                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                            uf00 uf00Var5 = uf00Var4;
                                                                            int i13 = 0;
                                                                            for (Object obj9 : uf00Var5) {
                                                                                int i14 = i13 + 1;
                                                                                if (i13 < 0) {
                                                                                    b.q();
                                                                                    throw null;
                                                                                }
                                                                                uyt uytVar = (uyt) obj9;
                                                                                if (i13 != 0) {
                                                                                    aVar4.N(-1581850809);
                                                                                    ty0.a(aVar4, j.i(d.a.b, uytVar instanceof uyt.i ? 20.0f : 8.0f));
                                                                                } else {
                                                                                    aVar4.N(-1792680044);
                                                                                }
                                                                                aVar4.H();
                                                                                vzt.b(uytVar, false, i13, i13 == uf00Var5.size() + (-1), z12, function15, function16, function17, function18, function19, null, null, rt3Var3, aVar4, 48, 3072);
                                                                                i13 = i14;
                                                                            }
                                                                        } else {
                                                                            aVar4.G();
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                }, aVar3), aVar3, 3456);
                                                            } else {
                                                                aVar3.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, true));
                                                }
                                            } else if (tytVar2 instanceof tyt.a) {
                                                vzt.c(szrVar, uf00Var3, z9, tytVar2, z11, function12, function8, function11, function13, function14, null);
                                            } else {
                                                uhc.a();
                                            }
                                        }
                                    } else {
                                        i10 = i12;
                                        if (wvtVar instanceof z4c) {
                                            String name15 = wvtVar.getClass().getName();
                                            String name16 = wvtVar.getClass().getName();
                                            final z4c z4cVar = (z4c) wvtVar;
                                            szrVar.i(name15, name16, new op8(2130792734, new gaj() { // from class: ott
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    a aVar3 = (a) obj4;
                                                    int iIntValue = ((Integer) obj5).intValue();
                                                    ((gwr) obj3).getClass();
                                                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        lpe.b(z4cVar.a, h.j(d.a.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), aVar3, 48, 0);
                                                    } else {
                                                        aVar3.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true));
                                        } else {
                                            if (!(wvtVar instanceof y4c)) {
                                                uhc.a();
                                                return null;
                                            }
                                            String name17 = wvtVar.getClass().getName();
                                            String name18 = wvtVar.getClass().getName();
                                            final y4c y4cVar = (y4c) wvtVar;
                                            szrVar.i(name17, name18, new op8(603588639, new gaj() { // from class: dvt
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    a aVar3 = (a) obj4;
                                                    int iIntValue = ((Integer) obj5).intValue();
                                                    ((gwr) obj3).getClass();
                                                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        sme.a(h.j(d.a.b, 0.0f, 7.65f, 0.0f, 0.0f, 13), y4cVar, aVar3, 6);
                                                    } else {
                                                        aVar3.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true));
                                        }
                                    }
                                    i11 = i10;
                                }
                            }
                            i10 = i12;
                            i11 = i10;
                        }
                        return Unit.a;
                    }
                };
                bVar.r(function7);
                objY4 = function7;
            } else {
                i3 = i4;
            }
            aur.a(dVarG, zzrVar, umzVarB, false, null, null, null, false, null, (Function1) objY4, bVar, ((i3 >> 3) & 112) | 6, 504);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, zzrVar, z, z2, z3, tytVar, z4, function1, function2, function3, function4, function0, function5, function6, az3Var, cr3Var, rt3Var, i) { // from class: bvt
                public final /* synthetic */ Function1 A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ Function0 C;
                public final /* synthetic */ Function2 D;
                public final /* synthetic */ az3 E;
                public final /* synthetic */ cr3 F;
                public final /* synthetic */ rt3 G;
                public final /* synthetic */ float b;
                public final /* synthetic */ zzr c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ tyt i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Function1 w;
                public final /* synthetic */ Function1 y;
                public final /* synthetic */ Function1 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(2097153);
                    ivt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [T, zi50$b] */
    public static final void c(final int i, androidx.compose.runtime.a aVar, final Function0 function0, final Function0 function1, final Function1 function2, final Function1 function3, final Function2 function4) {
        Object bVar;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final b3u b3uVar;
        Function0 function5;
        function2.getClass();
        function4.getClass();
        function0.getClass();
        function3.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1976114660);
        int i2 = i | (bVarI.A(function2) ? 4 : 2) | (bVarI.A(function4) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            bVarI.N(-1097432187);
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            Object objO = bVarI.O(qyd0Var);
            w8i0 w8i0Var = objO instanceof w8i0 ? (w8i0) objO : null;
            if (w8i0Var == null) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(new IllegalStateException("Current context is not a viewModelStoreOwner."));
            } else {
                dq40 dq40Var = new dq40();
                zi50.a aVar3 = zi50.b;
                dq40Var.a = new zi50.b(new IllegalStateException("ViewModel not initialized"));
                hna.a(zdt.a.a(w8i0Var), pp8.b(1239804216, new a(dq40Var), bVarI), bVarI, 48);
                bVar = dq40Var.a;
            }
            bVarI.X(false);
            uj50.b(bVar);
            b3u b3uVar2 = (b3u) ((j8i0) bVar);
            final ytw ytwVarC = wyh.c(b3uVar2.f0, bVarI, 0, 7);
            final ytw ytwVarC2 = wyh.c(b3uVar2.Y, bVarI, 0, 7);
            Context context = (Context) bVarI.O(qyd0Var);
            final v0u v0uVar = (v0u) bVarI.O(cst.f);
            ytw ytwVarC3 = wyh.c(b3uVar2.a0, bVarI, 0, 7);
            boolean zM = bVarI.M((Boolean) ytwVarC3.getValue());
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a2) {
                objY = new az3((Boolean) ytwVarC3.getValue(), new wtt(b3uVar2, 0), new vxj(b3uVar2, 1), new ztt(b3uVar2));
                bVarI.r(objY);
            }
            final az3 az3Var = (az3) objY;
            boolean zB = bVarI.b(((myt) ytwVarC.getValue()).f);
            Object objY2 = bVarI.y();
            if (zB || objY2 == c0042a2) {
                objY2 = new cr3(((myt) ytwVarC.getValue()).f, new aut(b3uVar2));
                bVarI.r(objY2);
            }
            final cr3 cr3Var = (cr3) objY2;
            boolean zB2 = bVarI.b(((myt) ytwVarC.getValue()).e);
            Object objY3 = bVarI.y();
            if (zB2 || objY3 == c0042a2) {
                objY3 = new rt3(((myt) ytwVarC.getValue()).e, new but(b3uVar2, 0));
                bVarI.r(objY3);
            }
            final rt3 rt3Var = (rt3) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a2) {
                objY4 = b40.a(bVarI);
            }
            final v3a0 v3a0Var = (v3a0) objY4;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(b3uVar2);
            Object objY5 = bVarI.y();
            if (zA || objY5 == c0042a2) {
                objY5 = new ayj(b3uVar2, 1);
                bVarI.r(objY5);
            }
            xvf.c(unit, (Function1) objY5, bVarI);
            boolean zA2 = ((i2 & 896) == 256) | bVarI.A(b3uVar2) | ((i2 & 57344) == 16384) | bVarI.A(context);
            Object objY6 = bVarI.y();
            if (zA2 || objY6 == c0042a2) {
                c0042a = c0042a2;
                b bVar2 = new b(b3uVar2, function0, function1, v3a0Var, context, null);
                b3uVar = b3uVar2;
                function5 = function1;
                bVarI.r(bVar2);
                objY6 = bVar2;
            } else {
                function5 = function1;
                c0042a = c0042a2;
                b3uVar = b3uVar2;
            }
            xvf.e(bVarI, unit, (Function2) objY6);
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new cut();
                bVarI.r(objY7);
            }
            final b3u b3uVar3 = b3uVar;
            hy60.a(xa80.b(androidx.compose.ui.d.a.b, false, (Function1) objY7), null, pp8.b(-2006671839, new dut(ytwVarC, function5), bVarI), pp8.b(-1996901278, new Function2() { // from class: eut
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        s3a0.b(v3a0Var, null, zc9.a, aVar4, 390, 2);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), pp8.b(-1987130717, new Function2() { // from class: fut
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        gtt gttVar = ((myt) ytwVarC.getValue()).a;
                        if (!(gttVar instanceof gtt.b)) {
                            gttVar = null;
                        }
                        gtt.b bVar3 = (gtt.b) gttVar;
                        if (bVar3 != null && bVar3.f && (bVar3.e instanceof tyt.c)) {
                            aVar4.N(-1076834026);
                            b3u b3uVar4 = b3uVar;
                            boolean zA3 = aVar4.A(b3uVar4);
                            Object objY8 = aVar4.y();
                            if (zA3 || objY8 == a.C0041a.a) {
                                objY8 = new ir1(b3uVar4, 1);
                                aVar4.r(objY8);
                            }
                            hvv.a(null, v0uVar, (Function0) objY8, aVar4, 0, 1);
                            aVar4.H();
                        } else {
                            aVar4.N(-1076579361);
                            aVar4.H();
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), 3, j58.l, 0L, r8j0.b(3, 0.0f, 0.0f), pp8.b(-250039957, new gaj() { // from class: xtt
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((tmz) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        myt mytVar = (myt) ytwVarC.getValue();
                        lrv lrvVar = (lrv) ytwVarC2.getValue();
                        b3u b3uVar4 = b3uVar3;
                        boolean zA3 = aVar4.A(b3uVar4);
                        Object objY8 = aVar4.y();
                        if (zA3 || objY8 == a.C0041a.a) {
                            ivt.c cVar = new ivt.c(1, b3uVar4, b3u.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/loyalty/home/HomeLoyaltyAction;)V", 0);
                            aVar4.r(cVar);
                            objY8 = cVar;
                        }
                        ivt.d(mytVar, (Function1) ((chp) objY8), function4, function2, function0, function3, az3Var, cr3Var, rt3Var, lrvVar, aVar4, 0);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 806907264, 130);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0, function1, function2, function3, function4) { // from class: ytt
                public final /* synthetic */ Function1 a;
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;

                {
                    this.a = function2;
                    this.b = function4;
                    this.c = function0;
                    this.d = function3;
                    this.e = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ivt.c(qj40.a(1), (a) obj, this.c, this.e, this.a, this.d, this.b);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v59, types: [int] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r12v13, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r12v14, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    public static final void d(final myt mytVar, final Function1 function1, final Function2 function2, final Function1 function3, final Function0 function0, final Function1 function4, final az3 az3Var, final cr3 cr3Var, final rt3 rt3Var, final lrv lrvVar, androidx.compose.runtime.a aVar, final int i) {
        ?? r4;
        int i2;
        int i3;
        isw iswVar;
        int i4;
        Object obj;
        Object obj2;
        ?? r0;
        ?? r12;
        s1g0 s1g0Var;
        wvt wvtVar;
        ?? r5;
        ?? r6;
        uf00<wvt> uf00Var;
        wvt next;
        boolean z;
        Object obj3;
        Object obj4;
        ?? r1;
        Object obj5;
        ?? r2;
        Object obj6;
        ?? I = aVar.i(-1583917449);
        int i5 = i | (I.M(mytVar) ? 4 : 2) | (I.A(function1) ? 32 : 16) | (I.A(function2) ? 256 : 128) | (I.A(function3) ? 2048 : 1024) | (I.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (I.A(function4) ? 131072 : 65536) | (I.M(az3Var) ? 1048576 : 524288) | (I.M(cr3Var) ? 8388608 : 4194304) | (I.M(rt3Var) ? 67108864 : 33554432) | (I.M(lrvVar) ? 536870912 : 268435456);
        if (I.q(i5 & 1, (i5 & 306783379) != 306783378)) {
            final zzr zzrVarA = e0s.a(0, 3, I);
            boolean z2 = lrvVar instanceof lrv.a;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2) {
                I.N(-1973168333);
                final lrv.a aVar2 = (lrv.a) lrvVar;
                uxs uxsVar = aVar2.b;
                i2 = i5;
                int i6 = i2 & 112;
                boolean z3 = (i6 == 32) | ((i2 & 1879048192) == 536870912);
                Object objY = I.y();
                Object obj7 = objY;
                if (z3 || objY == c0042a) {
                    Function0 function5 = new Function0() { // from class: gut
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new igm.o.c(aVar2.a));
                            return Unit.a;
                        }
                    };
                    I.r(function5);
                    obj7 = function5;
                }
                Function0 function6 = (Function0) obj7;
                boolean z4 = i6 == 32;
                Object objY2 = I.y();
                if (z4 || objY2 == c0042a) {
                    r2 = 0;
                    qut qutVar = new qut(function1, false ? 1 : 0);
                    I.r(qutVar);
                    obj6 = qutVar;
                } else {
                    r2 = 0;
                    obj6 = objY2;
                }
                nrv.a(uxsVar, function6, (Function0) obj6, I, r2);
                I.X(r2);
                i3 = r2;
            } else {
                i2 = i5;
                i3 = 0;
                if (!Intrinsics.g(lrvVar, lrv.b.a)) {
                    throw igf0.a(I, -1726221120, false);
                }
                I.N(-1726202309);
                I.X(false);
            }
            Object[] objArr = new Object[i3];
            Object objY3 = I.y();
            Object obj8 = objY3;
            if (objY3 == c0042a) {
                vut vutVar = new vut();
                I.r(vutVar);
                obj8 = vutVar;
            }
            isw iswVar2 = (isw) o350.e(objArr, (Function0) obj8, I, 48);
            kst kstVar = mytVar.b;
            gtt gttVar = mytVar.a;
            if (kstVar instanceof kst.a) {
                I.N(-1972501678);
                String strG = ((kst.a) kstVar).a.g((Context) I.O(AndroidCompositionLocals_androidKt.b));
                iswVar = iswVar2;
                boolean z5 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objY4 = I.y();
                if (z5 || objY4 == c0042a) {
                    r1 = 0;
                    wut wutVar = new wut(0, mytVar, function1);
                    I.r(wutVar);
                    obj5 = wutVar;
                } else {
                    r1 = 0;
                    obj5 = objY4;
                }
                x0b.a(r1, I, strG, (Function0) obj5);
                I.X(r1);
            } else {
                iswVar = iswVar2;
                if (kstVar instanceof kst.b) {
                    I.N(-1972275130);
                    Unit unit = Unit.a;
                    boolean z6 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                    Object objY5 = I.y();
                    Object obj9 = objY5;
                    if (z6 || objY5 == c0042a) {
                        jvt jvtVar = new jvt(mytVar, function1, null);
                        I.r(jvtVar);
                        obj9 = jvtVar;
                    }
                    xvf.e(I, unit, (Function2) obj9);
                    I.X(false);
                } else {
                    if (!(kstVar instanceof kst.c)) {
                        throw igf0.a(I, -1726198600, false);
                    }
                    I.N(-1972043095);
                    kst.c cVar = (kst.c) kstVar;
                    UiText uiText = cVar.a;
                    uiText.getClass();
                    qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                    String strG2 = uiText.g((Context) I.O(qyd0Var));
                    UiText uiText2 = cVar.b;
                    uiText2.getClass();
                    String strG3 = uiText2.g((Context) I.O(qyd0Var));
                    long jA = c68.a(R.color.brand_tertiary, I);
                    long jA2 = c68.a(R.color.background_disable_type2_primary, I);
                    long jA3 = c68.a(R.color.brand_tertiary, I);
                    alb0 alb0Var = qdf0.a;
                    ryj ryjVarA = syj.a(jA2, jA3, jA, qdf0.a(390, 2, r58.d(4292275164L), I), null, I, 16);
                    int i7 = i2 & 112;
                    int i8 = i2 & 14;
                    boolean z7 = (i7 == 32) | (i8 == 4);
                    Object objY6 = I.y();
                    Object obj10 = objY6;
                    if (z7 || objY6 == c0042a) {
                        Function0 function7 = new Function0() { // from class: xut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(((kst.c) mytVar.b).c);
                                return Unit.a;
                            }
                        };
                        I.r(function7);
                        obj10 = function7;
                    }
                    Function0 function8 = (Function0) obj10;
                    boolean z8 = (i7 == 32) | (i8 == 4);
                    Object objY7 = I.y();
                    Object obj11 = objY7;
                    if (z8 || objY7 == c0042a) {
                        Function0 function9 = new Function0() { // from class: yut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(((kst.c) mytVar.b).c);
                                return Unit.a;
                            }
                        };
                        I.r(function9);
                        obj11 = function9;
                    }
                    nzj.b(null, strG2, strG3, null, ryjVarA, null, null, null, null, null, null, function8, (Function0) obj11, null, I, 0, 0, 10217);
                    I.X(false);
                }
            }
            y0u y0uVar = mytVar.c;
            if (y0uVar instanceof y0u.b) {
                I.N(-1971293081);
                qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
                Context context = (Context) I.O(qyd0Var2);
                UiText uiText3 = ((y0u.b) y0uVar).a;
                uiText3.getClass();
                String strG4 = uiText3.g((Context) I.O(qyd0Var2));
                boolean zA = I.A(context) | I.M(strG4) | I.M(y0uVar);
                Object objY8 = I.y();
                if (zA || objY8 == c0042a) {
                    obj4 = objY8;
                    kvt kvtVar = new kvt(context, strG4, y0uVar, null);
                    I.r(kvtVar);
                    obj4 = kvtVar;
                }
                xvf.e(I, y0uVar, (Function2) obj4);
                I.X(false);
            } else {
                I.N(-1971073973);
                I.X(false);
            }
            final nz3 nz3Var = mytVar.g;
            if (nz3Var instanceof nz3.a) {
                I.N(-1970956514);
                Unit unit2 = Unit.a;
                int i9 = i2 & 112;
                boolean z9 = i9 == 32;
                Object objY9 = I.y();
                Object obj12 = objY9;
                if (z9 || objY9 == c0042a) {
                    lvt lvtVar = new lvt(function1, null);
                    I.r(lvtVar);
                    obj12 = lvtVar;
                }
                xvf.e(I, unit2, (Function2) obj12);
                boolean z10 = ((nz3.a) nz3Var).d;
                boolean z11 = i9 == 32;
                Object objY10 = I.y();
                Object obj13 = objY10;
                if (z11 || objY10 == c0042a) {
                    vw6 vw6Var = new vw6(function1, 1);
                    I.r(vw6Var);
                    obj13 = vw6Var;
                }
                Function0 function10 = (Function0) obj13;
                boolean z12 = i9 == 32;
                Object objY11 = I.y();
                if (z12 || objY11 == c0042a) {
                    z = false;
                    zut zutVar = new zut(function1, false ? 1 : 0);
                    I.r(zutVar);
                    obj3 = zutVar;
                } else {
                    z = false;
                    obj3 = objY11;
                }
                vy3.c(z10, function10, (Function0) obj3, null, pp8.b(849279099, new yw6(nz3Var, 1), I), I, 24576);
                I.X(z);
                i4 = z;
            } else if (nz3Var instanceof nz3.b) {
                I.N(-1970261959);
                Unit unit3 = Unit.a;
                int i10 = i2 & 112;
                boolean z13 = i10 == 32;
                Object objY12 = I.y();
                if (z13 || objY12 == c0042a) {
                    mvt mvtVar = new mvt(function1, null);
                    I.r(mvtVar);
                    obj = mvtVar;
                } else {
                    obj = objY12;
                }
                xvf.e(I, unit3, (Function2) obj);
                boolean z14 = i10 == 32;
                Object objY13 = I.y();
                Object obj14 = objY13;
                if (z14 || objY13 == c0042a) {
                    bx6 bx6Var = new bx6(1, function1);
                    I.r(bx6Var);
                    obj14 = bx6Var;
                }
                Function0 function11 = (Function0) obj14;
                boolean z15 = i10 == 32;
                Object objY14 = I.y();
                if (z15 || objY14 == c0042a) {
                    nff nffVar = new nff(function1, 1);
                    I.r(nffVar);
                    obj2 = nffVar;
                } else {
                    obj2 = objY14;
                }
                vy3.a(function11, (Function0) obj2, null, ((nz3.b) nz3Var).d, pp8.b(-1312992259, new Function2() { // from class: iut
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj15, Object obj16) {
                        a aVar3 = (a) obj15;
                        int iIntValue = ((Integer) obj16).intValue();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ivt.a(nz3Var, aVar3, 0);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, I), I, 24576, 4);
                i4 = 0;
                I.X(false);
            } else {
                i4 = 0;
                if (nz3Var != null) {
                    throw igf0.a(I, -1726149347, false);
                }
                I.N(-1726103845);
                I.X(false);
            }
            UiText uiText4 = mytVar.h;
            if (uiText4 == null) {
                I.N(-1969557051);
                I.X(i4);
                r12 = I;
                r0 = i4;
            } else {
                I.N(-1969557050);
                String strA = cb40.a(R.string.common_functions__error, new Object[i4], I);
                String strG5 = uiText4.g((Context) I.O(AndroidCompositionLocals_androidKt.b));
                long jA4 = c68.a(R.color.brand_tertiary, I);
                long jA5 = c68.a(R.color.background_disable_type2_primary, I);
                long jA6 = c68.a(R.color.brand_tertiary, I);
                alb0 alb0Var2 = qdf0.a;
                ryj ryjVarA2 = syj.a(jA5, jA6, jA4, qdf0.a(390, 2, r58.d(4292275164L), I), null, I, 16);
                int i11 = i2 & 112;
                boolean z16 = i11 == 32;
                Object objY15 = I.y();
                Object obj15 = objY15;
                if (z16 || objY15 == c0042a) {
                    Function0 function12 = new Function0() { // from class: jut
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(igm.d.e.a);
                            return Unit.a;
                        }
                    };
                    I.r(function12);
                    obj15 = function12;
                }
                Function0 function13 = (Function0) obj15;
                boolean z17 = i11 == 32;
                Object objY16 = I.y();
                Object obj16 = objY16;
                if (z17 || objY16 == c0042a) {
                    kut kutVar = new kut(function1, 0);
                    I.r(kutVar);
                    obj16 = kutVar;
                }
                nzj.b(null, strA, strG5, null, ryjVarA2, null, null, null, null, null, null, function13, (Function0) obj16, null, I, 0, 0, 10217);
                ?? r13 = I;
                Unit unit4 = Unit.a;
                r0 = 0;
                r13.X(false);
                r12 = r13;
            }
            dtg0 dtg0VarF = vtg0.f(gttVar, "loyalty", r12, 48, r0);
            Object objY17 = r12.y();
            Object obj17 = objY17;
            if (objY17 == c0042a) {
                lut lutVar = new lut();
                r12.r(lutVar);
                obj17 = lutVar;
            }
            ?? r30 = r0;
            int i12 = i2;
            final isw iswVar3 = iswVar;
            ?? r7 = r12;
            q3c.a(dtg0VarF, null, null, (Function1) obj17, pp8.b(609600219, new gaj() { // from class: mut
                @Override // defpackage.gaj
                public final Object invoke(Object obj18, Object obj19, Object obj20) {
                    gtt gttVar2 = (gtt) obj18;
                    a aVar3 = (a) obj19;
                    int iIntValue = ((Integer) obj20).intValue();
                    gttVar2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(gttVar2) ? 4 : 2;
                    }
                    if (!aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        aVar3.G();
                    } else if (gttVar2.equals(gtt.a.a)) {
                        aVar3.N(1478471298);
                        d.a aVar4 = d.a.b;
                        d dVarE = j.e(aVar4, 1.0f);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarE);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        q330.a(j.r(aVar4, 46.0f), j58.f, 4.0f, 0L, 0, 0.0f, aVar3, 438, 56);
                        aVar3.s();
                        aVar3.H();
                    } else {
                        if (!(gttVar2 instanceof gtt.b)) {
                            throw rg.a(1710260084, aVar3);
                        }
                        aVar3.N(1478854086);
                        gtt.b bVar = (gtt.b) gttVar2;
                        uf00<wvt> uf00Var2 = bVar.a;
                        boolean z18 = bVar.c;
                        boolean z19 = bVar.d;
                        boolean z20 = mytVar.d;
                        isw iswVar4 = iswVar3;
                        float fJ = iswVar4.j();
                        tyt tytVar = bVar.e;
                        boolean z21 = !bVar.f && (tytVar instanceof tyt.c);
                        boolean zM = aVar3.M(iswVar4);
                        Object objY18 = aVar3.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM || objY18 == c0042a2) {
                            objY18 = new rtt(iswVar4, 0);
                            aVar3.r(objY18);
                        }
                        Function1 function14 = (Function1) objY18;
                        Function1 function15 = function4;
                        boolean zM2 = aVar3.M(function15);
                        Object objY19 = aVar3.y();
                        if (zM2 || objY19 == c0042a2) {
                            objY19 = new yt6(function15, 1);
                            aVar3.r(objY19);
                        }
                        Function0 function16 = (Function0) objY19;
                        final Function2 function17 = function2;
                        boolean zM3 = aVar3.M(function17);
                        Object objY20 = aVar3.y();
                        if (zM3 || objY20 == c0042a2) {
                            objY20 = new Function0() { // from class: hut
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("data_enable_default_action_bar", false);
                                    function17.invoke("m/wv/loyalty/mission/terms-and-conditions", bundle);
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY20);
                        }
                        ivt.b(uf00Var2, fJ, zzrVarA, z18, z19, z20, tytVar, z21, function1, function3, function14, function15, function16, (Function0) objY20, function17, az3Var, cr3Var, rt3Var, aVar3, 2097152);
                        aVar3.H();
                    }
                    return Unit.a;
                }
            }, r12), r7, 27648, 3);
            boolean z18 = gttVar instanceof gtt.b;
            gtt.b bVar = (gtt.b) (!z18 ? null : gttVar);
            if (bVar == null || (s1g0Var = bVar.b) == null) {
                s1g0Var = new s1g0(r30 == true ? 1 : 0);
            }
            s1g0 s1g0Var2 = s1g0Var;
            boolean z19 = iswVar.j() > 0.0f ? true : r30 == true ? 1 : 0;
            int i13 = i12 & 896;
            boolean z20 = i13 == 256 ? true : r30 == true ? 1 : 0;
            Object objY18 = r7.y();
            Object obj18 = objY18;
            if (z20 || objY18 == c0042a) {
                Function0 function14 = new Function0() { // from class: nut
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("data_enable_default_action_bar", false);
                        bundle.putBoolean("key_finish_on_login", true);
                        function2.invoke("m/me/loyalty/intro", bundle);
                        return Unit.a;
                    }
                };
                r7.r(function14);
                obj18 = function14;
            }
            Function0 function15 = (Function0) obj18;
            boolean z21 = i13 == 256 ? true : r30 == true ? 1 : 0;
            Object objY19 = r7.y();
            Object obj19 = objY19;
            if (z21 || objY19 == c0042a) {
                thp thpVar = new thp(function2, 1);
                r7.r(thpVar);
                obj19 = thpVar;
            }
            yqt.b(z19, zzrVarA, s1g0Var2, function0, function15, (Function0) obj19, r7, 6 | (57344 & i12));
            ?? r8 = r7;
            gtt.b bVar2 = (gtt.b) (!z18 ? null : gttVar);
            if (bVar2 == null || (uf00Var = bVar2.a) == null) {
                wvtVar = null;
            } else {
                Iterator<wvt> it = uf00Var.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof wd8));
                wvtVar = next;
            }
            final wd8 wd8Var = wvtVar instanceof wd8 ? (wd8) wvtVar : null;
            if (wd8Var != null) {
                boolean z22 = wd8Var.b;
                r8.N(-1966116360);
                Iterator<wvt> it2 = bVar2.a.iterator();
                final int i14 = r30 == true ? 1 : 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (it2.next() instanceof wd8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                qyd0 qyd0Var3 = kna.h;
                final int iY0 = ((mmd) r8.O(qyd0Var3)).y0(100.0f);
                final int iY1 = ((mmd) r8.O(qyd0Var3)).y0(z22 ? 28.0f : 24.0f);
                boolean zD = r8.d(i14) | r8.d(iY0) | r8.d(iY1);
                Object objY20 = r8.y();
                Object obj20 = objY20;
                if (zD || objY20 == c0042a) {
                    mae maeVarB = a6a0.b(new Function0() { // from class: out
                        /* JADX WARN: Code duplicated, block: B:7:0x000f  */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object next2;
                            int i15 = i14;
                            boolean z23 = false;
                            if (i15 >= 0) {
                                zzr zzrVar = zzrVarA;
                                if (zzrVar.h() > i15) {
                                    z23 = true;
                                } else {
                                    Iterator<T> it3 = zzrVar.j().k().iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                    } while (((zyr) next2).getIndex() != i15);
                                    zyr zyrVar = (zyr) next2;
                                    if (zyrVar != null && zyrVar.getOffset() + iY1 <= iY0) {
                                        z23 = true;
                                    }
                                }
                            }
                            return Boolean.valueOf(z23);
                        }
                    });
                    r8.r(maeVarB);
                    obj20 = maeVarB;
                }
                if (((Boolean) ((twd0) obj20).getValue()).booleanValue()) {
                    r8.N(-1964881661);
                    androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                    if (z22) {
                        r8.N(-1964859031);
                        mmd mmdVar = (mmd) r8.O(qyd0Var3);
                        final float fC1 = mmdVar.C1(100.0f);
                        final float fC2 = mmdVar.C1(164.0f);
                        androidx.compose.ui.d dVarE = j.e(aVar3, 1.0f);
                        aiv aivVarC = g75.c(ht.a.a, r30);
                        int iHashCode = Long.hashCode(r8.T);
                        ne00 ne00VarS = r8.S();
                        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(r8, dVarE);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        r8.D();
                        if (r8.S) {
                            r8.F(aVar4);
                        } else {
                            r8.p();
                        }
                        hlh0.a(r8, aivVarC, yka.a.f);
                        hlh0.a(r8, ne00VarS, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (r8.S || !Intrinsics.g(r8.y(), Integer.valueOf(iHashCode))) {
                            n30.a(iHashCode, r8, iHashCode, c1350a);
                        }
                        hlh0.a(r8, dVarC, yka.a.d);
                        androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.d.a.f(aVar3);
                        boolean zC = r8.c(fC1) | r8.c(fC2);
                        Object objY21 = r8.y();
                        Object obj21 = objY21;
                        if (zC || objY21 == c0042a) {
                            Function1 function16 = new Function1() { // from class: put
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj22) {
                                    float f = fC1;
                                    float f2 = fC2;
                                    lza lzaVar = (lza) obj22;
                                    lzaVar.getClass();
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                                    qc6.b bVarF1 = lzaVar.F1();
                                    long jD = bVarF1.d();
                                    bVarF1.a().p();
                                    try {
                                        bVarF1.a.b(0.0f, f, fIntBitsToFloat, f2, 1);
                                        lzaVar.b2();
                                        return Unit.a;
                                    } finally {
                                        hrh.a(bVarF1, jD);
                                    }
                                }
                            };
                            r8.r(function16);
                            obj21 = function16;
                        }
                        mw90.a("https://s.sporty.net/cms/Fixed_Background_360x640_2_f0da14a704.png", null, androidx.compose.ui.draw.a.c(dVarF, (Function1) obj21), null, null, d0b.a.g, null, r8, 1572918, 1976);
                        ?? r9 = r8;
                        androidx.compose.ui.d dVarJ = h.j(aVar3, 0.0f, 100.0f, 0.0f, 0.0f, 13);
                        m3f0 m3f0Var = wd8Var.a;
                        boolean z23 = (i12 & 112) == 32 ? true : r30 == true ? 1 : 0;
                        Object objY22 = r9.y();
                        Object obj22 = objY22;
                        if (z23 || objY22 == c0042a) {
                            sut sutVar = new sut(r30 == true ? 1 : 0, function1);
                            r9.r(sutVar);
                            obj22 = sutVar;
                        }
                        e0u.b(dVarJ, m3f0Var, (Function1) obj22, r9, 70);
                        r9.X(true);
                        r9.X(r30);
                        r6 = r9;
                    } else {
                        r8.N(-1963331878);
                        l0u.a(h.j(aVar3, 0.0f, 100.0f, 0.0f, 0.0f, 13), false, pp8.b(533103791, new Function2() { // from class: tut
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj23, Object obj24) {
                                a aVar5 = (a) obj23;
                                int iIntValue = ((Integer) obj24).intValue();
                                int i15 = 1;
                                if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    m3f0 m3f0Var2 = wd8Var.a;
                                    Function1 function17 = function1;
                                    boolean zM = aVar5.M(function17);
                                    Object objY23 = aVar5.y();
                                    if (zM || objY23 == a.C0041a.a) {
                                        objY23 = new wwj(function17, i15);
                                        aVar5.r(objY23);
                                    }
                                    e0u.b(d.a.b, m3f0Var2, (Function1) objY23, aVar5, 70);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, r8), r8, 390, 2);
                        r8.X(r30);
                        r6 = r8;
                    }
                    r6.X(r30);
                    r5 = r6;
                } else {
                    r8.N(-1962936597);
                    r8.X(r30);
                    r5 = r8;
                }
                r5.X(r30);
                r4 = r5;
            } else {
                r8.N(-1962930645);
                r8.X(r30);
                r4 = r8;
            }
        } else {
            I.G();
            r4 = I;
        }
        e eVarZ = r4.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, function0, function4, az3Var, cr3Var, rt3Var, lrvVar, i) { // from class: uut
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ az3 i;
                public final /* synthetic */ cr3 v;
                public final /* synthetic */ rt3 w;
                public final /* synthetic */ lrv y;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj23, Object obj24) {
                    ((Integer) obj24).getClass();
                    int iA = qj40.a(1);
                    ivt.d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, (a) obj23, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(tyt tytVar, Function1<? super igm, Unit> function1) {
        function1.invoke(new igm.u(tytVar));
        if (tytVar instanceof tyt.c) {
            function1.invoke(new igm.s(new dwt.a(0), k00.f));
        }
    }
}
