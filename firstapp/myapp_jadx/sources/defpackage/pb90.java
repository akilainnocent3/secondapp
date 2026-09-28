package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.base.timelimits.viewmodel.ShowTimeLimitsViewModel$refreshLimits$1", f = "ShowTimeLimitsViewModel.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 46, WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
public final class pb90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public fwf0 a;
    public ztw b;
    public qb90 c;
    public Object d;
    public int e;
    public final /* synthetic */ qb90 f;

    public static final class a<T> implements myh {
        public final /* synthetic */ qb90 a;

        /* JADX INFO: renamed from: pb90$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.limits.base.timelimits.viewmodel.ShowTimeLimitsViewModel$refreshLimits$1$1", f = "ShowTimeLimitsViewModel.kt", l = {49}, m = "emit", v = 2)
        public static final class C0965a extends x1b {
            public wwd0 a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0965a(a<? super T> aVar, v1b<? super C0965a> v1bVar) {
                super(v1bVar);
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public a(qb90 qb90Var) {
            this.a = qb90Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lk50<fwf0> lk50Var, v1b<? super Unit> v1bVar) {
            C0965a c0965a;
            wwd0 wwd0Var;
            qb90 qb90Var = this.a;
            wwd0 wwd0Var2 = qb90Var.a;
            if (v1bVar instanceof C0965a) {
                c0965a = (C0965a) v1bVar;
                int i = c0965a.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0965a.d = i - Integer.MIN_VALUE;
                } else {
                    c0965a = new C0965a(this, v1bVar);
                }
            } else {
                c0965a = new C0965a(this, v1bVar);
            }
            Object objZ1 = c0965a.b;
            y5b y5bVar = y5b.a;
            int i2 = c0965a.d;
            if (i2 == 0) {
                uj50.b(objZ1);
                if (lk50Var instanceof lk50.c) {
                    fwf0 fwf0Var = (fwf0) ((lk50.c) lk50Var).a;
                    c0965a.a = wwd0Var2;
                    c0965a.d = 1;
                    objZ1 = qb90Var.z1(fwf0Var, c0965a);
                    if (objZ1 == y5bVar) {
                        wwd0Var = wwd0Var2;
                        return y5bVar;
                    }
                } else if (lk50Var instanceof lk50.a) {
                    wwd0Var2.setValue(nb90.a.a);
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    wwd0Var2.setValue(nb90.b.a);
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0 wwd0Var3 = c0965a.a;
            uj50.b(objZ1);
            wwd0Var = wwd0Var3;
            wwd0Var = wwd0Var2;
            wwd0Var.setValue(objZ1);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb90(qb90 qb90Var, v1b<? super pb90> v1bVar) {
        super(2, v1bVar);
        this.f = qb90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pb90(this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pb90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r2.collect(r9, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r4.g(r1, r3) != false) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:31:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:30:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.e
            r2 = 3
            r3 = 2
            r4 = 0
            qb90 r5 = r8.f
            r6 = 1
            if (r1 == 0) goto L2e
            if (r1 == r6) goto L2a
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r8.d
            qb90 r3 = r8.c
            ztw r4 = r8.b
            fwf0 r5 = r8.a
            defpackage.uj50.b(r9)
            goto L93
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r4
        L25:
            defpackage.uj50.b(r9)
            goto L9f
        L2a:
            defpackage.uj50.b(r9)
            goto L42
        L2e:
            defpackage.uj50.b(r9)
            gfy r9 = r5.i
            des r9 = r9.a
            lyh r9 = r9.k()
            r8.e = r6
            java.lang.Object r9 = defpackage.s0i.a(r9, r8)
            if (r9 != r0) goto L42
            goto L8e
        L42:
            fwf0 r9 = (defpackage.fwf0) r9
            java.lang.Integer r1 = r9.a
            if (r1 != 0) goto L70
            java.lang.Integer r1 = r9.c
            if (r1 == 0) goto L4d
            goto L70
        L4d:
            qfk r9 = r5.e
            des r1 = r9.a
            or60 r1 = r1.c()
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = defpackage.vch0.b
            yzh r1 = defpackage.bm50.b(r1, r2)
            pfk r2 = new pfk
            r2.<init>(r1, r6, r9)
            pb90$a r9 = new pb90$a
            r9.<init>(r5)
            r8.a = r4
            r8.e = r3
            java.lang.Object r8 = r2.collect(r9, r8)
            if (r8 != r0) goto L9f
            goto L8e
        L70:
            wwd0 r1 = r5.a
            r4 = r1
        L73:
            java.lang.Object r1 = r4.getValue()
            r3 = r1
            nb90 r3 = (defpackage.nb90) r3
            boolean r6 = r3 instanceof nb90.a
            if (r6 != 0) goto L99
            r8.a = r9
            r8.b = r4
            r8.c = r5
            r8.d = r1
            r8.e = r2
            java.lang.Object r3 = r5.z1(r9, r8)
            if (r3 != r0) goto L8f
        L8e:
            return r0
        L8f:
            r7 = r5
            r5 = r9
            r9 = r3
            r3 = r7
        L93:
            nb90 r9 = (defpackage.nb90) r9
            r7 = r3
            r3 = r9
            r9 = r5
            r5 = r7
        L99:
            boolean r1 = r4.g(r1, r3)
            if (r1 == 0) goto L73
        L9f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
