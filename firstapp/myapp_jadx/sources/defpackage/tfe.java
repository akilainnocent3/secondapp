package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.fragment.app.e;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.platform.features.newotp.agent.b;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.auth.AuthNavigatorImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltfe;", "Landroidx/fragment/app/Fragment;", "Llit;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tfe extends cql implements lit {
    public azm f;
    public AuthNavigatorImpl i;
    public uqm v;
    public final b390 w = d390.b(1, 0, null, 6);
    public final q8i0 y = new q8i0(jq40.a(au7.class), new d(), new f(), new e());

    @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementFragment$DeviceManagementNavGraph$1$1$1$1$1$1", f = "DeviceManagementFragment.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ phe b;
        public final /* synthetic */ phx c;

        /* JADX INFO: renamed from: tfe$a$a, reason: collision with other inner class name */
        public static final class C1134a<T> implements myh {
            public final /* synthetic */ phx a;

            public C1134a(phx phxVar) {
                this.a = phxVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                String str;
                ffe ffeVar = (ffe) obj;
                if (!(ffeVar instanceof ffe.a)) {
                    uhc.a();
                    return null;
                }
                ffe.a aVar = (ffe.a) ffeVar;
                dge dgeVar = aVar.a;
                dgeVar.getClass();
                if (dgeVar.equals(dge.b.a)) {
                    str = "logout_device";
                } else if (dgeVar.equals(dge.a.a)) {
                    str = "block_device";
                } else if (dgeVar.equals(dge.d.a)) {
                    str = "unblock_device";
                } else {
                    if (!dgeVar.equals(dge.c.a)) {
                        uhc.a();
                        return null;
                    }
                    str = "logout_other_devices";
                }
                yfx.h(this.a, new b9g(str, aVar.b), null, 6);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(phe pheVar, phx phxVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = pheVar;
            this.c = phxVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to tfe$a for r5v2 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L10:
                defpackage.uj50.b(r6)
                goto L2d
            L14:
                defpackage.uj50.b(r6)
                phe r6 = r5.b
                t340 r6 = r6.v
                tfe$a$a r1 = new tfe$a$a
                phx r4 = r5.c
                r1.<init>(r4)
                r5.a = r3
                a390<T> r6 = r6.a
                java.lang.Object r5 = r6.collect(r1, r5)
                if (r5 != r0) goto L2d
                return r0
            L2d:
                defpackage.fkd.a()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: tfe.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementFragment$DeviceManagementNavGraph$1$1$1$2$1$1", f = "DeviceManagementFragment.kt", l = {138}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ p9g b;
        public final /* synthetic */ phx c;
        public final /* synthetic */ tfe d;
        public final /* synthetic */ tnu<OtpModule<OtpData.DeviceBlocking>, OtpData.DeviceBlocking> e;
        public final /* synthetic */ tnu<OtpModule<OtpData.DeviceLogout>, OtpData.DeviceLogout> f;

        public static final class a<T> implements myh {
            public final /* synthetic */ phx a;
            public final /* synthetic */ tfe b;
            public final /* synthetic */ tnu<OtpModule<OtpData.DeviceBlocking>, OtpData.DeviceBlocking> c;
            public final /* synthetic */ tnu<OtpModule<OtpData.DeviceLogout>, OtpData.DeviceLogout> d;

            public a(phx phxVar, tfe tfeVar, tnu<OtpModule<OtpData.DeviceBlocking>, OtpData.DeviceBlocking> tnuVar, tnu<OtpModule<OtpData.DeviceLogout>, OtpData.DeviceLogout> tnuVar2) {
                this.a = phxVar;
                this.b = tfeVar;
                this.c = tnuVar;
                this.d = tnuVar2;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                vu60 vu60VarA;
                e9g e9gVar = (e9g) obj;
                boolean z = e9gVar instanceof e9g.c;
                tfe tfeVar = this.b;
                if (z) {
                    phx phxVar = this.a;
                    ifx ifxVarE = phxVar.e();
                    if (ifxVarE != null && (vu60VarA = ifxVarE.a()) != null) {
                        vu60VarA.e(((e9g.c) e9gVar).a, "password_success");
                    }
                    androidx.fragment.app.e eVarRequireActivity = tfeVar.requireActivity();
                    eVarRequireActivity.getClass();
                    wix.b(phxVar, eVarRequireActivity);
                } else if (e9gVar instanceof e9g.d) {
                    AuthNavigatorImpl authNavigatorImpl = tfeVar.i;
                    if (authNavigatorImpl == null) {
                        Intrinsics.n("authNavigator");
                        throw null;
                    }
                    Context contextRequireContext = tfeVar.requireContext();
                    contextRequireContext.getClass();
                    authNavigatorImpl.navigateToForgetPasswordWithOTP(contextRequireContext, ((e9g.d) e9gVar).a);
                } else if (e9gVar instanceof e9g.a) {
                    this.c.b(((e9g.a) e9gVar).a);
                } else {
                    if (!(e9gVar instanceof e9g.b)) {
                        uhc.a();
                        return null;
                    }
                    this.d.b(((e9g.b) e9gVar).a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p9g p9gVar, phx phxVar, tfe tfeVar, tnu<OtpModule<OtpData.DeviceBlocking>, OtpData.DeviceBlocking> tnuVar, tnu<OtpModule<OtpData.DeviceLogout>, OtpData.DeviceLogout> tnuVar2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = p9gVar;
            this.c = phxVar;
            this.d = tfeVar;
            this.e = tnuVar;
            this.f = tnuVar2;
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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to tfe$b for r8v2 'this'  v1b
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
                p9g r9 = r8.b
                t340 r9 = r9.A
                tfe$b$a r1 = new tfe$b$a
                tnu<com.sporty.android.platform.features.newotp.util.OtpModule<com.sporty.android.platform.features.newotp.util.OtpData$DeviceBlocking>, com.sporty.android.platform.features.newotp.util.OtpData$DeviceBlocking> r4 = r8.e
                tnu<com.sporty.android.platform.features.newotp.util.OtpModule<com.sporty.android.platform.features.newotp.util.OtpData$DeviceLogout>, com.sporty.android.platform.features.newotp.util.OtpData$DeviceLogout> r5 = r8.f
                phx r6 = r8.c
                tfe r7 = r8.d
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
            throw new UnsupportedOperationException("Method not decompiled: tfe.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementFragment$onLogin$1", f = "DeviceManagementFragment.kt", l = {185}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tfe.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = tfe.this.w;
                Unit unit = Unit.a;
                this.a = 1;
                if (b390Var.emit(unit, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return tfe.this.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return tfe.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return tfe.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public final void m0(final int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1045849950);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            final phx phxVarC = mr10.c(new vkx[0], bVarI);
            o0z.a(null, null, null, null, null, pp8.b(-1776804211, new Function2() { // from class: kfe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ude udeVar = ude.INSTANCE;
                        final phx phxVar = phxVarC;
                        boolean zA = aVar2.A(phxVar);
                        final tfe tfeVar = this;
                        boolean zA2 = zA | aVar2.A(tfeVar);
                        Object objY = aVar2.y();
                        if (zA2 || objY == a.C0041a.a) {
                            objY = new Function1() { // from class: mfe
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ghx ghxVar = (ghx) obj3;
                                    ghxVar.getClass();
                                    final phx phxVar2 = phxVar;
                                    final tfe tfeVar2 = tfeVar;
                                    op8 op8Var = new op8(1220207118, new iaj() { // from class: nfe
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            ifx ifxVar = (ifx) obj5;
                                            a aVar3 = (a) obj6;
                                            ((Integer) obj7).getClass();
                                            ((pf0) obj4).getClass();
                                            ifxVar.getClass();
                                            w8i0 w8i0VarA = zdt.a(aVar3);
                                            if (w8i0VarA == null) {
                                                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                return null;
                                            }
                                            phe pheVar = (phe) p8i0.a(jq40.a(phe.class), w8i0VarA, null, cll.a(w8i0VarA, aVar3), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar3);
                                            Unit unit = Unit.a;
                                            boolean zA3 = aVar3.A(pheVar);
                                            final phx phxVar3 = phxVar2;
                                            boolean zA4 = zA3 | aVar3.A(phxVar3);
                                            Object objY2 = aVar3.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA4 || objY2 == c0042a) {
                                                objY2 = new tfe.a(pheVar, phxVar3, null);
                                                aVar3.r(objY2);
                                            }
                                            xvf.e(aVar3, unit, (Function2) objY2);
                                            vu60 vu60VarA = ifxVar.a();
                                            boolean zA5 = aVar3.A(phxVar3);
                                            final tfe tfeVar3 = tfeVar2;
                                            boolean zA6 = zA5 | aVar3.A(tfeVar3);
                                            Object objY3 = aVar3.y();
                                            if (zA6 || objY3 == c0042a) {
                                                objY3 = new Function0() { // from class: ife
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        e eVarRequireActivity = tfeVar3.requireActivity();
                                                        eVarRequireActivity.getClass();
                                                        wix.b(phxVar3, eVarRequireActivity);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar3.r(objY3);
                                            }
                                            Function0 function0 = (Function0) objY3;
                                            boolean zA7 = aVar3.A(tfeVar3);
                                            Object objY4 = aVar3.y();
                                            if (zA7 || objY4 == c0042a) {
                                                objY4 = new jfe(tfeVar3, 0);
                                                aVar3.r(objY4);
                                            }
                                            mhe.b(pheVar, vu60VarA, function0, (Function1) objY4, aVar3, 8);
                                            return unit;
                                        }
                                    }, true);
                                    o2g o2gVar = o2g.a;
                                    o2gVar.getClass();
                                    m2g m2gVar = m2g.a;
                                    hhx.a(ghxVar, jq40.a(ude.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                                    hhx.a(ghxVar, jq40.a(b9g.class), o2gVar, m2gVar, null, null, null, null, new op8(679739333, new iaj() { // from class: ofe
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            a aVar3 = (a) obj6;
                                            ((Integer) obj7).getClass();
                                            ((pf0) obj4).getClass();
                                            ((ifx) obj5).getClass();
                                            w8i0 w8i0VarA = zdt.a(aVar3);
                                            if (w8i0VarA == null) {
                                                ib5.a(LxHElgWAiSeM.CmGvCWomua);
                                                return null;
                                            }
                                            final p9g p9gVar = (p9g) p8i0.a(jq40.a(p9g.class), w8i0VarA, null, cll.a(w8i0VarA, aVar3), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar3);
                                            boolean zA3 = aVar3.A(p9gVar);
                                            Object objY2 = aVar3.y();
                                            int i3 = 0;
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA3 || objY2 == c0042a) {
                                                objY2 = new pfe(p9gVar, i3);
                                                aVar3.r(objY2);
                                            }
                                            tnu tnuVarC = b.c((Function1) objY2, aVar3);
                                            boolean zA4 = aVar3.A(p9gVar);
                                            Object objY3 = aVar3.y();
                                            if (zA4 || objY3 == c0042a) {
                                                objY3 = new qfe(p9gVar, i3);
                                                aVar3.r(objY3);
                                            }
                                            tnu tnuVarC2 = b.c((Function1) objY3, aVar3);
                                            Unit unit = Unit.a;
                                            boolean zA5 = aVar3.A(p9gVar);
                                            final phx phxVar3 = phxVar2;
                                            boolean zA6 = zA5 | aVar3.A(phxVar3);
                                            final tfe tfeVar3 = tfeVar2;
                                            boolean zA7 = aVar3.A(tfeVar3) | zA6 | aVar3.A(tnuVarC) | aVar3.A(tnuVarC2);
                                            Object objY4 = aVar3.y();
                                            if (zA7 || objY4 == c0042a) {
                                                tfe.b bVar = new tfe.b(p9gVar, phxVar3, tfeVar3, tnuVarC, tnuVarC2, null);
                                                aVar3.r(bVar);
                                                objY4 = bVar;
                                            }
                                            xvf.e(aVar3, unit, (Function2) objY4);
                                            boolean zA8 = aVar3.A(phxVar3) | aVar3.A(tfeVar3);
                                            Object objY5 = aVar3.y();
                                            if (zA8 || objY5 == c0042a) {
                                                objY5 = new Function0() { // from class: rfe
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        e eVarRequireActivity = tfeVar3.requireActivity();
                                                        eVarRequireActivity.getClass();
                                                        wix.b(phxVar3, eVarRequireActivity);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar3.r(objY5);
                                            }
                                            Function0 function0 = (Function0) objY5;
                                            boolean zA9 = aVar3.A(tfeVar3);
                                            Object objY6 = aVar3.y();
                                            if (zA9 || objY6 == c0042a) {
                                                objY6 = new sfe(tfeVar3, i3);
                                                aVar3.r(objY6);
                                            }
                                            g9g.a(p9gVar, function0, (Function0) objY6, aVar3, 8);
                                            b390 b390Var = tfeVar3.w;
                                            boolean zA10 = aVar3.A(p9gVar);
                                            Object objY7 = aVar3.y();
                                            if (zA10 || objY7 == c0042a) {
                                                objY7 = new Function1() { // from class: hfe
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj8) {
                                                        ((Unit) obj8).getClass();
                                                        p9gVar.z.a(new e9g.c(null));
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar3.r(objY7);
                                            }
                                            abs.a(b390Var, null, null, (Function1) objY7, aVar3, 0);
                                            return unit;
                                        }
                                    }, true));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY);
                        }
                        uix.b(phxVar, udeVar, null, null, null, null, null, null, null, (Function1) objY, aVar2, 48, 2044);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: lfe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.m0(iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(1356839113, new Function2() { // from class: gfe
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.a.m0(0, aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        uqm uqmVar = this.v;
        if (uqmVar != null) {
            uqmVar.removeLoginEventListener(this);
        } else {
            Intrinsics.n("iAccountHelper");
            throw null;
        }
    }

    @Override // defpackage.lit
    public final void onLogin() {
        ej5.c(ebs.a(getLifecycle()), null, null, new c(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        uqm uqmVar = this.v;
        if (uqmVar != null) {
            uqmVar.addLoginEventListener(this);
        } else {
            Intrinsics.n("iAccountHelper");
            throw null;
        }
    }
}
