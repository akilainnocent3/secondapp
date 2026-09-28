package defpackage;

import com.sportygames.commons.models.GPSData;
import com.sportygames.spin2win.model.PlaceBetPayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e5b0 implements poy {
    public final /* synthetic */ v4b0 a;
    public final /* synthetic */ PlaceBetPayload b;
    public final /* synthetic */ kej c;

    @c0d(c = "com.sportygames.spin2win.viewmodel.Spin2WinViewModel$placeBetWithGPS$1$onPermissionGranted$1", f = "Spin2WinViewModel.kt", l = {485}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public dq40 a;
        public int b;
        public final /* synthetic */ v4b0 c;
        public final /* synthetic */ PlaceBetPayload d;
        public final /* synthetic */ kej e;

        /* JADX INFO: renamed from: e5b0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.spin2win.viewmodel.Spin2WinViewModel$placeBetWithGPS$1$onPermissionGranted$1$1", f = "Spin2WinViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C0514a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ dq40<GPSData> a;
            public final /* synthetic */ kej b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0514a(dq40<GPSData> dq40Var, kej kejVar, v1b<? super C0514a> v1bVar) {
                super(2, v1bVar);
                this.a = dq40Var;
                this.b = kejVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0514a(this.a, this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0514a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                kej kejVar = this.b;
                this.a.a = kejVar != null ? kejVar.a() : 0;
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v4b0 v4b0Var, PlaceBetPayload placeBetPayload, kej kejVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = v4b0Var;
            this.d = placeBetPayload;
            this.e = kejVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            dq40 dq40Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                dq40 dq40VarA = j6w.a(obj);
                pfd pfdVar = fse.a;
                odd oddVar = odd.b;
                C0514a c0514a = new C0514a(dq40VarA, this.e, null);
                this.a = dq40VarA;
                this.b = 1;
                if (ej5.d(oddVar, c0514a, this) == y5bVar) {
                    return y5bVar;
                }
                dq40Var = dq40VarA;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dq40Var = this.a;
                uj50.b(obj);
            }
            GPSData gPSData = (GPSData) dq40Var.a;
            PlaceBetPayload placeBetPayload = this.d;
            if (gPSData != null) {
                placeBetPayload.setGpsData(gPSData);
            }
            v4b0 v4b0Var = this.c;
            ej5.c(o8i0.d(v4b0Var), null, null, new d5b0(true, v4b0Var, placeBetPayload, null), 3);
            return Unit.a;
        }
    }

    public e5b0(v4b0 v4b0Var, PlaceBetPayload placeBetPayload, kej kejVar) {
        this.a = v4b0Var;
        this.b = placeBetPayload;
        this.c = kejVar;
    }

    @Override // defpackage.poy
    public final void a() {
        v4b0 v4b0Var = this.a;
        ej5.c(o8i0.d(v4b0Var), null, null, new a(v4b0Var, this.b, this.c, null), 3);
    }
}
