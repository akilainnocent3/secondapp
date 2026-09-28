package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.security.biometric.BiometricAuthStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MultiFactorAuthFragment$collectMultiFactorAuthState$$inlined$collectWithLifecycle$default$1", f = "MultiFactorAuthFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class jaw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ haw d;

    @c0d(c = "com.sportybet.feature.multifactorauth.MultiFactorAuthFragment$collectMultiFactorAuthState$$inlined$collectWithLifecycle$default$1$1", f = "MultiFactorAuthFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ haw d;

        /* JADX INFO: renamed from: jaw$a$a, reason: collision with other inner class name */
        public static final class C0715a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ haw b;

            public C0715a(v5b v5bVar, haw hawVar) {
                this.b = hawVar;
                this.a = v5bVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0043  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                int i;
                oaw oawVar = (oaw) t;
                ohp<Object>[] ohpVarArr = haw.E;
                final haw hawVar = this.b;
                mla.i(hawVar.m0().e, new op8(-571616685, new maw(oawVar, hawVar), true));
                BiometricAuthStatus biometricAuthStatus = (BiometricAuthStatus) hawVar.n0().L.getValue();
                ComposeView composeView = hawVar.m0().c;
                if (biometricAuthStatus == BiometricAuthStatus.Ready || biometricAuthStatus == BiometricAuthStatus.AvailableButNotEnrolled) {
                    psm psmVar = hawVar.w;
                    if (psmVar == null) {
                        Intrinsics.n("countryManager");
                        throw null;
                    }
                    if (psmVar.r()) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 8;
                }
                composeView.setVisibility(i);
                if (hawVar.m0().c.getVisibility() == 0) {
                    mla.i(hawVar.m0().c, new op8(1794815567, new v9w(hawVar), true));
                }
                final String str = oawVar.a;
                final boolean z = oawVar.c;
                final boolean mainSwitchEnabled = oawVar.d.getMainSwitchEnabled();
                mla.i(hawVar.m0().v, new op8(-1186276751, new Function2() { // from class: faw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        ohp<Object>[] ohpVarArr2 = haw.E;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final String str2 = str;
                            final boolean z2 = z;
                            final boolean z3 = mainSwitchEnabled;
                            final haw hawVar2 = hawVar;
                            o0z.a(null, null, null, null, null, pp8.b(-359000094, new Function2() { // from class: gaw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ohp<Object>[] ohpVarArr3 = haw.E;
                                    boolean z4 = true;
                                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        if (z2 && !z3) {
                                            z4 = false;
                                        }
                                        final haw hawVar3 = hawVar2;
                                        boolean zA = aVar2.A(hawVar3);
                                        Object objY = aVar2.y();
                                        if (zA || objY == a.C0041a.a) {
                                            objY = new Function0() { // from class: z9w
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    ohp<Object>[] ohpVarArr4 = haw.E;
                                                    hawVar3.n0().x1(b9w.b.a);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY);
                                        }
                                        n9w.b(0, aVar2, str2, (Function0) objY, z4);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar), aVar, 196608);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
                final boolean z2 = oawVar.b;
                mla.i(hawVar.m0().i, new op8(848780987, new Function2() { // from class: caw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        ohp<Object>[] ohpVarArr2 = haw.E;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final boolean z3 = z2;
                            final haw hawVar2 = hawVar;
                            o0z.a(null, null, null, null, null, pp8.b(-714674582, new Function2() { // from class: w9w
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ohp<Object>[] ohpVarArr3 = haw.E;
                                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        final haw hawVar3 = hawVar2;
                                        boolean zA = aVar2.A(hawVar3);
                                        Object objY = aVar2.y();
                                        if (zA || objY == a.C0041a.a) {
                                            objY = new Function0() { // from class: y9w
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    ohp<Object>[] ohpVarArr4 = haw.E;
                                                    hawVar3.n0().x1(b9w.c.a);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY);
                                        }
                                        n9w.d(0, aVar2, (Function0) objY, z3);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar), aVar, 196608);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, haw hawVar) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = hawVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0715a c0715a = new C0715a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0715a, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaw(ibs ibsVar, lyh lyhVar, v1b v1bVar, haw hawVar) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = hawVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new jaw(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jaw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
