package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class iz0 {

    @c0d(c = "com.sportybet.android.bookingcode.customCode.assign.compose.AssignedCustomCodeBottomSheetKt$AssignedCustomCodeResultBottomSheet$1$1", f = "AssignedCustomCodeBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ oz0 a;
        public final /* synthetic */ String b;
        public final /* synthetic */ gdc c;
        public final /* synthetic */ jz0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oz0 oz0Var, String str, gdc gdcVar, jz0 jz0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = oz0Var;
            this.b = str;
            this.c = gdcVar;
            this.d = jz0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            oz0 oz0Var = this.a;
            oz0Var.getClass();
            String str = this.b;
            str.getClass();
            oz0Var.y1(new lz0(oz0Var, str, this.c, this.d, null));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.bookingcode.customCode.assign.compose.AssignedCustomCodeBottomSheetKt$AssignedCustomCodeResultBottomSheet$2$1", f = "AssignedCustomCodeBottomSheet.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ oz0 b;
        public final /* synthetic */ v3a0 c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;

        public static final class a<T> implements myh {
            public final /* synthetic */ v3a0 a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ String c;

            /* JADX INFO: renamed from: iz0$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.bookingcode.customCode.assign.compose.AssignedCustomCodeBottomSheetKt$AssignedCustomCodeResultBottomSheet$2$1$1", f = "AssignedCustomCodeBottomSheet.kt", l = {87, 110}, m = "emit", v = 2)
            public static final class C0704a extends x1b {
                public /* synthetic */ Object a;
                public final /* synthetic */ a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0704a(a<? super T> aVar, v1b<? super C0704a> v1bVar) {
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

            public a(v3a0 v3a0Var, Context context, String str) {
                this.a = v3a0Var;
                this.b = context;
                this.c = str;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
            
                if (defpackage.v3a0.b(r11.a, r2, null, false, r5, r6, 6) == r0) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
            
                if (defpackage.v3a0.b(r11.a, r11.c, null, false, r5, r6, 6) == r0) goto L31;
             */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(defpackage.id90 r12, defpackage.v1b<? super kotlin.Unit> r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof iz0.b.a.C0704a
                    if (r0 == 0) goto L14
                    r0 = r13
                    iz0$b$a$a r0 = (iz0.b.a.C0704a) r0
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
                    iz0$b$a$a r0 = new iz0$b$a$a
                    r0.<init>(r11, r13)
                    goto L12
                L1a:
                    java.lang.Object r13 = r6.a
                    y5b r0 = defpackage.y5b.a
                    int r1 = r6.c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L38
                    if (r1 == r3) goto L34
                    if (r1 != r2) goto L2d
                    defpackage.uj50.b(r13)
                    goto La4
                L2d:
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r11)
                    r11 = 0
                    return r11
                L34:
                    defpackage.uj50.b(r13)
                    goto L59
                L38:
                    defpackage.uj50.b(r13)
                    boolean r13 = r12 instanceof defpackage.rb90
                    android.content.Context r1 = r11.b
                    if (r13 == 0) goto L5c
                    rb90 r12 = (defpackage.rb90) r12
                    com.sporty.android.common_ui.uitext.UiText r12 = r12.a
                    java.lang.String r2 = r12.g(r1)
                    k3a0 r5 = defpackage.k3a0.a
                    r6.c = r3
                    v3a0 r1 = r11.a
                    r3 = 0
                    r4 = 0
                    r7 = 6
                    java.lang.Object r11 = defpackage.v3a0.b(r1, r2, r3, r4, r5, r6, r7)
                    if (r11 != r0) goto L59
                    goto La3
                L59:
                    kotlin.Unit r11 = kotlin.Unit.a
                    return r11
                L5c:
                    boolean r13 = r12 instanceof qz0.b
                    if (r13 == 0) goto L79
                    int r13 = com.sportybet.android.social.presentation.SocialActivity.b
                    qz0$b r12 = (qz0.b) r12
                    java.lang.String r5 = r12.a
                    boolean r12 = r12.b
                    r6 = r12 ^ 1
                    r9 = 0
                    java.lang.String r10 = "CUSTOM_CODES"
                    android.content.Context r4 = r11.b
                    r7 = 0
                    r8 = 0
                    android.content.Intent r11 = com.sportybet.android.social.presentation.SocialActivity.a.a(r4, r5, r6, r7, r8, r9, r10)
                    r1.startActivity(r11)
                    goto La7
                L79:
                    boolean r13 = r12 instanceof qz0.a
                    if (r13 == 0) goto La7
                    java.lang.Class<android.content.ClipboardManager> r13 = android.content.ClipboardManager.class
                    java.lang.Object r13 = r1.getSystemService(r13)
                    android.content.ClipboardManager r13 = (android.content.ClipboardManager) r13
                    qz0$a r12 = (qz0.a) r12
                    java.lang.String r12 = r12.a
                    java.lang.String r1 = "custom_code"
                    android.content.ClipData r12 = android.content.ClipData.newPlainText(r1, r12)
                    r13.setPrimaryClip(r12)
                    k3a0 r5 = defpackage.k3a0.a
                    r6.c = r2
                    v3a0 r1 = r11.a
                    java.lang.String r2 = r11.c
                    r3 = 0
                    r4 = 0
                    r7 = 6
                    java.lang.Object r11 = defpackage.v3a0.b(r1, r2, r3, r4, r5, r6, r7)
                    if (r11 != r0) goto La4
                La3:
                    return r0
                La4:
                    kotlin.Unit r11 = kotlin.Unit.a
                    return r11
                La7:
                    kotlin.Unit r11 = kotlin.Unit.a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: iz0.b.a.emit(id90, v1b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oz0 oz0Var, v3a0 v3a0Var, Context context, String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = oz0Var;
            this.c = v3a0Var;
            this.d = context;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to iz0$b for r7v2 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r2
            L10:
                defpackage.uj50.b(r8)
                goto L31
            L14:
                defpackage.uj50.b(r8)
                oz0 r8 = r7.b
                t340 r8 = r8.d
                iz0$b$a r1 = new iz0$b$a
                android.content.Context r4 = r7.d
                java.lang.String r5 = r7.e
                v3a0 r6 = r7.c
                r1.<init>(r6, r4, r5)
                r7.a = r3
                a390<T> r8 = r8.a
                java.lang.Object r7 = r8.collect(r1, r7)
                if (r7 != r0) goto L31
                return r0
            L31:
                defpackage.fkd.a()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: iz0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ class c extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oz0 oz0Var = (oz0) this.a;
            oz0Var.getClass();
            oz0Var.y1(new mz0(oz0Var, null));
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oz0 oz0Var = (oz0) this.a;
            oz0Var.getClass();
            oz0Var.y1(new nz0(oz0Var, null));
            return Unit.a;
        }
    }

    public static final void a(final v3a0 v3a0Var, final gdc gdcVar, final String str, final jz0 jz0Var, final Function0<Unit> function0, final Function1<? super gdc, Unit> function1, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        boolean z;
        final oz0 oz0Var;
        String str2;
        v3a0Var.getClass();
        str.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1698695507);
        int i2 = i | (bVarI.M(gdcVar) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.d(jz0Var.ordinal()) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            String strA = cb40.a(R.string.component_assign_custom_code__custom_code_copied_success, new Object[0], bVarI);
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            oz0 oz0Var2 = (oz0) p8i0.a(jq40.a(oz0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            Integer numValueOf = Integer.valueOf(gdcVar.a);
            boolean zA = ((i2 & 112) == 32) | bVarI.A(oz0Var2) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                z = true;
                a aVar2 = new a(oz0Var2, str, gdcVar, jz0Var, null);
                oz0Var = oz0Var2;
                str2 = str;
                bVarI.r(aVar2);
                objY = aVar2;
            } else {
                z = true;
                str2 = str;
                oz0Var = oz0Var2;
            }
            xvf.g(str2, numValueOf, (Function2) objY, bVarI);
            j590 j590VarG = v1w.g(z, null, bVarI, 6, 2);
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            final ytw ytwVarC = wyh.c(oz0Var.b, bVarI, 0, 7);
            Unit unit = Unit.a;
            boolean zA2 = bVarI.A(oz0Var) | bVarI.A(context) | bVarI.M(strA);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new b(oz0Var, v3a0Var, context, strA, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            v1w.a(function0, null, j590VarG, 0.0f, false, j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12), c68.a(R.color.bg_primary_d_base, bVarI), 0L, 0L, dr8.a, null, null, pp8.b(56382987, new gaj() { // from class: zy0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar5 = d.a.b;
                        d dVarG = h.g(j.g(aVar5, 1.0f), 16.0f, 24.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC = c.c(aVar4, dVarG);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, aivVarC, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                        }
                        hlh0.a(aVar4, dVarC, yka.a.d);
                        twd0 twd0Var = ytwVarC;
                        if (((kz0) twd0Var.getValue()).a) {
                            aVar4.N(141050829);
                            iz0.d(0, aVar4);
                            aVar4.H();
                            aVar3 = aVar4;
                        } else {
                            aVar4.N(141142806);
                            int iOrdinal = ((kz0) twd0Var.getValue()).e.ordinal();
                            Function0 function3 = function0;
                            if (iOrdinal == 0) {
                                aVar4.N(-1796560135);
                                kz0 kz0Var = (kz0) twd0Var.getValue();
                                oz0 oz0Var3 = oz0Var;
                                boolean zA3 = aVar4.A(oz0Var3);
                                Object objY3 = aVar4.y();
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zA3 || objY3 == c0042a2) {
                                    iz0.c cVar = new iz0.c(0, oz0Var3, oz0.class, "onCopyCode", "onCopyCode()Lkotlinx/coroutines/Job;", 8);
                                    aVar4.r(cVar);
                                    objY3 = cVar;
                                }
                                Function0 function4 = (Function0) objY3;
                                boolean zA4 = aVar4.A(oz0Var3);
                                Object objY4 = aVar4.y();
                                if (zA4 || objY4 == c0042a2) {
                                    iz0.d dVar = new iz0.d(0, oz0Var3, oz0.class, "onViewMySportySocialClicked", "onViewMySportySocialClicked()Lkotlinx/coroutines/Job;", 8);
                                    aVar4.r(dVar);
                                    objY4 = dVar;
                                }
                                aVar3 = aVar4;
                                iz0.e(kz0Var, function4, function1, (Function0) objY4, function3, aVar3, 0);
                                aVar3.H();
                            } else {
                                if (iOrdinal != 1) {
                                    throw rg.a(-1796562324, aVar4);
                                }
                                aVar4.N(-1796547152);
                                iz0.c((kz0) twd0Var.getValue(), function2, function3, aVar4, 0);
                                aVar4.H();
                                aVar3 = aVar4;
                            }
                            aVar3.H();
                        }
                        a aVar7 = aVar3;
                        s3a0.b(v3a0Var, androidx.compose.foundation.layout.d.a.b(aVar5, ht.a.h), null, aVar7, 0, 4);
                        aVar7.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 >> 12) & 14, 3078, 7066);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(gdcVar, str, jz0Var, function0, function1, function2, i) { // from class: az0
                public final /* synthetic */ gdc b;
                public final /* synthetic */ String c;
                public final /* synthetic */ jz0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    iz0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, String str2, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        final String str3;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(15751339);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = z ? R.color.text_brand_sub_primary_d_base : R.color.text_type1_primary;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.bg_surface_primary, bVarI), j060.c(8.0f)), 0.0f, 16.0f, 1);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(str, null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, i2 & 14, 0, 131066);
            ty0.a(bVarI, j.i(aVar2, 4.0f));
            str3 = str2;
            lkf0.d(str3, null, c68.a(i3, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVarI), bVarI, (i2 >> 3) & 14, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
        } else {
            str3 = str2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, str3, z) { // from class: gz0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;

                {
                    this.a = str;
                    this.b = str3;
                    this.c = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    iz0.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final kz0 kz0Var, Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        String str;
        final Function0<Unit> function2 = function0;
        androidx.compose.runtime.b bVarI = aVar.i(-1668121443);
        int i2 = (bVarI.M(kz0Var) ? 4 : 2) | i | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            f(R.string.component_assign_custom_code__assignment_failed, (i2 >> 3) & 112, bVarI, function1);
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            b(cb40.a(R.string.component_assign_custom_code__booking_code, new Object[0], bVarI), kz0Var.b, false, bVarI, 384);
            androidx.compose.ui.d dVarF = h.f(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.bg_danger_secondary, bVarI), j060.c(8.0f)), 16.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            h6n.a(qgn.a(), null, null, c68.a(R.color.text_danger, bVarI), bVarI, 48, 4);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            lkf0.d(cb40.a(R.string.component_assign_custom_code__booking_code_high_liability_error, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 0, 0, 131066);
            bVarI.X(true);
            bVarI.X(true);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            String strA = cb40.a(R.string.component_assign_custom_code__custom_code, new Object[0], bVarI);
            gdc gdcVar = kz0Var.c;
            if (gdcVar == null || (str = gdcVar.b) == null) {
                str = "";
            }
            b(strA, str, true, bVarI, 384);
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            function2 = function0;
            xya.b(j.g(aVar2, 1.0f), false, null, sya.a, null, 0.0f, null, function2, dr8.v, bVarI, 100663302 | ((i2 << 18) & 29360128), 118);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function1, i) { // from class: bz0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    iz0.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1622740542);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d dVarG = j.g(androidx.compose.ui.d.a.b, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            q330.a(null, c68.a(R.color.text_type1_primary, bVarI), 4.0f, 0L, 0, 0.0f, bVarI, 384, 57);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new cz0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x03df  */
    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
    /* JADX WARN: Code duplicated, block: B:48:0x0165  */
    /* JADX WARN: Code duplicated, block: B:49:0x0169  */
    /* JADX WARN: Code duplicated, block: B:54:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x020f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0217  */
    /* JADX WARN: Code duplicated, block: B:70:0x021c  */
    /* JADX WARN: Code duplicated, block: B:73:0x029f  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0355  */
    /* JADX WARN: Code duplicated, block: B:84:0x0359  */
    /* JADX WARN: Code duplicated, block: B:91:0x0378  */
    /* JADX WARN: Code duplicated, block: B:94:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:95:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x03cc  */
    public static final void e(final kz0 kz0Var, final Function0<Unit> function0, Function1<? super gdc, Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, androidx.compose.runtime.a aVar, final int i) {
        yka.a.d dVar;
        gdc gdcVar;
        String str;
        int iHashCode;
        yka.a.C1350a c1350a;
        yka.a.C1350a c1350a2;
        int iHashCode2;
        String str2;
        boolean z;
        Object objY;
        int i2;
        int iHashCode3;
        boolean z2;
        boolean z3;
        Object objY2;
        final Function1<? super gdc, Unit> function4 = function1;
        androidx.compose.runtime.b bVarI = aVar.i(454329949);
        int i3 = i | (bVarI.M(kz0Var) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function4) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, ht.a.n, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S) {
                dVar = dVar2;
            } else {
                dVar = dVar2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                f(R.string.component_assign_custom_code__assigned_successfully, (i3 >> 9) & 112, bVarI, function3);
                ty0.a(bVarI, j.i(aVar2, 24.0f));
                String strA = cb40.a(R.string.component_assign_custom_code__booking_code, new Object[0], bVarI);
                String str3 = kz0Var.b;
                gdcVar = kz0Var.c;
                b(strA, str3, false, bVarI, 384);
                ty0.a(bVarI, j.i(aVar2, 4.0f));
                yka.a.d dVar3 = dVar;
                h6n.a(bop.a(), null, null, c68.a(R.color.text_type1_secondary, bVarI), bVarI, 48, 4);
                ty0.a(bVarI, j.i(aVar2, 4.0f));
                String strA2 = cb40.a(R.string.component_assign_custom_code__custom_code, new Object[0], bVarI);
                if (gdcVar != null || (str = gdcVar.b) == null) {
                    str = "";
                }
                b(strA2, str, true, bVarI, 384);
                androidx.compose.ui.d dVarA = hib0.a(aVar2, 16.0f, bVarI, aVar2, 1.0f);
                kw0.j jVar = kw0.a;
                n54.b bVar2 = ht.a.j;
                d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    c1350a = c1350a3;
                } else {
                    c1350a = c1350a3;
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                c1350a2 = c1350a;
                h6n.b(erz.a(R.drawable.ic_check_circle_green_20dp, 0, bVarI), null, null, c68.a(R.color.colorPrimary, bVarI), bVarI, 48, 4);
                ty0.a(bVarI, j.w(aVar2, 16.0f));
                f160 f160Var = f160.a;
                androidx.compose.ui.d dVarA2 = f160Var.a(1.0f, aVar2, true);
                i78 i78VarA2 = g78.a(kVar, ht.a.m, bVarI, 0);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarA2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                if (gdcVar != null) {
                    str2 = gdcVar.b;
                } else {
                    str2 = null;
                }
                lkf0.d(cb40.a(R.string.component_assign_custom_code__custom_vcode_successfully_assigned_confirmation_message, new Object[]{str2}, bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 0, 0, 130042);
                ty0.a(bVarI, j.i(aVar2, 2.0f));
                if ((i3 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (!z || objY == c0042a) {
                    i2 = 0;
                    objY = new dz0(function2, 0);
                    bVarI.r(objY);
                } else {
                    i2 = 0;
                }
                lkf0.d(cb40.a(R.string.component_assign_custom_code__view_at_my_sporty_social_custom_codes, new Object[i2], bVarI), androidx.compose.foundation.d.d(aVar2, false, null, null, (Function0) objY, 15), c68.a(R.color.colorPrimary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 0, 0, 130040);
                bVarI.X(true);
                bVarI.X(true);
                ty0.a(bVarI, j.i(aVar2, 24.0f));
                androidx.compose.ui.d dVarG2 = j.g(aVar2, 1.0f);
                d160 d160VarA2 = b160.a(new kw0.i(12.0f, true, new hw0()), bVar2, bVarI, 6);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarG2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar);
                hlh0.a(bVarI, ne00VarS4, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                vuc0.b(f160Var.a(1.0f, aVar2, true), false, null, null, null, cb40.a(R.string.common_functions__copy, new Object[0], bVarI), null, null, erz.a(R.drawable.icon_copy, 0, bVarI), null, function0, bVarI, 0, (i3 >> 3) & 14, 734);
                androidx.compose.ui.d dVarA3 = f160Var.a(1.0f, aVar2, true);
                if ((i3 & 14) != 4) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z3 = z2 | ((i3 & 896) == 256);
                objY2 = bVarI.y();
                if (!z3 || objY2 == c0042a) {
                    function4 = function1;
                    objY2 = new Function0() { // from class: ez0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            gdc gdcVar2 = kz0Var.c;
                            if (gdcVar2 != null) {
                                function4.invoke(gdcVar2);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    function4 = function1;
                }
                xya.b(dVarA3, false, null, null, null, 0.0f, null, (Function0) objY2, dr8.f, bVarI, 100663296, WebSocketProtocol.PAYLOAD_SHORT);
                bVarI = bVarI;
                bVarI.X(true);
                bVarI.X(true);
            }
            n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            f(R.string.component_assign_custom_code__assigned_successfully, (i3 >> 9) & 112, bVarI, function3);
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            String strA3 = cb40.a(R.string.component_assign_custom_code__booking_code, new Object[0], bVarI);
            String str4 = kz0Var.b;
            gdcVar = kz0Var.c;
            b(strA3, str4, false, bVarI, 384);
            ty0.a(bVarI, j.i(aVar2, 4.0f));
            yka.a.d dVar4 = dVar;
            h6n.a(bop.a(), null, null, c68.a(R.color.text_type1_secondary, bVarI), bVarI, 48, 4);
            ty0.a(bVarI, j.i(aVar2, 4.0f));
            String strA4 = cb40.a(R.string.component_assign_custom_code__custom_code, new Object[0], bVarI);
            if (gdcVar != null) {
                str = "";
            } else {
                str = "";
            }
            b(strA4, str, true, bVarI, 384);
            androidx.compose.ui.d dVarA4 = hib0.a(aVar2, 16.0f, bVarI, aVar2, 1.0f);
            kw0.j jVar2 = kw0.a;
            n54.b bVar3 = ht.a.j;
            d160 d160VarA3 = b160.a(jVar2, bVar3, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarA4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar4);
            if (bVarI.S) {
                c1350a = c1350a3;
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                c1350a = c1350a3;
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar2);
            c1350a2 = c1350a;
            h6n.b(erz.a(R.drawable.ic_check_circle_green_20dp, 0, bVarI), null, null, c68.a(R.color.colorPrimary, bVarI), bVarI, 48, 4);
            ty0.a(bVarI, j.w(aVar2, 16.0f));
            f160 f160Var2 = f160.a;
            androidx.compose.ui.d dVarA5 = f160Var2.a(1.0f, aVar2, true);
            i78 i78VarA3 = g78.a(kVar, ht.a.m, bVarI, 0);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVarI, dVarA5);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar);
            hlh0.a(bVarI, ne00VarS6, dVar4);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC6, cVar2);
            if (gdcVar != null) {
                str2 = gdcVar.b;
            } else {
                str2 = null;
            }
            lkf0.d(cb40.a(R.string.component_assign_custom_code__custom_vcode_successfully_assigned_confirmation_message, new Object[]{str2}, bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, 2.0f));
            if ((i3 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (z) {
                i2 = 0;
                objY = new dz0(function2, 0);
                bVarI.r(objY);
            } else {
                i2 = 0;
                objY = new dz0(function2, 0);
                bVarI.r(objY);
            }
            lkf0.d(cb40.a(R.string.component_assign_custom_code__view_at_my_sporty_social_custom_codes, new Object[i2], bVarI), androidx.compose.foundation.d.d(aVar2, false, null, null, (Function0) objY, 15), c68.a(R.color.colorPrimary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 0, 0, 130040);
            bVarI.X(true);
            bVarI.X(true);
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            androidx.compose.ui.d dVarG3 = j.g(aVar2, 1.0f);
            d160 d160VarA4 = b160.a(new kw0.i(12.0f, true, new hw0()), bVar3, bVarI, 6);
            iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS7 = bVarI.S();
            androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, bVar);
            hlh0.a(bVarI, ne00VarS7, dVar4);
            if (bVarI.S) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC7, cVar2);
            vuc0.b(f160Var2.a(1.0f, aVar2, true), false, null, null, null, cb40.a(R.string.common_functions__copy, new Object[0], bVarI), null, null, erz.a(R.drawable.icon_copy, 0, bVarI), null, function0, bVarI, 0, (i3 >> 3) & 14, 734);
            androidx.compose.ui.d dVarA6 = f160Var2.a(1.0f, aVar2, true);
            if ((i3 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            z3 = z2 | ((i3 & 896) == 256);
            objY2 = bVarI.y();
            if (z3) {
                function4 = function1;
                objY2 = new Function0() { // from class: ez0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        gdc gdcVar2 = kz0Var.c;
                        if (gdcVar2 != null) {
                            function4.invoke(gdcVar2);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                function4 = function1;
                objY2 = new Function0() { // from class: ez0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        gdc gdcVar2 = kz0Var.c;
                        if (gdcVar2 != null) {
                            function4.invoke(gdcVar2);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            xya.b(dVarA6, false, null, null, null, 0.0f, null, (Function0) objY2, dr8.f, bVarI, 100663296, WebSocketProtocol.PAYLOAD_SHORT);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function4, function2, function3, i) { // from class: fz0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    iz0.e(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final int i, final int i2, androidx.compose.runtime.a aVar, Function0 function0) {
        int i3;
        final Function0 function1 = function0;
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-2067723592);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.ui.d dVarG = j.g(androidx.compose.ui.d.a.b, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int i4 = ((i3 >> 3) & 14) | 1572864;
            c6n.a(function1, null, false, null, null, dr8.b, bVarI, i4, 62);
            lkf0.d(cb40.a(i, new Object[0], bVarI), new LayoutWeightElement(1.0f, true), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 0, 0, 131064);
            bVarI = bVarI;
            function1 = function0;
            c6n.a(function1, null, false, null, null, dr8.c, bVarI, i4, 62);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hz0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    iz0.f(i, iA, (a) obj, function1);
                    return Unit.a;
                }
            };
        }
    }
}
