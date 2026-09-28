package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog$observeBuildAndGoData$$inlined$collectWithLifecycle$default$1", f = "BuildAndGoRunningPageDialog.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class zf5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ n1i c;
    public final /* synthetic */ BuildAndGoRunningPageDialog d;

    @c0d(c = "com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog$observeBuildAndGoData$$inlined$collectWithLifecycle$default$1$1", f = "BuildAndGoRunningPageDialog.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ n1i c;
        public final /* synthetic */ BuildAndGoRunningPageDialog d;

        /* JADX INFO: renamed from: zf5$a$a, reason: collision with other inner class name */
        public static final class C1386a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ BuildAndGoRunningPageDialog b;

            public C1386a(v5b v5bVar, BuildAndGoRunningPageDialog buildAndGoRunningPageDialog) {
                this.b = buildAndGoRunningPageDialog;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                zvi zviVar;
                Pair pair = (Pair) t;
                lk50 lk50Var = (lk50) pair.a;
                lk50 lk50Var2 = (lk50) pair.b;
                boolean z = lk50Var instanceof lk50.b;
                boolean z2 = false;
                BuildAndGoRunningPageDialog buildAndGoRunningPageDialog = this.b;
                if (z || (lk50Var2 instanceof lk50.b)) {
                    buildAndGoRunningPageDialog.v = false;
                } else {
                    final Sports sports = (Sports) bm50.i(lk50Var);
                    final Round round = (Round) bm50.i(lk50Var2);
                    if (sports != null && sports.getActive() && round != null) {
                        z2 = true;
                    }
                    buildAndGoRunningPageDialog.v = z2;
                    if (((Boolean) buildAndGoRunningPageDialog.y.getValue()).booleanValue() && sports != null && sports.getActive() && round != null && (zviVar = buildAndGoRunningPageDialog.f) != null) {
                        ComposeView composeView = zviVar.d;
                        final String str = round.roundId;
                        final f fVarN0 = buildAndGoRunningPageDialog.n0();
                        composeView.setContent(new op8(-2059699472, new Function2() { // from class: nd5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final Object obj3 = str;
                                    aVar.C(608731486, obj3);
                                    final Round round2 = round;
                                    final Sports sports2 = sports;
                                    final f fVar = fVarN0;
                                    o0z.a(null, null, null, null, null, pp8.b(1209319508, new Function2() { // from class: od5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            a aVar2 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                qd5.a(obj3, round2, sports2, fVar, aVar2, (Sports.$stable << 6) | 4096);
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar), aVar, 196608);
                                    aVar.K();
                                } else {
                                    aVar.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n1i n1iVar, v1b v1bVar, BuildAndGoRunningPageDialog buildAndGoRunningPageDialog) {
            super(2, v1bVar);
            this.c = n1iVar;
            this.d = buildAndGoRunningPageDialog;
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
                C1386a c1386a = new C1386a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1386a, this) == y5bVar) {
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
    public zf5(ibs ibsVar, n1i n1iVar, v1b v1bVar, BuildAndGoRunningPageDialog buildAndGoRunningPageDialog) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = n1iVar;
        this.d = buildAndGoRunningPageDialog;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new zf5(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zf5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
