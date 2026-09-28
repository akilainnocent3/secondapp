package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class j4b {

    public static final class a implements ply {
        public final /* synthetic */ long a;

        public a(long j) {
            this.a = j;
        }

        @Override // defpackage.ply
        public final long a() {
            return this.a;
        }
    }

    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ fff0 a;
        public final /* synthetic */ iif0 b;

        @c0d(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ u020 b;
            public final /* synthetic */ fff0 c;
            public final /* synthetic */ iif0 d;

            /* JADX INFO: renamed from: j4b$b$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1094}, m = "invokeSuspend")
            public static final class C0707a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ u020 b;
                public final /* synthetic */ fff0 c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0707a(u020 u020Var, fff0 fff0Var, v1b<? super C0707a> v1bVar) {
                    super(2, v1bVar);
                    this.b = u020Var;
                    this.c = fff0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0707a(this.b, this.c, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0707a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        this.a = 1;
                        Object objD = w5b.d(new kkt(this.b, this.c, null), this);
                        if (objD != obj2) {
                            objD = Unit.a;
                        }
                        if (objD == obj2) {
                            return obj2;
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

            /* JADX INFO: renamed from: j4b$b$a$b, reason: collision with other inner class name */
            @c0d(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1097}, m = "invokeSuspend")
            public static final class C0708b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ u020 b;
                public final /* synthetic */ iif0 c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0708b(u020 u020Var, iif0 iif0Var, v1b<? super C0708b> v1bVar) {
                    super(2, v1bVar);
                    this.b = u020Var;
                    this.c = iif0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0708b(this.b, this.c, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0708b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        k4b k4bVar = new k4b(this.c, 0);
                        this.a = 1;
                        if (u4f0.d(this.b, null, k4bVar, this, 7) == y5bVar) {
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
            public a(u020 u020Var, fff0 fff0Var, iif0 iif0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = u020Var;
                this.c = fff0Var;
                this.d = iif0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, this.c, this.d, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                v5b v5bVar = (v5b) this.a;
                a6b a6bVar = a6b.d;
                fff0 fff0Var = this.c;
                u020 u020Var = this.b;
                ej5.c(v5bVar, null, a6bVar, new C0707a(u020Var, fff0Var, null), 1);
                ej5.c(v5bVar, null, a6bVar, new C0708b(u020Var, this.d, null), 1);
                return Unit.a;
            }
        }

        public b(fff0 fff0Var, iif0 iif0Var) {
            this.a = fff0Var;
            this.b = iif0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            Object objD = w5b.d(new a(u020Var, this.a, this.b, null), v1bVar);
            return objD == y5b.a ? objD : Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:208:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:211:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:213:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:215:0x0407  */
    /* JADX WARN: Code duplicated, block: B:216:0x0417  */
    /* JADX WARN: Code duplicated, block: B:219:0x041c  */
    /* JADX WARN: Code duplicated, block: B:221:0x0425  */
    /* JADX WARN: Code duplicated, block: B:223:0x042d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x0448  */
    /* JADX WARN: Code duplicated, block: B:233:0x045a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0465  */
    /* JADX WARN: Code duplicated, block: B:239:0x0479  */
    /* JADX WARN: Code duplicated, block: B:241:0x047d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0489  */
    /* JADX WARN: Code duplicated, block: B:247:0x0498  */
    /* JADX WARN: Code duplicated, block: B:250:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:253:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:256:0x0538  */
    /* JADX WARN: Code duplicated, block: B:257:0x053d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x0565  */
    /* JADX WARN: Code duplicated, block: B:264:0x058a  */
    /* JADX WARN: Code duplicated, block: B:265:0x058c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0594  */
    /* JADX WARN: Code duplicated, block: B:269:0x0596  */
    /* JADX WARN: Code duplicated, block: B:272:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:273:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:276:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:278:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:284:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:290:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x065f  */
    /* JADX WARN: Code duplicated, block: B:295:0x0686  */
    /* JADX WARN: Code duplicated, block: B:299:0x0690  */
    /* JADX WARN: Code duplicated, block: B:301:0x0696 A[PHI: r28
      0x0696: PHI (r28v4 n6s) = (r28v2 n6s), (r28v6 n6s) binds: [B:300:0x0694, B:298:0x068d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:302:0x0698  */
    /* JADX WARN: Code duplicated, block: B:305:0x06a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:308:0x06af  */
    /* JADX WARN: Code duplicated, block: B:311:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:312:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:315:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:316:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:319:0x0706  */
    /* JADX WARN: Code duplicated, block: B:320:0x0708  */
    /* JADX WARN: Code duplicated, block: B:323:0x071a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x0722  */
    /* JADX WARN: Code duplicated, block: B:329:0x073b  */
    /* JADX WARN: Code duplicated, block: B:332:0x0778  */
    /* JADX WARN: Code duplicated, block: B:333:0x077a  */
    /* JADX WARN: Code duplicated, block: B:336:0x0787 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:337:0x0789  */
    /* JADX WARN: Code duplicated, block: B:340:0x079f  */
    /* JADX WARN: Code duplicated, block: B:341:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:344:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:345:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:348:0x07c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:351:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:354:0x080c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:363:0x083b  */
    /* JADX WARN: Code duplicated, block: B:365:0x083e  */
    /* JADX WARN: Code duplicated, block: B:366:0x084e  */
    /* JADX WARN: Code duplicated, block: B:369:0x085c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:370:0x085e  */
    /* JADX WARN: Code duplicated, block: B:373:0x0878  */
    /* JADX WARN: Code duplicated, block: B:374:0x087a  */
    /* JADX WARN: Code duplicated, block: B:377:0x0882  */
    /* JADX WARN: Code duplicated, block: B:379:0x0888  */
    /* JADX WARN: Code duplicated, block: B:385:0x0896 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:386:0x0898  */
    /* JADX WARN: Code duplicated, block: B:389:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:390:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:394:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:396:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:400:0x08f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:401:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:404:0x091b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:405:0x091d  */
    /* JADX WARN: Code duplicated, block: B:408:0x0985  */
    /* JADX WARN: Code duplicated, block: B:416:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:421:0x09b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r15v18, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r15v19, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r15v2, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r15v21, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r57v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    public static final void a(final ijf0 ijf0Var, final Function1 function1, final d dVar, final imf0 imf0Var, final uni0 uni0Var, final Function1 function2, final psw pswVar, final ya5 ya5Var, final boolean z, final int i, final int i2, final bcn bcnVar, final tnp tnpVar, final boolean z2, final boolean z3, final gaj gajVar, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        int i6;
        ?? r15;
        ?? r12;
        Object n6sVar;
        imf0 imf0Var2;
        boolean z4;
        mmd mmdVar;
        f8i.a aVar2;
        Object obj;
        f8i.a aVar3;
        mmd mmdVar2;
        osf osfVar;
        dkf0 dkf0Var;
        ulf0 ulf0Var;
        String str;
        nk0 nk0Var;
        boolean z5;
        boolean z6;
        long j;
        ijf0 ijf0VarA;
        ijf0 ijf0Var2;
        Object objY;
        Object obj2;
        odh0 odh0Var;
        long jCurrentTimeMillis;
        Object objY2;
        final v5b v5bVar;
        Object objY3;
        final ia5 ia5Var;
        Object objY4;
        final iif0 iif0Var;
        q780 q780Var;
        cet cetVar;
        Context context;
        CoroutineContext coroutineContext;
        boolean zM;
        Object objY5;
        vj10 vj10Var;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        final ujf0 ujf0Var;
        boolean z9;
        int i9;
        boolean zA;
        Object obj3;
        int i10;
        final n6s n6sVar2;
        final bcn bcnVar2;
        boolean z10;
        final iif0 iif0Var2;
        ia5 ia5Var2;
        v5b v5bVar2;
        final ijf0 ijf0Var3;
        ?? r16;
        d.a aVar4;
        boolean z11;
        ytw ytwVarC;
        n6s n6sVar3;
        boolean z12;
        boolean z13;
        Object y3bVar;
        final n6s n6sVar4;
        ytw ytwVar;
        boolean zA2;
        Object objY6;
        d dVarA;
        boolean z14;
        int i11;
        boolean z15;
        boolean zA3;
        Object objY7;
        final mly mlyVar;
        Function1 function3;
        boolean z16;
        boolean zA4;
        Object objY8;
        boolean z17;
        boolean z18;
        boolean zA5;
        Object objY9;
        a8j0 a8j0Var;
        mly mlyVar2;
        final n6s n6sVar5;
        final ujf0 ujf0Var2;
        iif0 iif0Var3;
        boolean z19;
        d dVarA2;
        boolean zA6;
        Object objY10;
        boolean z20;
        boolean z21;
        Object objY11;
        boolean z22;
        int i12;
        final boolean z23;
        boolean zB;
        Object objY12;
        final long j2;
        boolean zA7;
        Object objY13;
        boolean z24;
        d dVarA3;
        Long l;
        ?? I = aVar.i(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (I.M(ijf0Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= I.A(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= I.M(dVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= I.M(imf0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= I.M(uni0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= I.A(function2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= I.M(pswVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= I.M(ya5Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= I.b(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= I.d(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (I.d(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= I.M(bcnVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= I.M(tnpVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= I.b(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= I.b(z3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= I.A(gajVar) ? 131072 : 65536;
        }
        int i13 = i6 | 1572864;
        if (I.q(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i13) == 599186) ? false : true)) {
            I.A0();
            if ((i3 & 1) != 0 && !I.h0()) {
                I.G();
            }
            I.Y();
            Object objY14 = I.y();
            Object obj4 = androidx.compose.runtime.a.C0041a.a;
            if (objY14 == obj4) {
                objY14 = new b5i();
                I.r(objY14);
            }
            b5i b5iVar = (b5i) objY14;
            Object objY15 = I.y();
            if (objY15 == obj4) {
                y5s.a aVar5 = y5s.a;
                objY15 = new n80();
                I.r(objY15);
            }
            final x5s x5sVar = (x5s) objY15;
            Object objY16 = I.y();
            if (objY16 == obj4) {
                objY16 = new ujf0(x5sVar);
                I.r(objY16);
            }
            ujf0 ujf0Var3 = (ujf0) objY16;
            mmd mmdVar3 = (mmd) I.O(kna.h);
            f8i.a aVar6 = (f8i.a) I.O(kna.k);
            long j3 = ((bmf0) I.O(cmf0.a)).b;
            k4i k4iVar = (k4i) I.O(kna.i);
            final a8j0 a8j0Var2 = (a8j0) I.O(kna.t);
            ooa0 ooa0Var = (ooa0) I.O(kna.p);
            i3z i3zVar = (i == 1 && !z && bcnVar.a) ? i3z.b : i3z.a;
            I.N(-213743954);
            Object[] objArr = {i3zVar};
            uv60 uv60Var = yhf0.g;
            boolean zD = I.d(i3zVar.ordinal());
            Object objY17 = I.y();
            if (zD || objY17 == obj4) {
                r12 = 0;
                objY17 = new p3b(i3zVar, 0);
                I.r(objY17);
            } else {
                r12 = 0;
            }
            yhf0 yhf0Var = (yhf0) o350.c(objArr, uv60Var, (Function0) objY17, I, r12);
            I.X(r12);
            if (((i3z) ((x5a0) yhf0Var.f).getValue()) != i3zVar) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(i3zVar == i3z.a ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i14 = i5 & 14;
            boolean z25 = ((i5 & 57344) == 16384) | (i14 == 4);
            Object objY18 = I.y();
            if (z25 || objY18 == obj4) {
                wsg0 wsg0VarA = luh0.a(uni0Var, ijf0Var.a);
                mly mlyVar3 = wsg0VarA.b;
                ulf0 ulf0Var2 = ijf0Var.c;
                if (ulf0Var2 != null) {
                    long j4 = ulf0Var2.a;
                    int i15 = ulf0.c;
                    int iB = mlyVar3.b((int) (j4 >> 32));
                    int iB2 = mlyVar3.b((int) (j4 & 4294967295L));
                    int iMin = Math.min(iB, iB2);
                    int iMax = Math.max(iB, iB2);
                    nk0.b bVar = new nk0.b(wsg0VarA.a);
                    bVar.d(new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, yef0.c, (ix80) null, 61439), iMin, iMax);
                    objY18 = new wsg0(bVar.m(), mlyVar3);
                } else {
                    objY18 = wsg0VarA;
                }
                I.r(objY18);
            } else {
                b5iVar = b5iVar;
                yhf0Var = yhf0Var;
            }
            wsg0 wsg0Var = (wsg0) objY18;
            nk0 nk0Var2 = wsg0Var.a;
            final mly mlyVar4 = wsg0Var.b;
            e eVarV = I.v();
            if (eVarV == null) {
                ib5.a("no recompose scope found");
                return;
            }
            I.E(eVarV);
            boolean zM2 = I.M(ooa0Var);
            Object objY19 = I.y();
            if (zM2 || objY19 == obj4) {
                imf0Var2 = imf0Var;
                bff0 bff0Var = new bff0(nk0Var2, imf0Var2, z, mmdVar3, aVar6, m2g.a);
                z4 = z;
                mmdVar = mmdVar3;
                aVar2 = aVar6;
                n6sVar = new n6s(bff0Var, eVarV, ooa0Var);
                I.r(n6sVar);
            } else {
                z4 = z;
                n6sVar = objY19;
                mmdVar = mmdVar3;
                imf0Var2 = imf0Var;
                aVar2 = aVar6;
            }
            n6s n6sVar6 = (n6s) n6sVar;
            nk0 nk0Var3 = ijf0Var.a;
            f8i.a aVar7 = aVar2;
            long j5 = ijf0Var.b;
            n6sVar6.u = function1;
            n6sVar6.z = j3;
            rnp rnpVar = n6sVar6.r;
            rnpVar.b = tnpVar;
            rnpVar.c = k4iVar;
            n6sVar6.j = nk0Var3;
            bff0 bff0Var2 = n6sVar6.a;
            m2g m2gVar = m2g.a;
            if (Intrinsics.g(bff0Var2.a, nk0Var2) && Intrinsics.g(bff0Var2.b, imf0Var2) && bff0Var2.e == z4) {
                obj = obj4;
                if (bff0Var2.f == 1 && bff0Var2.c == Integer.MAX_VALUE && bff0Var2.d == 1 && Intrinsics.g(bff0Var2.g, mmdVar) && Intrinsics.g(bff0Var2.i, m2gVar)) {
                    aVar3 = aVar7;
                    if (bff0Var2.h == aVar3) {
                        mmdVar2 = mmdVar;
                    }
                    if (n6sVar6.a != bff0Var2) {
                        n6sVar6.p = true;
                    }
                    n6sVar6.a = bff0Var2;
                    osfVar = n6sVar6.d;
                    dkf0Var = n6sVar6.e;
                    osfVar.getClass();
                    ulf0Var = ijf0Var.c;
                    boolean zG = Intrinsics.g(ulf0Var, osfVar.b.c());
                    str = osfVar.a.a.b;
                    nk0Var = ijf0Var.a;
                    if (Intrinsics.g(str, nk0Var.b)) {
                        if (ulf0.b(osfVar.a.b, j5)) {
                            z5 = false;
                        } else {
                            osfVar.b.h(ulf0.f(j5), ulf0.e(j5));
                            z5 = false;
                            z6 = true;
                        }
                        if (ulf0Var == null) {
                            rvf rvfVar = osfVar.b;
                            rvfVar.d = -1;
                            rvfVar.e = -1;
                        } else {
                            j = ulf0Var.a;
                            if (!ulf0.c(j)) {
                                osfVar.b.g(ulf0.f(j), ulf0.e(j));
                            }
                            if (z5 && (z6 || zG)) {
                                ijf0VarA = ijf0Var;
                            } else {
                                rvf rvfVar2 = osfVar.b;
                                rvfVar2.d = -1;
                                rvfVar2.e = -1;
                                ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                            }
                            ijf0Var2 = osfVar.a;
                            osfVar.a = ijf0VarA;
                            if (dkf0Var != null) {
                                dkf0Var.a(ijf0Var2, ijf0VarA);
                            }
                            objY = I.y();
                            obj2 = obj;
                            if (objY == obj2) {
                                objY = new odh0(0);
                                I.r(objY);
                            }
                            odh0Var = (odh0) objY;
                            jCurrentTimeMillis = System.currentTimeMillis();
                            if (odh0Var.f) {
                                odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                                odh0Var.a(ijf0Var);
                            } else {
                                l = odh0Var.e;
                                if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                                    odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                                    odh0Var.a(ijf0Var);
                                }
                            }
                            objY2 = I.y();
                            if (objY2 == obj2) {
                                objY2 = xvf.i(kotlin.coroutines.e.a, I);
                                I.r(objY2);
                            }
                            v5bVar = (v5b) objY2;
                            objY3 = I.y();
                            if (objY3 == obj2) {
                                objY3 = new la5();
                                I.r(objY3);
                            }
                            ia5Var = (ia5) objY3;
                            objY4 = I.y();
                            if (objY4 == obj2) {
                                objY4 = new iif0(odh0Var);
                                I.r(objY4);
                            }
                            iif0Var = (iif0) objY4;
                            iif0Var.b = mlyVar4;
                            iif0Var.f = uni0Var;
                            iif0Var.c = n6sVar6.v;
                            iif0Var.d = n6sVar6;
                            ((x5a0) iif0Var.e).setValue(ijf0Var);
                            iif0Var.x = new ulf0(j5);
                            iif0Var.h = (ms7) I.O(kna.f);
                            iif0Var.i = v5bVar;
                            iif0Var.k = (jmf0) I.O(kna.q);
                            iif0Var.l = (zdl) I.O(kna.l);
                            iif0Var.m = b5iVar;
                            boolean z26 = !z3;
                            ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z26));
                            ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                            I.N(1966776937);
                            q780Var = q780.a;
                            cetVar = imf0Var.a.k;
                            qyd0 qyd0Var = jk10.a;
                            I.N(430530635);
                            if (Build.VERSION.SDK_INT < 28) {
                                I.H();
                                vj10Var = null;
                            } else {
                                context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                                coroutineContext = (CoroutineContext) I.O(jk10.a);
                                zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                                objY5 = I.y();
                                if (zM || objY5 == obj2) {
                                    jk10.b.getClass();
                                    objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                                    I.r(objY5);
                                }
                                vj10Var = (vj10) objY5;
                                I.H();
                            }
                            iif0Var.j = vj10Var;
                            I.X(false);
                            boolean zA8 = I.A(n6sVar6);
                            i7 = i13 & 7168;
                            if (i7 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            boolean z27 = zA8 | z7;
                            i8 = i13 & 57344;
                            if (i8 == 16384) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            boolean z28 = z8 | z27;
                            ujf0Var = ujf0Var3;
                            boolean zA9 = z28 | I.A(ujf0Var);
                            if (i14 == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            i9 = (i13 & 112) ^ 48;
                            zA = zA9 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                            Object objY20 = I.y();
                            if (!zA || objY20 == obj2) {
                                i10 = i7;
                                n6sVar2 = n6sVar6;
                                ?? r17 = I;
                                bcnVar2 = bcnVar;
                                obj3 = new Function1() { // from class: q3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        vkf0 vkf0VarD;
                                        j5i j5iVar = (j5i) obj5;
                                        n6s n6sVar7 = n6sVar2;
                                        if (n6sVar7.b() == j5iVar.a()) {
                                            return Unit.a;
                                        }
                                        ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                        boolean zB2 = n6sVar7.b();
                                        ijf0 ijf0Var4 = ijf0Var;
                                        mly mlyVar5 = mlyVar4;
                                        if (zB2 && z2 && !z3) {
                                            j4b.g(ujf0Var, n6sVar7, ijf0Var4, bcnVar2, mlyVar5);
                                        } else {
                                            j4b.e(n6sVar7);
                                        }
                                        if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                            ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var4, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                        }
                                        if (!j5iVar.a()) {
                                            iif0Var.d(null);
                                        }
                                        return Unit.a;
                                    }
                                };
                                z10 = z2;
                                ujf0Var = ujf0Var;
                                iif0Var2 = iif0Var;
                                ia5Var2 = ia5Var;
                                v5bVar2 = v5bVar;
                                ijf0Var3 = ijf0Var;
                                r17.r(obj3);
                                r16 = r17;
                            } else {
                                n6sVar2 = n6sVar6;
                                ia5Var2 = ia5Var;
                                v5bVar2 = v5bVar;
                                iif0Var2 = iif0Var;
                                r16 = I;
                                i10 = i7;
                                obj3 = objY20;
                                bcnVar2 = bcnVar;
                                z10 = z2;
                                ijf0Var3 = ijf0Var;
                            }
                            aVar4 = d.a.b;
                            d dVarA4 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                            if (z10 || z3) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            ytwVarC = m.c(Boolean.valueOf(z11), r16);
                            Unit unit = Unit.a;
                            boolean zM3 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                            if (i9 > 32 || !r16.M(bcnVar2)) {
                                n6sVar3 = n6sVar2;
                                if ((r5 & 48) != 32) {
                                    z12 = false;
                                }
                                z13 = zM3 | z12;
                                Object objY21 = r16.y();
                                if (!z13 || objY21 == obj2) {
                                    n6sVar4 = n6sVar3;
                                    ujf0 ujf0Var4 = ujf0Var;
                                    y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var4, iif0Var2, bcnVar, null);
                                    ytwVar = ytwVarC;
                                    ujf0Var = ujf0Var4;
                                    r16.r(y3bVar);
                                } else {
                                    y3bVar = objY21;
                                    ytwVar = ytwVarC;
                                    n6sVar4 = n6sVar3;
                                }
                                xvf.e(r16, unit, (Function2) y3bVar);
                                zA2 = r16.A(n6sVar4);
                                objY6 = r16.y();
                                if (zA2 || objY6 == obj2) {
                                    objY6 = new r3b(n6sVar4, 0);
                                    r16.r(objY6);
                                }
                                dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                                boolean zA10 = r16.A(n6sVar4);
                                if (i8 == 16384) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                boolean z29 = zA10 | z14;
                                i11 = i10;
                                if (i11 == 2048) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                zA3 = z29 | z15 | r16.A(r7) | r16.A(iif0Var2);
                                objY7 = r16.y();
                                if (!zA3 || objY7 == obj2) {
                                    final iif0 iif0Var4 = iif0Var2;
                                    mlyVar = r7;
                                    final b5i b5iVar2 = b5iVar;
                                    Function1 function4 = new Function1() { // from class: s3b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            ooa0 ooa0Var2;
                                            gly glyVar = (gly) obj5;
                                            n6s n6sVar7 = n6sVar4;
                                            if (!n6sVar7.b()) {
                                                b5i.b(b5iVar2);
                                            } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                                ooa0Var2.a();
                                            }
                                            if (n6sVar7.b() && z2) {
                                                if (n6sVar7.a() != ocl.b) {
                                                    vkf0 vkf0VarD = n6sVar7.d();
                                                    if (vkf0VarD != null) {
                                                        long j6 = glyVar.a;
                                                        osf osfVar2 = n6sVar7.d;
                                                        l6s l6sVar = n6sVar7.v;
                                                        int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                        l6sVar.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                        if (n6sVar7.a.a.b.length() > 0) {
                                                            ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                        }
                                                    }
                                                } else {
                                                    iif0Var4.d(glyVar);
                                                }
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    iif0Var2 = iif0Var4;
                                    r16.r(function4);
                                    objY7 = function4;
                                } else {
                                    mlyVar = mlyVar4;
                                }
                                function3 = (Function1) objY7;
                                if (z2) {
                                    dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                                }
                                iif0.b bVar2 = iif0Var2.B;
                                iif0.c cVar = iif0Var2.A;
                                d dVarN = dVarA.n(new SuspendPointerInputElement(bVar2, cVar, null, new l880(bVar2, cVar), 4));
                                g020.a.getClass();
                                d dVarC = h020.c(dVarN, j020.b);
                                boolean zA11 = r16.A(n6sVar4);
                                if (i14 == 4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                zA4 = zA11 | z16 | r16.A(mlyVar);
                                objY8 = r16.y();
                                if (zA4 || objY8 == obj2) {
                                    objY8 = new Function1() { // from class: t3b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            tcf tcfVar = (tcf) obj5;
                                            n6s n6sVar7 = n6sVar4;
                                            vkf0 vkf0VarD = n6sVar7.d();
                                            if (vkf0VarD != null) {
                                                lc6 lc6VarA = tcfVar.F1().a();
                                                long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                                long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                                ukf0 ukf0Var = vkf0VarD.a;
                                                zjw zjwVar = ukf0Var.b;
                                                tkf0 tkf0Var = ukf0Var.a;
                                                b90 b90Var = n6sVar7.y;
                                                long j8 = n6sVar7.z;
                                                boolean zC = ulf0.c(j6);
                                                mly mlyVar5 = mlyVar;
                                                if (!zC) {
                                                    b90Var.m(j8);
                                                    int iB3 = mlyVar5.b(ulf0.f(j6));
                                                    int iB4 = mlyVar5.b(ulf0.e(j6));
                                                    if (iB3 != iB4) {
                                                        lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                                    }
                                                } else if (ulf0.c(j7)) {
                                                    ijf0 ijf0Var4 = ijf0Var3;
                                                    if (!ulf0.c(ijf0Var4.b)) {
                                                        b90Var.m(j8);
                                                        long j9 = ijf0Var4.b;
                                                        int iB5 = mlyVar5.b(ulf0.f(j9));
                                                        int iB6 = mlyVar5.b(ulf0.e(j9));
                                                        if (iB5 != iB6) {
                                                            lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                        }
                                                    }
                                                } else {
                                                    long jC = tkf0Var.b.c();
                                                    j58 j58Var = new j58(jC);
                                                    if (jC == 16) {
                                                        j58Var = null;
                                                    }
                                                    long j10 = j58Var != null ? j58Var.a : j58.b;
                                                    b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                                    int iB7 = mlyVar5.b(ulf0.f(j7));
                                                    int iB8 = mlyVar5.b(ulf0.e(j7));
                                                    if (iB7 != iB8) {
                                                        lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                                    }
                                                }
                                                boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                                if (z30) {
                                                    long j11 = ukf0Var.c;
                                                    lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                                    lc6VarA.p();
                                                    lc6VarA.i(lk40VarB);
                                                }
                                                ora0 ora0Var = tkf0Var.b.a;
                                                yef0 yef0Var = ora0Var.m;
                                                kjf0 kjf0Var = ora0Var.a;
                                                if (yef0Var == null) {
                                                    yef0Var = yef0.b;
                                                }
                                                yef0 yef0Var2 = yef0Var;
                                                ix80 ix80Var = ora0Var.n;
                                                if (ix80Var == null) {
                                                    ix80Var = ix80.d;
                                                }
                                                ix80 ix80Var2 = ix80Var;
                                                wcf wcfVar = ora0Var.p;
                                                if (wcfVar == null) {
                                                    wcfVar = rlh.a;
                                                }
                                                wcf wcfVar2 = wcfVar;
                                                try {
                                                    ya5 ya5VarE = kjf0Var.e();
                                                    kjf0.a aVar8 = kjf0.a.a;
                                                    if (ya5VarE != null) {
                                                        gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar8 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                                    } else {
                                                        zjwVar.i(lc6VarA, kjf0Var != aVar8 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                                    }
                                                } finally {
                                                    if (z30) {
                                                        lc6VarA.f();
                                                    }
                                                }
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    r16.r(objY8);
                                }
                                d dVarA5 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                                boolean zA12 = r16.A(n6sVar4);
                                if (i11 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                boolean zM4 = zA12 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                                if (i14 == 4) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                zA5 = zM4 | z18 | r16.A(mlyVar);
                                objY9 = r16.y();
                                if (!zA5 || objY9 == obj2) {
                                    final ijf0 ijf0Var4 = ijf0Var3;
                                    Function1 function5 = new Function1() { // from class: u3b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            dkf0 dkf0Var2;
                                            urr urrVar;
                                            urr urrVar2;
                                            n6s n6sVar7 = n6sVar4;
                                            ytw ytwVar2 = n6sVar7.o;
                                            urr urrVar3 = (urr) obj5;
                                            n6sVar7.h = urrVar3;
                                            vkf0 vkf0VarD = n6sVar7.d();
                                            if (vkf0VarD != null) {
                                                vkf0VarD.b = urrVar3;
                                            }
                                            if (z2) {
                                                ocl oclVarA = n6sVar7.a();
                                                ocl oclVar = ocl.b;
                                                iif0 iif0Var5 = iif0Var2;
                                                ijf0 ijf0Var5 = ijf0Var4;
                                                if (oclVarA == oclVar) {
                                                    if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                        iif0Var5.r();
                                                    } else {
                                                        iif0Var5.k();
                                                    }
                                                    ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var5, true)));
                                                    ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var5, false)));
                                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var5.b)));
                                                } else if (n6sVar7.a() == ocl.c) {
                                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var5, true)));
                                                }
                                                mly mlyVar5 = mlyVar;
                                                j4b.f(n6sVar7, ijf0Var5, mlyVar5);
                                                vkf0 vkf0VarD2 = n6sVar7.d();
                                                if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                                    ukf0 ukf0Var = vkf0VarD2.a;
                                                    wff0 wff0Var = new wff0(urrVar);
                                                    lk40 lk40VarA = z880.a(urrVar);
                                                    lk40 lk40VarP = urrVar.P(urrVar2, false);
                                                    if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                        dkf0Var2.b.h(ijf0Var5, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                                    }
                                                }
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a8j0Var = a8j0Var2;
                                    r16.r(function5);
                                    objY9 = function5;
                                } else {
                                    a8j0Var = a8j0Var2;
                                }
                                d dVarA6 = v.a(aVar4, (Function1) objY9);
                                mlyVar2 = mlyVar;
                                n6sVar5 = n6sVar4;
                                v5b v5bVar3 = v5bVar2;
                                ujf0Var2 = ujf0Var;
                                iif0Var3 = iif0Var2;
                                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                                if (!z2 && !z3 && a8j0Var.b() && ulf0.c(((ulf0) ((x5a0) n6sVar5.A).getValue()).a) && ulf0.c(((ulf0) ((x5a0) n6sVar5.B).getValue()).a)) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                                } else {
                                    dVarA2 = aVar4;
                                }
                                zA6 = r16.A(iif0Var3);
                                objY10 = r16.y();
                                if (zA6 || objY10 == obj2) {
                                    objY10 = new v3b(iif0Var3, 0);
                                    r16.r(objY10);
                                }
                                xvf.c(iif0Var3, (Function1) objY10, r16);
                                boolean zA13 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                                if (i14 == 4) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                z21 = zA13 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                                objY11 = r16.y();
                                if (z21 || objY11 == obj2) {
                                    objY11 = new Function1() { // from class: w3b
                                        /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            n6s n6sVar7 = n6sVar5;
                                            if (n6sVar7.b()) {
                                                osf osfVar2 = n6sVar7.d;
                                                l6s l6sVar = n6sVar7.v;
                                                uhi uhiVar = n6sVar7.w;
                                                dq40 dq40Var = new dq40();
                                                vff0 vff0Var = new vff0(osfVar2, l6sVar, dq40Var);
                                                ujf0 ujf0Var5 = ujf0Var2;
                                                rk10 rk10Var = ujf0Var5.a;
                                                rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                                ?? dkf0Var2 = new dkf0(ujf0Var5, rk10Var);
                                                ujf0Var5.b.set((dkf0) dkf0Var2);
                                                dq40Var.a = dkf0Var2;
                                                n6sVar7.e = dkf0Var2;
                                            }
                                            return new i4b();
                                        }
                                    };
                                    r16.r(objY11);
                                }
                                xvf.c(bcnVar, (Function1) objY11, r16);
                                l6s l6sVar = n6sVar5.v;
                                if (i == 1) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                chf0 chf0Var = new chf0(n6sVar5, iif0Var3, ijf0Var, z26, z22, mlyVar2, odh0Var, l6sVar, bcnVar.e);
                                gnn.a aVar8 = gnn.a;
                                d dVarA7 = c.a(aVar4, aVar8, chf0Var);
                                i12 = bcnVar.d;
                                if (i12 == 7 && i12 != 8) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                                zB = r16.b(z23) | r16.A(x5sVar);
                                objY12 = r16.y();
                                if (zB || objY12 == obj2) {
                                    objY12 = new Function0() { // from class: j3b
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            if (z23) {
                                                x5sVar.i();
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    r16.r(objY12);
                                }
                                d dVarA8 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue, z23, (Function0) objY12);
                                j2 = ((j58) r16.O(vl1.a)).a;
                                zA7 = r16.A(n6sVar5) | r16.e(j2);
                                objY13 = r16.y();
                                if (zA7 || objY13 == obj2) {
                                    objY13 = new Function1() { // from class: i3b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            tcf tcfVar = (tcf) obj5;
                                            n6s n6sVar7 = n6sVar5;
                                            if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                                tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    r16.r(objY13);
                                }
                                yhf0 yhf0Var2 = yhf0Var;
                                z24 = false;
                                d dVarA9 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA8).n(dVarA4), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA7), aVar8, new uhf0(yhf0Var2, z2, pswVar)).n(dVarC).n(coreTextFieldSemanticsModifier), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar3));
                                if (z2 && n6sVar5.b() && ((Boolean) ((x5a0) n6sVar5.q).getValue()).booleanValue() && a8j0Var.b()) {
                                    z24 = true;
                                }
                                if (z24 || !ciu.a()) {
                                    dVarA3 = aVar4;
                                } else {
                                    dVarA3 = c.a(aVar4, aVar8, new bjf0(iif0Var3));
                                }
                                ?? r18 = r16;
                                b(dVarA9, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var2, ijf0Var, uni0Var, dVarA2, dVarA5, dVarA6, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r18), r18, 384);
                                r15 = r18;
                            } else {
                                n6sVar3 = n6sVar2;
                            }
                            z12 = true;
                            z13 = zM3 | z12;
                            Object objY22 = r16.y();
                            if (z13) {
                                n6sVar4 = n6sVar3;
                                ujf0 ujf0Var5 = ujf0Var;
                                y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var5, iif0Var2, bcnVar, null);
                                ytwVar = ytwVarC;
                                ujf0Var = ujf0Var5;
                                r16.r(y3bVar);
                            } else {
                                n6sVar4 = n6sVar3;
                                ujf0 ujf0Var6 = ujf0Var;
                                y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var6, iif0Var2, bcnVar, null);
                                ytwVar = ytwVarC;
                                ujf0Var = ujf0Var6;
                                r16.r(y3bVar);
                            }
                            xvf.e(r16, unit, (Function2) y3bVar);
                            zA2 = r16.A(n6sVar4);
                            objY6 = r16.y();
                            if (zA2) {
                                objY6 = new r3b(n6sVar4, 0);
                                r16.r(objY6);
                            } else {
                                objY6 = new r3b(n6sVar4, 0);
                                r16.r(objY6);
                            }
                            dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                            boolean zA14 = r16.A(n6sVar4);
                            if (i8 == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z210 = zA14 | z14;
                            i11 = i10;
                            if (i11 == 2048) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zA3 = z210 | z15 | r16.A(r7) | r16.A(iif0Var2);
                            objY7 = r16.y();
                            if (zA3) {
                                final iif0 iif0Var5 = iif0Var2;
                                mlyVar = r7;
                                final b5i b5iVar3 = b5iVar;
                                Function1 function6 = new Function1() { // from class: s3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        ooa0 ooa0Var2;
                                        gly glyVar = (gly) obj5;
                                        n6s n6sVar7 = n6sVar4;
                                        if (!n6sVar7.b()) {
                                            b5i.b(b5iVar3);
                                        } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                            ooa0Var2.a();
                                        }
                                        if (n6sVar7.b() && z2) {
                                            if (n6sVar7.a() != ocl.b) {
                                                vkf0 vkf0VarD = n6sVar7.d();
                                                if (vkf0VarD != null) {
                                                    long j6 = glyVar.a;
                                                    osf osfVar2 = n6sVar7.d;
                                                    l6s l6sVar2 = n6sVar7.v;
                                                    int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                    l6sVar2.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                    if (n6sVar7.a.a.b.length() > 0) {
                                                        ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                    }
                                                }
                                            } else {
                                                iif0Var5.d(glyVar);
                                            }
                                        }
                                        return Unit.a;
                                    }
                                };
                                iif0Var2 = iif0Var5;
                                r16.r(function6);
                                objY7 = function6;
                            } else {
                                final iif0 iif0Var6 = iif0Var2;
                                mlyVar = r7;
                                final b5i b5iVar4 = b5iVar;
                                Function1 function7 = new Function1() { // from class: s3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        ooa0 ooa0Var2;
                                        gly glyVar = (gly) obj5;
                                        n6s n6sVar7 = n6sVar4;
                                        if (!n6sVar7.b()) {
                                            b5i.b(b5iVar4);
                                        } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                            ooa0Var2.a();
                                        }
                                        if (n6sVar7.b() && z2) {
                                            if (n6sVar7.a() != ocl.b) {
                                                vkf0 vkf0VarD = n6sVar7.d();
                                                if (vkf0VarD != null) {
                                                    long j6 = glyVar.a;
                                                    osf osfVar2 = n6sVar7.d;
                                                    l6s l6sVar2 = n6sVar7.v;
                                                    int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                    l6sVar2.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                    if (n6sVar7.a.a.b.length() > 0) {
                                                        ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                    }
                                                }
                                            } else {
                                                iif0Var6.d(glyVar);
                                            }
                                        }
                                        return Unit.a;
                                    }
                                };
                                iif0Var2 = iif0Var6;
                                r16.r(function7);
                                objY7 = function7;
                            }
                            function3 = (Function1) objY7;
                            if (z2) {
                                dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                            }
                            iif0.b bVar3 = iif0Var2.B;
                            iif0.c cVar2 = iif0Var2.A;
                            d dVarN2 = dVarA.n(new SuspendPointerInputElement(bVar3, cVar2, null, new l880(bVar3, cVar2), 4));
                            g020.a.getClass();
                            d dVarC2 = h020.c(dVarN2, j020.b);
                            boolean zA15 = r16.A(n6sVar4);
                            if (i14 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zA4 = zA15 | z16 | r16.A(mlyVar);
                            objY8 = r16.y();
                            if (zA4) {
                                objY8 = new Function1() { // from class: t3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        tcf tcfVar = (tcf) obj5;
                                        n6s n6sVar7 = n6sVar4;
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            lc6 lc6VarA = tcfVar.F1().a();
                                            long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                            long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                            ukf0 ukf0Var = vkf0VarD.a;
                                            zjw zjwVar = ukf0Var.b;
                                            tkf0 tkf0Var = ukf0Var.a;
                                            b90 b90Var = n6sVar7.y;
                                            long j8 = n6sVar7.z;
                                            boolean zC = ulf0.c(j6);
                                            mly mlyVar5 = mlyVar;
                                            if (!zC) {
                                                b90Var.m(j8);
                                                int iB3 = mlyVar5.b(ulf0.f(j6));
                                                int iB4 = mlyVar5.b(ulf0.e(j6));
                                                if (iB3 != iB4) {
                                                    lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                                }
                                            } else if (ulf0.c(j7)) {
                                                ijf0 ijf0Var5 = ijf0Var3;
                                                if (!ulf0.c(ijf0Var5.b)) {
                                                    b90Var.m(j8);
                                                    long j9 = ijf0Var5.b;
                                                    int iB5 = mlyVar5.b(ulf0.f(j9));
                                                    int iB6 = mlyVar5.b(ulf0.e(j9));
                                                    if (iB5 != iB6) {
                                                        lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                    }
                                                }
                                            } else {
                                                long jC = tkf0Var.b.c();
                                                j58 j58Var = new j58(jC);
                                                if (jC == 16) {
                                                    j58Var = null;
                                                }
                                                long j10 = j58Var != null ? j58Var.a : j58.b;
                                                b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                                int iB7 = mlyVar5.b(ulf0.f(j7));
                                                int iB8 = mlyVar5.b(ulf0.e(j7));
                                                if (iB7 != iB8) {
                                                    lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                                }
                                            }
                                            boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                            if (z30) {
                                                long j11 = ukf0Var.c;
                                                lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                                lc6VarA.p();
                                                lc6VarA.i(lk40VarB);
                                            }
                                            ora0 ora0Var = tkf0Var.b.a;
                                            yef0 yef0Var = ora0Var.m;
                                            kjf0 kjf0Var = ora0Var.a;
                                            if (yef0Var == null) {
                                                yef0Var = yef0.b;
                                            }
                                            yef0 yef0Var2 = yef0Var;
                                            ix80 ix80Var = ora0Var.n;
                                            if (ix80Var == null) {
                                                ix80Var = ix80.d;
                                            }
                                            ix80 ix80Var2 = ix80Var;
                                            wcf wcfVar = ora0Var.p;
                                            if (wcfVar == null) {
                                                wcfVar = rlh.a;
                                            }
                                            wcf wcfVar2 = wcfVar;
                                            try {
                                                ya5 ya5VarE = kjf0Var.e();
                                                kjf0.a aVar9 = kjf0.a.a;
                                                if (ya5VarE != null) {
                                                    gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar9 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                                } else {
                                                    zjwVar.i(lc6VarA, kjf0Var != aVar9 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                                }
                                            } finally {
                                                if (z30) {
                                                    lc6VarA.f();
                                                }
                                            }
                                        }
                                        return Unit.a;
                                    }
                                };
                                r16.r(objY8);
                            } else {
                                objY8 = new Function1() { // from class: t3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        tcf tcfVar = (tcf) obj5;
                                        n6s n6sVar7 = n6sVar4;
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            lc6 lc6VarA = tcfVar.F1().a();
                                            long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                            long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                            ukf0 ukf0Var = vkf0VarD.a;
                                            zjw zjwVar = ukf0Var.b;
                                            tkf0 tkf0Var = ukf0Var.a;
                                            b90 b90Var = n6sVar7.y;
                                            long j8 = n6sVar7.z;
                                            boolean zC = ulf0.c(j6);
                                            mly mlyVar5 = mlyVar;
                                            if (!zC) {
                                                b90Var.m(j8);
                                                int iB3 = mlyVar5.b(ulf0.f(j6));
                                                int iB4 = mlyVar5.b(ulf0.e(j6));
                                                if (iB3 != iB4) {
                                                    lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                                }
                                            } else if (ulf0.c(j7)) {
                                                ijf0 ijf0Var5 = ijf0Var3;
                                                if (!ulf0.c(ijf0Var5.b)) {
                                                    b90Var.m(j8);
                                                    long j9 = ijf0Var5.b;
                                                    int iB5 = mlyVar5.b(ulf0.f(j9));
                                                    int iB6 = mlyVar5.b(ulf0.e(j9));
                                                    if (iB5 != iB6) {
                                                        lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                    }
                                                }
                                            } else {
                                                long jC = tkf0Var.b.c();
                                                j58 j58Var = new j58(jC);
                                                if (jC == 16) {
                                                    j58Var = null;
                                                }
                                                long j10 = j58Var != null ? j58Var.a : j58.b;
                                                b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                                int iB7 = mlyVar5.b(ulf0.f(j7));
                                                int iB8 = mlyVar5.b(ulf0.e(j7));
                                                if (iB7 != iB8) {
                                                    lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                                }
                                            }
                                            boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                            if (z30) {
                                                long j11 = ukf0Var.c;
                                                lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                                lc6VarA.p();
                                                lc6VarA.i(lk40VarB);
                                            }
                                            ora0 ora0Var = tkf0Var.b.a;
                                            yef0 yef0Var = ora0Var.m;
                                            kjf0 kjf0Var = ora0Var.a;
                                            if (yef0Var == null) {
                                                yef0Var = yef0.b;
                                            }
                                            yef0 yef0Var2 = yef0Var;
                                            ix80 ix80Var = ora0Var.n;
                                            if (ix80Var == null) {
                                                ix80Var = ix80.d;
                                            }
                                            ix80 ix80Var2 = ix80Var;
                                            wcf wcfVar = ora0Var.p;
                                            if (wcfVar == null) {
                                                wcfVar = rlh.a;
                                            }
                                            wcf wcfVar2 = wcfVar;
                                            try {
                                                ya5 ya5VarE = kjf0Var.e();
                                                kjf0.a aVar9 = kjf0.a.a;
                                                if (ya5VarE != null) {
                                                    gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar9 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                                } else {
                                                    zjwVar.i(lc6VarA, kjf0Var != aVar9 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                                }
                                            } finally {
                                                if (z30) {
                                                    lc6VarA.f();
                                                }
                                            }
                                        }
                                        return Unit.a;
                                    }
                                };
                                r16.r(objY8);
                            }
                            d dVarA10 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                            boolean zA16 = r16.A(n6sVar4);
                            if (i11 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean zM5 = zA16 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                            if (i14 == 4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zA5 = zM5 | z18 | r16.A(mlyVar);
                            objY9 = r16.y();
                            if (zA5) {
                                final ijf0 ijf0Var5 = ijf0Var3;
                                Function1 function8 = new Function1() { // from class: u3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        dkf0 dkf0Var2;
                                        urr urrVar;
                                        urr urrVar2;
                                        n6s n6sVar7 = n6sVar4;
                                        ytw ytwVar2 = n6sVar7.o;
                                        urr urrVar3 = (urr) obj5;
                                        n6sVar7.h = urrVar3;
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            vkf0VarD.b = urrVar3;
                                        }
                                        if (z2) {
                                            ocl oclVarA = n6sVar7.a();
                                            ocl oclVar = ocl.b;
                                            iif0 iif0Var7 = iif0Var2;
                                            ijf0 ijf0Var6 = ijf0Var5;
                                            if (oclVarA == oclVar) {
                                                if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                    iif0Var7.r();
                                                } else {
                                                    iif0Var7.k();
                                                }
                                                ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var7, true)));
                                                ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var7, false)));
                                                ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var6.b)));
                                            } else if (n6sVar7.a() == ocl.c) {
                                                ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var7, true)));
                                            }
                                            mly mlyVar5 = mlyVar;
                                            j4b.f(n6sVar7, ijf0Var6, mlyVar5);
                                            vkf0 vkf0VarD2 = n6sVar7.d();
                                            if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                                ukf0 ukf0Var = vkf0VarD2.a;
                                                wff0 wff0Var = new wff0(urrVar);
                                                lk40 lk40VarA = z880.a(urrVar);
                                                lk40 lk40VarP = urrVar.P(urrVar2, false);
                                                if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                    dkf0Var2.b.h(ijf0Var6, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                                }
                                            }
                                        }
                                        return Unit.a;
                                    }
                                };
                                a8j0Var = a8j0Var2;
                                r16.r(function8);
                                objY9 = function8;
                            } else {
                                final ijf0 ijf0Var6 = ijf0Var3;
                                Function1 function9 = new Function1() { // from class: u3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        dkf0 dkf0Var2;
                                        urr urrVar;
                                        urr urrVar2;
                                        n6s n6sVar7 = n6sVar4;
                                        ytw ytwVar2 = n6sVar7.o;
                                        urr urrVar3 = (urr) obj5;
                                        n6sVar7.h = urrVar3;
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            vkf0VarD.b = urrVar3;
                                        }
                                        if (z2) {
                                            ocl oclVarA = n6sVar7.a();
                                            ocl oclVar = ocl.b;
                                            iif0 iif0Var7 = iif0Var2;
                                            ijf0 ijf0Var7 = ijf0Var6;
                                            if (oclVarA == oclVar) {
                                                if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                    iif0Var7.r();
                                                } else {
                                                    iif0Var7.k();
                                                }
                                                ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var7, true)));
                                                ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var7, false)));
                                                ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var7.b)));
                                            } else if (n6sVar7.a() == ocl.c) {
                                                ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var7, true)));
                                            }
                                            mly mlyVar5 = mlyVar;
                                            j4b.f(n6sVar7, ijf0Var7, mlyVar5);
                                            vkf0 vkf0VarD2 = n6sVar7.d();
                                            if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                                ukf0 ukf0Var = vkf0VarD2.a;
                                                wff0 wff0Var = new wff0(urrVar);
                                                lk40 lk40VarA = z880.a(urrVar);
                                                lk40 lk40VarP = urrVar.P(urrVar2, false);
                                                if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                    dkf0Var2.b.h(ijf0Var7, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                                }
                                            }
                                        }
                                        return Unit.a;
                                    }
                                };
                                a8j0Var = a8j0Var2;
                                r16.r(function9);
                                objY9 = function9;
                            }
                            d dVarA11 = v.a(aVar4, (Function1) objY9);
                            mlyVar2 = mlyVar;
                            n6sVar5 = n6sVar4;
                            v5b v5bVar4 = v5bVar2;
                            ujf0Var2 = ujf0Var;
                            iif0Var3 = iif0Var2;
                            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                            if (!z2) {
                                z19 = false;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                            } else {
                                dVarA2 = aVar4;
                            }
                            zA6 = r16.A(iif0Var3);
                            objY10 = r16.y();
                            if (zA6) {
                                objY10 = new v3b(iif0Var3, 0);
                                r16.r(objY10);
                            } else {
                                objY10 = new v3b(iif0Var3, 0);
                                r16.r(objY10);
                            }
                            xvf.c(iif0Var3, (Function1) objY10, r16);
                            boolean zA17 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                            if (i14 == 4) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            z21 = zA17 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                            objY11 = r16.y();
                            if (z21) {
                                objY11 = new Function1() { // from class: w3b
                                    /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        n6s n6sVar7 = n6sVar5;
                                        if (n6sVar7.b()) {
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar2 = n6sVar7.v;
                                            uhi uhiVar = n6sVar7.w;
                                            dq40 dq40Var = new dq40();
                                            vff0 vff0Var = new vff0(osfVar2, l6sVar2, dq40Var);
                                            ujf0 ujf0Var7 = ujf0Var2;
                                            rk10 rk10Var = ujf0Var7.a;
                                            rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                            ?? dkf0Var2 = new dkf0(ujf0Var7, rk10Var);
                                            ujf0Var7.b.set((dkf0) dkf0Var2);
                                            dq40Var.a = dkf0Var2;
                                            n6sVar7.e = dkf0Var2;
                                        }
                                        return new i4b();
                                    }
                                };
                                r16.r(objY11);
                            } else {
                                objY11 = new Function1() { // from class: w3b
                                    /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        n6s n6sVar7 = n6sVar5;
                                        if (n6sVar7.b()) {
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar2 = n6sVar7.v;
                                            uhi uhiVar = n6sVar7.w;
                                            dq40 dq40Var = new dq40();
                                            vff0 vff0Var = new vff0(osfVar2, l6sVar2, dq40Var);
                                            ujf0 ujf0Var7 = ujf0Var2;
                                            rk10 rk10Var = ujf0Var7.a;
                                            rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                            ?? dkf0Var2 = new dkf0(ujf0Var7, rk10Var);
                                            ujf0Var7.b.set((dkf0) dkf0Var2);
                                            dq40Var.a = dkf0Var2;
                                            n6sVar7.e = dkf0Var2;
                                        }
                                        return new i4b();
                                    }
                                };
                                r16.r(objY11);
                            }
                            xvf.c(bcnVar, (Function1) objY11, r16);
                            l6s l6sVar2 = n6sVar5.v;
                            if (i == 1) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            chf0 chf0Var2 = new chf0(n6sVar5, iif0Var3, ijf0Var, z26, z22, mlyVar2, odh0Var, l6sVar2, bcnVar.e);
                            gnn.a aVar9 = gnn.a;
                            d dVarA12 = c.a(aVar4, aVar9, chf0Var2);
                            i12 = bcnVar.d;
                            if (i12 == 7) {
                                z23 = false;
                            } else {
                                z23 = true;
                            }
                            boolean zBooleanValue2 = ((Boolean) ytwVar.getValue()).booleanValue();
                            zB = r16.b(z23) | r16.A(x5sVar);
                            objY12 = r16.y();
                            if (zB) {
                                objY12 = new Function0() { // from class: j3b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        if (z23) {
                                            x5sVar.i();
                                        }
                                        return Unit.a;
                                    }
                                };
                                r16.r(objY12);
                            } else {
                                objY12 = new Function0() { // from class: j3b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        if (z23) {
                                            x5sVar.i();
                                        }
                                        return Unit.a;
                                    }
                                };
                                r16.r(objY12);
                            }
                            d dVarA13 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue2, z23, (Function0) objY12);
                            j2 = ((j58) r16.O(vl1.a)).a;
                            zA7 = r16.A(n6sVar5) | r16.e(j2);
                            objY13 = r16.y();
                            if (zA7) {
                                objY13 = new Function1() { // from class: i3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        tcf tcfVar = (tcf) obj5;
                                        n6s n6sVar7 = n6sVar5;
                                        if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                            tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                        }
                                        return Unit.a;
                                    }
                                };
                                r16.r(objY13);
                            } else {
                                objY13 = new Function1() { // from class: i3b
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        tcf tcfVar = (tcf) obj5;
                                        n6s n6sVar7 = n6sVar5;
                                        if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                            tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                        }
                                        return Unit.a;
                                    }
                                };
                                r16.r(objY13);
                            }
                            yhf0 yhf0Var3 = yhf0Var;
                            z24 = false;
                            d dVarA14 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA13).n(dVarA4), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA12), aVar9, new uhf0(yhf0Var3, z2, pswVar)).n(dVarC2).n(coreTextFieldSemanticsModifier2), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar4));
                            if (z2) {
                                z24 = true;
                            }
                            if (z24) {
                                dVarA3 = aVar4;
                            } else {
                                dVarA3 = aVar4;
                            }
                            ?? r19 = r16;
                            b(dVarA14, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var3, ijf0Var, uni0Var, dVarA2, dVarA10, dVarA11, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r19), r19, 384);
                            r15 = r19;
                        }
                        if (z5) {
                            rvf rvfVar3 = osfVar.b;
                            rvfVar3.d = -1;
                            rvfVar3.e = -1;
                            ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                        } else {
                            rvf rvfVar4 = osfVar.b;
                            rvfVar4.d = -1;
                            rvfVar4.e = -1;
                            ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                        }
                        ijf0Var2 = osfVar.a;
                        osfVar.a = ijf0VarA;
                        if (dkf0Var != null) {
                            dkf0Var.a(ijf0Var2, ijf0VarA);
                        }
                        objY = I.y();
                        obj2 = obj;
                        if (objY == obj2) {
                            objY = new odh0(0);
                            I.r(objY);
                        }
                        odh0Var = (odh0) objY;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (odh0Var.f) {
                            odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                            odh0Var.a(ijf0Var);
                        } else {
                            l = odh0Var.e;
                            if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                                odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                                odh0Var.a(ijf0Var);
                            }
                        }
                        objY2 = I.y();
                        if (objY2 == obj2) {
                            objY2 = xvf.i(kotlin.coroutines.e.a, I);
                            I.r(objY2);
                        }
                        v5bVar = (v5b) objY2;
                        objY3 = I.y();
                        if (objY3 == obj2) {
                            objY3 = new la5();
                            I.r(objY3);
                        }
                        ia5Var = (ia5) objY3;
                        objY4 = I.y();
                        if (objY4 == obj2) {
                            objY4 = new iif0(odh0Var);
                            I.r(objY4);
                        }
                        iif0Var = (iif0) objY4;
                        iif0Var.b = mlyVar4;
                        iif0Var.f = uni0Var;
                        iif0Var.c = n6sVar6.v;
                        iif0Var.d = n6sVar6;
                        ((x5a0) iif0Var.e).setValue(ijf0Var);
                        iif0Var.x = new ulf0(j5);
                        iif0Var.h = (ms7) I.O(kna.f);
                        iif0Var.i = v5bVar;
                        iif0Var.k = (jmf0) I.O(kna.q);
                        iif0Var.l = (zdl) I.O(kna.l);
                        iif0Var.m = b5iVar;
                        boolean z211 = !z3;
                        ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z211));
                        ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                        I.N(1966776937);
                        q780Var = q780.a;
                        cetVar = imf0Var.a.k;
                        qyd0 qyd0Var2 = jk10.a;
                        I.N(430530635);
                        if (Build.VERSION.SDK_INT < 28) {
                            I.H();
                            vj10Var = null;
                        } else {
                            context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                            coroutineContext = (CoroutineContext) I.O(jk10.a);
                            zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                            objY5 = I.y();
                            if (zM) {
                                jk10.b.getClass();
                                objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                                I.r(objY5);
                            } else {
                                jk10.b.getClass();
                                objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                                I.r(objY5);
                            }
                            vj10Var = (vj10) objY5;
                            I.H();
                        }
                        iif0Var.j = vj10Var;
                        I.X(false);
                        boolean zA18 = I.A(n6sVar6);
                        i7 = i13 & 7168;
                        if (i7 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z212 = zA18 | z7;
                        i8 = i13 & 57344;
                        if (i8 == 16384) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean z213 = z8 | z212;
                        ujf0Var = ujf0Var3;
                        boolean zA19 = z213 | I.A(ujf0Var);
                        if (i14 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        i9 = (i13 & 112) ^ 48;
                        zA = zA19 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                        Object objY23 = I.y();
                        if (zA) {
                            i10 = i7;
                            n6sVar2 = n6sVar6;
                            ?? r110 = I;
                            bcnVar2 = bcnVar;
                            obj3 = new Function1() { // from class: q3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    vkf0 vkf0VarD;
                                    j5i j5iVar = (j5i) obj5;
                                    n6s n6sVar7 = n6sVar2;
                                    if (n6sVar7.b() == j5iVar.a()) {
                                        return Unit.a;
                                    }
                                    ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                    boolean zB2 = n6sVar7.b();
                                    ijf0 ijf0Var7 = ijf0Var;
                                    mly mlyVar5 = mlyVar4;
                                    if (zB2 && z2 && !z3) {
                                        j4b.g(ujf0Var, n6sVar7, ijf0Var7, bcnVar2, mlyVar5);
                                    } else {
                                        j4b.e(n6sVar7);
                                    }
                                    if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                        ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var7, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                    }
                                    if (!j5iVar.a()) {
                                        iif0Var.d(null);
                                    }
                                    return Unit.a;
                                }
                            };
                            z10 = z2;
                            ujf0Var = ujf0Var;
                            iif0Var2 = iif0Var;
                            ia5Var2 = ia5Var;
                            v5bVar2 = v5bVar;
                            ijf0Var3 = ijf0Var;
                            r110.r(obj3);
                            r16 = r110;
                        } else {
                            i10 = i7;
                            n6sVar2 = n6sVar6;
                            ?? r111 = I;
                            bcnVar2 = bcnVar;
                            obj3 = new Function1() { // from class: q3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    vkf0 vkf0VarD;
                                    j5i j5iVar = (j5i) obj5;
                                    n6s n6sVar7 = n6sVar2;
                                    if (n6sVar7.b() == j5iVar.a()) {
                                        return Unit.a;
                                    }
                                    ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                    boolean zB2 = n6sVar7.b();
                                    ijf0 ijf0Var7 = ijf0Var;
                                    mly mlyVar5 = mlyVar4;
                                    if (zB2 && z2 && !z3) {
                                        j4b.g(ujf0Var, n6sVar7, ijf0Var7, bcnVar2, mlyVar5);
                                    } else {
                                        j4b.e(n6sVar7);
                                    }
                                    if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                        ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var7, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                    }
                                    if (!j5iVar.a()) {
                                        iif0Var.d(null);
                                    }
                                    return Unit.a;
                                }
                            };
                            z10 = z2;
                            ujf0Var = ujf0Var;
                            iif0Var2 = iif0Var;
                            ia5Var2 = ia5Var;
                            v5bVar2 = v5bVar;
                            ijf0Var3 = ijf0Var;
                            r111.r(obj3);
                            r16 = r111;
                        }
                        aVar4 = d.a.b;
                        d dVarA15 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                        if (z10) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        ytwVarC = m.c(Boolean.valueOf(z11), r16);
                        Unit unit2 = Unit.a;
                        boolean zM6 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                        if (i9 > 32) {
                            n6sVar3 = n6sVar2;
                            if ((r5 & 48) != 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            n6sVar3 = n6sVar2;
                            if ((r5 & 48) != 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        z13 = zM6 | z12;
                        Object objY24 = r16.y();
                        if (z13) {
                            n6sVar4 = n6sVar3;
                            ujf0 ujf0Var7 = ujf0Var;
                            y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var7, iif0Var2, bcnVar, null);
                            ytwVar = ytwVarC;
                            ujf0Var = ujf0Var7;
                            r16.r(y3bVar);
                        } else {
                            n6sVar4 = n6sVar3;
                            ujf0 ujf0Var8 = ujf0Var;
                            y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var8, iif0Var2, bcnVar, null);
                            ytwVar = ytwVarC;
                            ujf0Var = ujf0Var8;
                            r16.r(y3bVar);
                        }
                        xvf.e(r16, unit2, (Function2) y3bVar);
                        zA2 = r16.A(n6sVar4);
                        objY6 = r16.y();
                        if (zA2) {
                            objY6 = new r3b(n6sVar4, 0);
                            r16.r(objY6);
                        } else {
                            objY6 = new r3b(n6sVar4, 0);
                            r16.r(objY6);
                        }
                        dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                        boolean zA110 = r16.A(n6sVar4);
                        if (i8 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z214 = zA110 | z14;
                        i11 = i10;
                        if (i11 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zA3 = z214 | z15 | r16.A(r7) | r16.A(iif0Var2);
                        objY7 = r16.y();
                        if (zA3) {
                            final iif0 iif0Var7 = iif0Var2;
                            mlyVar = r7;
                            final b5i b5iVar5 = b5iVar;
                            Function1 function10 = new Function1() { // from class: s3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    ooa0 ooa0Var2;
                                    gly glyVar = (gly) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    if (!n6sVar7.b()) {
                                        b5i.b(b5iVar5);
                                    } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                        ooa0Var2.a();
                                    }
                                    if (n6sVar7.b() && z2) {
                                        if (n6sVar7.a() != ocl.b) {
                                            vkf0 vkf0VarD = n6sVar7.d();
                                            if (vkf0VarD != null) {
                                                long j6 = glyVar.a;
                                                osf osfVar2 = n6sVar7.d;
                                                l6s l6sVar3 = n6sVar7.v;
                                                int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                l6sVar3.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                if (n6sVar7.a.a.b.length() > 0) {
                                                    ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                }
                                            }
                                        } else {
                                            iif0Var7.d(glyVar);
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            iif0Var2 = iif0Var7;
                            r16.r(function10);
                            objY7 = function10;
                        } else {
                            final iif0 iif0Var8 = iif0Var2;
                            mlyVar = r7;
                            final b5i b5iVar6 = b5iVar;
                            Function1 function11 = new Function1() { // from class: s3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    ooa0 ooa0Var2;
                                    gly glyVar = (gly) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    if (!n6sVar7.b()) {
                                        b5i.b(b5iVar6);
                                    } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                        ooa0Var2.a();
                                    }
                                    if (n6sVar7.b() && z2) {
                                        if (n6sVar7.a() != ocl.b) {
                                            vkf0 vkf0VarD = n6sVar7.d();
                                            if (vkf0VarD != null) {
                                                long j6 = glyVar.a;
                                                osf osfVar2 = n6sVar7.d;
                                                l6s l6sVar3 = n6sVar7.v;
                                                int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                l6sVar3.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                if (n6sVar7.a.a.b.length() > 0) {
                                                    ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                }
                                            }
                                        } else {
                                            iif0Var8.d(glyVar);
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            iif0Var2 = iif0Var8;
                            r16.r(function11);
                            objY7 = function11;
                        }
                        function3 = (Function1) objY7;
                        if (z2) {
                            dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                        }
                        iif0.b bVar4 = iif0Var2.B;
                        iif0.c cVar3 = iif0Var2.A;
                        d dVarN3 = dVarA.n(new SuspendPointerInputElement(bVar4, cVar3, null, new l880(bVar4, cVar3), 4));
                        g020.a.getClass();
                        d dVarC3 = h020.c(dVarN3, j020.b);
                        boolean zA111 = r16.A(n6sVar4);
                        if (i14 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zA4 = zA111 | z16 | r16.A(mlyVar);
                        objY8 = r16.y();
                        if (zA4) {
                            objY8 = new Function1() { // from class: t3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        lc6 lc6VarA = tcfVar.F1().a();
                                        long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                        long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                        ukf0 ukf0Var = vkf0VarD.a;
                                        zjw zjwVar = ukf0Var.b;
                                        tkf0 tkf0Var = ukf0Var.a;
                                        b90 b90Var = n6sVar7.y;
                                        long j8 = n6sVar7.z;
                                        boolean zC = ulf0.c(j6);
                                        mly mlyVar5 = mlyVar;
                                        if (!zC) {
                                            b90Var.m(j8);
                                            int iB3 = mlyVar5.b(ulf0.f(j6));
                                            int iB4 = mlyVar5.b(ulf0.e(j6));
                                            if (iB3 != iB4) {
                                                lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                            }
                                        } else if (ulf0.c(j7)) {
                                            ijf0 ijf0Var7 = ijf0Var3;
                                            if (!ulf0.c(ijf0Var7.b)) {
                                                b90Var.m(j8);
                                                long j9 = ijf0Var7.b;
                                                int iB5 = mlyVar5.b(ulf0.f(j9));
                                                int iB6 = mlyVar5.b(ulf0.e(j9));
                                                if (iB5 != iB6) {
                                                    lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                }
                                            }
                                        } else {
                                            long jC = tkf0Var.b.c();
                                            j58 j58Var = new j58(jC);
                                            if (jC == 16) {
                                                j58Var = null;
                                            }
                                            long j10 = j58Var != null ? j58Var.a : j58.b;
                                            b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                            int iB7 = mlyVar5.b(ulf0.f(j7));
                                            int iB8 = mlyVar5.b(ulf0.e(j7));
                                            if (iB7 != iB8) {
                                                lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                            }
                                        }
                                        boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                        if (z30) {
                                            long j11 = ukf0Var.c;
                                            lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                            lc6VarA.p();
                                            lc6VarA.i(lk40VarB);
                                        }
                                        ora0 ora0Var = tkf0Var.b.a;
                                        yef0 yef0Var = ora0Var.m;
                                        kjf0 kjf0Var = ora0Var.a;
                                        if (yef0Var == null) {
                                            yef0Var = yef0.b;
                                        }
                                        yef0 yef0Var2 = yef0Var;
                                        ix80 ix80Var = ora0Var.n;
                                        if (ix80Var == null) {
                                            ix80Var = ix80.d;
                                        }
                                        ix80 ix80Var2 = ix80Var;
                                        wcf wcfVar = ora0Var.p;
                                        if (wcfVar == null) {
                                            wcfVar = rlh.a;
                                        }
                                        wcf wcfVar2 = wcfVar;
                                        try {
                                            ya5 ya5VarE = kjf0Var.e();
                                            kjf0.a aVar10 = kjf0.a.a;
                                            if (ya5VarE != null) {
                                                gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar10 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                            } else {
                                                zjwVar.i(lc6VarA, kjf0Var != aVar10 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                            }
                                        } finally {
                                            if (z30) {
                                                lc6VarA.f();
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY8);
                        } else {
                            objY8 = new Function1() { // from class: t3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        lc6 lc6VarA = tcfVar.F1().a();
                                        long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                        long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                        ukf0 ukf0Var = vkf0VarD.a;
                                        zjw zjwVar = ukf0Var.b;
                                        tkf0 tkf0Var = ukf0Var.a;
                                        b90 b90Var = n6sVar7.y;
                                        long j8 = n6sVar7.z;
                                        boolean zC = ulf0.c(j6);
                                        mly mlyVar5 = mlyVar;
                                        if (!zC) {
                                            b90Var.m(j8);
                                            int iB3 = mlyVar5.b(ulf0.f(j6));
                                            int iB4 = mlyVar5.b(ulf0.e(j6));
                                            if (iB3 != iB4) {
                                                lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                            }
                                        } else if (ulf0.c(j7)) {
                                            ijf0 ijf0Var7 = ijf0Var3;
                                            if (!ulf0.c(ijf0Var7.b)) {
                                                b90Var.m(j8);
                                                long j9 = ijf0Var7.b;
                                                int iB5 = mlyVar5.b(ulf0.f(j9));
                                                int iB6 = mlyVar5.b(ulf0.e(j9));
                                                if (iB5 != iB6) {
                                                    lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                }
                                            }
                                        } else {
                                            long jC = tkf0Var.b.c();
                                            j58 j58Var = new j58(jC);
                                            if (jC == 16) {
                                                j58Var = null;
                                            }
                                            long j10 = j58Var != null ? j58Var.a : j58.b;
                                            b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                            int iB7 = mlyVar5.b(ulf0.f(j7));
                                            int iB8 = mlyVar5.b(ulf0.e(j7));
                                            if (iB7 != iB8) {
                                                lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                            }
                                        }
                                        boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                        if (z30) {
                                            long j11 = ukf0Var.c;
                                            lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                            lc6VarA.p();
                                            lc6VarA.i(lk40VarB);
                                        }
                                        ora0 ora0Var = tkf0Var.b.a;
                                        yef0 yef0Var = ora0Var.m;
                                        kjf0 kjf0Var = ora0Var.a;
                                        if (yef0Var == null) {
                                            yef0Var = yef0.b;
                                        }
                                        yef0 yef0Var2 = yef0Var;
                                        ix80 ix80Var = ora0Var.n;
                                        if (ix80Var == null) {
                                            ix80Var = ix80.d;
                                        }
                                        ix80 ix80Var2 = ix80Var;
                                        wcf wcfVar = ora0Var.p;
                                        if (wcfVar == null) {
                                            wcfVar = rlh.a;
                                        }
                                        wcf wcfVar2 = wcfVar;
                                        try {
                                            ya5 ya5VarE = kjf0Var.e();
                                            kjf0.a aVar10 = kjf0.a.a;
                                            if (ya5VarE != null) {
                                                gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar10 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                            } else {
                                                zjwVar.i(lc6VarA, kjf0Var != aVar10 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                            }
                                        } finally {
                                            if (z30) {
                                                lc6VarA.f();
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY8);
                        }
                        d dVarA16 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                        boolean zA112 = r16.A(n6sVar4);
                        if (i11 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zM7 = zA112 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                        if (i14 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zA5 = zM7 | z18 | r16.A(mlyVar);
                        objY9 = r16.y();
                        if (zA5) {
                            final ijf0 ijf0Var7 = ijf0Var3;
                            Function1 function12 = new Function1() { // from class: u3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    dkf0 dkf0Var2;
                                    urr urrVar;
                                    urr urrVar2;
                                    n6s n6sVar7 = n6sVar4;
                                    ytw ytwVar2 = n6sVar7.o;
                                    urr urrVar3 = (urr) obj5;
                                    n6sVar7.h = urrVar3;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        vkf0VarD.b = urrVar3;
                                    }
                                    if (z2) {
                                        ocl oclVarA = n6sVar7.a();
                                        ocl oclVar = ocl.b;
                                        iif0 iif0Var9 = iif0Var2;
                                        ijf0 ijf0Var8 = ijf0Var7;
                                        if (oclVarA == oclVar) {
                                            if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                iif0Var9.r();
                                            } else {
                                                iif0Var9.k();
                                            }
                                            ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var9, true)));
                                            ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var9, false)));
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var8.b)));
                                        } else if (n6sVar7.a() == ocl.c) {
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var9, true)));
                                        }
                                        mly mlyVar5 = mlyVar;
                                        j4b.f(n6sVar7, ijf0Var8, mlyVar5);
                                        vkf0 vkf0VarD2 = n6sVar7.d();
                                        if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                            ukf0 ukf0Var = vkf0VarD2.a;
                                            wff0 wff0Var = new wff0(urrVar);
                                            lk40 lk40VarA = z880.a(urrVar);
                                            lk40 lk40VarP = urrVar.P(urrVar2, false);
                                            if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                dkf0Var2.b.h(ijf0Var8, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            a8j0Var = a8j0Var2;
                            r16.r(function12);
                            objY9 = function12;
                        } else {
                            final ijf0 ijf0Var8 = ijf0Var3;
                            Function1 function13 = new Function1() { // from class: u3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    dkf0 dkf0Var2;
                                    urr urrVar;
                                    urr urrVar2;
                                    n6s n6sVar7 = n6sVar4;
                                    ytw ytwVar2 = n6sVar7.o;
                                    urr urrVar3 = (urr) obj5;
                                    n6sVar7.h = urrVar3;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        vkf0VarD.b = urrVar3;
                                    }
                                    if (z2) {
                                        ocl oclVarA = n6sVar7.a();
                                        ocl oclVar = ocl.b;
                                        iif0 iif0Var9 = iif0Var2;
                                        ijf0 ijf0Var9 = ijf0Var8;
                                        if (oclVarA == oclVar) {
                                            if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                iif0Var9.r();
                                            } else {
                                                iif0Var9.k();
                                            }
                                            ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var9, true)));
                                            ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var9, false)));
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var9.b)));
                                        } else if (n6sVar7.a() == ocl.c) {
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var9, true)));
                                        }
                                        mly mlyVar5 = mlyVar;
                                        j4b.f(n6sVar7, ijf0Var9, mlyVar5);
                                        vkf0 vkf0VarD2 = n6sVar7.d();
                                        if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                            ukf0 ukf0Var = vkf0VarD2.a;
                                            wff0 wff0Var = new wff0(urrVar);
                                            lk40 lk40VarA = z880.a(urrVar);
                                            lk40 lk40VarP = urrVar.P(urrVar2, false);
                                            if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                dkf0Var2.b.h(ijf0Var9, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            a8j0Var = a8j0Var2;
                            r16.r(function13);
                            objY9 = function13;
                        }
                        d dVarA17 = v.a(aVar4, (Function1) objY9);
                        mlyVar2 = mlyVar;
                        n6sVar5 = n6sVar4;
                        v5b v5bVar5 = v5bVar2;
                        ujf0Var2 = ujf0Var;
                        iif0Var3 = iif0Var2;
                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier3 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                        if (!z2) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                        } else {
                            dVarA2 = aVar4;
                        }
                        zA6 = r16.A(iif0Var3);
                        objY10 = r16.y();
                        if (zA6) {
                            objY10 = new v3b(iif0Var3, 0);
                            r16.r(objY10);
                        } else {
                            objY10 = new v3b(iif0Var3, 0);
                            r16.r(objY10);
                        }
                        xvf.c(iif0Var3, (Function1) objY10, r16);
                        boolean zA113 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                        if (i14 == 4) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        z21 = zA113 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                        objY11 = r16.y();
                        if (z21) {
                            objY11 = new Function1() { // from class: w3b
                                /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    n6s n6sVar7 = n6sVar5;
                                    if (n6sVar7.b()) {
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar3 = n6sVar7.v;
                                        uhi uhiVar = n6sVar7.w;
                                        dq40 dq40Var = new dq40();
                                        vff0 vff0Var = new vff0(osfVar2, l6sVar3, dq40Var);
                                        ujf0 ujf0Var9 = ujf0Var2;
                                        rk10 rk10Var = ujf0Var9.a;
                                        rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                        ?? dkf0Var2 = new dkf0(ujf0Var9, rk10Var);
                                        ujf0Var9.b.set((dkf0) dkf0Var2);
                                        dq40Var.a = dkf0Var2;
                                        n6sVar7.e = dkf0Var2;
                                    }
                                    return new i4b();
                                }
                            };
                            r16.r(objY11);
                        } else {
                            objY11 = new Function1() { // from class: w3b
                                /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    n6s n6sVar7 = n6sVar5;
                                    if (n6sVar7.b()) {
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar3 = n6sVar7.v;
                                        uhi uhiVar = n6sVar7.w;
                                        dq40 dq40Var = new dq40();
                                        vff0 vff0Var = new vff0(osfVar2, l6sVar3, dq40Var);
                                        ujf0 ujf0Var9 = ujf0Var2;
                                        rk10 rk10Var = ujf0Var9.a;
                                        rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                        ?? dkf0Var2 = new dkf0(ujf0Var9, rk10Var);
                                        ujf0Var9.b.set((dkf0) dkf0Var2);
                                        dq40Var.a = dkf0Var2;
                                        n6sVar7.e = dkf0Var2;
                                    }
                                    return new i4b();
                                }
                            };
                            r16.r(objY11);
                        }
                        xvf.c(bcnVar, (Function1) objY11, r16);
                        l6s l6sVar3 = n6sVar5.v;
                        if (i == 1) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        chf0 chf0Var3 = new chf0(n6sVar5, iif0Var3, ijf0Var, z211, z22, mlyVar2, odh0Var, l6sVar3, bcnVar.e);
                        gnn.a aVar10 = gnn.a;
                        d dVarA18 = c.a(aVar4, aVar10, chf0Var3);
                        i12 = bcnVar.d;
                        if (i12 == 7) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        boolean zBooleanValue3 = ((Boolean) ytwVar.getValue()).booleanValue();
                        zB = r16.b(z23) | r16.A(x5sVar);
                        objY12 = r16.y();
                        if (zB) {
                            objY12 = new Function0() { // from class: j3b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z23) {
                                        x5sVar.i();
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY12);
                        } else {
                            objY12 = new Function0() { // from class: j3b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z23) {
                                        x5sVar.i();
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY12);
                        }
                        d dVarA19 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue3, z23, (Function0) objY12);
                        j2 = ((j58) r16.O(vl1.a)).a;
                        zA7 = r16.A(n6sVar5) | r16.e(j2);
                        objY13 = r16.y();
                        if (zA7) {
                            objY13 = new Function1() { // from class: i3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar5;
                                    if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                        tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY13);
                        } else {
                            objY13 = new Function1() { // from class: i3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar5;
                                    if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                        tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY13);
                        }
                        yhf0 yhf0Var4 = yhf0Var;
                        z24 = false;
                        d dVarA110 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA19).n(dVarA15), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA18), aVar10, new uhf0(yhf0Var4, z2, pswVar)).n(dVarC3).n(coreTextFieldSemanticsModifier3), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar5));
                        if (z2) {
                            z24 = true;
                        }
                        if (z24) {
                            dVarA3 = aVar4;
                        } else {
                            dVarA3 = aVar4;
                        }
                        ?? r112 = r16;
                        b(dVarA110, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var4, ijf0Var, uni0Var, dVarA2, dVarA16, dVarA17, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r112), r112, 384);
                        r15 = r112;
                    } else {
                        osfVar.b = new rvf(nk0Var, j5);
                        z5 = true;
                    }
                    z6 = false;
                    if (ulf0Var == null) {
                        rvf rvfVar5 = osfVar.b;
                        rvfVar5.d = -1;
                        rvfVar5.e = -1;
                    } else {
                        j = ulf0Var.a;
                        if (!ulf0.c(j)) {
                            osfVar.b.g(ulf0.f(j), ulf0.e(j));
                        }
                        if (z5) {
                            rvf rvfVar6 = osfVar.b;
                            rvfVar6.d = -1;
                            rvfVar6.e = -1;
                            ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                        } else {
                            rvf rvfVar7 = osfVar.b;
                            rvfVar7.d = -1;
                            rvfVar7.e = -1;
                            ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                        }
                        ijf0Var2 = osfVar.a;
                        osfVar.a = ijf0VarA;
                        if (dkf0Var != null) {
                            dkf0Var.a(ijf0Var2, ijf0VarA);
                        }
                        objY = I.y();
                        obj2 = obj;
                        if (objY == obj2) {
                            objY = new odh0(0);
                            I.r(objY);
                        }
                        odh0Var = (odh0) objY;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (odh0Var.f) {
                            odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                            odh0Var.a(ijf0Var);
                        } else {
                            l = odh0Var.e;
                            if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                                odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                                odh0Var.a(ijf0Var);
                            }
                        }
                        objY2 = I.y();
                        if (objY2 == obj2) {
                            objY2 = xvf.i(kotlin.coroutines.e.a, I);
                            I.r(objY2);
                        }
                        v5bVar = (v5b) objY2;
                        objY3 = I.y();
                        if (objY3 == obj2) {
                            objY3 = new la5();
                            I.r(objY3);
                        }
                        ia5Var = (ia5) objY3;
                        objY4 = I.y();
                        if (objY4 == obj2) {
                            objY4 = new iif0(odh0Var);
                            I.r(objY4);
                        }
                        iif0Var = (iif0) objY4;
                        iif0Var.b = mlyVar4;
                        iif0Var.f = uni0Var;
                        iif0Var.c = n6sVar6.v;
                        iif0Var.d = n6sVar6;
                        ((x5a0) iif0Var.e).setValue(ijf0Var);
                        iif0Var.x = new ulf0(j5);
                        iif0Var.h = (ms7) I.O(kna.f);
                        iif0Var.i = v5bVar;
                        iif0Var.k = (jmf0) I.O(kna.q);
                        iif0Var.l = (zdl) I.O(kna.l);
                        iif0Var.m = b5iVar;
                        boolean z215 = !z3;
                        ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z215));
                        ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                        I.N(1966776937);
                        q780Var = q780.a;
                        cetVar = imf0Var.a.k;
                        qyd0 qyd0Var3 = jk10.a;
                        I.N(430530635);
                        if (Build.VERSION.SDK_INT < 28) {
                            I.H();
                            vj10Var = null;
                        } else {
                            context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                            coroutineContext = (CoroutineContext) I.O(jk10.a);
                            zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                            objY5 = I.y();
                            if (zM) {
                                jk10.b.getClass();
                                objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                                I.r(objY5);
                            } else {
                                jk10.b.getClass();
                                objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                                I.r(objY5);
                            }
                            vj10Var = (vj10) objY5;
                            I.H();
                        }
                        iif0Var.j = vj10Var;
                        I.X(false);
                        boolean zA114 = I.A(n6sVar6);
                        i7 = i13 & 7168;
                        if (i7 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z216 = zA114 | z7;
                        i8 = i13 & 57344;
                        if (i8 == 16384) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean z217 = z8 | z216;
                        ujf0Var = ujf0Var3;
                        boolean zA115 = z217 | I.A(ujf0Var);
                        if (i14 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        i9 = (i13 & 112) ^ 48;
                        zA = zA115 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                        Object objY25 = I.y();
                        if (zA) {
                            i10 = i7;
                            n6sVar2 = n6sVar6;
                            ?? r113 = I;
                            bcnVar2 = bcnVar;
                            obj3 = new Function1() { // from class: q3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    vkf0 vkf0VarD;
                                    j5i j5iVar = (j5i) obj5;
                                    n6s n6sVar7 = n6sVar2;
                                    if (n6sVar7.b() == j5iVar.a()) {
                                        return Unit.a;
                                    }
                                    ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                    boolean zB2 = n6sVar7.b();
                                    ijf0 ijf0Var9 = ijf0Var;
                                    mly mlyVar5 = mlyVar4;
                                    if (zB2 && z2 && !z3) {
                                        j4b.g(ujf0Var, n6sVar7, ijf0Var9, bcnVar2, mlyVar5);
                                    } else {
                                        j4b.e(n6sVar7);
                                    }
                                    if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                        ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var9, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                    }
                                    if (!j5iVar.a()) {
                                        iif0Var.d(null);
                                    }
                                    return Unit.a;
                                }
                            };
                            z10 = z2;
                            ujf0Var = ujf0Var;
                            iif0Var2 = iif0Var;
                            ia5Var2 = ia5Var;
                            v5bVar2 = v5bVar;
                            ijf0Var3 = ijf0Var;
                            r113.r(obj3);
                            r16 = r113;
                        } else {
                            i10 = i7;
                            n6sVar2 = n6sVar6;
                            ?? r114 = I;
                            bcnVar2 = bcnVar;
                            obj3 = new Function1() { // from class: q3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    vkf0 vkf0VarD;
                                    j5i j5iVar = (j5i) obj5;
                                    n6s n6sVar7 = n6sVar2;
                                    if (n6sVar7.b() == j5iVar.a()) {
                                        return Unit.a;
                                    }
                                    ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                    boolean zB2 = n6sVar7.b();
                                    ijf0 ijf0Var9 = ijf0Var;
                                    mly mlyVar5 = mlyVar4;
                                    if (zB2 && z2 && !z3) {
                                        j4b.g(ujf0Var, n6sVar7, ijf0Var9, bcnVar2, mlyVar5);
                                    } else {
                                        j4b.e(n6sVar7);
                                    }
                                    if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                        ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var9, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                    }
                                    if (!j5iVar.a()) {
                                        iif0Var.d(null);
                                    }
                                    return Unit.a;
                                }
                            };
                            z10 = z2;
                            ujf0Var = ujf0Var;
                            iif0Var2 = iif0Var;
                            ia5Var2 = ia5Var;
                            v5bVar2 = v5bVar;
                            ijf0Var3 = ijf0Var;
                            r114.r(obj3);
                            r16 = r114;
                        }
                        aVar4 = d.a.b;
                        d dVarA111 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                        if (z10) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        ytwVarC = m.c(Boolean.valueOf(z11), r16);
                        Unit unit3 = Unit.a;
                        boolean zM8 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                        if (i9 > 32) {
                            n6sVar3 = n6sVar2;
                            if ((r5 & 48) != 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            n6sVar3 = n6sVar2;
                            if ((r5 & 48) != 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        z13 = zM8 | z12;
                        Object objY26 = r16.y();
                        if (z13) {
                            n6sVar4 = n6sVar3;
                            ujf0 ujf0Var9 = ujf0Var;
                            y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var9, iif0Var2, bcnVar, null);
                            ytwVar = ytwVarC;
                            ujf0Var = ujf0Var9;
                            r16.r(y3bVar);
                        } else {
                            n6sVar4 = n6sVar3;
                            ujf0 ujf0Var10 = ujf0Var;
                            y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var10, iif0Var2, bcnVar, null);
                            ytwVar = ytwVarC;
                            ujf0Var = ujf0Var10;
                            r16.r(y3bVar);
                        }
                        xvf.e(r16, unit3, (Function2) y3bVar);
                        zA2 = r16.A(n6sVar4);
                        objY6 = r16.y();
                        if (zA2) {
                            objY6 = new r3b(n6sVar4, 0);
                            r16.r(objY6);
                        } else {
                            objY6 = new r3b(n6sVar4, 0);
                            r16.r(objY6);
                        }
                        dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                        boolean zA116 = r16.A(n6sVar4);
                        if (i8 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z218 = zA116 | z14;
                        i11 = i10;
                        if (i11 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zA3 = z218 | z15 | r16.A(r7) | r16.A(iif0Var2);
                        objY7 = r16.y();
                        if (zA3) {
                            final iif0 iif0Var9 = iif0Var2;
                            mlyVar = r7;
                            final b5i b5iVar7 = b5iVar;
                            Function1 function14 = new Function1() { // from class: s3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    ooa0 ooa0Var2;
                                    gly glyVar = (gly) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    if (!n6sVar7.b()) {
                                        b5i.b(b5iVar7);
                                    } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                        ooa0Var2.a();
                                    }
                                    if (n6sVar7.b() && z2) {
                                        if (n6sVar7.a() != ocl.b) {
                                            vkf0 vkf0VarD = n6sVar7.d();
                                            if (vkf0VarD != null) {
                                                long j6 = glyVar.a;
                                                osf osfVar2 = n6sVar7.d;
                                                l6s l6sVar4 = n6sVar7.v;
                                                int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                l6sVar4.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                if (n6sVar7.a.a.b.length() > 0) {
                                                    ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                }
                                            }
                                        } else {
                                            iif0Var9.d(glyVar);
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            iif0Var2 = iif0Var9;
                            r16.r(function14);
                            objY7 = function14;
                        } else {
                            final iif0 iif0Var10 = iif0Var2;
                            mlyVar = r7;
                            final b5i b5iVar8 = b5iVar;
                            Function1 function15 = new Function1() { // from class: s3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    ooa0 ooa0Var2;
                                    gly glyVar = (gly) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    if (!n6sVar7.b()) {
                                        b5i.b(b5iVar8);
                                    } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                        ooa0Var2.a();
                                    }
                                    if (n6sVar7.b() && z2) {
                                        if (n6sVar7.a() != ocl.b) {
                                            vkf0 vkf0VarD = n6sVar7.d();
                                            if (vkf0VarD != null) {
                                                long j6 = glyVar.a;
                                                osf osfVar2 = n6sVar7.d;
                                                l6s l6sVar4 = n6sVar7.v;
                                                int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                l6sVar4.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                if (n6sVar7.a.a.b.length() > 0) {
                                                    ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                }
                                            }
                                        } else {
                                            iif0Var10.d(glyVar);
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            iif0Var2 = iif0Var10;
                            r16.r(function15);
                            objY7 = function15;
                        }
                        function3 = (Function1) objY7;
                        if (z2) {
                            dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                        }
                        iif0.b bVar5 = iif0Var2.B;
                        iif0.c cVar4 = iif0Var2.A;
                        d dVarN4 = dVarA.n(new SuspendPointerInputElement(bVar5, cVar4, null, new l880(bVar5, cVar4), 4));
                        g020.a.getClass();
                        d dVarC4 = h020.c(dVarN4, j020.b);
                        boolean zA117 = r16.A(n6sVar4);
                        if (i14 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zA4 = zA117 | z16 | r16.A(mlyVar);
                        objY8 = r16.y();
                        if (zA4) {
                            objY8 = new Function1() { // from class: t3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        lc6 lc6VarA = tcfVar.F1().a();
                                        long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                        long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                        ukf0 ukf0Var = vkf0VarD.a;
                                        zjw zjwVar = ukf0Var.b;
                                        tkf0 tkf0Var = ukf0Var.a;
                                        b90 b90Var = n6sVar7.y;
                                        long j8 = n6sVar7.z;
                                        boolean zC = ulf0.c(j6);
                                        mly mlyVar5 = mlyVar;
                                        if (!zC) {
                                            b90Var.m(j8);
                                            int iB3 = mlyVar5.b(ulf0.f(j6));
                                            int iB4 = mlyVar5.b(ulf0.e(j6));
                                            if (iB3 != iB4) {
                                                lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                            }
                                        } else if (ulf0.c(j7)) {
                                            ijf0 ijf0Var9 = ijf0Var3;
                                            if (!ulf0.c(ijf0Var9.b)) {
                                                b90Var.m(j8);
                                                long j9 = ijf0Var9.b;
                                                int iB5 = mlyVar5.b(ulf0.f(j9));
                                                int iB6 = mlyVar5.b(ulf0.e(j9));
                                                if (iB5 != iB6) {
                                                    lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                }
                                            }
                                        } else {
                                            long jC = tkf0Var.b.c();
                                            j58 j58Var = new j58(jC);
                                            if (jC == 16) {
                                                j58Var = null;
                                            }
                                            long j10 = j58Var != null ? j58Var.a : j58.b;
                                            b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                            int iB7 = mlyVar5.b(ulf0.f(j7));
                                            int iB8 = mlyVar5.b(ulf0.e(j7));
                                            if (iB7 != iB8) {
                                                lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                            }
                                        }
                                        boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                        if (z30) {
                                            long j11 = ukf0Var.c;
                                            lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                            lc6VarA.p();
                                            lc6VarA.i(lk40VarB);
                                        }
                                        ora0 ora0Var = tkf0Var.b.a;
                                        yef0 yef0Var = ora0Var.m;
                                        kjf0 kjf0Var = ora0Var.a;
                                        if (yef0Var == null) {
                                            yef0Var = yef0.b;
                                        }
                                        yef0 yef0Var2 = yef0Var;
                                        ix80 ix80Var = ora0Var.n;
                                        if (ix80Var == null) {
                                            ix80Var = ix80.d;
                                        }
                                        ix80 ix80Var2 = ix80Var;
                                        wcf wcfVar = ora0Var.p;
                                        if (wcfVar == null) {
                                            wcfVar = rlh.a;
                                        }
                                        wcf wcfVar2 = wcfVar;
                                        try {
                                            ya5 ya5VarE = kjf0Var.e();
                                            kjf0.a aVar11 = kjf0.a.a;
                                            if (ya5VarE != null) {
                                                gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar11 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                            } else {
                                                zjwVar.i(lc6VarA, kjf0Var != aVar11 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                            }
                                        } finally {
                                            if (z30) {
                                                lc6VarA.f();
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY8);
                        } else {
                            objY8 = new Function1() { // from class: t3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        lc6 lc6VarA = tcfVar.F1().a();
                                        long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                        long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                        ukf0 ukf0Var = vkf0VarD.a;
                                        zjw zjwVar = ukf0Var.b;
                                        tkf0 tkf0Var = ukf0Var.a;
                                        b90 b90Var = n6sVar7.y;
                                        long j8 = n6sVar7.z;
                                        boolean zC = ulf0.c(j6);
                                        mly mlyVar5 = mlyVar;
                                        if (!zC) {
                                            b90Var.m(j8);
                                            int iB3 = mlyVar5.b(ulf0.f(j6));
                                            int iB4 = mlyVar5.b(ulf0.e(j6));
                                            if (iB3 != iB4) {
                                                lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                            }
                                        } else if (ulf0.c(j7)) {
                                            ijf0 ijf0Var9 = ijf0Var3;
                                            if (!ulf0.c(ijf0Var9.b)) {
                                                b90Var.m(j8);
                                                long j9 = ijf0Var9.b;
                                                int iB5 = mlyVar5.b(ulf0.f(j9));
                                                int iB6 = mlyVar5.b(ulf0.e(j9));
                                                if (iB5 != iB6) {
                                                    lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                }
                                            }
                                        } else {
                                            long jC = tkf0Var.b.c();
                                            j58 j58Var = new j58(jC);
                                            if (jC == 16) {
                                                j58Var = null;
                                            }
                                            long j10 = j58Var != null ? j58Var.a : j58.b;
                                            b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                            int iB7 = mlyVar5.b(ulf0.f(j7));
                                            int iB8 = mlyVar5.b(ulf0.e(j7));
                                            if (iB7 != iB8) {
                                                lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                            }
                                        }
                                        boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                        if (z30) {
                                            long j11 = ukf0Var.c;
                                            lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                            lc6VarA.p();
                                            lc6VarA.i(lk40VarB);
                                        }
                                        ora0 ora0Var = tkf0Var.b.a;
                                        yef0 yef0Var = ora0Var.m;
                                        kjf0 kjf0Var = ora0Var.a;
                                        if (yef0Var == null) {
                                            yef0Var = yef0.b;
                                        }
                                        yef0 yef0Var2 = yef0Var;
                                        ix80 ix80Var = ora0Var.n;
                                        if (ix80Var == null) {
                                            ix80Var = ix80.d;
                                        }
                                        ix80 ix80Var2 = ix80Var;
                                        wcf wcfVar = ora0Var.p;
                                        if (wcfVar == null) {
                                            wcfVar = rlh.a;
                                        }
                                        wcf wcfVar2 = wcfVar;
                                        try {
                                            ya5 ya5VarE = kjf0Var.e();
                                            kjf0.a aVar11 = kjf0.a.a;
                                            if (ya5VarE != null) {
                                                gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar11 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                            } else {
                                                zjwVar.i(lc6VarA, kjf0Var != aVar11 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                            }
                                        } finally {
                                            if (z30) {
                                                lc6VarA.f();
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY8);
                        }
                        d dVarA112 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                        boolean zA118 = r16.A(n6sVar4);
                        if (i11 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zM9 = zA118 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                        if (i14 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zA5 = zM9 | z18 | r16.A(mlyVar);
                        objY9 = r16.y();
                        if (zA5) {
                            final ijf0 ijf0Var9 = ijf0Var3;
                            Function1 function16 = new Function1() { // from class: u3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    dkf0 dkf0Var2;
                                    urr urrVar;
                                    urr urrVar2;
                                    n6s n6sVar7 = n6sVar4;
                                    ytw ytwVar2 = n6sVar7.o;
                                    urr urrVar3 = (urr) obj5;
                                    n6sVar7.h = urrVar3;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        vkf0VarD.b = urrVar3;
                                    }
                                    if (z2) {
                                        ocl oclVarA = n6sVar7.a();
                                        ocl oclVar = ocl.b;
                                        iif0 iif0Var11 = iif0Var2;
                                        ijf0 ijf0Var10 = ijf0Var9;
                                        if (oclVarA == oclVar) {
                                            if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                iif0Var11.r();
                                            } else {
                                                iif0Var11.k();
                                            }
                                            ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var11, true)));
                                            ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var11, false)));
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var10.b)));
                                        } else if (n6sVar7.a() == ocl.c) {
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var11, true)));
                                        }
                                        mly mlyVar5 = mlyVar;
                                        j4b.f(n6sVar7, ijf0Var10, mlyVar5);
                                        vkf0 vkf0VarD2 = n6sVar7.d();
                                        if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                            ukf0 ukf0Var = vkf0VarD2.a;
                                            wff0 wff0Var = new wff0(urrVar);
                                            lk40 lk40VarA = z880.a(urrVar);
                                            lk40 lk40VarP = urrVar.P(urrVar2, false);
                                            if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                dkf0Var2.b.h(ijf0Var10, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            a8j0Var = a8j0Var2;
                            r16.r(function16);
                            objY9 = function16;
                        } else {
                            final ijf0 ijf0Var10 = ijf0Var3;
                            Function1 function17 = new Function1() { // from class: u3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    dkf0 dkf0Var2;
                                    urr urrVar;
                                    urr urrVar2;
                                    n6s n6sVar7 = n6sVar4;
                                    ytw ytwVar2 = n6sVar7.o;
                                    urr urrVar3 = (urr) obj5;
                                    n6sVar7.h = urrVar3;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        vkf0VarD.b = urrVar3;
                                    }
                                    if (z2) {
                                        ocl oclVarA = n6sVar7.a();
                                        ocl oclVar = ocl.b;
                                        iif0 iif0Var11 = iif0Var2;
                                        ijf0 ijf0Var11 = ijf0Var10;
                                        if (oclVarA == oclVar) {
                                            if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                iif0Var11.r();
                                            } else {
                                                iif0Var11.k();
                                            }
                                            ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var11, true)));
                                            ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var11, false)));
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var11.b)));
                                        } else if (n6sVar7.a() == ocl.c) {
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var11, true)));
                                        }
                                        mly mlyVar5 = mlyVar;
                                        j4b.f(n6sVar7, ijf0Var11, mlyVar5);
                                        vkf0 vkf0VarD2 = n6sVar7.d();
                                        if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                            ukf0 ukf0Var = vkf0VarD2.a;
                                            wff0 wff0Var = new wff0(urrVar);
                                            lk40 lk40VarA = z880.a(urrVar);
                                            lk40 lk40VarP = urrVar.P(urrVar2, false);
                                            if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                dkf0Var2.b.h(ijf0Var11, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            a8j0Var = a8j0Var2;
                            r16.r(function17);
                            objY9 = function17;
                        }
                        d dVarA113 = v.a(aVar4, (Function1) objY9);
                        mlyVar2 = mlyVar;
                        n6sVar5 = n6sVar4;
                        v5b v5bVar6 = v5bVar2;
                        ujf0Var2 = ujf0Var;
                        iif0Var3 = iif0Var2;
                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier4 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                        if (!z2) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                        } else {
                            dVarA2 = aVar4;
                        }
                        zA6 = r16.A(iif0Var3);
                        objY10 = r16.y();
                        if (zA6) {
                            objY10 = new v3b(iif0Var3, 0);
                            r16.r(objY10);
                        } else {
                            objY10 = new v3b(iif0Var3, 0);
                            r16.r(objY10);
                        }
                        xvf.c(iif0Var3, (Function1) objY10, r16);
                        boolean zA119 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                        if (i14 == 4) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        z21 = zA119 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                        objY11 = r16.y();
                        if (z21) {
                            objY11 = new Function1() { // from class: w3b
                                /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    n6s n6sVar7 = n6sVar5;
                                    if (n6sVar7.b()) {
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar4 = n6sVar7.v;
                                        uhi uhiVar = n6sVar7.w;
                                        dq40 dq40Var = new dq40();
                                        vff0 vff0Var = new vff0(osfVar2, l6sVar4, dq40Var);
                                        ujf0 ujf0Var11 = ujf0Var2;
                                        rk10 rk10Var = ujf0Var11.a;
                                        rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                        ?? dkf0Var2 = new dkf0(ujf0Var11, rk10Var);
                                        ujf0Var11.b.set((dkf0) dkf0Var2);
                                        dq40Var.a = dkf0Var2;
                                        n6sVar7.e = dkf0Var2;
                                    }
                                    return new i4b();
                                }
                            };
                            r16.r(objY11);
                        } else {
                            objY11 = new Function1() { // from class: w3b
                                /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    n6s n6sVar7 = n6sVar5;
                                    if (n6sVar7.b()) {
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar4 = n6sVar7.v;
                                        uhi uhiVar = n6sVar7.w;
                                        dq40 dq40Var = new dq40();
                                        vff0 vff0Var = new vff0(osfVar2, l6sVar4, dq40Var);
                                        ujf0 ujf0Var11 = ujf0Var2;
                                        rk10 rk10Var = ujf0Var11.a;
                                        rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                        ?? dkf0Var2 = new dkf0(ujf0Var11, rk10Var);
                                        ujf0Var11.b.set((dkf0) dkf0Var2);
                                        dq40Var.a = dkf0Var2;
                                        n6sVar7.e = dkf0Var2;
                                    }
                                    return new i4b();
                                }
                            };
                            r16.r(objY11);
                        }
                        xvf.c(bcnVar, (Function1) objY11, r16);
                        l6s l6sVar4 = n6sVar5.v;
                        if (i == 1) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        chf0 chf0Var4 = new chf0(n6sVar5, iif0Var3, ijf0Var, z215, z22, mlyVar2, odh0Var, l6sVar4, bcnVar.e);
                        gnn.a aVar11 = gnn.a;
                        d dVarA114 = c.a(aVar4, aVar11, chf0Var4);
                        i12 = bcnVar.d;
                        if (i12 == 7) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        boolean zBooleanValue4 = ((Boolean) ytwVar.getValue()).booleanValue();
                        zB = r16.b(z23) | r16.A(x5sVar);
                        objY12 = r16.y();
                        if (zB) {
                            objY12 = new Function0() { // from class: j3b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z23) {
                                        x5sVar.i();
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY12);
                        } else {
                            objY12 = new Function0() { // from class: j3b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z23) {
                                        x5sVar.i();
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY12);
                        }
                        d dVarA115 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue4, z23, (Function0) objY12);
                        j2 = ((j58) r16.O(vl1.a)).a;
                        zA7 = r16.A(n6sVar5) | r16.e(j2);
                        objY13 = r16.y();
                        if (zA7) {
                            objY13 = new Function1() { // from class: i3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar5;
                                    if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                        tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY13);
                        } else {
                            objY13 = new Function1() { // from class: i3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar5;
                                    if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                        tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY13);
                        }
                        yhf0 yhf0Var5 = yhf0Var;
                        z24 = false;
                        d dVarA116 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA115).n(dVarA111), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA114), aVar11, new uhf0(yhf0Var5, z2, pswVar)).n(dVarC4).n(coreTextFieldSemanticsModifier4), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar6));
                        if (z2) {
                            z24 = true;
                        }
                        if (z24) {
                            dVarA3 = aVar4;
                        } else {
                            dVarA3 = aVar4;
                        }
                        ?? r115 = r16;
                        b(dVarA116, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var5, ijf0Var, uni0Var, dVarA2, dVarA112, dVarA113, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r115), r115, 384);
                        r15 = r115;
                    }
                    if (z5) {
                        rvf rvfVar8 = osfVar.b;
                        rvfVar8.d = -1;
                        rvfVar8.e = -1;
                        ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                    } else {
                        rvf rvfVar9 = osfVar.b;
                        rvfVar9.d = -1;
                        rvfVar9.e = -1;
                        ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                    }
                    ijf0Var2 = osfVar.a;
                    osfVar.a = ijf0VarA;
                    if (dkf0Var != null) {
                        dkf0Var.a(ijf0Var2, ijf0VarA);
                    }
                    objY = I.y();
                    obj2 = obj;
                    if (objY == obj2) {
                        objY = new odh0(0);
                        I.r(objY);
                    }
                    odh0Var = (odh0) objY;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (odh0Var.f) {
                        odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                        odh0Var.a(ijf0Var);
                    } else {
                        l = odh0Var.e;
                        if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                            odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                            odh0Var.a(ijf0Var);
                        }
                    }
                    objY2 = I.y();
                    if (objY2 == obj2) {
                        objY2 = xvf.i(kotlin.coroutines.e.a, I);
                        I.r(objY2);
                    }
                    v5bVar = (v5b) objY2;
                    objY3 = I.y();
                    if (objY3 == obj2) {
                        objY3 = new la5();
                        I.r(objY3);
                    }
                    ia5Var = (ia5) objY3;
                    objY4 = I.y();
                    if (objY4 == obj2) {
                        objY4 = new iif0(odh0Var);
                        I.r(objY4);
                    }
                    iif0Var = (iif0) objY4;
                    iif0Var.b = mlyVar4;
                    iif0Var.f = uni0Var;
                    iif0Var.c = n6sVar6.v;
                    iif0Var.d = n6sVar6;
                    ((x5a0) iif0Var.e).setValue(ijf0Var);
                    iif0Var.x = new ulf0(j5);
                    iif0Var.h = (ms7) I.O(kna.f);
                    iif0Var.i = v5bVar;
                    iif0Var.k = (jmf0) I.O(kna.q);
                    iif0Var.l = (zdl) I.O(kna.l);
                    iif0Var.m = b5iVar;
                    boolean z219 = !z3;
                    ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z219));
                    ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                    I.N(1966776937);
                    q780Var = q780.a;
                    cetVar = imf0Var.a.k;
                    qyd0 qyd0Var4 = jk10.a;
                    I.N(430530635);
                    if (Build.VERSION.SDK_INT < 28) {
                        I.H();
                        vj10Var = null;
                    } else {
                        context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                        coroutineContext = (CoroutineContext) I.O(jk10.a);
                        zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                        objY5 = I.y();
                        if (zM) {
                            jk10.b.getClass();
                            objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                            I.r(objY5);
                        } else {
                            jk10.b.getClass();
                            objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                            I.r(objY5);
                        }
                        vj10Var = (vj10) objY5;
                        I.H();
                    }
                    iif0Var.j = vj10Var;
                    I.X(false);
                    boolean zA1110 = I.A(n6sVar6);
                    i7 = i13 & 7168;
                    if (i7 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z2110 = zA1110 | z7;
                    i8 = i13 & 57344;
                    if (i8 == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z2111 = z8 | z2110;
                    ujf0Var = ujf0Var3;
                    boolean zA1111 = z2111 | I.A(ujf0Var);
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i9 = (i13 & 112) ^ 48;
                    zA = zA1111 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                    Object objY27 = I.y();
                    if (zA) {
                        i10 = i7;
                        n6sVar2 = n6sVar6;
                        ?? r116 = I;
                        bcnVar2 = bcnVar;
                        obj3 = new Function1() { // from class: q3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                vkf0 vkf0VarD;
                                j5i j5iVar = (j5i) obj5;
                                n6s n6sVar7 = n6sVar2;
                                if (n6sVar7.b() == j5iVar.a()) {
                                    return Unit.a;
                                }
                                ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                boolean zB2 = n6sVar7.b();
                                ijf0 ijf0Var11 = ijf0Var;
                                mly mlyVar5 = mlyVar4;
                                if (zB2 && z2 && !z3) {
                                    j4b.g(ujf0Var, n6sVar7, ijf0Var11, bcnVar2, mlyVar5);
                                } else {
                                    j4b.e(n6sVar7);
                                }
                                if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                    ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var11, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                }
                                if (!j5iVar.a()) {
                                    iif0Var.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        z10 = z2;
                        ujf0Var = ujf0Var;
                        iif0Var2 = iif0Var;
                        ia5Var2 = ia5Var;
                        v5bVar2 = v5bVar;
                        ijf0Var3 = ijf0Var;
                        r116.r(obj3);
                        r16 = r116;
                    } else {
                        i10 = i7;
                        n6sVar2 = n6sVar6;
                        ?? r117 = I;
                        bcnVar2 = bcnVar;
                        obj3 = new Function1() { // from class: q3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                vkf0 vkf0VarD;
                                j5i j5iVar = (j5i) obj5;
                                n6s n6sVar7 = n6sVar2;
                                if (n6sVar7.b() == j5iVar.a()) {
                                    return Unit.a;
                                }
                                ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                boolean zB2 = n6sVar7.b();
                                ijf0 ijf0Var11 = ijf0Var;
                                mly mlyVar5 = mlyVar4;
                                if (zB2 && z2 && !z3) {
                                    j4b.g(ujf0Var, n6sVar7, ijf0Var11, bcnVar2, mlyVar5);
                                } else {
                                    j4b.e(n6sVar7);
                                }
                                if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                    ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var11, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                }
                                if (!j5iVar.a()) {
                                    iif0Var.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        z10 = z2;
                        ujf0Var = ujf0Var;
                        iif0Var2 = iif0Var;
                        ia5Var2 = ia5Var;
                        v5bVar2 = v5bVar;
                        ijf0Var3 = ijf0Var;
                        r117.r(obj3);
                        r16 = r117;
                    }
                    aVar4 = d.a.b;
                    d dVarA117 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    ytwVarC = m.c(Boolean.valueOf(z11), r16);
                    Unit unit4 = Unit.a;
                    boolean zM10 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                    if (i9 > 32) {
                        n6sVar3 = n6sVar2;
                        if ((r5 & 48) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        n6sVar3 = n6sVar2;
                        if ((r5 & 48) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    z13 = zM10 | z12;
                    Object objY28 = r16.y();
                    if (z13) {
                        n6sVar4 = n6sVar3;
                        ujf0 ujf0Var11 = ujf0Var;
                        y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var11, iif0Var2, bcnVar, null);
                        ytwVar = ytwVarC;
                        ujf0Var = ujf0Var11;
                        r16.r(y3bVar);
                    } else {
                        n6sVar4 = n6sVar3;
                        ujf0 ujf0Var12 = ujf0Var;
                        y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var12, iif0Var2, bcnVar, null);
                        ytwVar = ytwVarC;
                        ujf0Var = ujf0Var12;
                        r16.r(y3bVar);
                    }
                    xvf.e(r16, unit4, (Function2) y3bVar);
                    zA2 = r16.A(n6sVar4);
                    objY6 = r16.y();
                    if (zA2) {
                        objY6 = new r3b(n6sVar4, 0);
                        r16.r(objY6);
                    } else {
                        objY6 = new r3b(n6sVar4, 0);
                        r16.r(objY6);
                    }
                    dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                    boolean zA1112 = r16.A(n6sVar4);
                    if (i8 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z2112 = zA1112 | z14;
                    i11 = i10;
                    if (i11 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zA3 = z2112 | z15 | r16.A(r7) | r16.A(iif0Var2);
                    objY7 = r16.y();
                    if (zA3) {
                        final iif0 iif0Var11 = iif0Var2;
                        mlyVar = r7;
                        final b5i b5iVar9 = b5iVar;
                        Function1 function18 = new Function1() { // from class: s3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ooa0 ooa0Var2;
                                gly glyVar = (gly) obj5;
                                n6s n6sVar7 = n6sVar4;
                                if (!n6sVar7.b()) {
                                    b5i.b(b5iVar9);
                                } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                    ooa0Var2.a();
                                }
                                if (n6sVar7.b() && z2) {
                                    if (n6sVar7.a() != ocl.b) {
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            long j6 = glyVar.a;
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar5 = n6sVar7.v;
                                            int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                            l6sVar5.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                            if (n6sVar7.a.a.b.length() > 0) {
                                                ((x5a0) n6sVar7.k).setValue(ocl.c);
                                            }
                                        }
                                    } else {
                                        iif0Var11.d(glyVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        iif0Var2 = iif0Var11;
                        r16.r(function18);
                        objY7 = function18;
                    } else {
                        final iif0 iif0Var12 = iif0Var2;
                        mlyVar = r7;
                        final b5i b5iVar10 = b5iVar;
                        Function1 function19 = new Function1() { // from class: s3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ooa0 ooa0Var2;
                                gly glyVar = (gly) obj5;
                                n6s n6sVar7 = n6sVar4;
                                if (!n6sVar7.b()) {
                                    b5i.b(b5iVar10);
                                } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                    ooa0Var2.a();
                                }
                                if (n6sVar7.b() && z2) {
                                    if (n6sVar7.a() != ocl.b) {
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            long j6 = glyVar.a;
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar5 = n6sVar7.v;
                                            int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                            l6sVar5.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                            if (n6sVar7.a.a.b.length() > 0) {
                                                ((x5a0) n6sVar7.k).setValue(ocl.c);
                                            }
                                        }
                                    } else {
                                        iif0Var12.d(glyVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        iif0Var2 = iif0Var12;
                        r16.r(function19);
                        objY7 = function19;
                    }
                    function3 = (Function1) objY7;
                    if (z2) {
                        dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                    }
                    iif0.b bVar6 = iif0Var2.B;
                    iif0.c cVar5 = iif0Var2.A;
                    d dVarN5 = dVarA.n(new SuspendPointerInputElement(bVar6, cVar5, null, new l880(bVar6, cVar5), 4));
                    g020.a.getClass();
                    d dVarC5 = h020.c(dVarN5, j020.b);
                    boolean zA1113 = r16.A(n6sVar4);
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zA4 = zA1113 | z16 | r16.A(mlyVar);
                    objY8 = r16.y();
                    if (zA4) {
                        objY8 = new Function1() { // from class: t3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar4;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    lc6 lc6VarA = tcfVar.F1().a();
                                    long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                    long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    tkf0 tkf0Var = ukf0Var.a;
                                    b90 b90Var = n6sVar7.y;
                                    long j8 = n6sVar7.z;
                                    boolean zC = ulf0.c(j6);
                                    mly mlyVar5 = mlyVar;
                                    if (!zC) {
                                        b90Var.m(j8);
                                        int iB3 = mlyVar5.b(ulf0.f(j6));
                                        int iB4 = mlyVar5.b(ulf0.e(j6));
                                        if (iB3 != iB4) {
                                            lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                        }
                                    } else if (ulf0.c(j7)) {
                                        ijf0 ijf0Var11 = ijf0Var3;
                                        if (!ulf0.c(ijf0Var11.b)) {
                                            b90Var.m(j8);
                                            long j9 = ijf0Var11.b;
                                            int iB5 = mlyVar5.b(ulf0.f(j9));
                                            int iB6 = mlyVar5.b(ulf0.e(j9));
                                            if (iB5 != iB6) {
                                                lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                            }
                                        }
                                    } else {
                                        long jC = tkf0Var.b.c();
                                        j58 j58Var = new j58(jC);
                                        if (jC == 16) {
                                            j58Var = null;
                                        }
                                        long j10 = j58Var != null ? j58Var.a : j58.b;
                                        b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                        int iB7 = mlyVar5.b(ulf0.f(j7));
                                        int iB8 = mlyVar5.b(ulf0.e(j7));
                                        if (iB7 != iB8) {
                                            lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                        }
                                    }
                                    boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                    if (z30) {
                                        long j11 = ukf0Var.c;
                                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        lc6VarA.p();
                                        lc6VarA.i(lk40VarB);
                                    }
                                    ora0 ora0Var = tkf0Var.b.a;
                                    yef0 yef0Var = ora0Var.m;
                                    kjf0 kjf0Var = ora0Var.a;
                                    if (yef0Var == null) {
                                        yef0Var = yef0.b;
                                    }
                                    yef0 yef0Var2 = yef0Var;
                                    ix80 ix80Var = ora0Var.n;
                                    if (ix80Var == null) {
                                        ix80Var = ix80.d;
                                    }
                                    ix80 ix80Var2 = ix80Var;
                                    wcf wcfVar = ora0Var.p;
                                    if (wcfVar == null) {
                                        wcfVar = rlh.a;
                                    }
                                    wcf wcfVar2 = wcfVar;
                                    try {
                                        ya5 ya5VarE = kjf0Var.e();
                                        kjf0.a aVar12 = kjf0.a.a;
                                        if (ya5VarE != null) {
                                            gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar12 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                        } else {
                                            zjwVar.i(lc6VarA, kjf0Var != aVar12 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                        }
                                    } finally {
                                        if (z30) {
                                            lc6VarA.f();
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY8);
                    } else {
                        objY8 = new Function1() { // from class: t3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar4;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    lc6 lc6VarA = tcfVar.F1().a();
                                    long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                    long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    tkf0 tkf0Var = ukf0Var.a;
                                    b90 b90Var = n6sVar7.y;
                                    long j8 = n6sVar7.z;
                                    boolean zC = ulf0.c(j6);
                                    mly mlyVar5 = mlyVar;
                                    if (!zC) {
                                        b90Var.m(j8);
                                        int iB3 = mlyVar5.b(ulf0.f(j6));
                                        int iB4 = mlyVar5.b(ulf0.e(j6));
                                        if (iB3 != iB4) {
                                            lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                        }
                                    } else if (ulf0.c(j7)) {
                                        ijf0 ijf0Var11 = ijf0Var3;
                                        if (!ulf0.c(ijf0Var11.b)) {
                                            b90Var.m(j8);
                                            long j9 = ijf0Var11.b;
                                            int iB5 = mlyVar5.b(ulf0.f(j9));
                                            int iB6 = mlyVar5.b(ulf0.e(j9));
                                            if (iB5 != iB6) {
                                                lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                            }
                                        }
                                    } else {
                                        long jC = tkf0Var.b.c();
                                        j58 j58Var = new j58(jC);
                                        if (jC == 16) {
                                            j58Var = null;
                                        }
                                        long j10 = j58Var != null ? j58Var.a : j58.b;
                                        b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                        int iB7 = mlyVar5.b(ulf0.f(j7));
                                        int iB8 = mlyVar5.b(ulf0.e(j7));
                                        if (iB7 != iB8) {
                                            lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                        }
                                    }
                                    boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                    if (z30) {
                                        long j11 = ukf0Var.c;
                                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        lc6VarA.p();
                                        lc6VarA.i(lk40VarB);
                                    }
                                    ora0 ora0Var = tkf0Var.b.a;
                                    yef0 yef0Var = ora0Var.m;
                                    kjf0 kjf0Var = ora0Var.a;
                                    if (yef0Var == null) {
                                        yef0Var = yef0.b;
                                    }
                                    yef0 yef0Var2 = yef0Var;
                                    ix80 ix80Var = ora0Var.n;
                                    if (ix80Var == null) {
                                        ix80Var = ix80.d;
                                    }
                                    ix80 ix80Var2 = ix80Var;
                                    wcf wcfVar = ora0Var.p;
                                    if (wcfVar == null) {
                                        wcfVar = rlh.a;
                                    }
                                    wcf wcfVar2 = wcfVar;
                                    try {
                                        ya5 ya5VarE = kjf0Var.e();
                                        kjf0.a aVar12 = kjf0.a.a;
                                        if (ya5VarE != null) {
                                            gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar12 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                        } else {
                                            zjwVar.i(lc6VarA, kjf0Var != aVar12 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                        }
                                    } finally {
                                        if (z30) {
                                            lc6VarA.f();
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY8);
                    }
                    d dVarA118 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                    boolean zA1114 = r16.A(n6sVar4);
                    if (i11 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zM11 = zA1114 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                    if (i14 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zA5 = zM11 | z18 | r16.A(mlyVar);
                    objY9 = r16.y();
                    if (zA5) {
                        final ijf0 ijf0Var11 = ijf0Var3;
                        Function1 function110 = new Function1() { // from class: u3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                dkf0 dkf0Var2;
                                urr urrVar;
                                urr urrVar2;
                                n6s n6sVar7 = n6sVar4;
                                ytw ytwVar2 = n6sVar7.o;
                                urr urrVar3 = (urr) obj5;
                                n6sVar7.h = urrVar3;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    vkf0VarD.b = urrVar3;
                                }
                                if (z2) {
                                    ocl oclVarA = n6sVar7.a();
                                    ocl oclVar = ocl.b;
                                    iif0 iif0Var13 = iif0Var2;
                                    ijf0 ijf0Var12 = ijf0Var11;
                                    if (oclVarA == oclVar) {
                                        if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                            iif0Var13.r();
                                        } else {
                                            iif0Var13.k();
                                        }
                                        ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var13, true)));
                                        ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var13, false)));
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var12.b)));
                                    } else if (n6sVar7.a() == ocl.c) {
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var13, true)));
                                    }
                                    mly mlyVar5 = mlyVar;
                                    j4b.f(n6sVar7, ijf0Var12, mlyVar5);
                                    vkf0 vkf0VarD2 = n6sVar7.d();
                                    if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                        ukf0 ukf0Var = vkf0VarD2.a;
                                        wff0 wff0Var = new wff0(urrVar);
                                        lk40 lk40VarA = z880.a(urrVar);
                                        lk40 lk40VarP = urrVar.P(urrVar2, false);
                                        if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                            dkf0Var2.b.h(ijf0Var12, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        a8j0Var = a8j0Var2;
                        r16.r(function110);
                        objY9 = function110;
                    } else {
                        final ijf0 ijf0Var12 = ijf0Var3;
                        Function1 function111 = new Function1() { // from class: u3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                dkf0 dkf0Var2;
                                urr urrVar;
                                urr urrVar2;
                                n6s n6sVar7 = n6sVar4;
                                ytw ytwVar2 = n6sVar7.o;
                                urr urrVar3 = (urr) obj5;
                                n6sVar7.h = urrVar3;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    vkf0VarD.b = urrVar3;
                                }
                                if (z2) {
                                    ocl oclVarA = n6sVar7.a();
                                    ocl oclVar = ocl.b;
                                    iif0 iif0Var13 = iif0Var2;
                                    ijf0 ijf0Var13 = ijf0Var12;
                                    if (oclVarA == oclVar) {
                                        if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                            iif0Var13.r();
                                        } else {
                                            iif0Var13.k();
                                        }
                                        ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var13, true)));
                                        ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var13, false)));
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var13.b)));
                                    } else if (n6sVar7.a() == ocl.c) {
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var13, true)));
                                    }
                                    mly mlyVar5 = mlyVar;
                                    j4b.f(n6sVar7, ijf0Var13, mlyVar5);
                                    vkf0 vkf0VarD2 = n6sVar7.d();
                                    if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                        ukf0 ukf0Var = vkf0VarD2.a;
                                        wff0 wff0Var = new wff0(urrVar);
                                        lk40 lk40VarA = z880.a(urrVar);
                                        lk40 lk40VarP = urrVar.P(urrVar2, false);
                                        if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                            dkf0Var2.b.h(ijf0Var13, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        a8j0Var = a8j0Var2;
                        r16.r(function111);
                        objY9 = function111;
                    }
                    d dVarA119 = v.a(aVar4, (Function1) objY9);
                    mlyVar2 = mlyVar;
                    n6sVar5 = n6sVar4;
                    v5b v5bVar7 = v5bVar2;
                    ujf0Var2 = ujf0Var;
                    iif0Var3 = iif0Var2;
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier5 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                    if (!z2) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                    } else {
                        dVarA2 = aVar4;
                    }
                    zA6 = r16.A(iif0Var3);
                    objY10 = r16.y();
                    if (zA6) {
                        objY10 = new v3b(iif0Var3, 0);
                        r16.r(objY10);
                    } else {
                        objY10 = new v3b(iif0Var3, 0);
                        r16.r(objY10);
                    }
                    xvf.c(iif0Var3, (Function1) objY10, r16);
                    boolean zA1115 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                    if (i14 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zA1115 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                    objY11 = r16.y();
                    if (z21) {
                        objY11 = new Function1() { // from class: w3b
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                n6s n6sVar7 = n6sVar5;
                                if (n6sVar7.b()) {
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar5 = n6sVar7.v;
                                    uhi uhiVar = n6sVar7.w;
                                    dq40 dq40Var = new dq40();
                                    vff0 vff0Var = new vff0(osfVar2, l6sVar5, dq40Var);
                                    ujf0 ujf0Var13 = ujf0Var2;
                                    rk10 rk10Var = ujf0Var13.a;
                                    rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                    ?? dkf0Var2 = new dkf0(ujf0Var13, rk10Var);
                                    ujf0Var13.b.set((dkf0) dkf0Var2);
                                    dq40Var.a = dkf0Var2;
                                    n6sVar7.e = dkf0Var2;
                                }
                                return new i4b();
                            }
                        };
                        r16.r(objY11);
                    } else {
                        objY11 = new Function1() { // from class: w3b
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                n6s n6sVar7 = n6sVar5;
                                if (n6sVar7.b()) {
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar5 = n6sVar7.v;
                                    uhi uhiVar = n6sVar7.w;
                                    dq40 dq40Var = new dq40();
                                    vff0 vff0Var = new vff0(osfVar2, l6sVar5, dq40Var);
                                    ujf0 ujf0Var13 = ujf0Var2;
                                    rk10 rk10Var = ujf0Var13.a;
                                    rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                    ?? dkf0Var2 = new dkf0(ujf0Var13, rk10Var);
                                    ujf0Var13.b.set((dkf0) dkf0Var2);
                                    dq40Var.a = dkf0Var2;
                                    n6sVar7.e = dkf0Var2;
                                }
                                return new i4b();
                            }
                        };
                        r16.r(objY11);
                    }
                    xvf.c(bcnVar, (Function1) objY11, r16);
                    l6s l6sVar5 = n6sVar5.v;
                    if (i == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    chf0 chf0Var5 = new chf0(n6sVar5, iif0Var3, ijf0Var, z219, z22, mlyVar2, odh0Var, l6sVar5, bcnVar.e);
                    gnn.a aVar12 = gnn.a;
                    d dVarA1110 = c.a(aVar4, aVar12, chf0Var5);
                    i12 = bcnVar.d;
                    if (i12 == 7) {
                        z23 = false;
                    } else {
                        z23 = true;
                    }
                    boolean zBooleanValue5 = ((Boolean) ytwVar.getValue()).booleanValue();
                    zB = r16.b(z23) | r16.A(x5sVar);
                    objY12 = r16.y();
                    if (zB) {
                        objY12 = new Function0() { // from class: j3b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z23) {
                                    x5sVar.i();
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY12);
                    } else {
                        objY12 = new Function0() { // from class: j3b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z23) {
                                    x5sVar.i();
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY12);
                    }
                    d dVarA1111 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue5, z23, (Function0) objY12);
                    j2 = ((j58) r16.O(vl1.a)).a;
                    zA7 = r16.A(n6sVar5) | r16.e(j2);
                    objY13 = r16.y();
                    if (zA7) {
                        objY13 = new Function1() { // from class: i3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar5;
                                if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                    tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY13);
                    } else {
                        objY13 = new Function1() { // from class: i3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar5;
                                if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                    tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY13);
                    }
                    yhf0 yhf0Var6 = yhf0Var;
                    z24 = false;
                    d dVarA1112 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA1111).n(dVarA117), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA1110), aVar12, new uhf0(yhf0Var6, z2, pswVar)).n(dVarC5).n(coreTextFieldSemanticsModifier5), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar7));
                    if (z2) {
                        z24 = true;
                    }
                    if (z24) {
                        dVarA3 = aVar4;
                    } else {
                        dVarA3 = aVar4;
                    }
                    ?? r118 = r16;
                    b(dVarA1112, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var6, ijf0Var, uni0Var, dVarA2, dVarA118, dVarA119, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r118), r118, 384);
                    r15 = r118;
                }
                mmdVar2 = mmdVar;
                bff0Var2 = new bff0(nk0Var2, imf0Var2, z, mmdVar2, aVar3, m2gVar);
                if (n6sVar6.a != bff0Var2) {
                    n6sVar6.p = true;
                }
                n6sVar6.a = bff0Var2;
                osfVar = n6sVar6.d;
                dkf0Var = n6sVar6.e;
                osfVar.getClass();
                ulf0Var = ijf0Var.c;
                boolean zG2 = Intrinsics.g(ulf0Var, osfVar.b.c());
                str = osfVar.a.a.b;
                nk0Var = ijf0Var.a;
                if (Intrinsics.g(str, nk0Var.b)) {
                    osfVar.b = new rvf(nk0Var, j5);
                    z5 = true;
                } else {
                    if (ulf0.b(osfVar.a.b, j5)) {
                        osfVar.b.h(ulf0.f(j5), ulf0.e(j5));
                        z5 = false;
                        z6 = true;
                    } else {
                        z5 = false;
                    }
                    if (ulf0Var == null) {
                        rvf rvfVar10 = osfVar.b;
                        rvfVar10.d = -1;
                        rvfVar10.e = -1;
                    } else {
                        j = ulf0Var.a;
                        if (!ulf0.c(j)) {
                            osfVar.b.g(ulf0.f(j), ulf0.e(j));
                        }
                        if (z5) {
                            rvf rvfVar11 = osfVar.b;
                            rvfVar11.d = -1;
                            rvfVar11.e = -1;
                            ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                        } else {
                            rvf rvfVar12 = osfVar.b;
                            rvfVar12.d = -1;
                            rvfVar12.e = -1;
                            ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                        }
                        ijf0Var2 = osfVar.a;
                        osfVar.a = ijf0VarA;
                        if (dkf0Var != null) {
                            dkf0Var.a(ijf0Var2, ijf0VarA);
                        }
                        objY = I.y();
                        obj2 = obj;
                        if (objY == obj2) {
                            objY = new odh0(0);
                            I.r(objY);
                        }
                        odh0Var = (odh0) objY;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (odh0Var.f) {
                            odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                            odh0Var.a(ijf0Var);
                        } else {
                            l = odh0Var.e;
                            if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                                odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                                odh0Var.a(ijf0Var);
                            }
                        }
                        objY2 = I.y();
                        if (objY2 == obj2) {
                            objY2 = xvf.i(kotlin.coroutines.e.a, I);
                            I.r(objY2);
                        }
                        v5bVar = (v5b) objY2;
                        objY3 = I.y();
                        if (objY3 == obj2) {
                            objY3 = new la5();
                            I.r(objY3);
                        }
                        ia5Var = (ia5) objY3;
                        objY4 = I.y();
                        if (objY4 == obj2) {
                            objY4 = new iif0(odh0Var);
                            I.r(objY4);
                        }
                        iif0Var = (iif0) objY4;
                        iif0Var.b = mlyVar4;
                        iif0Var.f = uni0Var;
                        iif0Var.c = n6sVar6.v;
                        iif0Var.d = n6sVar6;
                        ((x5a0) iif0Var.e).setValue(ijf0Var);
                        iif0Var.x = new ulf0(j5);
                        iif0Var.h = (ms7) I.O(kna.f);
                        iif0Var.i = v5bVar;
                        iif0Var.k = (jmf0) I.O(kna.q);
                        iif0Var.l = (zdl) I.O(kna.l);
                        iif0Var.m = b5iVar;
                        boolean z2113 = !z3;
                        ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z2113));
                        ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                        I.N(1966776937);
                        q780Var = q780.a;
                        cetVar = imf0Var.a.k;
                        qyd0 qyd0Var5 = jk10.a;
                        I.N(430530635);
                        if (Build.VERSION.SDK_INT < 28) {
                            I.H();
                            vj10Var = null;
                        } else {
                            context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                            coroutineContext = (CoroutineContext) I.O(jk10.a);
                            zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                            objY5 = I.y();
                            if (zM) {
                                jk10.b.getClass();
                                objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                                I.r(objY5);
                            } else {
                                jk10.b.getClass();
                                objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                                I.r(objY5);
                            }
                            vj10Var = (vj10) objY5;
                            I.H();
                        }
                        iif0Var.j = vj10Var;
                        I.X(false);
                        boolean zA1116 = I.A(n6sVar6);
                        i7 = i13 & 7168;
                        if (i7 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z2114 = zA1116 | z7;
                        i8 = i13 & 57344;
                        if (i8 == 16384) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean z2115 = z8 | z2114;
                        ujf0Var = ujf0Var3;
                        boolean zA1117 = z2115 | I.A(ujf0Var);
                        if (i14 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        i9 = (i13 & 112) ^ 48;
                        zA = zA1117 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                        Object objY29 = I.y();
                        if (zA) {
                            i10 = i7;
                            n6sVar2 = n6sVar6;
                            ?? r119 = I;
                            bcnVar2 = bcnVar;
                            obj3 = new Function1() { // from class: q3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    vkf0 vkf0VarD;
                                    j5i j5iVar = (j5i) obj5;
                                    n6s n6sVar7 = n6sVar2;
                                    if (n6sVar7.b() == j5iVar.a()) {
                                        return Unit.a;
                                    }
                                    ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                    boolean zB2 = n6sVar7.b();
                                    ijf0 ijf0Var13 = ijf0Var;
                                    mly mlyVar5 = mlyVar4;
                                    if (zB2 && z2 && !z3) {
                                        j4b.g(ujf0Var, n6sVar7, ijf0Var13, bcnVar2, mlyVar5);
                                    } else {
                                        j4b.e(n6sVar7);
                                    }
                                    if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                        ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var13, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                    }
                                    if (!j5iVar.a()) {
                                        iif0Var.d(null);
                                    }
                                    return Unit.a;
                                }
                            };
                            z10 = z2;
                            ujf0Var = ujf0Var;
                            iif0Var2 = iif0Var;
                            ia5Var2 = ia5Var;
                            v5bVar2 = v5bVar;
                            ijf0Var3 = ijf0Var;
                            r119.r(obj3);
                            r16 = r119;
                        } else {
                            i10 = i7;
                            n6sVar2 = n6sVar6;
                            ?? r1110 = I;
                            bcnVar2 = bcnVar;
                            obj3 = new Function1() { // from class: q3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    vkf0 vkf0VarD;
                                    j5i j5iVar = (j5i) obj5;
                                    n6s n6sVar7 = n6sVar2;
                                    if (n6sVar7.b() == j5iVar.a()) {
                                        return Unit.a;
                                    }
                                    ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                    boolean zB2 = n6sVar7.b();
                                    ijf0 ijf0Var13 = ijf0Var;
                                    mly mlyVar5 = mlyVar4;
                                    if (zB2 && z2 && !z3) {
                                        j4b.g(ujf0Var, n6sVar7, ijf0Var13, bcnVar2, mlyVar5);
                                    } else {
                                        j4b.e(n6sVar7);
                                    }
                                    if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                        ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var13, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                    }
                                    if (!j5iVar.a()) {
                                        iif0Var.d(null);
                                    }
                                    return Unit.a;
                                }
                            };
                            z10 = z2;
                            ujf0Var = ujf0Var;
                            iif0Var2 = iif0Var;
                            ia5Var2 = ia5Var;
                            v5bVar2 = v5bVar;
                            ijf0Var3 = ijf0Var;
                            r1110.r(obj3);
                            r16 = r1110;
                        }
                        aVar4 = d.a.b;
                        d dVarA1113 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                        if (z10) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        ytwVarC = m.c(Boolean.valueOf(z11), r16);
                        Unit unit5 = Unit.a;
                        boolean zM12 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                        if (i9 > 32) {
                            n6sVar3 = n6sVar2;
                            if ((r5 & 48) != 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            n6sVar3 = n6sVar2;
                            if ((r5 & 48) != 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        z13 = zM12 | z12;
                        Object objY210 = r16.y();
                        if (z13) {
                            n6sVar4 = n6sVar3;
                            ujf0 ujf0Var13 = ujf0Var;
                            y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var13, iif0Var2, bcnVar, null);
                            ytwVar = ytwVarC;
                            ujf0Var = ujf0Var13;
                            r16.r(y3bVar);
                        } else {
                            n6sVar4 = n6sVar3;
                            ujf0 ujf0Var14 = ujf0Var;
                            y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var14, iif0Var2, bcnVar, null);
                            ytwVar = ytwVarC;
                            ujf0Var = ujf0Var14;
                            r16.r(y3bVar);
                        }
                        xvf.e(r16, unit5, (Function2) y3bVar);
                        zA2 = r16.A(n6sVar4);
                        objY6 = r16.y();
                        if (zA2) {
                            objY6 = new r3b(n6sVar4, 0);
                            r16.r(objY6);
                        } else {
                            objY6 = new r3b(n6sVar4, 0);
                            r16.r(objY6);
                        }
                        dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                        boolean zA1118 = r16.A(n6sVar4);
                        if (i8 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z2116 = zA1118 | z14;
                        i11 = i10;
                        if (i11 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zA3 = z2116 | z15 | r16.A(r7) | r16.A(iif0Var2);
                        objY7 = r16.y();
                        if (zA3) {
                            final iif0 iif0Var13 = iif0Var2;
                            mlyVar = r7;
                            final b5i b5iVar11 = b5iVar;
                            Function1 function112 = new Function1() { // from class: s3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    ooa0 ooa0Var2;
                                    gly glyVar = (gly) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    if (!n6sVar7.b()) {
                                        b5i.b(b5iVar11);
                                    } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                        ooa0Var2.a();
                                    }
                                    if (n6sVar7.b() && z2) {
                                        if (n6sVar7.a() != ocl.b) {
                                            vkf0 vkf0VarD = n6sVar7.d();
                                            if (vkf0VarD != null) {
                                                long j6 = glyVar.a;
                                                osf osfVar2 = n6sVar7.d;
                                                l6s l6sVar6 = n6sVar7.v;
                                                int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                l6sVar6.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                if (n6sVar7.a.a.b.length() > 0) {
                                                    ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                }
                                            }
                                        } else {
                                            iif0Var13.d(glyVar);
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            iif0Var2 = iif0Var13;
                            r16.r(function112);
                            objY7 = function112;
                        } else {
                            final iif0 iif0Var14 = iif0Var2;
                            mlyVar = r7;
                            final b5i b5iVar12 = b5iVar;
                            Function1 function113 = new Function1() { // from class: s3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    ooa0 ooa0Var2;
                                    gly glyVar = (gly) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    if (!n6sVar7.b()) {
                                        b5i.b(b5iVar12);
                                    } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                        ooa0Var2.a();
                                    }
                                    if (n6sVar7.b() && z2) {
                                        if (n6sVar7.a() != ocl.b) {
                                            vkf0 vkf0VarD = n6sVar7.d();
                                            if (vkf0VarD != null) {
                                                long j6 = glyVar.a;
                                                osf osfVar2 = n6sVar7.d;
                                                l6s l6sVar6 = n6sVar7.v;
                                                int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                                l6sVar6.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                                if (n6sVar7.a.a.b.length() > 0) {
                                                    ((x5a0) n6sVar7.k).setValue(ocl.c);
                                                }
                                            }
                                        } else {
                                            iif0Var14.d(glyVar);
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            iif0Var2 = iif0Var14;
                            r16.r(function113);
                            objY7 = function113;
                        }
                        function3 = (Function1) objY7;
                        if (z2) {
                            dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                        }
                        iif0.b bVar7 = iif0Var2.B;
                        iif0.c cVar6 = iif0Var2.A;
                        d dVarN6 = dVarA.n(new SuspendPointerInputElement(bVar7, cVar6, null, new l880(bVar7, cVar6), 4));
                        g020.a.getClass();
                        d dVarC6 = h020.c(dVarN6, j020.b);
                        boolean zA1119 = r16.A(n6sVar4);
                        if (i14 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zA4 = zA1119 | z16 | r16.A(mlyVar);
                        objY8 = r16.y();
                        if (zA4) {
                            objY8 = new Function1() { // from class: t3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        lc6 lc6VarA = tcfVar.F1().a();
                                        long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                        long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                        ukf0 ukf0Var = vkf0VarD.a;
                                        zjw zjwVar = ukf0Var.b;
                                        tkf0 tkf0Var = ukf0Var.a;
                                        b90 b90Var = n6sVar7.y;
                                        long j8 = n6sVar7.z;
                                        boolean zC = ulf0.c(j6);
                                        mly mlyVar5 = mlyVar;
                                        if (!zC) {
                                            b90Var.m(j8);
                                            int iB3 = mlyVar5.b(ulf0.f(j6));
                                            int iB4 = mlyVar5.b(ulf0.e(j6));
                                            if (iB3 != iB4) {
                                                lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                            }
                                        } else if (ulf0.c(j7)) {
                                            ijf0 ijf0Var13 = ijf0Var3;
                                            if (!ulf0.c(ijf0Var13.b)) {
                                                b90Var.m(j8);
                                                long j9 = ijf0Var13.b;
                                                int iB5 = mlyVar5.b(ulf0.f(j9));
                                                int iB6 = mlyVar5.b(ulf0.e(j9));
                                                if (iB5 != iB6) {
                                                    lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                }
                                            }
                                        } else {
                                            long jC = tkf0Var.b.c();
                                            j58 j58Var = new j58(jC);
                                            if (jC == 16) {
                                                j58Var = null;
                                            }
                                            long j10 = j58Var != null ? j58Var.a : j58.b;
                                            b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                            int iB7 = mlyVar5.b(ulf0.f(j7));
                                            int iB8 = mlyVar5.b(ulf0.e(j7));
                                            if (iB7 != iB8) {
                                                lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                            }
                                        }
                                        boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                        if (z30) {
                                            long j11 = ukf0Var.c;
                                            lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                            lc6VarA.p();
                                            lc6VarA.i(lk40VarB);
                                        }
                                        ora0 ora0Var = tkf0Var.b.a;
                                        yef0 yef0Var = ora0Var.m;
                                        kjf0 kjf0Var = ora0Var.a;
                                        if (yef0Var == null) {
                                            yef0Var = yef0.b;
                                        }
                                        yef0 yef0Var2 = yef0Var;
                                        ix80 ix80Var = ora0Var.n;
                                        if (ix80Var == null) {
                                            ix80Var = ix80.d;
                                        }
                                        ix80 ix80Var2 = ix80Var;
                                        wcf wcfVar = ora0Var.p;
                                        if (wcfVar == null) {
                                            wcfVar = rlh.a;
                                        }
                                        wcf wcfVar2 = wcfVar;
                                        try {
                                            ya5 ya5VarE = kjf0Var.e();
                                            kjf0.a aVar13 = kjf0.a.a;
                                            if (ya5VarE != null) {
                                                gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar13 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                            } else {
                                                zjwVar.i(lc6VarA, kjf0Var != aVar13 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                            }
                                        } finally {
                                            if (z30) {
                                                lc6VarA.f();
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY8);
                        } else {
                            objY8 = new Function1() { // from class: t3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar4;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        lc6 lc6VarA = tcfVar.F1().a();
                                        long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                        long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                        ukf0 ukf0Var = vkf0VarD.a;
                                        zjw zjwVar = ukf0Var.b;
                                        tkf0 tkf0Var = ukf0Var.a;
                                        b90 b90Var = n6sVar7.y;
                                        long j8 = n6sVar7.z;
                                        boolean zC = ulf0.c(j6);
                                        mly mlyVar5 = mlyVar;
                                        if (!zC) {
                                            b90Var.m(j8);
                                            int iB3 = mlyVar5.b(ulf0.f(j6));
                                            int iB4 = mlyVar5.b(ulf0.e(j6));
                                            if (iB3 != iB4) {
                                                lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                            }
                                        } else if (ulf0.c(j7)) {
                                            ijf0 ijf0Var13 = ijf0Var3;
                                            if (!ulf0.c(ijf0Var13.b)) {
                                                b90Var.m(j8);
                                                long j9 = ijf0Var13.b;
                                                int iB5 = mlyVar5.b(ulf0.f(j9));
                                                int iB6 = mlyVar5.b(ulf0.e(j9));
                                                if (iB5 != iB6) {
                                                    lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                                }
                                            }
                                        } else {
                                            long jC = tkf0Var.b.c();
                                            j58 j58Var = new j58(jC);
                                            if (jC == 16) {
                                                j58Var = null;
                                            }
                                            long j10 = j58Var != null ? j58Var.a : j58.b;
                                            b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                            int iB7 = mlyVar5.b(ulf0.f(j7));
                                            int iB8 = mlyVar5.b(ulf0.e(j7));
                                            if (iB7 != iB8) {
                                                lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                            }
                                        }
                                        boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                        if (z30) {
                                            long j11 = ukf0Var.c;
                                            lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                            lc6VarA.p();
                                            lc6VarA.i(lk40VarB);
                                        }
                                        ora0 ora0Var = tkf0Var.b.a;
                                        yef0 yef0Var = ora0Var.m;
                                        kjf0 kjf0Var = ora0Var.a;
                                        if (yef0Var == null) {
                                            yef0Var = yef0.b;
                                        }
                                        yef0 yef0Var2 = yef0Var;
                                        ix80 ix80Var = ora0Var.n;
                                        if (ix80Var == null) {
                                            ix80Var = ix80.d;
                                        }
                                        ix80 ix80Var2 = ix80Var;
                                        wcf wcfVar = ora0Var.p;
                                        if (wcfVar == null) {
                                            wcfVar = rlh.a;
                                        }
                                        wcf wcfVar2 = wcfVar;
                                        try {
                                            ya5 ya5VarE = kjf0Var.e();
                                            kjf0.a aVar13 = kjf0.a.a;
                                            if (ya5VarE != null) {
                                                gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar13 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                            } else {
                                                zjwVar.i(lc6VarA, kjf0Var != aVar13 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                            }
                                        } finally {
                                            if (z30) {
                                                lc6VarA.f();
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY8);
                        }
                        d dVarA1114 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                        boolean zA11110 = r16.A(n6sVar4);
                        if (i11 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zM13 = zA11110 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                        if (i14 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zA5 = zM13 | z18 | r16.A(mlyVar);
                        objY9 = r16.y();
                        if (zA5) {
                            final ijf0 ijf0Var13 = ijf0Var3;
                            Function1 function114 = new Function1() { // from class: u3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    dkf0 dkf0Var2;
                                    urr urrVar;
                                    urr urrVar2;
                                    n6s n6sVar7 = n6sVar4;
                                    ytw ytwVar2 = n6sVar7.o;
                                    urr urrVar3 = (urr) obj5;
                                    n6sVar7.h = urrVar3;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        vkf0VarD.b = urrVar3;
                                    }
                                    if (z2) {
                                        ocl oclVarA = n6sVar7.a();
                                        ocl oclVar = ocl.b;
                                        iif0 iif0Var15 = iif0Var2;
                                        ijf0 ijf0Var14 = ijf0Var13;
                                        if (oclVarA == oclVar) {
                                            if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                iif0Var15.r();
                                            } else {
                                                iif0Var15.k();
                                            }
                                            ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var15, true)));
                                            ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var15, false)));
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var14.b)));
                                        } else if (n6sVar7.a() == ocl.c) {
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var15, true)));
                                        }
                                        mly mlyVar5 = mlyVar;
                                        j4b.f(n6sVar7, ijf0Var14, mlyVar5);
                                        vkf0 vkf0VarD2 = n6sVar7.d();
                                        if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                            ukf0 ukf0Var = vkf0VarD2.a;
                                            wff0 wff0Var = new wff0(urrVar);
                                            lk40 lk40VarA = z880.a(urrVar);
                                            lk40 lk40VarP = urrVar.P(urrVar2, false);
                                            if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                dkf0Var2.b.h(ijf0Var14, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            a8j0Var = a8j0Var2;
                            r16.r(function114);
                            objY9 = function114;
                        } else {
                            final ijf0 ijf0Var14 = ijf0Var3;
                            Function1 function115 = new Function1() { // from class: u3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    dkf0 dkf0Var2;
                                    urr urrVar;
                                    urr urrVar2;
                                    n6s n6sVar7 = n6sVar4;
                                    ytw ytwVar2 = n6sVar7.o;
                                    urr urrVar3 = (urr) obj5;
                                    n6sVar7.h = urrVar3;
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        vkf0VarD.b = urrVar3;
                                    }
                                    if (z2) {
                                        ocl oclVarA = n6sVar7.a();
                                        ocl oclVar = ocl.b;
                                        iif0 iif0Var15 = iif0Var2;
                                        ijf0 ijf0Var15 = ijf0Var14;
                                        if (oclVarA == oclVar) {
                                            if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                                iif0Var15.r();
                                            } else {
                                                iif0Var15.k();
                                            }
                                            ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var15, true)));
                                            ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var15, false)));
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var15.b)));
                                        } else if (n6sVar7.a() == ocl.c) {
                                            ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var15, true)));
                                        }
                                        mly mlyVar5 = mlyVar;
                                        j4b.f(n6sVar7, ijf0Var15, mlyVar5);
                                        vkf0 vkf0VarD2 = n6sVar7.d();
                                        if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                            ukf0 ukf0Var = vkf0VarD2.a;
                                            wff0 wff0Var = new wff0(urrVar);
                                            lk40 lk40VarA = z880.a(urrVar);
                                            lk40 lk40VarP = urrVar.P(urrVar2, false);
                                            if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                                dkf0Var2.b.h(ijf0Var15, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            a8j0Var = a8j0Var2;
                            r16.r(function115);
                            objY9 = function115;
                        }
                        d dVarA1115 = v.a(aVar4, (Function1) objY9);
                        mlyVar2 = mlyVar;
                        n6sVar5 = n6sVar4;
                        v5b v5bVar8 = v5bVar2;
                        ujf0Var2 = ujf0Var;
                        iif0Var3 = iif0Var2;
                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier6 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                        if (!z2) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                        } else {
                            dVarA2 = aVar4;
                        }
                        zA6 = r16.A(iif0Var3);
                        objY10 = r16.y();
                        if (zA6) {
                            objY10 = new v3b(iif0Var3, 0);
                            r16.r(objY10);
                        } else {
                            objY10 = new v3b(iif0Var3, 0);
                            r16.r(objY10);
                        }
                        xvf.c(iif0Var3, (Function1) objY10, r16);
                        boolean zA11111 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                        if (i14 == 4) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        z21 = zA11111 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                        objY11 = r16.y();
                        if (z21) {
                            objY11 = new Function1() { // from class: w3b
                                /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    n6s n6sVar7 = n6sVar5;
                                    if (n6sVar7.b()) {
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar6 = n6sVar7.v;
                                        uhi uhiVar = n6sVar7.w;
                                        dq40 dq40Var = new dq40();
                                        vff0 vff0Var = new vff0(osfVar2, l6sVar6, dq40Var);
                                        ujf0 ujf0Var15 = ujf0Var2;
                                        rk10 rk10Var = ujf0Var15.a;
                                        rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                        ?? dkf0Var2 = new dkf0(ujf0Var15, rk10Var);
                                        ujf0Var15.b.set((dkf0) dkf0Var2);
                                        dq40Var.a = dkf0Var2;
                                        n6sVar7.e = dkf0Var2;
                                    }
                                    return new i4b();
                                }
                            };
                            r16.r(objY11);
                        } else {
                            objY11 = new Function1() { // from class: w3b
                                /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    n6s n6sVar7 = n6sVar5;
                                    if (n6sVar7.b()) {
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar6 = n6sVar7.v;
                                        uhi uhiVar = n6sVar7.w;
                                        dq40 dq40Var = new dq40();
                                        vff0 vff0Var = new vff0(osfVar2, l6sVar6, dq40Var);
                                        ujf0 ujf0Var15 = ujf0Var2;
                                        rk10 rk10Var = ujf0Var15.a;
                                        rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                        ?? dkf0Var2 = new dkf0(ujf0Var15, rk10Var);
                                        ujf0Var15.b.set((dkf0) dkf0Var2);
                                        dq40Var.a = dkf0Var2;
                                        n6sVar7.e = dkf0Var2;
                                    }
                                    return new i4b();
                                }
                            };
                            r16.r(objY11);
                        }
                        xvf.c(bcnVar, (Function1) objY11, r16);
                        l6s l6sVar6 = n6sVar5.v;
                        if (i == 1) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        chf0 chf0Var6 = new chf0(n6sVar5, iif0Var3, ijf0Var, z2113, z22, mlyVar2, odh0Var, l6sVar6, bcnVar.e);
                        gnn.a aVar13 = gnn.a;
                        d dVarA1116 = c.a(aVar4, aVar13, chf0Var6);
                        i12 = bcnVar.d;
                        if (i12 == 7) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        boolean zBooleanValue6 = ((Boolean) ytwVar.getValue()).booleanValue();
                        zB = r16.b(z23) | r16.A(x5sVar);
                        objY12 = r16.y();
                        if (zB) {
                            objY12 = new Function0() { // from class: j3b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z23) {
                                        x5sVar.i();
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY12);
                        } else {
                            objY12 = new Function0() { // from class: j3b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z23) {
                                        x5sVar.i();
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY12);
                        }
                        d dVarA1117 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue6, z23, (Function0) objY12);
                        j2 = ((j58) r16.O(vl1.a)).a;
                        zA7 = r16.A(n6sVar5) | r16.e(j2);
                        objY13 = r16.y();
                        if (zA7) {
                            objY13 = new Function1() { // from class: i3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar5;
                                    if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                        tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY13);
                        } else {
                            objY13 = new Function1() { // from class: i3b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    tcf tcfVar = (tcf) obj5;
                                    n6s n6sVar7 = n6sVar5;
                                    if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                        tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                    }
                                    return Unit.a;
                                }
                            };
                            r16.r(objY13);
                        }
                        yhf0 yhf0Var7 = yhf0Var;
                        z24 = false;
                        d dVarA1118 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA1117).n(dVarA1113), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA1116), aVar13, new uhf0(yhf0Var7, z2, pswVar)).n(dVarC6).n(coreTextFieldSemanticsModifier6), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar8));
                        if (z2) {
                            z24 = true;
                        }
                        if (z24) {
                            dVarA3 = aVar4;
                        } else {
                            dVarA3 = aVar4;
                        }
                        ?? r1111 = r16;
                        b(dVarA1118, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var7, ijf0Var, uni0Var, dVarA2, dVarA1114, dVarA1115, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r1111), r1111, 384);
                        r15 = r1111;
                    }
                    if (z5) {
                        rvf rvfVar13 = osfVar.b;
                        rvfVar13.d = -1;
                        rvfVar13.e = -1;
                        ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                    } else {
                        rvf rvfVar14 = osfVar.b;
                        rvfVar14.d = -1;
                        rvfVar14.e = -1;
                        ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                    }
                    ijf0Var2 = osfVar.a;
                    osfVar.a = ijf0VarA;
                    if (dkf0Var != null) {
                        dkf0Var.a(ijf0Var2, ijf0VarA);
                    }
                    objY = I.y();
                    obj2 = obj;
                    if (objY == obj2) {
                        objY = new odh0(0);
                        I.r(objY);
                    }
                    odh0Var = (odh0) objY;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (odh0Var.f) {
                        odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                        odh0Var.a(ijf0Var);
                    } else {
                        l = odh0Var.e;
                        if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                            odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                            odh0Var.a(ijf0Var);
                        }
                    }
                    objY2 = I.y();
                    if (objY2 == obj2) {
                        objY2 = xvf.i(kotlin.coroutines.e.a, I);
                        I.r(objY2);
                    }
                    v5bVar = (v5b) objY2;
                    objY3 = I.y();
                    if (objY3 == obj2) {
                        objY3 = new la5();
                        I.r(objY3);
                    }
                    ia5Var = (ia5) objY3;
                    objY4 = I.y();
                    if (objY4 == obj2) {
                        objY4 = new iif0(odh0Var);
                        I.r(objY4);
                    }
                    iif0Var = (iif0) objY4;
                    iif0Var.b = mlyVar4;
                    iif0Var.f = uni0Var;
                    iif0Var.c = n6sVar6.v;
                    iif0Var.d = n6sVar6;
                    ((x5a0) iif0Var.e).setValue(ijf0Var);
                    iif0Var.x = new ulf0(j5);
                    iif0Var.h = (ms7) I.O(kna.f);
                    iif0Var.i = v5bVar;
                    iif0Var.k = (jmf0) I.O(kna.q);
                    iif0Var.l = (zdl) I.O(kna.l);
                    iif0Var.m = b5iVar;
                    boolean z2117 = !z3;
                    ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z2117));
                    ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                    I.N(1966776937);
                    q780Var = q780.a;
                    cetVar = imf0Var.a.k;
                    qyd0 qyd0Var6 = jk10.a;
                    I.N(430530635);
                    if (Build.VERSION.SDK_INT < 28) {
                        I.H();
                        vj10Var = null;
                    } else {
                        context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                        coroutineContext = (CoroutineContext) I.O(jk10.a);
                        zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                        objY5 = I.y();
                        if (zM) {
                            jk10.b.getClass();
                            objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                            I.r(objY5);
                        } else {
                            jk10.b.getClass();
                            objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                            I.r(objY5);
                        }
                        vj10Var = (vj10) objY5;
                        I.H();
                    }
                    iif0Var.j = vj10Var;
                    I.X(false);
                    boolean zA11112 = I.A(n6sVar6);
                    i7 = i13 & 7168;
                    if (i7 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z2118 = zA11112 | z7;
                    i8 = i13 & 57344;
                    if (i8 == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z2119 = z8 | z2118;
                    ujf0Var = ujf0Var3;
                    boolean zA11113 = z2119 | I.A(ujf0Var);
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i9 = (i13 & 112) ^ 48;
                    zA = zA11113 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                    Object objY211 = I.y();
                    if (zA) {
                        i10 = i7;
                        n6sVar2 = n6sVar6;
                        ?? r1112 = I;
                        bcnVar2 = bcnVar;
                        obj3 = new Function1() { // from class: q3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                vkf0 vkf0VarD;
                                j5i j5iVar = (j5i) obj5;
                                n6s n6sVar7 = n6sVar2;
                                if (n6sVar7.b() == j5iVar.a()) {
                                    return Unit.a;
                                }
                                ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                boolean zB2 = n6sVar7.b();
                                ijf0 ijf0Var15 = ijf0Var;
                                mly mlyVar5 = mlyVar4;
                                if (zB2 && z2 && !z3) {
                                    j4b.g(ujf0Var, n6sVar7, ijf0Var15, bcnVar2, mlyVar5);
                                } else {
                                    j4b.e(n6sVar7);
                                }
                                if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                    ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var15, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                }
                                if (!j5iVar.a()) {
                                    iif0Var.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        z10 = z2;
                        ujf0Var = ujf0Var;
                        iif0Var2 = iif0Var;
                        ia5Var2 = ia5Var;
                        v5bVar2 = v5bVar;
                        ijf0Var3 = ijf0Var;
                        r1112.r(obj3);
                        r16 = r1112;
                    } else {
                        i10 = i7;
                        n6sVar2 = n6sVar6;
                        ?? r1113 = I;
                        bcnVar2 = bcnVar;
                        obj3 = new Function1() { // from class: q3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                vkf0 vkf0VarD;
                                j5i j5iVar = (j5i) obj5;
                                n6s n6sVar7 = n6sVar2;
                                if (n6sVar7.b() == j5iVar.a()) {
                                    return Unit.a;
                                }
                                ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                boolean zB2 = n6sVar7.b();
                                ijf0 ijf0Var15 = ijf0Var;
                                mly mlyVar5 = mlyVar4;
                                if (zB2 && z2 && !z3) {
                                    j4b.g(ujf0Var, n6sVar7, ijf0Var15, bcnVar2, mlyVar5);
                                } else {
                                    j4b.e(n6sVar7);
                                }
                                if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                    ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var15, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                }
                                if (!j5iVar.a()) {
                                    iif0Var.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        z10 = z2;
                        ujf0Var = ujf0Var;
                        iif0Var2 = iif0Var;
                        ia5Var2 = ia5Var;
                        v5bVar2 = v5bVar;
                        ijf0Var3 = ijf0Var;
                        r1113.r(obj3);
                        r16 = r1113;
                    }
                    aVar4 = d.a.b;
                    d dVarA1119 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    ytwVarC = m.c(Boolean.valueOf(z11), r16);
                    Unit unit6 = Unit.a;
                    boolean zM14 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                    if (i9 > 32) {
                        n6sVar3 = n6sVar2;
                        if ((r5 & 48) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        n6sVar3 = n6sVar2;
                        if ((r5 & 48) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    z13 = zM14 | z12;
                    Object objY212 = r16.y();
                    if (z13) {
                        n6sVar4 = n6sVar3;
                        ujf0 ujf0Var15 = ujf0Var;
                        y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var15, iif0Var2, bcnVar, null);
                        ytwVar = ytwVarC;
                        ujf0Var = ujf0Var15;
                        r16.r(y3bVar);
                    } else {
                        n6sVar4 = n6sVar3;
                        ujf0 ujf0Var16 = ujf0Var;
                        y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var16, iif0Var2, bcnVar, null);
                        ytwVar = ytwVarC;
                        ujf0Var = ujf0Var16;
                        r16.r(y3bVar);
                    }
                    xvf.e(r16, unit6, (Function2) y3bVar);
                    zA2 = r16.A(n6sVar4);
                    objY6 = r16.y();
                    if (zA2) {
                        objY6 = new r3b(n6sVar4, 0);
                        r16.r(objY6);
                    } else {
                        objY6 = new r3b(n6sVar4, 0);
                        r16.r(objY6);
                    }
                    dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                    boolean zA11114 = r16.A(n6sVar4);
                    if (i8 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z21110 = zA11114 | z14;
                    i11 = i10;
                    if (i11 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zA3 = z21110 | z15 | r16.A(r7) | r16.A(iif0Var2);
                    objY7 = r16.y();
                    if (zA3) {
                        final iif0 iif0Var15 = iif0Var2;
                        mlyVar = r7;
                        final b5i b5iVar13 = b5iVar;
                        Function1 function116 = new Function1() { // from class: s3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ooa0 ooa0Var2;
                                gly glyVar = (gly) obj5;
                                n6s n6sVar7 = n6sVar4;
                                if (!n6sVar7.b()) {
                                    b5i.b(b5iVar13);
                                } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                    ooa0Var2.a();
                                }
                                if (n6sVar7.b() && z2) {
                                    if (n6sVar7.a() != ocl.b) {
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            long j6 = glyVar.a;
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar7 = n6sVar7.v;
                                            int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                            l6sVar7.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                            if (n6sVar7.a.a.b.length() > 0) {
                                                ((x5a0) n6sVar7.k).setValue(ocl.c);
                                            }
                                        }
                                    } else {
                                        iif0Var15.d(glyVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        iif0Var2 = iif0Var15;
                        r16.r(function116);
                        objY7 = function116;
                    } else {
                        final iif0 iif0Var16 = iif0Var2;
                        mlyVar = r7;
                        final b5i b5iVar14 = b5iVar;
                        Function1 function117 = new Function1() { // from class: s3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ooa0 ooa0Var2;
                                gly glyVar = (gly) obj5;
                                n6s n6sVar7 = n6sVar4;
                                if (!n6sVar7.b()) {
                                    b5i.b(b5iVar14);
                                } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                    ooa0Var2.a();
                                }
                                if (n6sVar7.b() && z2) {
                                    if (n6sVar7.a() != ocl.b) {
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            long j6 = glyVar.a;
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar7 = n6sVar7.v;
                                            int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                            l6sVar7.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                            if (n6sVar7.a.a.b.length() > 0) {
                                                ((x5a0) n6sVar7.k).setValue(ocl.c);
                                            }
                                        }
                                    } else {
                                        iif0Var16.d(glyVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        iif0Var2 = iif0Var16;
                        r16.r(function117);
                        objY7 = function117;
                    }
                    function3 = (Function1) objY7;
                    if (z2) {
                        dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                    }
                    iif0.b bVar8 = iif0Var2.B;
                    iif0.c cVar7 = iif0Var2.A;
                    d dVarN7 = dVarA.n(new SuspendPointerInputElement(bVar8, cVar7, null, new l880(bVar8, cVar7), 4));
                    g020.a.getClass();
                    d dVarC7 = h020.c(dVarN7, j020.b);
                    boolean zA11115 = r16.A(n6sVar4);
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zA4 = zA11115 | z16 | r16.A(mlyVar);
                    objY8 = r16.y();
                    if (zA4) {
                        objY8 = new Function1() { // from class: t3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar4;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    lc6 lc6VarA = tcfVar.F1().a();
                                    long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                    long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    tkf0 tkf0Var = ukf0Var.a;
                                    b90 b90Var = n6sVar7.y;
                                    long j8 = n6sVar7.z;
                                    boolean zC = ulf0.c(j6);
                                    mly mlyVar5 = mlyVar;
                                    if (!zC) {
                                        b90Var.m(j8);
                                        int iB3 = mlyVar5.b(ulf0.f(j6));
                                        int iB4 = mlyVar5.b(ulf0.e(j6));
                                        if (iB3 != iB4) {
                                            lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                        }
                                    } else if (ulf0.c(j7)) {
                                        ijf0 ijf0Var15 = ijf0Var3;
                                        if (!ulf0.c(ijf0Var15.b)) {
                                            b90Var.m(j8);
                                            long j9 = ijf0Var15.b;
                                            int iB5 = mlyVar5.b(ulf0.f(j9));
                                            int iB6 = mlyVar5.b(ulf0.e(j9));
                                            if (iB5 != iB6) {
                                                lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                            }
                                        }
                                    } else {
                                        long jC = tkf0Var.b.c();
                                        j58 j58Var = new j58(jC);
                                        if (jC == 16) {
                                            j58Var = null;
                                        }
                                        long j10 = j58Var != null ? j58Var.a : j58.b;
                                        b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                        int iB7 = mlyVar5.b(ulf0.f(j7));
                                        int iB8 = mlyVar5.b(ulf0.e(j7));
                                        if (iB7 != iB8) {
                                            lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                        }
                                    }
                                    boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                    if (z30) {
                                        long j11 = ukf0Var.c;
                                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        lc6VarA.p();
                                        lc6VarA.i(lk40VarB);
                                    }
                                    ora0 ora0Var = tkf0Var.b.a;
                                    yef0 yef0Var = ora0Var.m;
                                    kjf0 kjf0Var = ora0Var.a;
                                    if (yef0Var == null) {
                                        yef0Var = yef0.b;
                                    }
                                    yef0 yef0Var2 = yef0Var;
                                    ix80 ix80Var = ora0Var.n;
                                    if (ix80Var == null) {
                                        ix80Var = ix80.d;
                                    }
                                    ix80 ix80Var2 = ix80Var;
                                    wcf wcfVar = ora0Var.p;
                                    if (wcfVar == null) {
                                        wcfVar = rlh.a;
                                    }
                                    wcf wcfVar2 = wcfVar;
                                    try {
                                        ya5 ya5VarE = kjf0Var.e();
                                        kjf0.a aVar14 = kjf0.a.a;
                                        if (ya5VarE != null) {
                                            gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar14 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                        } else {
                                            zjwVar.i(lc6VarA, kjf0Var != aVar14 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                        }
                                    } finally {
                                        if (z30) {
                                            lc6VarA.f();
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY8);
                    } else {
                        objY8 = new Function1() { // from class: t3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar4;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    lc6 lc6VarA = tcfVar.F1().a();
                                    long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                    long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    tkf0 tkf0Var = ukf0Var.a;
                                    b90 b90Var = n6sVar7.y;
                                    long j8 = n6sVar7.z;
                                    boolean zC = ulf0.c(j6);
                                    mly mlyVar5 = mlyVar;
                                    if (!zC) {
                                        b90Var.m(j8);
                                        int iB3 = mlyVar5.b(ulf0.f(j6));
                                        int iB4 = mlyVar5.b(ulf0.e(j6));
                                        if (iB3 != iB4) {
                                            lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                        }
                                    } else if (ulf0.c(j7)) {
                                        ijf0 ijf0Var15 = ijf0Var3;
                                        if (!ulf0.c(ijf0Var15.b)) {
                                            b90Var.m(j8);
                                            long j9 = ijf0Var15.b;
                                            int iB5 = mlyVar5.b(ulf0.f(j9));
                                            int iB6 = mlyVar5.b(ulf0.e(j9));
                                            if (iB5 != iB6) {
                                                lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                            }
                                        }
                                    } else {
                                        long jC = tkf0Var.b.c();
                                        j58 j58Var = new j58(jC);
                                        if (jC == 16) {
                                            j58Var = null;
                                        }
                                        long j10 = j58Var != null ? j58Var.a : j58.b;
                                        b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                        int iB7 = mlyVar5.b(ulf0.f(j7));
                                        int iB8 = mlyVar5.b(ulf0.e(j7));
                                        if (iB7 != iB8) {
                                            lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                        }
                                    }
                                    boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                    if (z30) {
                                        long j11 = ukf0Var.c;
                                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        lc6VarA.p();
                                        lc6VarA.i(lk40VarB);
                                    }
                                    ora0 ora0Var = tkf0Var.b.a;
                                    yef0 yef0Var = ora0Var.m;
                                    kjf0 kjf0Var = ora0Var.a;
                                    if (yef0Var == null) {
                                        yef0Var = yef0.b;
                                    }
                                    yef0 yef0Var2 = yef0Var;
                                    ix80 ix80Var = ora0Var.n;
                                    if (ix80Var == null) {
                                        ix80Var = ix80.d;
                                    }
                                    ix80 ix80Var2 = ix80Var;
                                    wcf wcfVar = ora0Var.p;
                                    if (wcfVar == null) {
                                        wcfVar = rlh.a;
                                    }
                                    wcf wcfVar2 = wcfVar;
                                    try {
                                        ya5 ya5VarE = kjf0Var.e();
                                        kjf0.a aVar14 = kjf0.a.a;
                                        if (ya5VarE != null) {
                                            gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar14 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                        } else {
                                            zjwVar.i(lc6VarA, kjf0Var != aVar14 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                        }
                                    } finally {
                                        if (z30) {
                                            lc6VarA.f();
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY8);
                    }
                    d dVarA11110 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                    boolean zA11116 = r16.A(n6sVar4);
                    if (i11 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zM15 = zA11116 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                    if (i14 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zA5 = zM15 | z18 | r16.A(mlyVar);
                    objY9 = r16.y();
                    if (zA5) {
                        final ijf0 ijf0Var15 = ijf0Var3;
                        Function1 function118 = new Function1() { // from class: u3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                dkf0 dkf0Var2;
                                urr urrVar;
                                urr urrVar2;
                                n6s n6sVar7 = n6sVar4;
                                ytw ytwVar2 = n6sVar7.o;
                                urr urrVar3 = (urr) obj5;
                                n6sVar7.h = urrVar3;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    vkf0VarD.b = urrVar3;
                                }
                                if (z2) {
                                    ocl oclVarA = n6sVar7.a();
                                    ocl oclVar = ocl.b;
                                    iif0 iif0Var17 = iif0Var2;
                                    ijf0 ijf0Var16 = ijf0Var15;
                                    if (oclVarA == oclVar) {
                                        if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                            iif0Var17.r();
                                        } else {
                                            iif0Var17.k();
                                        }
                                        ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var17, true)));
                                        ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var17, false)));
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var16.b)));
                                    } else if (n6sVar7.a() == ocl.c) {
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var17, true)));
                                    }
                                    mly mlyVar5 = mlyVar;
                                    j4b.f(n6sVar7, ijf0Var16, mlyVar5);
                                    vkf0 vkf0VarD2 = n6sVar7.d();
                                    if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                        ukf0 ukf0Var = vkf0VarD2.a;
                                        wff0 wff0Var = new wff0(urrVar);
                                        lk40 lk40VarA = z880.a(urrVar);
                                        lk40 lk40VarP = urrVar.P(urrVar2, false);
                                        if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                            dkf0Var2.b.h(ijf0Var16, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        a8j0Var = a8j0Var2;
                        r16.r(function118);
                        objY9 = function118;
                    } else {
                        final ijf0 ijf0Var16 = ijf0Var3;
                        Function1 function119 = new Function1() { // from class: u3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                dkf0 dkf0Var2;
                                urr urrVar;
                                urr urrVar2;
                                n6s n6sVar7 = n6sVar4;
                                ytw ytwVar2 = n6sVar7.o;
                                urr urrVar3 = (urr) obj5;
                                n6sVar7.h = urrVar3;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    vkf0VarD.b = urrVar3;
                                }
                                if (z2) {
                                    ocl oclVarA = n6sVar7.a();
                                    ocl oclVar = ocl.b;
                                    iif0 iif0Var17 = iif0Var2;
                                    ijf0 ijf0Var17 = ijf0Var16;
                                    if (oclVarA == oclVar) {
                                        if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                            iif0Var17.r();
                                        } else {
                                            iif0Var17.k();
                                        }
                                        ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var17, true)));
                                        ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var17, false)));
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var17.b)));
                                    } else if (n6sVar7.a() == ocl.c) {
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var17, true)));
                                    }
                                    mly mlyVar5 = mlyVar;
                                    j4b.f(n6sVar7, ijf0Var17, mlyVar5);
                                    vkf0 vkf0VarD2 = n6sVar7.d();
                                    if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                        ukf0 ukf0Var = vkf0VarD2.a;
                                        wff0 wff0Var = new wff0(urrVar);
                                        lk40 lk40VarA = z880.a(urrVar);
                                        lk40 lk40VarP = urrVar.P(urrVar2, false);
                                        if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                            dkf0Var2.b.h(ijf0Var17, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        a8j0Var = a8j0Var2;
                        r16.r(function119);
                        objY9 = function119;
                    }
                    d dVarA11111 = v.a(aVar4, (Function1) objY9);
                    mlyVar2 = mlyVar;
                    n6sVar5 = n6sVar4;
                    v5b v5bVar9 = v5bVar2;
                    ujf0Var2 = ujf0Var;
                    iif0Var3 = iif0Var2;
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier7 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                    if (!z2) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                    } else {
                        dVarA2 = aVar4;
                    }
                    zA6 = r16.A(iif0Var3);
                    objY10 = r16.y();
                    if (zA6) {
                        objY10 = new v3b(iif0Var3, 0);
                        r16.r(objY10);
                    } else {
                        objY10 = new v3b(iif0Var3, 0);
                        r16.r(objY10);
                    }
                    xvf.c(iif0Var3, (Function1) objY10, r16);
                    boolean zA11117 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                    if (i14 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zA11117 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                    objY11 = r16.y();
                    if (z21) {
                        objY11 = new Function1() { // from class: w3b
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                n6s n6sVar7 = n6sVar5;
                                if (n6sVar7.b()) {
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar7 = n6sVar7.v;
                                    uhi uhiVar = n6sVar7.w;
                                    dq40 dq40Var = new dq40();
                                    vff0 vff0Var = new vff0(osfVar2, l6sVar7, dq40Var);
                                    ujf0 ujf0Var17 = ujf0Var2;
                                    rk10 rk10Var = ujf0Var17.a;
                                    rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                    ?? dkf0Var2 = new dkf0(ujf0Var17, rk10Var);
                                    ujf0Var17.b.set((dkf0) dkf0Var2);
                                    dq40Var.a = dkf0Var2;
                                    n6sVar7.e = dkf0Var2;
                                }
                                return new i4b();
                            }
                        };
                        r16.r(objY11);
                    } else {
                        objY11 = new Function1() { // from class: w3b
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                n6s n6sVar7 = n6sVar5;
                                if (n6sVar7.b()) {
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar7 = n6sVar7.v;
                                    uhi uhiVar = n6sVar7.w;
                                    dq40 dq40Var = new dq40();
                                    vff0 vff0Var = new vff0(osfVar2, l6sVar7, dq40Var);
                                    ujf0 ujf0Var17 = ujf0Var2;
                                    rk10 rk10Var = ujf0Var17.a;
                                    rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                    ?? dkf0Var2 = new dkf0(ujf0Var17, rk10Var);
                                    ujf0Var17.b.set((dkf0) dkf0Var2);
                                    dq40Var.a = dkf0Var2;
                                    n6sVar7.e = dkf0Var2;
                                }
                                return new i4b();
                            }
                        };
                        r16.r(objY11);
                    }
                    xvf.c(bcnVar, (Function1) objY11, r16);
                    l6s l6sVar7 = n6sVar5.v;
                    if (i == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    chf0 chf0Var7 = new chf0(n6sVar5, iif0Var3, ijf0Var, z2117, z22, mlyVar2, odh0Var, l6sVar7, bcnVar.e);
                    gnn.a aVar14 = gnn.a;
                    d dVarA11112 = c.a(aVar4, aVar14, chf0Var7);
                    i12 = bcnVar.d;
                    if (i12 == 7) {
                        z23 = false;
                    } else {
                        z23 = true;
                    }
                    boolean zBooleanValue7 = ((Boolean) ytwVar.getValue()).booleanValue();
                    zB = r16.b(z23) | r16.A(x5sVar);
                    objY12 = r16.y();
                    if (zB) {
                        objY12 = new Function0() { // from class: j3b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z23) {
                                    x5sVar.i();
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY12);
                    } else {
                        objY12 = new Function0() { // from class: j3b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z23) {
                                    x5sVar.i();
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY12);
                    }
                    d dVarA11113 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue7, z23, (Function0) objY12);
                    j2 = ((j58) r16.O(vl1.a)).a;
                    zA7 = r16.A(n6sVar5) | r16.e(j2);
                    objY13 = r16.y();
                    if (zA7) {
                        objY13 = new Function1() { // from class: i3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar5;
                                if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                    tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY13);
                    } else {
                        objY13 = new Function1() { // from class: i3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar5;
                                if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                    tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY13);
                    }
                    yhf0 yhf0Var8 = yhf0Var;
                    z24 = false;
                    d dVarA11114 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA11113).n(dVarA1119), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA11112), aVar14, new uhf0(yhf0Var8, z2, pswVar)).n(dVarC7).n(coreTextFieldSemanticsModifier7), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar9));
                    if (z2) {
                        z24 = true;
                    }
                    if (z24) {
                        dVarA3 = aVar4;
                    } else {
                        dVarA3 = aVar4;
                    }
                    ?? r1114 = r16;
                    b(dVarA11114, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var8, ijf0Var, uni0Var, dVarA2, dVarA11110, dVarA11111, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r1114), r1114, 384);
                    r15 = r1114;
                }
                z6 = false;
                if (ulf0Var == null) {
                    rvf rvfVar15 = osfVar.b;
                    rvfVar15.d = -1;
                    rvfVar15.e = -1;
                } else {
                    j = ulf0Var.a;
                    if (!ulf0.c(j)) {
                        osfVar.b.g(ulf0.f(j), ulf0.e(j));
                    }
                    if (z5) {
                        rvf rvfVar16 = osfVar.b;
                        rvfVar16.d = -1;
                        rvfVar16.e = -1;
                        ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                    } else {
                        rvf rvfVar17 = osfVar.b;
                        rvfVar17.d = -1;
                        rvfVar17.e = -1;
                        ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                    }
                    ijf0Var2 = osfVar.a;
                    osfVar.a = ijf0VarA;
                    if (dkf0Var != null) {
                        dkf0Var.a(ijf0Var2, ijf0VarA);
                    }
                    objY = I.y();
                    obj2 = obj;
                    if (objY == obj2) {
                        objY = new odh0(0);
                        I.r(objY);
                    }
                    odh0Var = (odh0) objY;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (odh0Var.f) {
                        odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                        odh0Var.a(ijf0Var);
                    } else {
                        l = odh0Var.e;
                        if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                            odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                            odh0Var.a(ijf0Var);
                        }
                    }
                    objY2 = I.y();
                    if (objY2 == obj2) {
                        objY2 = xvf.i(kotlin.coroutines.e.a, I);
                        I.r(objY2);
                    }
                    v5bVar = (v5b) objY2;
                    objY3 = I.y();
                    if (objY3 == obj2) {
                        objY3 = new la5();
                        I.r(objY3);
                    }
                    ia5Var = (ia5) objY3;
                    objY4 = I.y();
                    if (objY4 == obj2) {
                        objY4 = new iif0(odh0Var);
                        I.r(objY4);
                    }
                    iif0Var = (iif0) objY4;
                    iif0Var.b = mlyVar4;
                    iif0Var.f = uni0Var;
                    iif0Var.c = n6sVar6.v;
                    iif0Var.d = n6sVar6;
                    ((x5a0) iif0Var.e).setValue(ijf0Var);
                    iif0Var.x = new ulf0(j5);
                    iif0Var.h = (ms7) I.O(kna.f);
                    iif0Var.i = v5bVar;
                    iif0Var.k = (jmf0) I.O(kna.q);
                    iif0Var.l = (zdl) I.O(kna.l);
                    iif0Var.m = b5iVar;
                    boolean z21111 = !z3;
                    ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z21111));
                    ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                    I.N(1966776937);
                    q780Var = q780.a;
                    cetVar = imf0Var.a.k;
                    qyd0 qyd0Var7 = jk10.a;
                    I.N(430530635);
                    if (Build.VERSION.SDK_INT < 28) {
                        I.H();
                        vj10Var = null;
                    } else {
                        context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                        coroutineContext = (CoroutineContext) I.O(jk10.a);
                        zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                        objY5 = I.y();
                        if (zM) {
                            jk10.b.getClass();
                            objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                            I.r(objY5);
                        } else {
                            jk10.b.getClass();
                            objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                            I.r(objY5);
                        }
                        vj10Var = (vj10) objY5;
                        I.H();
                    }
                    iif0Var.j = vj10Var;
                    I.X(false);
                    boolean zA11118 = I.A(n6sVar6);
                    i7 = i13 & 7168;
                    if (i7 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z21112 = zA11118 | z7;
                    i8 = i13 & 57344;
                    if (i8 == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z21113 = z8 | z21112;
                    ujf0Var = ujf0Var3;
                    boolean zA11119 = z21113 | I.A(ujf0Var);
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i9 = (i13 & 112) ^ 48;
                    zA = zA11119 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                    Object objY213 = I.y();
                    if (zA) {
                        i10 = i7;
                        n6sVar2 = n6sVar6;
                        ?? r1115 = I;
                        bcnVar2 = bcnVar;
                        obj3 = new Function1() { // from class: q3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                vkf0 vkf0VarD;
                                j5i j5iVar = (j5i) obj5;
                                n6s n6sVar7 = n6sVar2;
                                if (n6sVar7.b() == j5iVar.a()) {
                                    return Unit.a;
                                }
                                ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                boolean zB2 = n6sVar7.b();
                                ijf0 ijf0Var17 = ijf0Var;
                                mly mlyVar5 = mlyVar4;
                                if (zB2 && z2 && !z3) {
                                    j4b.g(ujf0Var, n6sVar7, ijf0Var17, bcnVar2, mlyVar5);
                                } else {
                                    j4b.e(n6sVar7);
                                }
                                if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                    ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var17, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                }
                                if (!j5iVar.a()) {
                                    iif0Var.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        z10 = z2;
                        ujf0Var = ujf0Var;
                        iif0Var2 = iif0Var;
                        ia5Var2 = ia5Var;
                        v5bVar2 = v5bVar;
                        ijf0Var3 = ijf0Var;
                        r1115.r(obj3);
                        r16 = r1115;
                    } else {
                        i10 = i7;
                        n6sVar2 = n6sVar6;
                        ?? r1116 = I;
                        bcnVar2 = bcnVar;
                        obj3 = new Function1() { // from class: q3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                vkf0 vkf0VarD;
                                j5i j5iVar = (j5i) obj5;
                                n6s n6sVar7 = n6sVar2;
                                if (n6sVar7.b() == j5iVar.a()) {
                                    return Unit.a;
                                }
                                ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                boolean zB2 = n6sVar7.b();
                                ijf0 ijf0Var17 = ijf0Var;
                                mly mlyVar5 = mlyVar4;
                                if (zB2 && z2 && !z3) {
                                    j4b.g(ujf0Var, n6sVar7, ijf0Var17, bcnVar2, mlyVar5);
                                } else {
                                    j4b.e(n6sVar7);
                                }
                                if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                    ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var17, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                }
                                if (!j5iVar.a()) {
                                    iif0Var.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        z10 = z2;
                        ujf0Var = ujf0Var;
                        iif0Var2 = iif0Var;
                        ia5Var2 = ia5Var;
                        v5bVar2 = v5bVar;
                        ijf0Var3 = ijf0Var;
                        r1116.r(obj3);
                        r16 = r1116;
                    }
                    aVar4 = d.a.b;
                    d dVarA11115 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    ytwVarC = m.c(Boolean.valueOf(z11), r16);
                    Unit unit7 = Unit.a;
                    boolean zM16 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                    if (i9 > 32) {
                        n6sVar3 = n6sVar2;
                        if ((r5 & 48) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        n6sVar3 = n6sVar2;
                        if ((r5 & 48) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    z13 = zM16 | z12;
                    Object objY214 = r16.y();
                    if (z13) {
                        n6sVar4 = n6sVar3;
                        ujf0 ujf0Var17 = ujf0Var;
                        y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var17, iif0Var2, bcnVar, null);
                        ytwVar = ytwVarC;
                        ujf0Var = ujf0Var17;
                        r16.r(y3bVar);
                    } else {
                        n6sVar4 = n6sVar3;
                        ujf0 ujf0Var18 = ujf0Var;
                        y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var18, iif0Var2, bcnVar, null);
                        ytwVar = ytwVarC;
                        ujf0Var = ujf0Var18;
                        r16.r(y3bVar);
                    }
                    xvf.e(r16, unit7, (Function2) y3bVar);
                    zA2 = r16.A(n6sVar4);
                    objY6 = r16.y();
                    if (zA2) {
                        objY6 = new r3b(n6sVar4, 0);
                        r16.r(objY6);
                    } else {
                        objY6 = new r3b(n6sVar4, 0);
                        r16.r(objY6);
                    }
                    dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                    boolean zA111110 = r16.A(n6sVar4);
                    if (i8 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z21114 = zA111110 | z14;
                    i11 = i10;
                    if (i11 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zA3 = z21114 | z15 | r16.A(r7) | r16.A(iif0Var2);
                    objY7 = r16.y();
                    if (zA3) {
                        final iif0 iif0Var17 = iif0Var2;
                        mlyVar = r7;
                        final b5i b5iVar15 = b5iVar;
                        Function1 function1110 = new Function1() { // from class: s3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ooa0 ooa0Var2;
                                gly glyVar = (gly) obj5;
                                n6s n6sVar7 = n6sVar4;
                                if (!n6sVar7.b()) {
                                    b5i.b(b5iVar15);
                                } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                    ooa0Var2.a();
                                }
                                if (n6sVar7.b() && z2) {
                                    if (n6sVar7.a() != ocl.b) {
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            long j6 = glyVar.a;
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar8 = n6sVar7.v;
                                            int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                            l6sVar8.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                            if (n6sVar7.a.a.b.length() > 0) {
                                                ((x5a0) n6sVar7.k).setValue(ocl.c);
                                            }
                                        }
                                    } else {
                                        iif0Var17.d(glyVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        iif0Var2 = iif0Var17;
                        r16.r(function1110);
                        objY7 = function1110;
                    } else {
                        final iif0 iif0Var18 = iif0Var2;
                        mlyVar = r7;
                        final b5i b5iVar16 = b5iVar;
                        Function1 function1111 = new Function1() { // from class: s3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ooa0 ooa0Var2;
                                gly glyVar = (gly) obj5;
                                n6s n6sVar7 = n6sVar4;
                                if (!n6sVar7.b()) {
                                    b5i.b(b5iVar16);
                                } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                    ooa0Var2.a();
                                }
                                if (n6sVar7.b() && z2) {
                                    if (n6sVar7.a() != ocl.b) {
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            long j6 = glyVar.a;
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar8 = n6sVar7.v;
                                            int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                            l6sVar8.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                            if (n6sVar7.a.a.b.length() > 0) {
                                                ((x5a0) n6sVar7.k).setValue(ocl.c);
                                            }
                                        }
                                    } else {
                                        iif0Var18.d(glyVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        iif0Var2 = iif0Var18;
                        r16.r(function1111);
                        objY7 = function1111;
                    }
                    function3 = (Function1) objY7;
                    if (z2) {
                        dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                    }
                    iif0.b bVar9 = iif0Var2.B;
                    iif0.c cVar8 = iif0Var2.A;
                    d dVarN8 = dVarA.n(new SuspendPointerInputElement(bVar9, cVar8, null, new l880(bVar9, cVar8), 4));
                    g020.a.getClass();
                    d dVarC8 = h020.c(dVarN8, j020.b);
                    boolean zA111111 = r16.A(n6sVar4);
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zA4 = zA111111 | z16 | r16.A(mlyVar);
                    objY8 = r16.y();
                    if (zA4) {
                        objY8 = new Function1() { // from class: t3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar4;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    lc6 lc6VarA = tcfVar.F1().a();
                                    long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                    long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    tkf0 tkf0Var = ukf0Var.a;
                                    b90 b90Var = n6sVar7.y;
                                    long j8 = n6sVar7.z;
                                    boolean zC = ulf0.c(j6);
                                    mly mlyVar5 = mlyVar;
                                    if (!zC) {
                                        b90Var.m(j8);
                                        int iB3 = mlyVar5.b(ulf0.f(j6));
                                        int iB4 = mlyVar5.b(ulf0.e(j6));
                                        if (iB3 != iB4) {
                                            lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                        }
                                    } else if (ulf0.c(j7)) {
                                        ijf0 ijf0Var17 = ijf0Var3;
                                        if (!ulf0.c(ijf0Var17.b)) {
                                            b90Var.m(j8);
                                            long j9 = ijf0Var17.b;
                                            int iB5 = mlyVar5.b(ulf0.f(j9));
                                            int iB6 = mlyVar5.b(ulf0.e(j9));
                                            if (iB5 != iB6) {
                                                lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                            }
                                        }
                                    } else {
                                        long jC = tkf0Var.b.c();
                                        j58 j58Var = new j58(jC);
                                        if (jC == 16) {
                                            j58Var = null;
                                        }
                                        long j10 = j58Var != null ? j58Var.a : j58.b;
                                        b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                        int iB7 = mlyVar5.b(ulf0.f(j7));
                                        int iB8 = mlyVar5.b(ulf0.e(j7));
                                        if (iB7 != iB8) {
                                            lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                        }
                                    }
                                    boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                    if (z30) {
                                        long j11 = ukf0Var.c;
                                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        lc6VarA.p();
                                        lc6VarA.i(lk40VarB);
                                    }
                                    ora0 ora0Var = tkf0Var.b.a;
                                    yef0 yef0Var = ora0Var.m;
                                    kjf0 kjf0Var = ora0Var.a;
                                    if (yef0Var == null) {
                                        yef0Var = yef0.b;
                                    }
                                    yef0 yef0Var2 = yef0Var;
                                    ix80 ix80Var = ora0Var.n;
                                    if (ix80Var == null) {
                                        ix80Var = ix80.d;
                                    }
                                    ix80 ix80Var2 = ix80Var;
                                    wcf wcfVar = ora0Var.p;
                                    if (wcfVar == null) {
                                        wcfVar = rlh.a;
                                    }
                                    wcf wcfVar2 = wcfVar;
                                    try {
                                        ya5 ya5VarE = kjf0Var.e();
                                        kjf0.a aVar15 = kjf0.a.a;
                                        if (ya5VarE != null) {
                                            gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar15 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                        } else {
                                            zjwVar.i(lc6VarA, kjf0Var != aVar15 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                        }
                                    } finally {
                                        if (z30) {
                                            lc6VarA.f();
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY8);
                    } else {
                        objY8 = new Function1() { // from class: t3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar4;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    lc6 lc6VarA = tcfVar.F1().a();
                                    long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                    long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    tkf0 tkf0Var = ukf0Var.a;
                                    b90 b90Var = n6sVar7.y;
                                    long j8 = n6sVar7.z;
                                    boolean zC = ulf0.c(j6);
                                    mly mlyVar5 = mlyVar;
                                    if (!zC) {
                                        b90Var.m(j8);
                                        int iB3 = mlyVar5.b(ulf0.f(j6));
                                        int iB4 = mlyVar5.b(ulf0.e(j6));
                                        if (iB3 != iB4) {
                                            lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                        }
                                    } else if (ulf0.c(j7)) {
                                        ijf0 ijf0Var17 = ijf0Var3;
                                        if (!ulf0.c(ijf0Var17.b)) {
                                            b90Var.m(j8);
                                            long j9 = ijf0Var17.b;
                                            int iB5 = mlyVar5.b(ulf0.f(j9));
                                            int iB6 = mlyVar5.b(ulf0.e(j9));
                                            if (iB5 != iB6) {
                                                lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                            }
                                        }
                                    } else {
                                        long jC = tkf0Var.b.c();
                                        j58 j58Var = new j58(jC);
                                        if (jC == 16) {
                                            j58Var = null;
                                        }
                                        long j10 = j58Var != null ? j58Var.a : j58.b;
                                        b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                        int iB7 = mlyVar5.b(ulf0.f(j7));
                                        int iB8 = mlyVar5.b(ulf0.e(j7));
                                        if (iB7 != iB8) {
                                            lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                        }
                                    }
                                    boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                    if (z30) {
                                        long j11 = ukf0Var.c;
                                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        lc6VarA.p();
                                        lc6VarA.i(lk40VarB);
                                    }
                                    ora0 ora0Var = tkf0Var.b.a;
                                    yef0 yef0Var = ora0Var.m;
                                    kjf0 kjf0Var = ora0Var.a;
                                    if (yef0Var == null) {
                                        yef0Var = yef0.b;
                                    }
                                    yef0 yef0Var2 = yef0Var;
                                    ix80 ix80Var = ora0Var.n;
                                    if (ix80Var == null) {
                                        ix80Var = ix80.d;
                                    }
                                    ix80 ix80Var2 = ix80Var;
                                    wcf wcfVar = ora0Var.p;
                                    if (wcfVar == null) {
                                        wcfVar = rlh.a;
                                    }
                                    wcf wcfVar2 = wcfVar;
                                    try {
                                        ya5 ya5VarE = kjf0Var.e();
                                        kjf0.a aVar15 = kjf0.a.a;
                                        if (ya5VarE != null) {
                                            gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar15 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                        } else {
                                            zjwVar.i(lc6VarA, kjf0Var != aVar15 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                        }
                                    } finally {
                                        if (z30) {
                                            lc6VarA.f();
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY8);
                    }
                    d dVarA11116 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                    boolean zA111112 = r16.A(n6sVar4);
                    if (i11 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zM17 = zA111112 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                    if (i14 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zA5 = zM17 | z18 | r16.A(mlyVar);
                    objY9 = r16.y();
                    if (zA5) {
                        final ijf0 ijf0Var17 = ijf0Var3;
                        Function1 function1112 = new Function1() { // from class: u3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                dkf0 dkf0Var2;
                                urr urrVar;
                                urr urrVar2;
                                n6s n6sVar7 = n6sVar4;
                                ytw ytwVar2 = n6sVar7.o;
                                urr urrVar3 = (urr) obj5;
                                n6sVar7.h = urrVar3;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    vkf0VarD.b = urrVar3;
                                }
                                if (z2) {
                                    ocl oclVarA = n6sVar7.a();
                                    ocl oclVar = ocl.b;
                                    iif0 iif0Var19 = iif0Var2;
                                    ijf0 ijf0Var18 = ijf0Var17;
                                    if (oclVarA == oclVar) {
                                        if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                            iif0Var19.r();
                                        } else {
                                            iif0Var19.k();
                                        }
                                        ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var19, true)));
                                        ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var19, false)));
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var18.b)));
                                    } else if (n6sVar7.a() == ocl.c) {
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var19, true)));
                                    }
                                    mly mlyVar5 = mlyVar;
                                    j4b.f(n6sVar7, ijf0Var18, mlyVar5);
                                    vkf0 vkf0VarD2 = n6sVar7.d();
                                    if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                        ukf0 ukf0Var = vkf0VarD2.a;
                                        wff0 wff0Var = new wff0(urrVar);
                                        lk40 lk40VarA = z880.a(urrVar);
                                        lk40 lk40VarP = urrVar.P(urrVar2, false);
                                        if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                            dkf0Var2.b.h(ijf0Var18, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        a8j0Var = a8j0Var2;
                        r16.r(function1112);
                        objY9 = function1112;
                    } else {
                        final ijf0 ijf0Var18 = ijf0Var3;
                        Function1 function1113 = new Function1() { // from class: u3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                dkf0 dkf0Var2;
                                urr urrVar;
                                urr urrVar2;
                                n6s n6sVar7 = n6sVar4;
                                ytw ytwVar2 = n6sVar7.o;
                                urr urrVar3 = (urr) obj5;
                                n6sVar7.h = urrVar3;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    vkf0VarD.b = urrVar3;
                                }
                                if (z2) {
                                    ocl oclVarA = n6sVar7.a();
                                    ocl oclVar = ocl.b;
                                    iif0 iif0Var19 = iif0Var2;
                                    ijf0 ijf0Var19 = ijf0Var18;
                                    if (oclVarA == oclVar) {
                                        if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                            iif0Var19.r();
                                        } else {
                                            iif0Var19.k();
                                        }
                                        ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var19, true)));
                                        ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var19, false)));
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var19.b)));
                                    } else if (n6sVar7.a() == ocl.c) {
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var19, true)));
                                    }
                                    mly mlyVar5 = mlyVar;
                                    j4b.f(n6sVar7, ijf0Var19, mlyVar5);
                                    vkf0 vkf0VarD2 = n6sVar7.d();
                                    if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                        ukf0 ukf0Var = vkf0VarD2.a;
                                        wff0 wff0Var = new wff0(urrVar);
                                        lk40 lk40VarA = z880.a(urrVar);
                                        lk40 lk40VarP = urrVar.P(urrVar2, false);
                                        if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                            dkf0Var2.b.h(ijf0Var19, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        a8j0Var = a8j0Var2;
                        r16.r(function1113);
                        objY9 = function1113;
                    }
                    d dVarA11117 = v.a(aVar4, (Function1) objY9);
                    mlyVar2 = mlyVar;
                    n6sVar5 = n6sVar4;
                    v5b v5bVar10 = v5bVar2;
                    ujf0Var2 = ujf0Var;
                    iif0Var3 = iif0Var2;
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier8 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                    if (!z2) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                    } else {
                        dVarA2 = aVar4;
                    }
                    zA6 = r16.A(iif0Var3);
                    objY10 = r16.y();
                    if (zA6) {
                        objY10 = new v3b(iif0Var3, 0);
                        r16.r(objY10);
                    } else {
                        objY10 = new v3b(iif0Var3, 0);
                        r16.r(objY10);
                    }
                    xvf.c(iif0Var3, (Function1) objY10, r16);
                    boolean zA111113 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                    if (i14 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zA111113 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                    objY11 = r16.y();
                    if (z21) {
                        objY11 = new Function1() { // from class: w3b
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                n6s n6sVar7 = n6sVar5;
                                if (n6sVar7.b()) {
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar8 = n6sVar7.v;
                                    uhi uhiVar = n6sVar7.w;
                                    dq40 dq40Var = new dq40();
                                    vff0 vff0Var = new vff0(osfVar2, l6sVar8, dq40Var);
                                    ujf0 ujf0Var19 = ujf0Var2;
                                    rk10 rk10Var = ujf0Var19.a;
                                    rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                    ?? dkf0Var2 = new dkf0(ujf0Var19, rk10Var);
                                    ujf0Var19.b.set((dkf0) dkf0Var2);
                                    dq40Var.a = dkf0Var2;
                                    n6sVar7.e = dkf0Var2;
                                }
                                return new i4b();
                            }
                        };
                        r16.r(objY11);
                    } else {
                        objY11 = new Function1() { // from class: w3b
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                n6s n6sVar7 = n6sVar5;
                                if (n6sVar7.b()) {
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar8 = n6sVar7.v;
                                    uhi uhiVar = n6sVar7.w;
                                    dq40 dq40Var = new dq40();
                                    vff0 vff0Var = new vff0(osfVar2, l6sVar8, dq40Var);
                                    ujf0 ujf0Var19 = ujf0Var2;
                                    rk10 rk10Var = ujf0Var19.a;
                                    rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                    ?? dkf0Var2 = new dkf0(ujf0Var19, rk10Var);
                                    ujf0Var19.b.set((dkf0) dkf0Var2);
                                    dq40Var.a = dkf0Var2;
                                    n6sVar7.e = dkf0Var2;
                                }
                                return new i4b();
                            }
                        };
                        r16.r(objY11);
                    }
                    xvf.c(bcnVar, (Function1) objY11, r16);
                    l6s l6sVar8 = n6sVar5.v;
                    if (i == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    chf0 chf0Var8 = new chf0(n6sVar5, iif0Var3, ijf0Var, z21111, z22, mlyVar2, odh0Var, l6sVar8, bcnVar.e);
                    gnn.a aVar15 = gnn.a;
                    d dVarA11118 = c.a(aVar4, aVar15, chf0Var8);
                    i12 = bcnVar.d;
                    if (i12 == 7) {
                        z23 = false;
                    } else {
                        z23 = true;
                    }
                    boolean zBooleanValue8 = ((Boolean) ytwVar.getValue()).booleanValue();
                    zB = r16.b(z23) | r16.A(x5sVar);
                    objY12 = r16.y();
                    if (zB) {
                        objY12 = new Function0() { // from class: j3b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z23) {
                                    x5sVar.i();
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY12);
                    } else {
                        objY12 = new Function0() { // from class: j3b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z23) {
                                    x5sVar.i();
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY12);
                    }
                    d dVarA11119 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue8, z23, (Function0) objY12);
                    j2 = ((j58) r16.O(vl1.a)).a;
                    zA7 = r16.A(n6sVar5) | r16.e(j2);
                    objY13 = r16.y();
                    if (zA7) {
                        objY13 = new Function1() { // from class: i3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar5;
                                if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                    tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY13);
                    } else {
                        objY13 = new Function1() { // from class: i3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar5;
                                if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                    tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY13);
                    }
                    yhf0 yhf0Var9 = yhf0Var;
                    z24 = false;
                    d dVarA111110 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA11119).n(dVarA11115), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA11118), aVar15, new uhf0(yhf0Var9, z2, pswVar)).n(dVarC8).n(coreTextFieldSemanticsModifier8), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar10));
                    if (z2) {
                        z24 = true;
                    }
                    if (z24) {
                        dVarA3 = aVar4;
                    } else {
                        dVarA3 = aVar4;
                    }
                    ?? r1117 = r16;
                    b(dVarA111110, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var9, ijf0Var, uni0Var, dVarA2, dVarA11116, dVarA11117, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r1117), r1117, 384);
                    r15 = r1117;
                }
                if (z5) {
                    rvf rvfVar18 = osfVar.b;
                    rvfVar18.d = -1;
                    rvfVar18.e = -1;
                    ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                } else {
                    rvf rvfVar19 = osfVar.b;
                    rvfVar19.d = -1;
                    rvfVar19.e = -1;
                    ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                }
                ijf0Var2 = osfVar.a;
                osfVar.a = ijf0VarA;
                if (dkf0Var != null) {
                    dkf0Var.a(ijf0Var2, ijf0VarA);
                }
                objY = I.y();
                obj2 = obj;
                if (objY == obj2) {
                    objY = new odh0(0);
                    I.r(objY);
                }
                odh0Var = (odh0) objY;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (odh0Var.f) {
                    odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                    odh0Var.a(ijf0Var);
                } else {
                    l = odh0Var.e;
                    if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                        odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                        odh0Var.a(ijf0Var);
                    }
                }
                objY2 = I.y();
                if (objY2 == obj2) {
                    objY2 = xvf.i(kotlin.coroutines.e.a, I);
                    I.r(objY2);
                }
                v5bVar = (v5b) objY2;
                objY3 = I.y();
                if (objY3 == obj2) {
                    objY3 = new la5();
                    I.r(objY3);
                }
                ia5Var = (ia5) objY3;
                objY4 = I.y();
                if (objY4 == obj2) {
                    objY4 = new iif0(odh0Var);
                    I.r(objY4);
                }
                iif0Var = (iif0) objY4;
                iif0Var.b = mlyVar4;
                iif0Var.f = uni0Var;
                iif0Var.c = n6sVar6.v;
                iif0Var.d = n6sVar6;
                ((x5a0) iif0Var.e).setValue(ijf0Var);
                iif0Var.x = new ulf0(j5);
                iif0Var.h = (ms7) I.O(kna.f);
                iif0Var.i = v5bVar;
                iif0Var.k = (jmf0) I.O(kna.q);
                iif0Var.l = (zdl) I.O(kna.l);
                iif0Var.m = b5iVar;
                boolean z21115 = !z3;
                ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z21115));
                ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                I.N(1966776937);
                q780Var = q780.a;
                cetVar = imf0Var.a.k;
                qyd0 qyd0Var8 = jk10.a;
                I.N(430530635);
                if (Build.VERSION.SDK_INT < 28) {
                    I.H();
                    vj10Var = null;
                } else {
                    context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                    coroutineContext = (CoroutineContext) I.O(jk10.a);
                    zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                    objY5 = I.y();
                    if (zM) {
                        jk10.b.getClass();
                        objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                        I.r(objY5);
                    } else {
                        jk10.b.getClass();
                        objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                        I.r(objY5);
                    }
                    vj10Var = (vj10) objY5;
                    I.H();
                }
                iif0Var.j = vj10Var;
                I.X(false);
                boolean zA111114 = I.A(n6sVar6);
                i7 = i13 & 7168;
                if (i7 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z21116 = zA111114 | z7;
                i8 = i13 & 57344;
                if (i8 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z21117 = z8 | z21116;
                ujf0Var = ujf0Var3;
                boolean zA111115 = z21117 | I.A(ujf0Var);
                if (i14 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i9 = (i13 & 112) ^ 48;
                zA = zA111115 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                Object objY215 = I.y();
                if (zA) {
                    i10 = i7;
                    n6sVar2 = n6sVar6;
                    ?? r1118 = I;
                    bcnVar2 = bcnVar;
                    obj3 = new Function1() { // from class: q3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            vkf0 vkf0VarD;
                            j5i j5iVar = (j5i) obj5;
                            n6s n6sVar7 = n6sVar2;
                            if (n6sVar7.b() == j5iVar.a()) {
                                return Unit.a;
                            }
                            ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                            boolean zB2 = n6sVar7.b();
                            ijf0 ijf0Var19 = ijf0Var;
                            mly mlyVar5 = mlyVar4;
                            if (zB2 && z2 && !z3) {
                                j4b.g(ujf0Var, n6sVar7, ijf0Var19, bcnVar2, mlyVar5);
                            } else {
                                j4b.e(n6sVar7);
                            }
                            if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var19, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                            }
                            if (!j5iVar.a()) {
                                iif0Var.d(null);
                            }
                            return Unit.a;
                        }
                    };
                    z10 = z2;
                    ujf0Var = ujf0Var;
                    iif0Var2 = iif0Var;
                    ia5Var2 = ia5Var;
                    v5bVar2 = v5bVar;
                    ijf0Var3 = ijf0Var;
                    r1118.r(obj3);
                    r16 = r1118;
                } else {
                    i10 = i7;
                    n6sVar2 = n6sVar6;
                    ?? r1119 = I;
                    bcnVar2 = bcnVar;
                    obj3 = new Function1() { // from class: q3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            vkf0 vkf0VarD;
                            j5i j5iVar = (j5i) obj5;
                            n6s n6sVar7 = n6sVar2;
                            if (n6sVar7.b() == j5iVar.a()) {
                                return Unit.a;
                            }
                            ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                            boolean zB2 = n6sVar7.b();
                            ijf0 ijf0Var19 = ijf0Var;
                            mly mlyVar5 = mlyVar4;
                            if (zB2 && z2 && !z3) {
                                j4b.g(ujf0Var, n6sVar7, ijf0Var19, bcnVar2, mlyVar5);
                            } else {
                                j4b.e(n6sVar7);
                            }
                            if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var19, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                            }
                            if (!j5iVar.a()) {
                                iif0Var.d(null);
                            }
                            return Unit.a;
                        }
                    };
                    z10 = z2;
                    ujf0Var = ujf0Var;
                    iif0Var2 = iif0Var;
                    ia5Var2 = ia5Var;
                    v5bVar2 = v5bVar;
                    ijf0Var3 = ijf0Var;
                    r1119.r(obj3);
                    r16 = r1119;
                }
                aVar4 = d.a.b;
                d dVarA111111 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                ytwVarC = m.c(Boolean.valueOf(z11), r16);
                Unit unit8 = Unit.a;
                boolean zM18 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                if (i9 > 32) {
                    n6sVar3 = n6sVar2;
                    if ((r5 & 48) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    n6sVar3 = n6sVar2;
                    if ((r5 & 48) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                z13 = zM18 | z12;
                Object objY216 = r16.y();
                if (z13) {
                    n6sVar4 = n6sVar3;
                    ujf0 ujf0Var19 = ujf0Var;
                    y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var19, iif0Var2, bcnVar, null);
                    ytwVar = ytwVarC;
                    ujf0Var = ujf0Var19;
                    r16.r(y3bVar);
                } else {
                    n6sVar4 = n6sVar3;
                    ujf0 ujf0Var110 = ujf0Var;
                    y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var110, iif0Var2, bcnVar, null);
                    ytwVar = ytwVarC;
                    ujf0Var = ujf0Var110;
                    r16.r(y3bVar);
                }
                xvf.e(r16, unit8, (Function2) y3bVar);
                zA2 = r16.A(n6sVar4);
                objY6 = r16.y();
                if (zA2) {
                    objY6 = new r3b(n6sVar4, 0);
                    r16.r(objY6);
                } else {
                    objY6 = new r3b(n6sVar4, 0);
                    r16.r(objY6);
                }
                dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                boolean zA111116 = r16.A(n6sVar4);
                if (i8 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21118 = zA111116 | z14;
                i11 = i10;
                if (i11 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zA3 = z21118 | z15 | r16.A(r7) | r16.A(iif0Var2);
                objY7 = r16.y();
                if (zA3) {
                    final iif0 iif0Var19 = iif0Var2;
                    mlyVar = r7;
                    final b5i b5iVar17 = b5iVar;
                    Function1 function1114 = new Function1() { // from class: s3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ooa0 ooa0Var2;
                            gly glyVar = (gly) obj5;
                            n6s n6sVar7 = n6sVar4;
                            if (!n6sVar7.b()) {
                                b5i.b(b5iVar17);
                            } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                ooa0Var2.a();
                            }
                            if (n6sVar7.b() && z2) {
                                if (n6sVar7.a() != ocl.b) {
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        long j6 = glyVar.a;
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar9 = n6sVar7.v;
                                        int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                        l6sVar9.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                        if (n6sVar7.a.a.b.length() > 0) {
                                            ((x5a0) n6sVar7.k).setValue(ocl.c);
                                        }
                                    }
                                } else {
                                    iif0Var19.d(glyVar);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    iif0Var2 = iif0Var19;
                    r16.r(function1114);
                    objY7 = function1114;
                } else {
                    final iif0 iif0Var110 = iif0Var2;
                    mlyVar = r7;
                    final b5i b5iVar18 = b5iVar;
                    Function1 function1115 = new Function1() { // from class: s3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ooa0 ooa0Var2;
                            gly glyVar = (gly) obj5;
                            n6s n6sVar7 = n6sVar4;
                            if (!n6sVar7.b()) {
                                b5i.b(b5iVar18);
                            } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                ooa0Var2.a();
                            }
                            if (n6sVar7.b() && z2) {
                                if (n6sVar7.a() != ocl.b) {
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        long j6 = glyVar.a;
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar9 = n6sVar7.v;
                                        int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                        l6sVar9.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                        if (n6sVar7.a.a.b.length() > 0) {
                                            ((x5a0) n6sVar7.k).setValue(ocl.c);
                                        }
                                    }
                                } else {
                                    iif0Var110.d(glyVar);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    iif0Var2 = iif0Var110;
                    r16.r(function1115);
                    objY7 = function1115;
                }
                function3 = (Function1) objY7;
                if (z2) {
                    dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                }
                iif0.b bVar10 = iif0Var2.B;
                iif0.c cVar9 = iif0Var2.A;
                d dVarN9 = dVarA.n(new SuspendPointerInputElement(bVar10, cVar9, null, new l880(bVar10, cVar9), 4));
                g020.a.getClass();
                d dVarC9 = h020.c(dVarN9, j020.b);
                boolean zA111117 = r16.A(n6sVar4);
                if (i14 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zA4 = zA111117 | z16 | r16.A(mlyVar);
                objY8 = r16.y();
                if (zA4) {
                    objY8 = new Function1() { // from class: t3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar4;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                lc6 lc6VarA = tcfVar.F1().a();
                                long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                ukf0 ukf0Var = vkf0VarD.a;
                                zjw zjwVar = ukf0Var.b;
                                tkf0 tkf0Var = ukf0Var.a;
                                b90 b90Var = n6sVar7.y;
                                long j8 = n6sVar7.z;
                                boolean zC = ulf0.c(j6);
                                mly mlyVar5 = mlyVar;
                                if (!zC) {
                                    b90Var.m(j8);
                                    int iB3 = mlyVar5.b(ulf0.f(j6));
                                    int iB4 = mlyVar5.b(ulf0.e(j6));
                                    if (iB3 != iB4) {
                                        lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                    }
                                } else if (ulf0.c(j7)) {
                                    ijf0 ijf0Var19 = ijf0Var3;
                                    if (!ulf0.c(ijf0Var19.b)) {
                                        b90Var.m(j8);
                                        long j9 = ijf0Var19.b;
                                        int iB5 = mlyVar5.b(ulf0.f(j9));
                                        int iB6 = mlyVar5.b(ulf0.e(j9));
                                        if (iB5 != iB6) {
                                            lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                        }
                                    }
                                } else {
                                    long jC = tkf0Var.b.c();
                                    j58 j58Var = new j58(jC);
                                    if (jC == 16) {
                                        j58Var = null;
                                    }
                                    long j10 = j58Var != null ? j58Var.a : j58.b;
                                    b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                    int iB7 = mlyVar5.b(ulf0.f(j7));
                                    int iB8 = mlyVar5.b(ulf0.e(j7));
                                    if (iB7 != iB8) {
                                        lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                    }
                                }
                                boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                if (z30) {
                                    long j11 = ukf0Var.c;
                                    lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    lc6VarA.p();
                                    lc6VarA.i(lk40VarB);
                                }
                                ora0 ora0Var = tkf0Var.b.a;
                                yef0 yef0Var = ora0Var.m;
                                kjf0 kjf0Var = ora0Var.a;
                                if (yef0Var == null) {
                                    yef0Var = yef0.b;
                                }
                                yef0 yef0Var2 = yef0Var;
                                ix80 ix80Var = ora0Var.n;
                                if (ix80Var == null) {
                                    ix80Var = ix80.d;
                                }
                                ix80 ix80Var2 = ix80Var;
                                wcf wcfVar = ora0Var.p;
                                if (wcfVar == null) {
                                    wcfVar = rlh.a;
                                }
                                wcf wcfVar2 = wcfVar;
                                try {
                                    ya5 ya5VarE = kjf0Var.e();
                                    kjf0.a aVar16 = kjf0.a.a;
                                    if (ya5VarE != null) {
                                        gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar16 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                    } else {
                                        zjwVar.i(lc6VarA, kjf0Var != aVar16 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                    }
                                } finally {
                                    if (z30) {
                                        lc6VarA.f();
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY8);
                } else {
                    objY8 = new Function1() { // from class: t3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar4;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                lc6 lc6VarA = tcfVar.F1().a();
                                long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                ukf0 ukf0Var = vkf0VarD.a;
                                zjw zjwVar = ukf0Var.b;
                                tkf0 tkf0Var = ukf0Var.a;
                                b90 b90Var = n6sVar7.y;
                                long j8 = n6sVar7.z;
                                boolean zC = ulf0.c(j6);
                                mly mlyVar5 = mlyVar;
                                if (!zC) {
                                    b90Var.m(j8);
                                    int iB3 = mlyVar5.b(ulf0.f(j6));
                                    int iB4 = mlyVar5.b(ulf0.e(j6));
                                    if (iB3 != iB4) {
                                        lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                    }
                                } else if (ulf0.c(j7)) {
                                    ijf0 ijf0Var19 = ijf0Var3;
                                    if (!ulf0.c(ijf0Var19.b)) {
                                        b90Var.m(j8);
                                        long j9 = ijf0Var19.b;
                                        int iB5 = mlyVar5.b(ulf0.f(j9));
                                        int iB6 = mlyVar5.b(ulf0.e(j9));
                                        if (iB5 != iB6) {
                                            lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                        }
                                    }
                                } else {
                                    long jC = tkf0Var.b.c();
                                    j58 j58Var = new j58(jC);
                                    if (jC == 16) {
                                        j58Var = null;
                                    }
                                    long j10 = j58Var != null ? j58Var.a : j58.b;
                                    b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                    int iB7 = mlyVar5.b(ulf0.f(j7));
                                    int iB8 = mlyVar5.b(ulf0.e(j7));
                                    if (iB7 != iB8) {
                                        lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                    }
                                }
                                boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                if (z30) {
                                    long j11 = ukf0Var.c;
                                    lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    lc6VarA.p();
                                    lc6VarA.i(lk40VarB);
                                }
                                ora0 ora0Var = tkf0Var.b.a;
                                yef0 yef0Var = ora0Var.m;
                                kjf0 kjf0Var = ora0Var.a;
                                if (yef0Var == null) {
                                    yef0Var = yef0.b;
                                }
                                yef0 yef0Var2 = yef0Var;
                                ix80 ix80Var = ora0Var.n;
                                if (ix80Var == null) {
                                    ix80Var = ix80.d;
                                }
                                ix80 ix80Var2 = ix80Var;
                                wcf wcfVar = ora0Var.p;
                                if (wcfVar == null) {
                                    wcfVar = rlh.a;
                                }
                                wcf wcfVar2 = wcfVar;
                                try {
                                    ya5 ya5VarE = kjf0Var.e();
                                    kjf0.a aVar16 = kjf0.a.a;
                                    if (ya5VarE != null) {
                                        gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar16 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                    } else {
                                        zjwVar.i(lc6VarA, kjf0Var != aVar16 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                    }
                                } finally {
                                    if (z30) {
                                        lc6VarA.f();
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY8);
                }
                d dVarA111112 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                boolean zA111118 = r16.A(n6sVar4);
                if (i11 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zM19 = zA111118 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                if (i14 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zA5 = zM19 | z18 | r16.A(mlyVar);
                objY9 = r16.y();
                if (zA5) {
                    final ijf0 ijf0Var19 = ijf0Var3;
                    Function1 function1116 = new Function1() { // from class: u3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            dkf0 dkf0Var2;
                            urr urrVar;
                            urr urrVar2;
                            n6s n6sVar7 = n6sVar4;
                            ytw ytwVar2 = n6sVar7.o;
                            urr urrVar3 = (urr) obj5;
                            n6sVar7.h = urrVar3;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                vkf0VarD.b = urrVar3;
                            }
                            if (z2) {
                                ocl oclVarA = n6sVar7.a();
                                ocl oclVar = ocl.b;
                                iif0 iif0Var111 = iif0Var2;
                                ijf0 ijf0Var110 = ijf0Var19;
                                if (oclVarA == oclVar) {
                                    if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                        iif0Var111.r();
                                    } else {
                                        iif0Var111.k();
                                    }
                                    ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var111, true)));
                                    ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var111, false)));
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var110.b)));
                                } else if (n6sVar7.a() == ocl.c) {
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var111, true)));
                                }
                                mly mlyVar5 = mlyVar;
                                j4b.f(n6sVar7, ijf0Var110, mlyVar5);
                                vkf0 vkf0VarD2 = n6sVar7.d();
                                if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                    ukf0 ukf0Var = vkf0VarD2.a;
                                    wff0 wff0Var = new wff0(urrVar);
                                    lk40 lk40VarA = z880.a(urrVar);
                                    lk40 lk40VarP = urrVar.P(urrVar2, false);
                                    if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                        dkf0Var2.b.h(ijf0Var110, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    a8j0Var = a8j0Var2;
                    r16.r(function1116);
                    objY9 = function1116;
                } else {
                    final ijf0 ijf0Var110 = ijf0Var3;
                    Function1 function1117 = new Function1() { // from class: u3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            dkf0 dkf0Var2;
                            urr urrVar;
                            urr urrVar2;
                            n6s n6sVar7 = n6sVar4;
                            ytw ytwVar2 = n6sVar7.o;
                            urr urrVar3 = (urr) obj5;
                            n6sVar7.h = urrVar3;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                vkf0VarD.b = urrVar3;
                            }
                            if (z2) {
                                ocl oclVarA = n6sVar7.a();
                                ocl oclVar = ocl.b;
                                iif0 iif0Var111 = iif0Var2;
                                ijf0 ijf0Var111 = ijf0Var110;
                                if (oclVarA == oclVar) {
                                    if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                        iif0Var111.r();
                                    } else {
                                        iif0Var111.k();
                                    }
                                    ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var111, true)));
                                    ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var111, false)));
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var111.b)));
                                } else if (n6sVar7.a() == ocl.c) {
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var111, true)));
                                }
                                mly mlyVar5 = mlyVar;
                                j4b.f(n6sVar7, ijf0Var111, mlyVar5);
                                vkf0 vkf0VarD2 = n6sVar7.d();
                                if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                    ukf0 ukf0Var = vkf0VarD2.a;
                                    wff0 wff0Var = new wff0(urrVar);
                                    lk40 lk40VarA = z880.a(urrVar);
                                    lk40 lk40VarP = urrVar.P(urrVar2, false);
                                    if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                        dkf0Var2.b.h(ijf0Var111, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    a8j0Var = a8j0Var2;
                    r16.r(function1117);
                    objY9 = function1117;
                }
                d dVarA111113 = v.a(aVar4, (Function1) objY9);
                mlyVar2 = mlyVar;
                n6sVar5 = n6sVar4;
                v5b v5bVar11 = v5bVar2;
                ujf0Var2 = ujf0Var;
                iif0Var3 = iif0Var2;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier9 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                if (!z2) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                } else {
                    dVarA2 = aVar4;
                }
                zA6 = r16.A(iif0Var3);
                objY10 = r16.y();
                if (zA6) {
                    objY10 = new v3b(iif0Var3, 0);
                    r16.r(objY10);
                } else {
                    objY10 = new v3b(iif0Var3, 0);
                    r16.r(objY10);
                }
                xvf.c(iif0Var3, (Function1) objY10, r16);
                boolean zA111119 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                if (i14 == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = zA111119 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                objY11 = r16.y();
                if (z21) {
                    objY11 = new Function1() { // from class: w3b
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            n6s n6sVar7 = n6sVar5;
                            if (n6sVar7.b()) {
                                osf osfVar2 = n6sVar7.d;
                                l6s l6sVar9 = n6sVar7.v;
                                uhi uhiVar = n6sVar7.w;
                                dq40 dq40Var = new dq40();
                                vff0 vff0Var = new vff0(osfVar2, l6sVar9, dq40Var);
                                ujf0 ujf0Var111 = ujf0Var2;
                                rk10 rk10Var = ujf0Var111.a;
                                rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                ?? dkf0Var2 = new dkf0(ujf0Var111, rk10Var);
                                ujf0Var111.b.set((dkf0) dkf0Var2);
                                dq40Var.a = dkf0Var2;
                                n6sVar7.e = dkf0Var2;
                            }
                            return new i4b();
                        }
                    };
                    r16.r(objY11);
                } else {
                    objY11 = new Function1() { // from class: w3b
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            n6s n6sVar7 = n6sVar5;
                            if (n6sVar7.b()) {
                                osf osfVar2 = n6sVar7.d;
                                l6s l6sVar9 = n6sVar7.v;
                                uhi uhiVar = n6sVar7.w;
                                dq40 dq40Var = new dq40();
                                vff0 vff0Var = new vff0(osfVar2, l6sVar9, dq40Var);
                                ujf0 ujf0Var111 = ujf0Var2;
                                rk10 rk10Var = ujf0Var111.a;
                                rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                ?? dkf0Var2 = new dkf0(ujf0Var111, rk10Var);
                                ujf0Var111.b.set((dkf0) dkf0Var2);
                                dq40Var.a = dkf0Var2;
                                n6sVar7.e = dkf0Var2;
                            }
                            return new i4b();
                        }
                    };
                    r16.r(objY11);
                }
                xvf.c(bcnVar, (Function1) objY11, r16);
                l6s l6sVar9 = n6sVar5.v;
                if (i == 1) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                chf0 chf0Var9 = new chf0(n6sVar5, iif0Var3, ijf0Var, z21115, z22, mlyVar2, odh0Var, l6sVar9, bcnVar.e);
                gnn.a aVar16 = gnn.a;
                d dVarA111114 = c.a(aVar4, aVar16, chf0Var9);
                i12 = bcnVar.d;
                if (i12 == 7) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                boolean zBooleanValue9 = ((Boolean) ytwVar.getValue()).booleanValue();
                zB = r16.b(z23) | r16.A(x5sVar);
                objY12 = r16.y();
                if (zB) {
                    objY12 = new Function0() { // from class: j3b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z23) {
                                x5sVar.i();
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY12);
                } else {
                    objY12 = new Function0() { // from class: j3b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z23) {
                                x5sVar.i();
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY12);
                }
                d dVarA111115 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue9, z23, (Function0) objY12);
                j2 = ((j58) r16.O(vl1.a)).a;
                zA7 = r16.A(n6sVar5) | r16.e(j2);
                objY13 = r16.y();
                if (zA7) {
                    objY13 = new Function1() { // from class: i3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar5;
                            if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY13);
                } else {
                    objY13 = new Function1() { // from class: i3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar5;
                            if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY13);
                }
                yhf0 yhf0Var10 = yhf0Var;
                z24 = false;
                d dVarA111116 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA111115).n(dVarA111111), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA111114), aVar16, new uhf0(yhf0Var10, z2, pswVar)).n(dVarC9).n(coreTextFieldSemanticsModifier9), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar11));
                if (z2) {
                    z24 = true;
                }
                if (z24) {
                    dVarA3 = aVar4;
                } else {
                    dVarA3 = aVar4;
                }
                ?? r11110 = r16;
                b(dVarA111116, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var10, ijf0Var, uni0Var, dVarA2, dVarA111112, dVarA111113, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r11110), r11110, 384);
                r15 = r11110;
            } else {
                obj = obj4;
            }
            aVar3 = aVar7;
            mmdVar2 = mmdVar;
            bff0Var2 = new bff0(nk0Var2, imf0Var2, z, mmdVar2, aVar3, m2gVar);
            if (n6sVar6.a != bff0Var2) {
                n6sVar6.p = true;
            }
            n6sVar6.a = bff0Var2;
            osfVar = n6sVar6.d;
            dkf0Var = n6sVar6.e;
            osfVar.getClass();
            ulf0Var = ijf0Var.c;
            boolean zG3 = Intrinsics.g(ulf0Var, osfVar.b.c());
            str = osfVar.a.a.b;
            nk0Var = ijf0Var.a;
            if (Intrinsics.g(str, nk0Var.b)) {
                osfVar.b = new rvf(nk0Var, j5);
                z5 = true;
            } else {
                if (ulf0.b(osfVar.a.b, j5)) {
                    osfVar.b.h(ulf0.f(j5), ulf0.e(j5));
                    z5 = false;
                    z6 = true;
                } else {
                    z5 = false;
                }
                if (ulf0Var == null) {
                    rvf rvfVar110 = osfVar.b;
                    rvfVar110.d = -1;
                    rvfVar110.e = -1;
                } else {
                    j = ulf0Var.a;
                    if (!ulf0.c(j)) {
                        osfVar.b.g(ulf0.f(j), ulf0.e(j));
                    }
                    if (z5) {
                        rvf rvfVar111 = osfVar.b;
                        rvfVar111.d = -1;
                        rvfVar111.e = -1;
                        ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                    } else {
                        rvf rvfVar112 = osfVar.b;
                        rvfVar112.d = -1;
                        rvfVar112.e = -1;
                        ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                    }
                    ijf0Var2 = osfVar.a;
                    osfVar.a = ijf0VarA;
                    if (dkf0Var != null) {
                        dkf0Var.a(ijf0Var2, ijf0VarA);
                    }
                    objY = I.y();
                    obj2 = obj;
                    if (objY == obj2) {
                        objY = new odh0(0);
                        I.r(objY);
                    }
                    odh0Var = (odh0) objY;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (odh0Var.f) {
                        odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                        odh0Var.a(ijf0Var);
                    } else {
                        l = odh0Var.e;
                        if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                            odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                            odh0Var.a(ijf0Var);
                        }
                    }
                    objY2 = I.y();
                    if (objY2 == obj2) {
                        objY2 = xvf.i(kotlin.coroutines.e.a, I);
                        I.r(objY2);
                    }
                    v5bVar = (v5b) objY2;
                    objY3 = I.y();
                    if (objY3 == obj2) {
                        objY3 = new la5();
                        I.r(objY3);
                    }
                    ia5Var = (ia5) objY3;
                    objY4 = I.y();
                    if (objY4 == obj2) {
                        objY4 = new iif0(odh0Var);
                        I.r(objY4);
                    }
                    iif0Var = (iif0) objY4;
                    iif0Var.b = mlyVar4;
                    iif0Var.f = uni0Var;
                    iif0Var.c = n6sVar6.v;
                    iif0Var.d = n6sVar6;
                    ((x5a0) iif0Var.e).setValue(ijf0Var);
                    iif0Var.x = new ulf0(j5);
                    iif0Var.h = (ms7) I.O(kna.f);
                    iif0Var.i = v5bVar;
                    iif0Var.k = (jmf0) I.O(kna.q);
                    iif0Var.l = (zdl) I.O(kna.l);
                    iif0Var.m = b5iVar;
                    boolean z21119 = !z3;
                    ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z21119));
                    ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                    I.N(1966776937);
                    q780Var = q780.a;
                    cetVar = imf0Var.a.k;
                    qyd0 qyd0Var9 = jk10.a;
                    I.N(430530635);
                    if (Build.VERSION.SDK_INT < 28) {
                        I.H();
                        vj10Var = null;
                    } else {
                        context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                        coroutineContext = (CoroutineContext) I.O(jk10.a);
                        zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                        objY5 = I.y();
                        if (zM) {
                            jk10.b.getClass();
                            objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                            I.r(objY5);
                        } else {
                            jk10.b.getClass();
                            objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                            I.r(objY5);
                        }
                        vj10Var = (vj10) objY5;
                        I.H();
                    }
                    iif0Var.j = vj10Var;
                    I.X(false);
                    boolean zA1111110 = I.A(n6sVar6);
                    i7 = i13 & 7168;
                    if (i7 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z211110 = zA1111110 | z7;
                    i8 = i13 & 57344;
                    if (i8 == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z211111 = z8 | z211110;
                    ujf0Var = ujf0Var3;
                    boolean zA1111111 = z211111 | I.A(ujf0Var);
                    if (i14 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i9 = (i13 & 112) ^ 48;
                    zA = zA1111111 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                    Object objY217 = I.y();
                    if (zA) {
                        i10 = i7;
                        n6sVar2 = n6sVar6;
                        ?? r11111 = I;
                        bcnVar2 = bcnVar;
                        obj3 = new Function1() { // from class: q3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                vkf0 vkf0VarD;
                                j5i j5iVar = (j5i) obj5;
                                n6s n6sVar7 = n6sVar2;
                                if (n6sVar7.b() == j5iVar.a()) {
                                    return Unit.a;
                                }
                                ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                boolean zB2 = n6sVar7.b();
                                ijf0 ijf0Var111 = ijf0Var;
                                mly mlyVar5 = mlyVar4;
                                if (zB2 && z2 && !z3) {
                                    j4b.g(ujf0Var, n6sVar7, ijf0Var111, bcnVar2, mlyVar5);
                                } else {
                                    j4b.e(n6sVar7);
                                }
                                if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                    ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var111, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                }
                                if (!j5iVar.a()) {
                                    iif0Var.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        z10 = z2;
                        ujf0Var = ujf0Var;
                        iif0Var2 = iif0Var;
                        ia5Var2 = ia5Var;
                        v5bVar2 = v5bVar;
                        ijf0Var3 = ijf0Var;
                        r11111.r(obj3);
                        r16 = r11111;
                    } else {
                        i10 = i7;
                        n6sVar2 = n6sVar6;
                        ?? r11112 = I;
                        bcnVar2 = bcnVar;
                        obj3 = new Function1() { // from class: q3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                vkf0 vkf0VarD;
                                j5i j5iVar = (j5i) obj5;
                                n6s n6sVar7 = n6sVar2;
                                if (n6sVar7.b() == j5iVar.a()) {
                                    return Unit.a;
                                }
                                ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                                boolean zB2 = n6sVar7.b();
                                ijf0 ijf0Var111 = ijf0Var;
                                mly mlyVar5 = mlyVar4;
                                if (zB2 && z2 && !z3) {
                                    j4b.g(ujf0Var, n6sVar7, ijf0Var111, bcnVar2, mlyVar5);
                                } else {
                                    j4b.e(n6sVar7);
                                }
                                if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                    ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var111, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                                }
                                if (!j5iVar.a()) {
                                    iif0Var.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        z10 = z2;
                        ujf0Var = ujf0Var;
                        iif0Var2 = iif0Var;
                        ia5Var2 = ia5Var;
                        v5bVar2 = v5bVar;
                        ijf0Var3 = ijf0Var;
                        r11112.r(obj3);
                        r16 = r11112;
                    }
                    aVar4 = d.a.b;
                    d dVarA111117 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    ytwVarC = m.c(Boolean.valueOf(z11), r16);
                    Unit unit9 = Unit.a;
                    boolean zM110 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                    if (i9 > 32) {
                        n6sVar3 = n6sVar2;
                        if ((r5 & 48) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        n6sVar3 = n6sVar2;
                        if ((r5 & 48) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    z13 = zM110 | z12;
                    Object objY218 = r16.y();
                    if (z13) {
                        n6sVar4 = n6sVar3;
                        ujf0 ujf0Var111 = ujf0Var;
                        y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var111, iif0Var2, bcnVar, null);
                        ytwVar = ytwVarC;
                        ujf0Var = ujf0Var111;
                        r16.r(y3bVar);
                    } else {
                        n6sVar4 = n6sVar3;
                        ujf0 ujf0Var112 = ujf0Var;
                        y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var112, iif0Var2, bcnVar, null);
                        ytwVar = ytwVarC;
                        ujf0Var = ujf0Var112;
                        r16.r(y3bVar);
                    }
                    xvf.e(r16, unit9, (Function2) y3bVar);
                    zA2 = r16.A(n6sVar4);
                    objY6 = r16.y();
                    if (zA2) {
                        objY6 = new r3b(n6sVar4, 0);
                        r16.r(objY6);
                    } else {
                        objY6 = new r3b(n6sVar4, 0);
                        r16.r(objY6);
                    }
                    dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                    boolean zA1111112 = r16.A(n6sVar4);
                    if (i8 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z211112 = zA1111112 | z14;
                    i11 = i10;
                    if (i11 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zA3 = z211112 | z15 | r16.A(r7) | r16.A(iif0Var2);
                    objY7 = r16.y();
                    if (zA3) {
                        final iif0 iif0Var111 = iif0Var2;
                        mlyVar = r7;
                        final b5i b5iVar19 = b5iVar;
                        Function1 function1118 = new Function1() { // from class: s3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ooa0 ooa0Var2;
                                gly glyVar = (gly) obj5;
                                n6s n6sVar7 = n6sVar4;
                                if (!n6sVar7.b()) {
                                    b5i.b(b5iVar19);
                                } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                    ooa0Var2.a();
                                }
                                if (n6sVar7.b() && z2) {
                                    if (n6sVar7.a() != ocl.b) {
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            long j6 = glyVar.a;
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar10 = n6sVar7.v;
                                            int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                            l6sVar10.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                            if (n6sVar7.a.a.b.length() > 0) {
                                                ((x5a0) n6sVar7.k).setValue(ocl.c);
                                            }
                                        }
                                    } else {
                                        iif0Var111.d(glyVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        iif0Var2 = iif0Var111;
                        r16.r(function1118);
                        objY7 = function1118;
                    } else {
                        final iif0 iif0Var112 = iif0Var2;
                        mlyVar = r7;
                        final b5i b5iVar110 = b5iVar;
                        Function1 function1119 = new Function1() { // from class: s3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ooa0 ooa0Var2;
                                gly glyVar = (gly) obj5;
                                n6s n6sVar7 = n6sVar4;
                                if (!n6sVar7.b()) {
                                    b5i.b(b5iVar110);
                                } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                    ooa0Var2.a();
                                }
                                if (n6sVar7.b() && z2) {
                                    if (n6sVar7.a() != ocl.b) {
                                        vkf0 vkf0VarD = n6sVar7.d();
                                        if (vkf0VarD != null) {
                                            long j6 = glyVar.a;
                                            osf osfVar2 = n6sVar7.d;
                                            l6s l6sVar10 = n6sVar7.v;
                                            int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                            l6sVar10.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                            if (n6sVar7.a.a.b.length() > 0) {
                                                ((x5a0) n6sVar7.k).setValue(ocl.c);
                                            }
                                        }
                                    } else {
                                        iif0Var112.d(glyVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        iif0Var2 = iif0Var112;
                        r16.r(function1119);
                        objY7 = function1119;
                    }
                    function3 = (Function1) objY7;
                    if (z2) {
                        dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                    }
                    iif0.b bVar11 = iif0Var2.B;
                    iif0.c cVar10 = iif0Var2.A;
                    d dVarN10 = dVarA.n(new SuspendPointerInputElement(bVar11, cVar10, null, new l880(bVar11, cVar10), 4));
                    g020.a.getClass();
                    d dVarC10 = h020.c(dVarN10, j020.b);
                    boolean zA1111113 = r16.A(n6sVar4);
                    if (i14 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zA4 = zA1111113 | z16 | r16.A(mlyVar);
                    objY8 = r16.y();
                    if (zA4) {
                        objY8 = new Function1() { // from class: t3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar4;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    lc6 lc6VarA = tcfVar.F1().a();
                                    long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                    long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    tkf0 tkf0Var = ukf0Var.a;
                                    b90 b90Var = n6sVar7.y;
                                    long j8 = n6sVar7.z;
                                    boolean zC = ulf0.c(j6);
                                    mly mlyVar5 = mlyVar;
                                    if (!zC) {
                                        b90Var.m(j8);
                                        int iB3 = mlyVar5.b(ulf0.f(j6));
                                        int iB4 = mlyVar5.b(ulf0.e(j6));
                                        if (iB3 != iB4) {
                                            lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                        }
                                    } else if (ulf0.c(j7)) {
                                        ijf0 ijf0Var111 = ijf0Var3;
                                        if (!ulf0.c(ijf0Var111.b)) {
                                            b90Var.m(j8);
                                            long j9 = ijf0Var111.b;
                                            int iB5 = mlyVar5.b(ulf0.f(j9));
                                            int iB6 = mlyVar5.b(ulf0.e(j9));
                                            if (iB5 != iB6) {
                                                lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                            }
                                        }
                                    } else {
                                        long jC = tkf0Var.b.c();
                                        j58 j58Var = new j58(jC);
                                        if (jC == 16) {
                                            j58Var = null;
                                        }
                                        long j10 = j58Var != null ? j58Var.a : j58.b;
                                        b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                        int iB7 = mlyVar5.b(ulf0.f(j7));
                                        int iB8 = mlyVar5.b(ulf0.e(j7));
                                        if (iB7 != iB8) {
                                            lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                        }
                                    }
                                    boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                    if (z30) {
                                        long j11 = ukf0Var.c;
                                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        lc6VarA.p();
                                        lc6VarA.i(lk40VarB);
                                    }
                                    ora0 ora0Var = tkf0Var.b.a;
                                    yef0 yef0Var = ora0Var.m;
                                    kjf0 kjf0Var = ora0Var.a;
                                    if (yef0Var == null) {
                                        yef0Var = yef0.b;
                                    }
                                    yef0 yef0Var2 = yef0Var;
                                    ix80 ix80Var = ora0Var.n;
                                    if (ix80Var == null) {
                                        ix80Var = ix80.d;
                                    }
                                    ix80 ix80Var2 = ix80Var;
                                    wcf wcfVar = ora0Var.p;
                                    if (wcfVar == null) {
                                        wcfVar = rlh.a;
                                    }
                                    wcf wcfVar2 = wcfVar;
                                    try {
                                        ya5 ya5VarE = kjf0Var.e();
                                        kjf0.a aVar17 = kjf0.a.a;
                                        if (ya5VarE != null) {
                                            gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar17 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                        } else {
                                            zjwVar.i(lc6VarA, kjf0Var != aVar17 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                        }
                                    } finally {
                                        if (z30) {
                                            lc6VarA.f();
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY8);
                    } else {
                        objY8 = new Function1() { // from class: t3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar4;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    lc6 lc6VarA = tcfVar.F1().a();
                                    long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                    long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    tkf0 tkf0Var = ukf0Var.a;
                                    b90 b90Var = n6sVar7.y;
                                    long j8 = n6sVar7.z;
                                    boolean zC = ulf0.c(j6);
                                    mly mlyVar5 = mlyVar;
                                    if (!zC) {
                                        b90Var.m(j8);
                                        int iB3 = mlyVar5.b(ulf0.f(j6));
                                        int iB4 = mlyVar5.b(ulf0.e(j6));
                                        if (iB3 != iB4) {
                                            lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                        }
                                    } else if (ulf0.c(j7)) {
                                        ijf0 ijf0Var111 = ijf0Var3;
                                        if (!ulf0.c(ijf0Var111.b)) {
                                            b90Var.m(j8);
                                            long j9 = ijf0Var111.b;
                                            int iB5 = mlyVar5.b(ulf0.f(j9));
                                            int iB6 = mlyVar5.b(ulf0.e(j9));
                                            if (iB5 != iB6) {
                                                lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                            }
                                        }
                                    } else {
                                        long jC = tkf0Var.b.c();
                                        j58 j58Var = new j58(jC);
                                        if (jC == 16) {
                                            j58Var = null;
                                        }
                                        long j10 = j58Var != null ? j58Var.a : j58.b;
                                        b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                        int iB7 = mlyVar5.b(ulf0.f(j7));
                                        int iB8 = mlyVar5.b(ulf0.e(j7));
                                        if (iB7 != iB8) {
                                            lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                        }
                                    }
                                    boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                    if (z30) {
                                        long j11 = ukf0Var.c;
                                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        lc6VarA.p();
                                        lc6VarA.i(lk40VarB);
                                    }
                                    ora0 ora0Var = tkf0Var.b.a;
                                    yef0 yef0Var = ora0Var.m;
                                    kjf0 kjf0Var = ora0Var.a;
                                    if (yef0Var == null) {
                                        yef0Var = yef0.b;
                                    }
                                    yef0 yef0Var2 = yef0Var;
                                    ix80 ix80Var = ora0Var.n;
                                    if (ix80Var == null) {
                                        ix80Var = ix80.d;
                                    }
                                    ix80 ix80Var2 = ix80Var;
                                    wcf wcfVar = ora0Var.p;
                                    if (wcfVar == null) {
                                        wcfVar = rlh.a;
                                    }
                                    wcf wcfVar2 = wcfVar;
                                    try {
                                        ya5 ya5VarE = kjf0Var.e();
                                        kjf0.a aVar17 = kjf0.a.a;
                                        if (ya5VarE != null) {
                                            gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar17 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                        } else {
                                            zjwVar.i(lc6VarA, kjf0Var != aVar17 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                        }
                                    } finally {
                                        if (z30) {
                                            lc6VarA.f();
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY8);
                    }
                    d dVarA111118 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                    boolean zA1111114 = r16.A(n6sVar4);
                    if (i11 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zM111 = zA1111114 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                    if (i14 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zA5 = zM111 | z18 | r16.A(mlyVar);
                    objY9 = r16.y();
                    if (zA5) {
                        final ijf0 ijf0Var111 = ijf0Var3;
                        Function1 function11110 = new Function1() { // from class: u3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                dkf0 dkf0Var2;
                                urr urrVar;
                                urr urrVar2;
                                n6s n6sVar7 = n6sVar4;
                                ytw ytwVar2 = n6sVar7.o;
                                urr urrVar3 = (urr) obj5;
                                n6sVar7.h = urrVar3;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    vkf0VarD.b = urrVar3;
                                }
                                if (z2) {
                                    ocl oclVarA = n6sVar7.a();
                                    ocl oclVar = ocl.b;
                                    iif0 iif0Var113 = iif0Var2;
                                    ijf0 ijf0Var112 = ijf0Var111;
                                    if (oclVarA == oclVar) {
                                        if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                            iif0Var113.r();
                                        } else {
                                            iif0Var113.k();
                                        }
                                        ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var113, true)));
                                        ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var113, false)));
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var112.b)));
                                    } else if (n6sVar7.a() == ocl.c) {
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var113, true)));
                                    }
                                    mly mlyVar5 = mlyVar;
                                    j4b.f(n6sVar7, ijf0Var112, mlyVar5);
                                    vkf0 vkf0VarD2 = n6sVar7.d();
                                    if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                        ukf0 ukf0Var = vkf0VarD2.a;
                                        wff0 wff0Var = new wff0(urrVar);
                                        lk40 lk40VarA = z880.a(urrVar);
                                        lk40 lk40VarP = urrVar.P(urrVar2, false);
                                        if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                            dkf0Var2.b.h(ijf0Var112, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        a8j0Var = a8j0Var2;
                        r16.r(function11110);
                        objY9 = function11110;
                    } else {
                        final ijf0 ijf0Var112 = ijf0Var3;
                        Function1 function11111 = new Function1() { // from class: u3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                dkf0 dkf0Var2;
                                urr urrVar;
                                urr urrVar2;
                                n6s n6sVar7 = n6sVar4;
                                ytw ytwVar2 = n6sVar7.o;
                                urr urrVar3 = (urr) obj5;
                                n6sVar7.h = urrVar3;
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    vkf0VarD.b = urrVar3;
                                }
                                if (z2) {
                                    ocl oclVarA = n6sVar7.a();
                                    ocl oclVar = ocl.b;
                                    iif0 iif0Var113 = iif0Var2;
                                    ijf0 ijf0Var113 = ijf0Var112;
                                    if (oclVarA == oclVar) {
                                        if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                            iif0Var113.r();
                                        } else {
                                            iif0Var113.k();
                                        }
                                        ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var113, true)));
                                        ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var113, false)));
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var113.b)));
                                    } else if (n6sVar7.a() == ocl.c) {
                                        ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var113, true)));
                                    }
                                    mly mlyVar5 = mlyVar;
                                    j4b.f(n6sVar7, ijf0Var113, mlyVar5);
                                    vkf0 vkf0VarD2 = n6sVar7.d();
                                    if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                        ukf0 ukf0Var = vkf0VarD2.a;
                                        wff0 wff0Var = new wff0(urrVar);
                                        lk40 lk40VarA = z880.a(urrVar);
                                        lk40 lk40VarP = urrVar.P(urrVar2, false);
                                        if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                            dkf0Var2.b.h(ijf0Var113, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        a8j0Var = a8j0Var2;
                        r16.r(function11111);
                        objY9 = function11111;
                    }
                    d dVarA111119 = v.a(aVar4, (Function1) objY9);
                    mlyVar2 = mlyVar;
                    n6sVar5 = n6sVar4;
                    v5b v5bVar12 = v5bVar2;
                    ujf0Var2 = ujf0Var;
                    iif0Var3 = iif0Var2;
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier10 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                    if (!z2) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                    } else {
                        dVarA2 = aVar4;
                    }
                    zA6 = r16.A(iif0Var3);
                    objY10 = r16.y();
                    if (zA6) {
                        objY10 = new v3b(iif0Var3, 0);
                        r16.r(objY10);
                    } else {
                        objY10 = new v3b(iif0Var3, 0);
                        r16.r(objY10);
                    }
                    xvf.c(iif0Var3, (Function1) objY10, r16);
                    boolean zA1111115 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                    if (i14 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zA1111115 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                    objY11 = r16.y();
                    if (z21) {
                        objY11 = new Function1() { // from class: w3b
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                n6s n6sVar7 = n6sVar5;
                                if (n6sVar7.b()) {
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar10 = n6sVar7.v;
                                    uhi uhiVar = n6sVar7.w;
                                    dq40 dq40Var = new dq40();
                                    vff0 vff0Var = new vff0(osfVar2, l6sVar10, dq40Var);
                                    ujf0 ujf0Var113 = ujf0Var2;
                                    rk10 rk10Var = ujf0Var113.a;
                                    rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                    ?? dkf0Var2 = new dkf0(ujf0Var113, rk10Var);
                                    ujf0Var113.b.set((dkf0) dkf0Var2);
                                    dq40Var.a = dkf0Var2;
                                    n6sVar7.e = dkf0Var2;
                                }
                                return new i4b();
                            }
                        };
                        r16.r(objY11);
                    } else {
                        objY11 = new Function1() { // from class: w3b
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                n6s n6sVar7 = n6sVar5;
                                if (n6sVar7.b()) {
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar10 = n6sVar7.v;
                                    uhi uhiVar = n6sVar7.w;
                                    dq40 dq40Var = new dq40();
                                    vff0 vff0Var = new vff0(osfVar2, l6sVar10, dq40Var);
                                    ujf0 ujf0Var113 = ujf0Var2;
                                    rk10 rk10Var = ujf0Var113.a;
                                    rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                    ?? dkf0Var2 = new dkf0(ujf0Var113, rk10Var);
                                    ujf0Var113.b.set((dkf0) dkf0Var2);
                                    dq40Var.a = dkf0Var2;
                                    n6sVar7.e = dkf0Var2;
                                }
                                return new i4b();
                            }
                        };
                        r16.r(objY11);
                    }
                    xvf.c(bcnVar, (Function1) objY11, r16);
                    l6s l6sVar10 = n6sVar5.v;
                    if (i == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    chf0 chf0Var10 = new chf0(n6sVar5, iif0Var3, ijf0Var, z21119, z22, mlyVar2, odh0Var, l6sVar10, bcnVar.e);
                    gnn.a aVar17 = gnn.a;
                    d dVarA1111110 = c.a(aVar4, aVar17, chf0Var10);
                    i12 = bcnVar.d;
                    if (i12 == 7) {
                        z23 = false;
                    } else {
                        z23 = true;
                    }
                    boolean zBooleanValue10 = ((Boolean) ytwVar.getValue()).booleanValue();
                    zB = r16.b(z23) | r16.A(x5sVar);
                    objY12 = r16.y();
                    if (zB) {
                        objY12 = new Function0() { // from class: j3b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z23) {
                                    x5sVar.i();
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY12);
                    } else {
                        objY12 = new Function0() { // from class: j3b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z23) {
                                    x5sVar.i();
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY12);
                    }
                    d dVarA1111111 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue10, z23, (Function0) objY12);
                    j2 = ((j58) r16.O(vl1.a)).a;
                    zA7 = r16.A(n6sVar5) | r16.e(j2);
                    objY13 = r16.y();
                    if (zA7) {
                        objY13 = new Function1() { // from class: i3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar5;
                                if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                    tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY13);
                    } else {
                        objY13 = new Function1() { // from class: i3b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                n6s n6sVar7 = n6sVar5;
                                if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                    tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                }
                                return Unit.a;
                            }
                        };
                        r16.r(objY13);
                    }
                    yhf0 yhf0Var11 = yhf0Var;
                    z24 = false;
                    d dVarA1111112 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA1111111).n(dVarA111117), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA1111110), aVar17, new uhf0(yhf0Var11, z2, pswVar)).n(dVarC10).n(coreTextFieldSemanticsModifier10), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar12));
                    if (z2) {
                        z24 = true;
                    }
                    if (z24) {
                        dVarA3 = aVar4;
                    } else {
                        dVarA3 = aVar4;
                    }
                    ?? r11113 = r16;
                    b(dVarA1111112, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var11, ijf0Var, uni0Var, dVarA2, dVarA111118, dVarA111119, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r11113), r11113, 384);
                    r15 = r11113;
                }
                if (z5) {
                    rvf rvfVar113 = osfVar.b;
                    rvfVar113.d = -1;
                    rvfVar113.e = -1;
                    ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                } else {
                    rvf rvfVar114 = osfVar.b;
                    rvfVar114.d = -1;
                    rvfVar114.e = -1;
                    ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                }
                ijf0Var2 = osfVar.a;
                osfVar.a = ijf0VarA;
                if (dkf0Var != null) {
                    dkf0Var.a(ijf0Var2, ijf0VarA);
                }
                objY = I.y();
                obj2 = obj;
                if (objY == obj2) {
                    objY = new odh0(0);
                    I.r(objY);
                }
                odh0Var = (odh0) objY;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (odh0Var.f) {
                    odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                    odh0Var.a(ijf0Var);
                } else {
                    l = odh0Var.e;
                    if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                        odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                        odh0Var.a(ijf0Var);
                    }
                }
                objY2 = I.y();
                if (objY2 == obj2) {
                    objY2 = xvf.i(kotlin.coroutines.e.a, I);
                    I.r(objY2);
                }
                v5bVar = (v5b) objY2;
                objY3 = I.y();
                if (objY3 == obj2) {
                    objY3 = new la5();
                    I.r(objY3);
                }
                ia5Var = (ia5) objY3;
                objY4 = I.y();
                if (objY4 == obj2) {
                    objY4 = new iif0(odh0Var);
                    I.r(objY4);
                }
                iif0Var = (iif0) objY4;
                iif0Var.b = mlyVar4;
                iif0Var.f = uni0Var;
                iif0Var.c = n6sVar6.v;
                iif0Var.d = n6sVar6;
                ((x5a0) iif0Var.e).setValue(ijf0Var);
                iif0Var.x = new ulf0(j5);
                iif0Var.h = (ms7) I.O(kna.f);
                iif0Var.i = v5bVar;
                iif0Var.k = (jmf0) I.O(kna.q);
                iif0Var.l = (zdl) I.O(kna.l);
                iif0Var.m = b5iVar;
                boolean z211113 = !z3;
                ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z211113));
                ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                I.N(1966776937);
                q780Var = q780.a;
                cetVar = imf0Var.a.k;
                qyd0 qyd0Var10 = jk10.a;
                I.N(430530635);
                if (Build.VERSION.SDK_INT < 28) {
                    I.H();
                    vj10Var = null;
                } else {
                    context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                    coroutineContext = (CoroutineContext) I.O(jk10.a);
                    zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                    objY5 = I.y();
                    if (zM) {
                        jk10.b.getClass();
                        objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                        I.r(objY5);
                    } else {
                        jk10.b.getClass();
                        objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                        I.r(objY5);
                    }
                    vj10Var = (vj10) objY5;
                    I.H();
                }
                iif0Var.j = vj10Var;
                I.X(false);
                boolean zA1111116 = I.A(n6sVar6);
                i7 = i13 & 7168;
                if (i7 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z211114 = zA1111116 | z7;
                i8 = i13 & 57344;
                if (i8 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z211115 = z8 | z211114;
                ujf0Var = ujf0Var3;
                boolean zA1111117 = z211115 | I.A(ujf0Var);
                if (i14 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i9 = (i13 & 112) ^ 48;
                zA = zA1111117 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                Object objY219 = I.y();
                if (zA) {
                    i10 = i7;
                    n6sVar2 = n6sVar6;
                    ?? r11114 = I;
                    bcnVar2 = bcnVar;
                    obj3 = new Function1() { // from class: q3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            vkf0 vkf0VarD;
                            j5i j5iVar = (j5i) obj5;
                            n6s n6sVar7 = n6sVar2;
                            if (n6sVar7.b() == j5iVar.a()) {
                                return Unit.a;
                            }
                            ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                            boolean zB2 = n6sVar7.b();
                            ijf0 ijf0Var113 = ijf0Var;
                            mly mlyVar5 = mlyVar4;
                            if (zB2 && z2 && !z3) {
                                j4b.g(ujf0Var, n6sVar7, ijf0Var113, bcnVar2, mlyVar5);
                            } else {
                                j4b.e(n6sVar7);
                            }
                            if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var113, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                            }
                            if (!j5iVar.a()) {
                                iif0Var.d(null);
                            }
                            return Unit.a;
                        }
                    };
                    z10 = z2;
                    ujf0Var = ujf0Var;
                    iif0Var2 = iif0Var;
                    ia5Var2 = ia5Var;
                    v5bVar2 = v5bVar;
                    ijf0Var3 = ijf0Var;
                    r11114.r(obj3);
                    r16 = r11114;
                } else {
                    i10 = i7;
                    n6sVar2 = n6sVar6;
                    ?? r11115 = I;
                    bcnVar2 = bcnVar;
                    obj3 = new Function1() { // from class: q3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            vkf0 vkf0VarD;
                            j5i j5iVar = (j5i) obj5;
                            n6s n6sVar7 = n6sVar2;
                            if (n6sVar7.b() == j5iVar.a()) {
                                return Unit.a;
                            }
                            ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                            boolean zB2 = n6sVar7.b();
                            ijf0 ijf0Var113 = ijf0Var;
                            mly mlyVar5 = mlyVar4;
                            if (zB2 && z2 && !z3) {
                                j4b.g(ujf0Var, n6sVar7, ijf0Var113, bcnVar2, mlyVar5);
                            } else {
                                j4b.e(n6sVar7);
                            }
                            if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var113, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                            }
                            if (!j5iVar.a()) {
                                iif0Var.d(null);
                            }
                            return Unit.a;
                        }
                    };
                    z10 = z2;
                    ujf0Var = ujf0Var;
                    iif0Var2 = iif0Var;
                    ia5Var2 = ia5Var;
                    v5bVar2 = v5bVar;
                    ijf0Var3 = ijf0Var;
                    r11115.r(obj3);
                    r16 = r11115;
                }
                aVar4 = d.a.b;
                d dVarA1111113 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                ytwVarC = m.c(Boolean.valueOf(z11), r16);
                Unit unit10 = Unit.a;
                boolean zM112 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                if (i9 > 32) {
                    n6sVar3 = n6sVar2;
                    if ((r5 & 48) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    n6sVar3 = n6sVar2;
                    if ((r5 & 48) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                z13 = zM112 | z12;
                Object objY2110 = r16.y();
                if (z13) {
                    n6sVar4 = n6sVar3;
                    ujf0 ujf0Var113 = ujf0Var;
                    y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var113, iif0Var2, bcnVar, null);
                    ytwVar = ytwVarC;
                    ujf0Var = ujf0Var113;
                    r16.r(y3bVar);
                } else {
                    n6sVar4 = n6sVar3;
                    ujf0 ujf0Var114 = ujf0Var;
                    y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var114, iif0Var2, bcnVar, null);
                    ytwVar = ytwVarC;
                    ujf0Var = ujf0Var114;
                    r16.r(y3bVar);
                }
                xvf.e(r16, unit10, (Function2) y3bVar);
                zA2 = r16.A(n6sVar4);
                objY6 = r16.y();
                if (zA2) {
                    objY6 = new r3b(n6sVar4, 0);
                    r16.r(objY6);
                } else {
                    objY6 = new r3b(n6sVar4, 0);
                    r16.r(objY6);
                }
                dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                boolean zA1111118 = r16.A(n6sVar4);
                if (i8 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z211116 = zA1111118 | z14;
                i11 = i10;
                if (i11 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zA3 = z211116 | z15 | r16.A(r7) | r16.A(iif0Var2);
                objY7 = r16.y();
                if (zA3) {
                    final iif0 iif0Var113 = iif0Var2;
                    mlyVar = r7;
                    final b5i b5iVar111 = b5iVar;
                    Function1 function11112 = new Function1() { // from class: s3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ooa0 ooa0Var2;
                            gly glyVar = (gly) obj5;
                            n6s n6sVar7 = n6sVar4;
                            if (!n6sVar7.b()) {
                                b5i.b(b5iVar111);
                            } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                ooa0Var2.a();
                            }
                            if (n6sVar7.b() && z2) {
                                if (n6sVar7.a() != ocl.b) {
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        long j6 = glyVar.a;
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar11 = n6sVar7.v;
                                        int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                        l6sVar11.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                        if (n6sVar7.a.a.b.length() > 0) {
                                            ((x5a0) n6sVar7.k).setValue(ocl.c);
                                        }
                                    }
                                } else {
                                    iif0Var113.d(glyVar);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    iif0Var2 = iif0Var113;
                    r16.r(function11112);
                    objY7 = function11112;
                } else {
                    final iif0 iif0Var114 = iif0Var2;
                    mlyVar = r7;
                    final b5i b5iVar112 = b5iVar;
                    Function1 function11113 = new Function1() { // from class: s3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ooa0 ooa0Var2;
                            gly glyVar = (gly) obj5;
                            n6s n6sVar7 = n6sVar4;
                            if (!n6sVar7.b()) {
                                b5i.b(b5iVar112);
                            } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                ooa0Var2.a();
                            }
                            if (n6sVar7.b() && z2) {
                                if (n6sVar7.a() != ocl.b) {
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        long j6 = glyVar.a;
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar11 = n6sVar7.v;
                                        int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                        l6sVar11.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                        if (n6sVar7.a.a.b.length() > 0) {
                                            ((x5a0) n6sVar7.k).setValue(ocl.c);
                                        }
                                    }
                                } else {
                                    iif0Var114.d(glyVar);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    iif0Var2 = iif0Var114;
                    r16.r(function11113);
                    objY7 = function11113;
                }
                function3 = (Function1) objY7;
                if (z2) {
                    dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                }
                iif0.b bVar12 = iif0Var2.B;
                iif0.c cVar11 = iif0Var2.A;
                d dVarN11 = dVarA.n(new SuspendPointerInputElement(bVar12, cVar11, null, new l880(bVar12, cVar11), 4));
                g020.a.getClass();
                d dVarC11 = h020.c(dVarN11, j020.b);
                boolean zA1111119 = r16.A(n6sVar4);
                if (i14 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zA4 = zA1111119 | z16 | r16.A(mlyVar);
                objY8 = r16.y();
                if (zA4) {
                    objY8 = new Function1() { // from class: t3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar4;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                lc6 lc6VarA = tcfVar.F1().a();
                                long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                ukf0 ukf0Var = vkf0VarD.a;
                                zjw zjwVar = ukf0Var.b;
                                tkf0 tkf0Var = ukf0Var.a;
                                b90 b90Var = n6sVar7.y;
                                long j8 = n6sVar7.z;
                                boolean zC = ulf0.c(j6);
                                mly mlyVar5 = mlyVar;
                                if (!zC) {
                                    b90Var.m(j8);
                                    int iB3 = mlyVar5.b(ulf0.f(j6));
                                    int iB4 = mlyVar5.b(ulf0.e(j6));
                                    if (iB3 != iB4) {
                                        lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                    }
                                } else if (ulf0.c(j7)) {
                                    ijf0 ijf0Var113 = ijf0Var3;
                                    if (!ulf0.c(ijf0Var113.b)) {
                                        b90Var.m(j8);
                                        long j9 = ijf0Var113.b;
                                        int iB5 = mlyVar5.b(ulf0.f(j9));
                                        int iB6 = mlyVar5.b(ulf0.e(j9));
                                        if (iB5 != iB6) {
                                            lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                        }
                                    }
                                } else {
                                    long jC = tkf0Var.b.c();
                                    j58 j58Var = new j58(jC);
                                    if (jC == 16) {
                                        j58Var = null;
                                    }
                                    long j10 = j58Var != null ? j58Var.a : j58.b;
                                    b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                    int iB7 = mlyVar5.b(ulf0.f(j7));
                                    int iB8 = mlyVar5.b(ulf0.e(j7));
                                    if (iB7 != iB8) {
                                        lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                    }
                                }
                                boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                if (z30) {
                                    long j11 = ukf0Var.c;
                                    lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    lc6VarA.p();
                                    lc6VarA.i(lk40VarB);
                                }
                                ora0 ora0Var = tkf0Var.b.a;
                                yef0 yef0Var = ora0Var.m;
                                kjf0 kjf0Var = ora0Var.a;
                                if (yef0Var == null) {
                                    yef0Var = yef0.b;
                                }
                                yef0 yef0Var2 = yef0Var;
                                ix80 ix80Var = ora0Var.n;
                                if (ix80Var == null) {
                                    ix80Var = ix80.d;
                                }
                                ix80 ix80Var2 = ix80Var;
                                wcf wcfVar = ora0Var.p;
                                if (wcfVar == null) {
                                    wcfVar = rlh.a;
                                }
                                wcf wcfVar2 = wcfVar;
                                try {
                                    ya5 ya5VarE = kjf0Var.e();
                                    kjf0.a aVar18 = kjf0.a.a;
                                    if (ya5VarE != null) {
                                        gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar18 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                    } else {
                                        zjwVar.i(lc6VarA, kjf0Var != aVar18 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                    }
                                } finally {
                                    if (z30) {
                                        lc6VarA.f();
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY8);
                } else {
                    objY8 = new Function1() { // from class: t3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar4;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                lc6 lc6VarA = tcfVar.F1().a();
                                long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                ukf0 ukf0Var = vkf0VarD.a;
                                zjw zjwVar = ukf0Var.b;
                                tkf0 tkf0Var = ukf0Var.a;
                                b90 b90Var = n6sVar7.y;
                                long j8 = n6sVar7.z;
                                boolean zC = ulf0.c(j6);
                                mly mlyVar5 = mlyVar;
                                if (!zC) {
                                    b90Var.m(j8);
                                    int iB3 = mlyVar5.b(ulf0.f(j6));
                                    int iB4 = mlyVar5.b(ulf0.e(j6));
                                    if (iB3 != iB4) {
                                        lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                    }
                                } else if (ulf0.c(j7)) {
                                    ijf0 ijf0Var113 = ijf0Var3;
                                    if (!ulf0.c(ijf0Var113.b)) {
                                        b90Var.m(j8);
                                        long j9 = ijf0Var113.b;
                                        int iB5 = mlyVar5.b(ulf0.f(j9));
                                        int iB6 = mlyVar5.b(ulf0.e(j9));
                                        if (iB5 != iB6) {
                                            lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                        }
                                    }
                                } else {
                                    long jC = tkf0Var.b.c();
                                    j58 j58Var = new j58(jC);
                                    if (jC == 16) {
                                        j58Var = null;
                                    }
                                    long j10 = j58Var != null ? j58Var.a : j58.b;
                                    b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                    int iB7 = mlyVar5.b(ulf0.f(j7));
                                    int iB8 = mlyVar5.b(ulf0.e(j7));
                                    if (iB7 != iB8) {
                                        lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                    }
                                }
                                boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                if (z30) {
                                    long j11 = ukf0Var.c;
                                    lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    lc6VarA.p();
                                    lc6VarA.i(lk40VarB);
                                }
                                ora0 ora0Var = tkf0Var.b.a;
                                yef0 yef0Var = ora0Var.m;
                                kjf0 kjf0Var = ora0Var.a;
                                if (yef0Var == null) {
                                    yef0Var = yef0.b;
                                }
                                yef0 yef0Var2 = yef0Var;
                                ix80 ix80Var = ora0Var.n;
                                if (ix80Var == null) {
                                    ix80Var = ix80.d;
                                }
                                ix80 ix80Var2 = ix80Var;
                                wcf wcfVar = ora0Var.p;
                                if (wcfVar == null) {
                                    wcfVar = rlh.a;
                                }
                                wcf wcfVar2 = wcfVar;
                                try {
                                    ya5 ya5VarE = kjf0Var.e();
                                    kjf0.a aVar18 = kjf0.a.a;
                                    if (ya5VarE != null) {
                                        gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar18 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                    } else {
                                        zjwVar.i(lc6VarA, kjf0Var != aVar18 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                    }
                                } finally {
                                    if (z30) {
                                        lc6VarA.f();
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY8);
                }
                d dVarA1111114 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                boolean zA11111110 = r16.A(n6sVar4);
                if (i11 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zM113 = zA11111110 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                if (i14 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zA5 = zM113 | z18 | r16.A(mlyVar);
                objY9 = r16.y();
                if (zA5) {
                    final ijf0 ijf0Var113 = ijf0Var3;
                    Function1 function11114 = new Function1() { // from class: u3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            dkf0 dkf0Var2;
                            urr urrVar;
                            urr urrVar2;
                            n6s n6sVar7 = n6sVar4;
                            ytw ytwVar2 = n6sVar7.o;
                            urr urrVar3 = (urr) obj5;
                            n6sVar7.h = urrVar3;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                vkf0VarD.b = urrVar3;
                            }
                            if (z2) {
                                ocl oclVarA = n6sVar7.a();
                                ocl oclVar = ocl.b;
                                iif0 iif0Var115 = iif0Var2;
                                ijf0 ijf0Var114 = ijf0Var113;
                                if (oclVarA == oclVar) {
                                    if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                        iif0Var115.r();
                                    } else {
                                        iif0Var115.k();
                                    }
                                    ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var115, true)));
                                    ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var115, false)));
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var114.b)));
                                } else if (n6sVar7.a() == ocl.c) {
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var115, true)));
                                }
                                mly mlyVar5 = mlyVar;
                                j4b.f(n6sVar7, ijf0Var114, mlyVar5);
                                vkf0 vkf0VarD2 = n6sVar7.d();
                                if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                    ukf0 ukf0Var = vkf0VarD2.a;
                                    wff0 wff0Var = new wff0(urrVar);
                                    lk40 lk40VarA = z880.a(urrVar);
                                    lk40 lk40VarP = urrVar.P(urrVar2, false);
                                    if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                        dkf0Var2.b.h(ijf0Var114, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    a8j0Var = a8j0Var2;
                    r16.r(function11114);
                    objY9 = function11114;
                } else {
                    final ijf0 ijf0Var114 = ijf0Var3;
                    Function1 function11115 = new Function1() { // from class: u3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            dkf0 dkf0Var2;
                            urr urrVar;
                            urr urrVar2;
                            n6s n6sVar7 = n6sVar4;
                            ytw ytwVar2 = n6sVar7.o;
                            urr urrVar3 = (urr) obj5;
                            n6sVar7.h = urrVar3;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                vkf0VarD.b = urrVar3;
                            }
                            if (z2) {
                                ocl oclVarA = n6sVar7.a();
                                ocl oclVar = ocl.b;
                                iif0 iif0Var115 = iif0Var2;
                                ijf0 ijf0Var115 = ijf0Var114;
                                if (oclVarA == oclVar) {
                                    if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                        iif0Var115.r();
                                    } else {
                                        iif0Var115.k();
                                    }
                                    ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var115, true)));
                                    ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var115, false)));
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var115.b)));
                                } else if (n6sVar7.a() == ocl.c) {
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var115, true)));
                                }
                                mly mlyVar5 = mlyVar;
                                j4b.f(n6sVar7, ijf0Var115, mlyVar5);
                                vkf0 vkf0VarD2 = n6sVar7.d();
                                if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                    ukf0 ukf0Var = vkf0VarD2.a;
                                    wff0 wff0Var = new wff0(urrVar);
                                    lk40 lk40VarA = z880.a(urrVar);
                                    lk40 lk40VarP = urrVar.P(urrVar2, false);
                                    if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                        dkf0Var2.b.h(ijf0Var115, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    a8j0Var = a8j0Var2;
                    r16.r(function11115);
                    objY9 = function11115;
                }
                d dVarA1111115 = v.a(aVar4, (Function1) objY9);
                mlyVar2 = mlyVar;
                n6sVar5 = n6sVar4;
                v5b v5bVar13 = v5bVar2;
                ujf0Var2 = ujf0Var;
                iif0Var3 = iif0Var2;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier11 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                if (!z2) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                } else {
                    dVarA2 = aVar4;
                }
                zA6 = r16.A(iif0Var3);
                objY10 = r16.y();
                if (zA6) {
                    objY10 = new v3b(iif0Var3, 0);
                    r16.r(objY10);
                } else {
                    objY10 = new v3b(iif0Var3, 0);
                    r16.r(objY10);
                }
                xvf.c(iif0Var3, (Function1) objY10, r16);
                boolean zA11111111 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                if (i14 == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = zA11111111 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                objY11 = r16.y();
                if (z21) {
                    objY11 = new Function1() { // from class: w3b
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            n6s n6sVar7 = n6sVar5;
                            if (n6sVar7.b()) {
                                osf osfVar2 = n6sVar7.d;
                                l6s l6sVar11 = n6sVar7.v;
                                uhi uhiVar = n6sVar7.w;
                                dq40 dq40Var = new dq40();
                                vff0 vff0Var = new vff0(osfVar2, l6sVar11, dq40Var);
                                ujf0 ujf0Var115 = ujf0Var2;
                                rk10 rk10Var = ujf0Var115.a;
                                rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                ?? dkf0Var2 = new dkf0(ujf0Var115, rk10Var);
                                ujf0Var115.b.set((dkf0) dkf0Var2);
                                dq40Var.a = dkf0Var2;
                                n6sVar7.e = dkf0Var2;
                            }
                            return new i4b();
                        }
                    };
                    r16.r(objY11);
                } else {
                    objY11 = new Function1() { // from class: w3b
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            n6s n6sVar7 = n6sVar5;
                            if (n6sVar7.b()) {
                                osf osfVar2 = n6sVar7.d;
                                l6s l6sVar11 = n6sVar7.v;
                                uhi uhiVar = n6sVar7.w;
                                dq40 dq40Var = new dq40();
                                vff0 vff0Var = new vff0(osfVar2, l6sVar11, dq40Var);
                                ujf0 ujf0Var115 = ujf0Var2;
                                rk10 rk10Var = ujf0Var115.a;
                                rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                ?? dkf0Var2 = new dkf0(ujf0Var115, rk10Var);
                                ujf0Var115.b.set((dkf0) dkf0Var2);
                                dq40Var.a = dkf0Var2;
                                n6sVar7.e = dkf0Var2;
                            }
                            return new i4b();
                        }
                    };
                    r16.r(objY11);
                }
                xvf.c(bcnVar, (Function1) objY11, r16);
                l6s l6sVar11 = n6sVar5.v;
                if (i == 1) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                chf0 chf0Var11 = new chf0(n6sVar5, iif0Var3, ijf0Var, z211113, z22, mlyVar2, odh0Var, l6sVar11, bcnVar.e);
                gnn.a aVar18 = gnn.a;
                d dVarA1111116 = c.a(aVar4, aVar18, chf0Var11);
                i12 = bcnVar.d;
                if (i12 == 7) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                boolean zBooleanValue11 = ((Boolean) ytwVar.getValue()).booleanValue();
                zB = r16.b(z23) | r16.A(x5sVar);
                objY12 = r16.y();
                if (zB) {
                    objY12 = new Function0() { // from class: j3b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z23) {
                                x5sVar.i();
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY12);
                } else {
                    objY12 = new Function0() { // from class: j3b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z23) {
                                x5sVar.i();
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY12);
                }
                d dVarA1111117 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue11, z23, (Function0) objY12);
                j2 = ((j58) r16.O(vl1.a)).a;
                zA7 = r16.A(n6sVar5) | r16.e(j2);
                objY13 = r16.y();
                if (zA7) {
                    objY13 = new Function1() { // from class: i3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar5;
                            if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY13);
                } else {
                    objY13 = new Function1() { // from class: i3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar5;
                            if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY13);
                }
                yhf0 yhf0Var12 = yhf0Var;
                z24 = false;
                d dVarA1111118 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA1111117).n(dVarA1111113), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA1111116), aVar18, new uhf0(yhf0Var12, z2, pswVar)).n(dVarC11).n(coreTextFieldSemanticsModifier11), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar13));
                if (z2) {
                    z24 = true;
                }
                if (z24) {
                    dVarA3 = aVar4;
                } else {
                    dVarA3 = aVar4;
                }
                ?? r11116 = r16;
                b(dVarA1111118, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var12, ijf0Var, uni0Var, dVarA2, dVarA1111114, dVarA1111115, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r11116), r11116, 384);
                r15 = r11116;
            }
            z6 = false;
            if (ulf0Var == null) {
                rvf rvfVar115 = osfVar.b;
                rvfVar115.d = -1;
                rvfVar115.e = -1;
            } else {
                j = ulf0Var.a;
                if (!ulf0.c(j)) {
                    osfVar.b.g(ulf0.f(j), ulf0.e(j));
                }
                if (z5) {
                    rvf rvfVar116 = osfVar.b;
                    rvfVar116.d = -1;
                    rvfVar116.e = -1;
                    ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                } else {
                    rvf rvfVar117 = osfVar.b;
                    rvfVar117.d = -1;
                    rvfVar117.e = -1;
                    ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
                }
                ijf0Var2 = osfVar.a;
                osfVar.a = ijf0VarA;
                if (dkf0Var != null) {
                    dkf0Var.a(ijf0Var2, ijf0VarA);
                }
                objY = I.y();
                obj2 = obj;
                if (objY == obj2) {
                    objY = new odh0(0);
                    I.r(objY);
                }
                odh0Var = (odh0) objY;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (odh0Var.f) {
                    odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                    odh0Var.a(ijf0Var);
                } else {
                    l = odh0Var.e;
                    if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                        odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                        odh0Var.a(ijf0Var);
                    }
                }
                objY2 = I.y();
                if (objY2 == obj2) {
                    objY2 = xvf.i(kotlin.coroutines.e.a, I);
                    I.r(objY2);
                }
                v5bVar = (v5b) objY2;
                objY3 = I.y();
                if (objY3 == obj2) {
                    objY3 = new la5();
                    I.r(objY3);
                }
                ia5Var = (ia5) objY3;
                objY4 = I.y();
                if (objY4 == obj2) {
                    objY4 = new iif0(odh0Var);
                    I.r(objY4);
                }
                iif0Var = (iif0) objY4;
                iif0Var.b = mlyVar4;
                iif0Var.f = uni0Var;
                iif0Var.c = n6sVar6.v;
                iif0Var.d = n6sVar6;
                ((x5a0) iif0Var.e).setValue(ijf0Var);
                iif0Var.x = new ulf0(j5);
                iif0Var.h = (ms7) I.O(kna.f);
                iif0Var.i = v5bVar;
                iif0Var.k = (jmf0) I.O(kna.q);
                iif0Var.l = (zdl) I.O(kna.l);
                iif0Var.m = b5iVar;
                boolean z211117 = !z3;
                ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z211117));
                ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
                I.N(1966776937);
                q780Var = q780.a;
                cetVar = imf0Var.a.k;
                qyd0 qyd0Var11 = jk10.a;
                I.N(430530635);
                if (Build.VERSION.SDK_INT < 28) {
                    I.H();
                    vj10Var = null;
                } else {
                    context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                    coroutineContext = (CoroutineContext) I.O(jk10.a);
                    zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                    objY5 = I.y();
                    if (zM) {
                        jk10.b.getClass();
                        objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                        I.r(objY5);
                    } else {
                        jk10.b.getClass();
                        objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                        I.r(objY5);
                    }
                    vj10Var = (vj10) objY5;
                    I.H();
                }
                iif0Var.j = vj10Var;
                I.X(false);
                boolean zA11111112 = I.A(n6sVar6);
                i7 = i13 & 7168;
                if (i7 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z211118 = zA11111112 | z7;
                i8 = i13 & 57344;
                if (i8 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z211119 = z8 | z211118;
                ujf0Var = ujf0Var3;
                boolean zA11111113 = z211119 | I.A(ujf0Var);
                if (i14 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i9 = (i13 & 112) ^ 48;
                zA = zA11111113 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
                Object objY2111 = I.y();
                if (zA) {
                    i10 = i7;
                    n6sVar2 = n6sVar6;
                    ?? r11117 = I;
                    bcnVar2 = bcnVar;
                    obj3 = new Function1() { // from class: q3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            vkf0 vkf0VarD;
                            j5i j5iVar = (j5i) obj5;
                            n6s n6sVar7 = n6sVar2;
                            if (n6sVar7.b() == j5iVar.a()) {
                                return Unit.a;
                            }
                            ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                            boolean zB2 = n6sVar7.b();
                            ijf0 ijf0Var115 = ijf0Var;
                            mly mlyVar5 = mlyVar4;
                            if (zB2 && z2 && !z3) {
                                j4b.g(ujf0Var, n6sVar7, ijf0Var115, bcnVar2, mlyVar5);
                            } else {
                                j4b.e(n6sVar7);
                            }
                            if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var115, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                            }
                            if (!j5iVar.a()) {
                                iif0Var.d(null);
                            }
                            return Unit.a;
                        }
                    };
                    z10 = z2;
                    ujf0Var = ujf0Var;
                    iif0Var2 = iif0Var;
                    ia5Var2 = ia5Var;
                    v5bVar2 = v5bVar;
                    ijf0Var3 = ijf0Var;
                    r11117.r(obj3);
                    r16 = r11117;
                } else {
                    i10 = i7;
                    n6sVar2 = n6sVar6;
                    ?? r11118 = I;
                    bcnVar2 = bcnVar;
                    obj3 = new Function1() { // from class: q3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            vkf0 vkf0VarD;
                            j5i j5iVar = (j5i) obj5;
                            n6s n6sVar7 = n6sVar2;
                            if (n6sVar7.b() == j5iVar.a()) {
                                return Unit.a;
                            }
                            ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                            boolean zB2 = n6sVar7.b();
                            ijf0 ijf0Var115 = ijf0Var;
                            mly mlyVar5 = mlyVar4;
                            if (zB2 && z2 && !z3) {
                                j4b.g(ujf0Var, n6sVar7, ijf0Var115, bcnVar2, mlyVar5);
                            } else {
                                j4b.e(n6sVar7);
                            }
                            if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                                ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var115, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                            }
                            if (!j5iVar.a()) {
                                iif0Var.d(null);
                            }
                            return Unit.a;
                        }
                    };
                    z10 = z2;
                    ujf0Var = ujf0Var;
                    iif0Var2 = iif0Var;
                    ia5Var2 = ia5Var;
                    v5bVar2 = v5bVar;
                    ijf0Var3 = ijf0Var;
                    r11118.r(obj3);
                    r16 = r11118;
                }
                aVar4 = d.a.b;
                d dVarA1111119 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                ytwVarC = m.c(Boolean.valueOf(z11), r16);
                Unit unit11 = Unit.a;
                boolean zM114 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
                if (i9 > 32) {
                    n6sVar3 = n6sVar2;
                    if ((r5 & 48) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    n6sVar3 = n6sVar2;
                    if ((r5 & 48) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                z13 = zM114 | z12;
                Object objY2112 = r16.y();
                if (z13) {
                    n6sVar4 = n6sVar3;
                    ujf0 ujf0Var115 = ujf0Var;
                    y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var115, iif0Var2, bcnVar, null);
                    ytwVar = ytwVarC;
                    ujf0Var = ujf0Var115;
                    r16.r(y3bVar);
                } else {
                    n6sVar4 = n6sVar3;
                    ujf0 ujf0Var116 = ujf0Var;
                    y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var116, iif0Var2, bcnVar, null);
                    ytwVar = ytwVarC;
                    ujf0Var = ujf0Var116;
                    r16.r(y3bVar);
                }
                xvf.e(r16, unit11, (Function2) y3bVar);
                zA2 = r16.A(n6sVar4);
                objY6 = r16.y();
                if (zA2) {
                    objY6 = new r3b(n6sVar4, 0);
                    r16.r(objY6);
                } else {
                    objY6 = new r3b(n6sVar4, 0);
                    r16.r(objY6);
                }
                dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
                boolean zA11111114 = r16.A(n6sVar4);
                if (i8 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z2111110 = zA11111114 | z14;
                i11 = i10;
                if (i11 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zA3 = z2111110 | z15 | r16.A(r7) | r16.A(iif0Var2);
                objY7 = r16.y();
                if (zA3) {
                    final iif0 iif0Var115 = iif0Var2;
                    mlyVar = r7;
                    final b5i b5iVar113 = b5iVar;
                    Function1 function11116 = new Function1() { // from class: s3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ooa0 ooa0Var2;
                            gly glyVar = (gly) obj5;
                            n6s n6sVar7 = n6sVar4;
                            if (!n6sVar7.b()) {
                                b5i.b(b5iVar113);
                            } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                ooa0Var2.a();
                            }
                            if (n6sVar7.b() && z2) {
                                if (n6sVar7.a() != ocl.b) {
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        long j6 = glyVar.a;
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar12 = n6sVar7.v;
                                        int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                        l6sVar12.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                        if (n6sVar7.a.a.b.length() > 0) {
                                            ((x5a0) n6sVar7.k).setValue(ocl.c);
                                        }
                                    }
                                } else {
                                    iif0Var115.d(glyVar);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    iif0Var2 = iif0Var115;
                    r16.r(function11116);
                    objY7 = function11116;
                } else {
                    final iif0 iif0Var116 = iif0Var2;
                    mlyVar = r7;
                    final b5i b5iVar114 = b5iVar;
                    Function1 function11117 = new Function1() { // from class: s3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ooa0 ooa0Var2;
                            gly glyVar = (gly) obj5;
                            n6s n6sVar7 = n6sVar4;
                            if (!n6sVar7.b()) {
                                b5i.b(b5iVar114);
                            } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                                ooa0Var2.a();
                            }
                            if (n6sVar7.b() && z2) {
                                if (n6sVar7.a() != ocl.b) {
                                    vkf0 vkf0VarD = n6sVar7.d();
                                    if (vkf0VarD != null) {
                                        long j6 = glyVar.a;
                                        osf osfVar2 = n6sVar7.d;
                                        l6s l6sVar12 = n6sVar7.v;
                                        int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                        l6sVar12.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                        if (n6sVar7.a.a.b.length() > 0) {
                                            ((x5a0) n6sVar7.k).setValue(ocl.c);
                                        }
                                    }
                                } else {
                                    iif0Var116.d(glyVar);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    iif0Var2 = iif0Var116;
                    r16.r(function11117);
                    objY7 = function11117;
                }
                function3 = (Function1) objY7;
                if (z2) {
                    dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
                }
                iif0.b bVar13 = iif0Var2.B;
                iif0.c cVar12 = iif0Var2.A;
                d dVarN12 = dVarA.n(new SuspendPointerInputElement(bVar13, cVar12, null, new l880(bVar13, cVar12), 4));
                g020.a.getClass();
                d dVarC12 = h020.c(dVarN12, j020.b);
                boolean zA11111115 = r16.A(n6sVar4);
                if (i14 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zA4 = zA11111115 | z16 | r16.A(mlyVar);
                objY8 = r16.y();
                if (zA4) {
                    objY8 = new Function1() { // from class: t3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar4;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                lc6 lc6VarA = tcfVar.F1().a();
                                long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                ukf0 ukf0Var = vkf0VarD.a;
                                zjw zjwVar = ukf0Var.b;
                                tkf0 tkf0Var = ukf0Var.a;
                                b90 b90Var = n6sVar7.y;
                                long j8 = n6sVar7.z;
                                boolean zC = ulf0.c(j6);
                                mly mlyVar5 = mlyVar;
                                if (!zC) {
                                    b90Var.m(j8);
                                    int iB3 = mlyVar5.b(ulf0.f(j6));
                                    int iB4 = mlyVar5.b(ulf0.e(j6));
                                    if (iB3 != iB4) {
                                        lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                    }
                                } else if (ulf0.c(j7)) {
                                    ijf0 ijf0Var115 = ijf0Var3;
                                    if (!ulf0.c(ijf0Var115.b)) {
                                        b90Var.m(j8);
                                        long j9 = ijf0Var115.b;
                                        int iB5 = mlyVar5.b(ulf0.f(j9));
                                        int iB6 = mlyVar5.b(ulf0.e(j9));
                                        if (iB5 != iB6) {
                                            lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                        }
                                    }
                                } else {
                                    long jC = tkf0Var.b.c();
                                    j58 j58Var = new j58(jC);
                                    if (jC == 16) {
                                        j58Var = null;
                                    }
                                    long j10 = j58Var != null ? j58Var.a : j58.b;
                                    b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                    int iB7 = mlyVar5.b(ulf0.f(j7));
                                    int iB8 = mlyVar5.b(ulf0.e(j7));
                                    if (iB7 != iB8) {
                                        lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                    }
                                }
                                boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                if (z30) {
                                    long j11 = ukf0Var.c;
                                    lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    lc6VarA.p();
                                    lc6VarA.i(lk40VarB);
                                }
                                ora0 ora0Var = tkf0Var.b.a;
                                yef0 yef0Var = ora0Var.m;
                                kjf0 kjf0Var = ora0Var.a;
                                if (yef0Var == null) {
                                    yef0Var = yef0.b;
                                }
                                yef0 yef0Var2 = yef0Var;
                                ix80 ix80Var = ora0Var.n;
                                if (ix80Var == null) {
                                    ix80Var = ix80.d;
                                }
                                ix80 ix80Var2 = ix80Var;
                                wcf wcfVar = ora0Var.p;
                                if (wcfVar == null) {
                                    wcfVar = rlh.a;
                                }
                                wcf wcfVar2 = wcfVar;
                                try {
                                    ya5 ya5VarE = kjf0Var.e();
                                    kjf0.a aVar19 = kjf0.a.a;
                                    if (ya5VarE != null) {
                                        gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar19 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                    } else {
                                        zjwVar.i(lc6VarA, kjf0Var != aVar19 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                    }
                                } finally {
                                    if (z30) {
                                        lc6VarA.f();
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY8);
                } else {
                    objY8 = new Function1() { // from class: t3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar4;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                lc6 lc6VarA = tcfVar.F1().a();
                                long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                                long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                                ukf0 ukf0Var = vkf0VarD.a;
                                zjw zjwVar = ukf0Var.b;
                                tkf0 tkf0Var = ukf0Var.a;
                                b90 b90Var = n6sVar7.y;
                                long j8 = n6sVar7.z;
                                boolean zC = ulf0.c(j6);
                                mly mlyVar5 = mlyVar;
                                if (!zC) {
                                    b90Var.m(j8);
                                    int iB3 = mlyVar5.b(ulf0.f(j6));
                                    int iB4 = mlyVar5.b(ulf0.e(j6));
                                    if (iB3 != iB4) {
                                        lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                    }
                                } else if (ulf0.c(j7)) {
                                    ijf0 ijf0Var115 = ijf0Var3;
                                    if (!ulf0.c(ijf0Var115.b)) {
                                        b90Var.m(j8);
                                        long j9 = ijf0Var115.b;
                                        int iB5 = mlyVar5.b(ulf0.f(j9));
                                        int iB6 = mlyVar5.b(ulf0.e(j9));
                                        if (iB5 != iB6) {
                                            lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                        }
                                    }
                                } else {
                                    long jC = tkf0Var.b.c();
                                    j58 j58Var = new j58(jC);
                                    if (jC == 16) {
                                        j58Var = null;
                                    }
                                    long j10 = j58Var != null ? j58Var.a : j58.b;
                                    b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                    int iB7 = mlyVar5.b(ulf0.f(j7));
                                    int iB8 = mlyVar5.b(ulf0.e(j7));
                                    if (iB7 != iB8) {
                                        lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                    }
                                }
                                boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                                if (z30) {
                                    long j11 = ukf0Var.c;
                                    lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    lc6VarA.p();
                                    lc6VarA.i(lk40VarB);
                                }
                                ora0 ora0Var = tkf0Var.b.a;
                                yef0 yef0Var = ora0Var.m;
                                kjf0 kjf0Var = ora0Var.a;
                                if (yef0Var == null) {
                                    yef0Var = yef0.b;
                                }
                                yef0 yef0Var2 = yef0Var;
                                ix80 ix80Var = ora0Var.n;
                                if (ix80Var == null) {
                                    ix80Var = ix80.d;
                                }
                                ix80 ix80Var2 = ix80Var;
                                wcf wcfVar = ora0Var.p;
                                if (wcfVar == null) {
                                    wcfVar = rlh.a;
                                }
                                wcf wcfVar2 = wcfVar;
                                try {
                                    ya5 ya5VarE = kjf0Var.e();
                                    kjf0.a aVar19 = kjf0.a.a;
                                    if (ya5VarE != null) {
                                        gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar19 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                    } else {
                                        zjwVar.i(lc6VarA, kjf0Var != aVar19 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                    }
                                } finally {
                                    if (z30) {
                                        lc6VarA.f();
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY8);
                }
                d dVarA11111110 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
                boolean zA11111116 = r16.A(n6sVar4);
                if (i11 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zM115 = zA11111116 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
                if (i14 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zA5 = zM115 | z18 | r16.A(mlyVar);
                objY9 = r16.y();
                if (zA5) {
                    final ijf0 ijf0Var115 = ijf0Var3;
                    Function1 function11118 = new Function1() { // from class: u3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            dkf0 dkf0Var2;
                            urr urrVar;
                            urr urrVar2;
                            n6s n6sVar7 = n6sVar4;
                            ytw ytwVar2 = n6sVar7.o;
                            urr urrVar3 = (urr) obj5;
                            n6sVar7.h = urrVar3;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                vkf0VarD.b = urrVar3;
                            }
                            if (z2) {
                                ocl oclVarA = n6sVar7.a();
                                ocl oclVar = ocl.b;
                                iif0 iif0Var117 = iif0Var2;
                                ijf0 ijf0Var116 = ijf0Var115;
                                if (oclVarA == oclVar) {
                                    if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                        iif0Var117.r();
                                    } else {
                                        iif0Var117.k();
                                    }
                                    ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var117, true)));
                                    ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var117, false)));
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var116.b)));
                                } else if (n6sVar7.a() == ocl.c) {
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var117, true)));
                                }
                                mly mlyVar5 = mlyVar;
                                j4b.f(n6sVar7, ijf0Var116, mlyVar5);
                                vkf0 vkf0VarD2 = n6sVar7.d();
                                if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                    ukf0 ukf0Var = vkf0VarD2.a;
                                    wff0 wff0Var = new wff0(urrVar);
                                    lk40 lk40VarA = z880.a(urrVar);
                                    lk40 lk40VarP = urrVar.P(urrVar2, false);
                                    if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                        dkf0Var2.b.h(ijf0Var116, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    a8j0Var = a8j0Var2;
                    r16.r(function11118);
                    objY9 = function11118;
                } else {
                    final ijf0 ijf0Var116 = ijf0Var3;
                    Function1 function11119 = new Function1() { // from class: u3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            dkf0 dkf0Var2;
                            urr urrVar;
                            urr urrVar2;
                            n6s n6sVar7 = n6sVar4;
                            ytw ytwVar2 = n6sVar7.o;
                            urr urrVar3 = (urr) obj5;
                            n6sVar7.h = urrVar3;
                            vkf0 vkf0VarD = n6sVar7.d();
                            if (vkf0VarD != null) {
                                vkf0VarD.b = urrVar3;
                            }
                            if (z2) {
                                ocl oclVarA = n6sVar7.a();
                                ocl oclVar = ocl.b;
                                iif0 iif0Var117 = iif0Var2;
                                ijf0 ijf0Var117 = ijf0Var116;
                                if (oclVarA == oclVar) {
                                    if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                        iif0Var117.r();
                                    } else {
                                        iif0Var117.k();
                                    }
                                    ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var117, true)));
                                    ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var117, false)));
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var117.b)));
                                } else if (n6sVar7.a() == ocl.c) {
                                    ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var117, true)));
                                }
                                mly mlyVar5 = mlyVar;
                                j4b.f(n6sVar7, ijf0Var117, mlyVar5);
                                vkf0 vkf0VarD2 = n6sVar7.d();
                                if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                    ukf0 ukf0Var = vkf0VarD2.a;
                                    wff0 wff0Var = new wff0(urrVar);
                                    lk40 lk40VarA = z880.a(urrVar);
                                    lk40 lk40VarP = urrVar.P(urrVar2, false);
                                    if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                        dkf0Var2.b.h(ijf0Var117, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    a8j0Var = a8j0Var2;
                    r16.r(function11119);
                    objY9 = function11119;
                }
                d dVarA11111111 = v.a(aVar4, (Function1) objY9);
                mlyVar2 = mlyVar;
                n6sVar5 = n6sVar4;
                v5b v5bVar14 = v5bVar2;
                ujf0Var2 = ujf0Var;
                iif0Var3 = iif0Var2;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier12 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
                if (!z2) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
                } else {
                    dVarA2 = aVar4;
                }
                zA6 = r16.A(iif0Var3);
                objY10 = r16.y();
                if (zA6) {
                    objY10 = new v3b(iif0Var3, 0);
                    r16.r(objY10);
                } else {
                    objY10 = new v3b(iif0Var3, 0);
                    r16.r(objY10);
                }
                xvf.c(iif0Var3, (Function1) objY10, r16);
                boolean zA11111117 = r16.A(n6sVar5) | r16.A(ujf0Var2);
                if (i14 == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = zA11111117 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
                objY11 = r16.y();
                if (z21) {
                    objY11 = new Function1() { // from class: w3b
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            n6s n6sVar7 = n6sVar5;
                            if (n6sVar7.b()) {
                                osf osfVar2 = n6sVar7.d;
                                l6s l6sVar12 = n6sVar7.v;
                                uhi uhiVar = n6sVar7.w;
                                dq40 dq40Var = new dq40();
                                vff0 vff0Var = new vff0(osfVar2, l6sVar12, dq40Var);
                                ujf0 ujf0Var117 = ujf0Var2;
                                rk10 rk10Var = ujf0Var117.a;
                                rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                ?? dkf0Var2 = new dkf0(ujf0Var117, rk10Var);
                                ujf0Var117.b.set((dkf0) dkf0Var2);
                                dq40Var.a = dkf0Var2;
                                n6sVar7.e = dkf0Var2;
                            }
                            return new i4b();
                        }
                    };
                    r16.r(objY11);
                } else {
                    objY11 = new Function1() { // from class: w3b
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            n6s n6sVar7 = n6sVar5;
                            if (n6sVar7.b()) {
                                osf osfVar2 = n6sVar7.d;
                                l6s l6sVar12 = n6sVar7.v;
                                uhi uhiVar = n6sVar7.w;
                                dq40 dq40Var = new dq40();
                                vff0 vff0Var = new vff0(osfVar2, l6sVar12, dq40Var);
                                ujf0 ujf0Var117 = ujf0Var2;
                                rk10 rk10Var = ujf0Var117.a;
                                rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                                ?? dkf0Var2 = new dkf0(ujf0Var117, rk10Var);
                                ujf0Var117.b.set((dkf0) dkf0Var2);
                                dq40Var.a = dkf0Var2;
                                n6sVar7.e = dkf0Var2;
                            }
                            return new i4b();
                        }
                    };
                    r16.r(objY11);
                }
                xvf.c(bcnVar, (Function1) objY11, r16);
                l6s l6sVar12 = n6sVar5.v;
                if (i == 1) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                chf0 chf0Var12 = new chf0(n6sVar5, iif0Var3, ijf0Var, z211117, z22, mlyVar2, odh0Var, l6sVar12, bcnVar.e);
                gnn.a aVar19 = gnn.a;
                d dVarA11111112 = c.a(aVar4, aVar19, chf0Var12);
                i12 = bcnVar.d;
                if (i12 == 7) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                boolean zBooleanValue12 = ((Boolean) ytwVar.getValue()).booleanValue();
                zB = r16.b(z23) | r16.A(x5sVar);
                objY12 = r16.y();
                if (zB) {
                    objY12 = new Function0() { // from class: j3b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z23) {
                                x5sVar.i();
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY12);
                } else {
                    objY12 = new Function0() { // from class: j3b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z23) {
                                x5sVar.i();
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY12);
                }
                d dVarA11111113 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue12, z23, (Function0) objY12);
                j2 = ((j58) r16.O(vl1.a)).a;
                zA7 = r16.A(n6sVar5) | r16.e(j2);
                objY13 = r16.y();
                if (zA7) {
                    objY13 = new Function1() { // from class: i3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar5;
                            if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY13);
                } else {
                    objY13 = new Function1() { // from class: i3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            tcf tcfVar = (tcf) obj5;
                            n6s n6sVar7 = n6sVar5;
                            if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                                tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                            }
                            return Unit.a;
                        }
                    };
                    r16.r(objY13);
                }
                yhf0 yhf0Var13 = yhf0Var;
                z24 = false;
                d dVarA11111114 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA11111113).n(dVarA1111119), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA11111112), aVar19, new uhf0(yhf0Var13, z2, pswVar)).n(dVarC12).n(coreTextFieldSemanticsModifier12), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar14));
                if (z2) {
                    z24 = true;
                }
                if (z24) {
                    dVarA3 = aVar4;
                } else {
                    dVarA3 = aVar4;
                }
                ?? r11119 = r16;
                b(dVarA11111114, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var13, ijf0Var, uni0Var, dVarA2, dVarA11111110, dVarA11111111, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r11119), r11119, 384);
                r15 = r11119;
            }
            if (z5) {
                rvf rvfVar118 = osfVar.b;
                rvfVar118.d = -1;
                rvfVar118.e = -1;
                ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
            } else {
                rvf rvfVar119 = osfVar.b;
                rvfVar119.d = -1;
                rvfVar119.e = -1;
                ijf0VarA = ijf0.a(ijf0Var, null, 0L, 3);
            }
            ijf0Var2 = osfVar.a;
            osfVar.a = ijf0VarA;
            if (dkf0Var != null) {
                dkf0Var.a(ijf0Var2, ijf0VarA);
            }
            objY = I.y();
            obj2 = obj;
            if (objY == obj2) {
                objY = new odh0(0);
                I.r(objY);
            }
            odh0Var = (odh0) objY;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (odh0Var.f) {
                odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                odh0Var.a(ijf0Var);
            } else {
                l = odh0Var.e;
                if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                    odh0Var.e = Long.valueOf(jCurrentTimeMillis);
                    odh0Var.a(ijf0Var);
                }
            }
            objY2 = I.y();
            if (objY2 == obj2) {
                objY2 = xvf.i(kotlin.coroutines.e.a, I);
                I.r(objY2);
            }
            v5bVar = (v5b) objY2;
            objY3 = I.y();
            if (objY3 == obj2) {
                objY3 = new la5();
                I.r(objY3);
            }
            ia5Var = (ia5) objY3;
            objY4 = I.y();
            if (objY4 == obj2) {
                objY4 = new iif0(odh0Var);
                I.r(objY4);
            }
            iif0Var = (iif0) objY4;
            iif0Var.b = mlyVar4;
            iif0Var.f = uni0Var;
            iif0Var.c = n6sVar6.v;
            iif0Var.d = n6sVar6;
            ((x5a0) iif0Var.e).setValue(ijf0Var);
            iif0Var.x = new ulf0(j5);
            iif0Var.h = (ms7) I.O(kna.f);
            iif0Var.i = v5bVar;
            iif0Var.k = (jmf0) I.O(kna.q);
            iif0Var.l = (zdl) I.O(kna.l);
            iif0Var.m = b5iVar;
            boolean z2111111 = !z3;
            ((x5a0) iif0Var.n).setValue(Boolean.valueOf(z2111111));
            ((x5a0) iif0Var.o).setValue(Boolean.valueOf(z2));
            I.N(1966776937);
            q780Var = q780.a;
            cetVar = imf0Var.a.k;
            qyd0 qyd0Var12 = jk10.a;
            I.N(430530635);
            if (Build.VERSION.SDK_INT < 28) {
                I.H();
                vj10Var = null;
            } else {
                context = (Context) I.O(AndroidCompositionLocals_androidKt.b);
                coroutineContext = (CoroutineContext) I.O(jk10.a);
                zM = I.M(coroutineContext) | I.M(context) | I.M(cetVar);
                objY5 = I.y();
                if (zM) {
                    jk10.b.getClass();
                    objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                    I.r(objY5);
                } else {
                    jk10.b.getClass();
                    objY5 = new gk10(coroutineContext, context, q780Var, cetVar);
                    I.r(objY5);
                }
                vj10Var = (vj10) objY5;
                I.H();
            }
            iif0Var.j = vj10Var;
            I.X(false);
            boolean zA11111118 = I.A(n6sVar6);
            i7 = i13 & 7168;
            if (i7 == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z2111112 = zA11111118 | z7;
            i8 = i13 & 57344;
            if (i8 == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z2111113 = z8 | z2111112;
            ujf0Var = ujf0Var3;
            boolean zA11111119 = z2111113 | I.A(ujf0Var);
            if (i14 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            i9 = (i13 & 112) ^ 48;
            zA = zA11111119 | z9 | ((i9 <= 32 && I.M(bcnVar)) || (i13 & 48) == 32) | I.A(mlyVar4) | I.A(v5bVar) | I.A(ia5Var) | I.A(iif0Var);
            Object objY2113 = I.y();
            if (zA) {
                i10 = i7;
                n6sVar2 = n6sVar6;
                ?? r111110 = I;
                bcnVar2 = bcnVar;
                obj3 = new Function1() { // from class: q3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        vkf0 vkf0VarD;
                        j5i j5iVar = (j5i) obj5;
                        n6s n6sVar7 = n6sVar2;
                        if (n6sVar7.b() == j5iVar.a()) {
                            return Unit.a;
                        }
                        ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                        boolean zB2 = n6sVar7.b();
                        ijf0 ijf0Var117 = ijf0Var;
                        mly mlyVar5 = mlyVar4;
                        if (zB2 && z2 && !z3) {
                            j4b.g(ujf0Var, n6sVar7, ijf0Var117, bcnVar2, mlyVar5);
                        } else {
                            j4b.e(n6sVar7);
                        }
                        if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                            ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var117, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                        }
                        if (!j5iVar.a()) {
                            iif0Var.d(null);
                        }
                        return Unit.a;
                    }
                };
                z10 = z2;
                ujf0Var = ujf0Var;
                iif0Var2 = iif0Var;
                ia5Var2 = ia5Var;
                v5bVar2 = v5bVar;
                ijf0Var3 = ijf0Var;
                r111110.r(obj3);
                r16 = r111110;
            } else {
                i10 = i7;
                n6sVar2 = n6sVar6;
                ?? r111111 = I;
                bcnVar2 = bcnVar;
                obj3 = new Function1() { // from class: q3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        vkf0 vkf0VarD;
                        j5i j5iVar = (j5i) obj5;
                        n6s n6sVar7 = n6sVar2;
                        if (n6sVar7.b() == j5iVar.a()) {
                            return Unit.a;
                        }
                        ((x5a0) n6sVar7.f).setValue(Boolean.valueOf(j5iVar.a()));
                        boolean zB2 = n6sVar7.b();
                        ijf0 ijf0Var117 = ijf0Var;
                        mly mlyVar5 = mlyVar4;
                        if (zB2 && z2 && !z3) {
                            j4b.g(ujf0Var, n6sVar7, ijf0Var117, bcnVar2, mlyVar5);
                        } else {
                            j4b.e(n6sVar7);
                        }
                        if (j5iVar.a() && (vkf0VarD = n6sVar7.d()) != null) {
                            ej5.c(v5bVar, null, null, new g4b(ia5Var, ijf0Var117, n6sVar7, vkf0VarD, mlyVar5, null), 3);
                        }
                        if (!j5iVar.a()) {
                            iif0Var.d(null);
                        }
                        return Unit.a;
                    }
                };
                z10 = z2;
                ujf0Var = ujf0Var;
                iif0Var2 = iif0Var;
                ia5Var2 = ia5Var;
                v5bVar2 = v5bVar;
                ijf0Var3 = ijf0Var;
                r111111.r(obj3);
                r16 = r111111;
            }
            aVar4 = d.a.b;
            d dVarA11111115 = androidx.compose.foundation.e.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar4, b5iVar), (Function1) obj3), z10, pswVar);
            if (z10) {
                z11 = false;
            } else {
                z11 = false;
            }
            ytwVarC = m.c(Boolean.valueOf(z11), r16);
            Unit unit12 = Unit.a;
            boolean zM116 = r16.M(ytwVarC) | r16.A(n6sVar2) | r16.A(ujf0Var) | r16.A(iif0Var2);
            if (i9 > 32) {
                n6sVar3 = n6sVar2;
                if ((r5 & 48) != 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                n6sVar3 = n6sVar2;
                if ((r5 & 48) != 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            z13 = zM116 | z12;
            Object objY2114 = r16.y();
            if (z13) {
                n6sVar4 = n6sVar3;
                ujf0 ujf0Var117 = ujf0Var;
                y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var117, iif0Var2, bcnVar, null);
                ytwVar = ytwVarC;
                ujf0Var = ujf0Var117;
                r16.r(y3bVar);
            } else {
                n6sVar4 = n6sVar3;
                ujf0 ujf0Var118 = ujf0Var;
                y3bVar = new y3b(n6sVar4, ytwVarC, ujf0Var118, iif0Var2, bcnVar, null);
                ytwVar = ytwVarC;
                ujf0Var = ujf0Var118;
                r16.r(y3bVar);
            }
            xvf.e(r16, unit12, (Function2) y3bVar);
            zA2 = r16.A(n6sVar4);
            objY6 = r16.y();
            if (zA2) {
                objY6 = new r3b(n6sVar4, 0);
                r16.r(objY6);
            } else {
                objY6 = new r3b(n6sVar4, 0);
                r16.r(objY6);
            }
            dVarA = wje0.a(aVar4, 8675309, new n880((Function1) objY6));
            boolean zA111111110 = r16.A(n6sVar4);
            if (i8 == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z2111114 = zA111111110 | z14;
            i11 = i10;
            if (i11 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            zA3 = z2111114 | z15 | r16.A(r7) | r16.A(iif0Var2);
            objY7 = r16.y();
            if (zA3) {
                final iif0 iif0Var117 = iif0Var2;
                mlyVar = r7;
                final b5i b5iVar115 = b5iVar;
                Function1 function111110 = new Function1() { // from class: s3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        ooa0 ooa0Var2;
                        gly glyVar = (gly) obj5;
                        n6s n6sVar7 = n6sVar4;
                        if (!n6sVar7.b()) {
                            b5i.b(b5iVar115);
                        } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                            ooa0Var2.a();
                        }
                        if (n6sVar7.b() && z2) {
                            if (n6sVar7.a() != ocl.b) {
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    long j6 = glyVar.a;
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar13 = n6sVar7.v;
                                    int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                    l6sVar13.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                    if (n6sVar7.a.a.b.length() > 0) {
                                        ((x5a0) n6sVar7.k).setValue(ocl.c);
                                    }
                                }
                            } else {
                                iif0Var117.d(glyVar);
                            }
                        }
                        return Unit.a;
                    }
                };
                iif0Var2 = iif0Var117;
                r16.r(function111110);
                objY7 = function111110;
            } else {
                final iif0 iif0Var118 = iif0Var2;
                mlyVar = r7;
                final b5i b5iVar116 = b5iVar;
                Function1 function111111 = new Function1() { // from class: s3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        ooa0 ooa0Var2;
                        gly glyVar = (gly) obj5;
                        n6s n6sVar7 = n6sVar4;
                        if (!n6sVar7.b()) {
                            b5i.b(b5iVar116);
                        } else if (!z3 && (ooa0Var2 = n6sVar7.c) != null) {
                            ooa0Var2.a();
                        }
                        if (n6sVar7.b() && z2) {
                            if (n6sVar7.a() != ocl.b) {
                                vkf0 vkf0VarD = n6sVar7.d();
                                if (vkf0VarD != null) {
                                    long j6 = glyVar.a;
                                    osf osfVar2 = n6sVar7.d;
                                    l6s l6sVar13 = n6sVar7.v;
                                    int iA = mlyVar.a(vkf0VarD.b(j6, true));
                                    l6sVar13.invoke(ijf0.a(osfVar2.a, null, vlf0.a(iA, iA), 5));
                                    if (n6sVar7.a.a.b.length() > 0) {
                                        ((x5a0) n6sVar7.k).setValue(ocl.c);
                                    }
                                }
                            } else {
                                iif0Var118.d(glyVar);
                            }
                        }
                        return Unit.a;
                    }
                };
                iif0Var2 = iif0Var118;
                r16.r(function111111);
                objY7 = function111111;
            }
            function3 = (Function1) objY7;
            if (z2) {
                dVarA = c.a(dVarA, gnn.a, new shf0(function3, pswVar));
            }
            iif0.b bVar14 = iif0Var2.B;
            iif0.c cVar13 = iif0Var2.A;
            d dVarN13 = dVarA.n(new SuspendPointerInputElement(bVar14, cVar13, null, new l880(bVar14, cVar13), 4));
            g020.a.getClass();
            d dVarC13 = h020.c(dVarN13, j020.b);
            boolean zA111111111 = r16.A(n6sVar4);
            if (i14 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            zA4 = zA111111111 | z16 | r16.A(mlyVar);
            objY8 = r16.y();
            if (zA4) {
                objY8 = new Function1() { // from class: t3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        tcf tcfVar = (tcf) obj5;
                        n6s n6sVar7 = n6sVar4;
                        vkf0 vkf0VarD = n6sVar7.d();
                        if (vkf0VarD != null) {
                            lc6 lc6VarA = tcfVar.F1().a();
                            long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                            long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                            ukf0 ukf0Var = vkf0VarD.a;
                            zjw zjwVar = ukf0Var.b;
                            tkf0 tkf0Var = ukf0Var.a;
                            b90 b90Var = n6sVar7.y;
                            long j8 = n6sVar7.z;
                            boolean zC = ulf0.c(j6);
                            mly mlyVar5 = mlyVar;
                            if (!zC) {
                                b90Var.m(j8);
                                int iB3 = mlyVar5.b(ulf0.f(j6));
                                int iB4 = mlyVar5.b(ulf0.e(j6));
                                if (iB3 != iB4) {
                                    lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                }
                            } else if (ulf0.c(j7)) {
                                ijf0 ijf0Var117 = ijf0Var3;
                                if (!ulf0.c(ijf0Var117.b)) {
                                    b90Var.m(j8);
                                    long j9 = ijf0Var117.b;
                                    int iB5 = mlyVar5.b(ulf0.f(j9));
                                    int iB6 = mlyVar5.b(ulf0.e(j9));
                                    if (iB5 != iB6) {
                                        lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                    }
                                }
                            } else {
                                long jC = tkf0Var.b.c();
                                j58 j58Var = new j58(jC);
                                if (jC == 16) {
                                    j58Var = null;
                                }
                                long j10 = j58Var != null ? j58Var.a : j58.b;
                                b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                int iB7 = mlyVar5.b(ulf0.f(j7));
                                int iB8 = mlyVar5.b(ulf0.e(j7));
                                if (iB7 != iB8) {
                                    lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                }
                            }
                            boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                            if (z30) {
                                long j11 = ukf0Var.c;
                                lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                lc6VarA.p();
                                lc6VarA.i(lk40VarB);
                            }
                            ora0 ora0Var = tkf0Var.b.a;
                            yef0 yef0Var = ora0Var.m;
                            kjf0 kjf0Var = ora0Var.a;
                            if (yef0Var == null) {
                                yef0Var = yef0.b;
                            }
                            yef0 yef0Var2 = yef0Var;
                            ix80 ix80Var = ora0Var.n;
                            if (ix80Var == null) {
                                ix80Var = ix80.d;
                            }
                            ix80 ix80Var2 = ix80Var;
                            wcf wcfVar = ora0Var.p;
                            if (wcfVar == null) {
                                wcfVar = rlh.a;
                            }
                            wcf wcfVar2 = wcfVar;
                            try {
                                ya5 ya5VarE = kjf0Var.e();
                                kjf0.a aVar110 = kjf0.a.a;
                                if (ya5VarE != null) {
                                    gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar110 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                } else {
                                    zjwVar.i(lc6VarA, kjf0Var != aVar110 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                }
                            } finally {
                                if (z30) {
                                    lc6VarA.f();
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                r16.r(objY8);
            } else {
                objY8 = new Function1() { // from class: t3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        tcf tcfVar = (tcf) obj5;
                        n6s n6sVar7 = n6sVar4;
                        vkf0 vkf0VarD = n6sVar7.d();
                        if (vkf0VarD != null) {
                            lc6 lc6VarA = tcfVar.F1().a();
                            long j6 = ((ulf0) ((x5a0) n6sVar7.A).getValue()).a;
                            long j7 = ((ulf0) ((x5a0) n6sVar7.B).getValue()).a;
                            ukf0 ukf0Var = vkf0VarD.a;
                            zjw zjwVar = ukf0Var.b;
                            tkf0 tkf0Var = ukf0Var.a;
                            b90 b90Var = n6sVar7.y;
                            long j8 = n6sVar7.z;
                            boolean zC = ulf0.c(j6);
                            mly mlyVar5 = mlyVar;
                            if (!zC) {
                                b90Var.m(j8);
                                int iB3 = mlyVar5.b(ulf0.f(j6));
                                int iB4 = mlyVar5.b(ulf0.e(j6));
                                if (iB3 != iB4) {
                                    lc6VarA.m(ukf0Var.k(iB3, iB4), b90Var);
                                }
                            } else if (ulf0.c(j7)) {
                                ijf0 ijf0Var117 = ijf0Var3;
                                if (!ulf0.c(ijf0Var117.b)) {
                                    b90Var.m(j8);
                                    long j9 = ijf0Var117.b;
                                    int iB5 = mlyVar5.b(ulf0.f(j9));
                                    int iB6 = mlyVar5.b(ulf0.e(j9));
                                    if (iB5 != iB6) {
                                        lc6VarA.m(ukf0Var.k(iB5, iB6), b90Var);
                                    }
                                }
                            } else {
                                long jC = tkf0Var.b.c();
                                j58 j58Var = new j58(jC);
                                if (jC == 16) {
                                    j58Var = null;
                                }
                                long j10 = j58Var != null ? j58Var.a : j58.b;
                                b90Var.m(j58.c(j58.d(j10) * 0.2f, j10));
                                int iB7 = mlyVar5.b(ulf0.f(j7));
                                int iB8 = mlyVar5.b(ulf0.e(j7));
                                if (iB7 != iB8) {
                                    lc6VarA.m(ukf0Var.k(iB7, iB8), b90Var);
                                }
                            }
                            boolean z30 = ukf0Var.f() && tkf0Var.f != 3;
                            if (z30) {
                                long j11 = ukf0Var.c;
                                lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                lc6VarA.p();
                                lc6VarA.i(lk40VarB);
                            }
                            ora0 ora0Var = tkf0Var.b.a;
                            yef0 yef0Var = ora0Var.m;
                            kjf0 kjf0Var = ora0Var.a;
                            if (yef0Var == null) {
                                yef0Var = yef0.b;
                            }
                            yef0 yef0Var2 = yef0Var;
                            ix80 ix80Var = ora0Var.n;
                            if (ix80Var == null) {
                                ix80Var = ix80.d;
                            }
                            ix80 ix80Var2 = ix80Var;
                            wcf wcfVar = ora0Var.p;
                            if (wcfVar == null) {
                                wcfVar = rlh.a;
                            }
                            wcf wcfVar2 = wcfVar;
                            try {
                                ya5 ya5VarE = kjf0Var.e();
                                kjf0.a aVar110 = kjf0.a.a;
                                if (ya5VarE != null) {
                                    gy9.a(zjwVar, lc6VarA, ya5VarE, kjf0Var != aVar110 ? kjf0Var.a() : 1.0f, ix80Var2, yef0Var2, wcfVar2);
                                } else {
                                    zjwVar.i(lc6VarA, kjf0Var != aVar110 ? kjf0Var.d() : j58.b, ix80Var2, yef0Var2, wcfVar2);
                                }
                            } finally {
                                if (z30) {
                                    lc6VarA.f();
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                r16.r(objY8);
            }
            d dVarA11111116 = androidx.compose.ui.draw.a.a(aVar4, (Function1) objY8);
            boolean zA111111112 = r16.A(n6sVar4);
            if (i11 == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zM117 = zA111111112 | z17 | r16.M(a8j0Var2) | r16.A(iif0Var2);
            if (i14 == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            zA5 = zM117 | z18 | r16.A(mlyVar);
            objY9 = r16.y();
            if (zA5) {
                final ijf0 ijf0Var117 = ijf0Var3;
                Function1 function111112 = new Function1() { // from class: u3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        dkf0 dkf0Var2;
                        urr urrVar;
                        urr urrVar2;
                        n6s n6sVar7 = n6sVar4;
                        ytw ytwVar2 = n6sVar7.o;
                        urr urrVar3 = (urr) obj5;
                        n6sVar7.h = urrVar3;
                        vkf0 vkf0VarD = n6sVar7.d();
                        if (vkf0VarD != null) {
                            vkf0VarD.b = urrVar3;
                        }
                        if (z2) {
                            ocl oclVarA = n6sVar7.a();
                            ocl oclVar = ocl.b;
                            iif0 iif0Var119 = iif0Var2;
                            ijf0 ijf0Var118 = ijf0Var117;
                            if (oclVarA == oclVar) {
                                if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                    iif0Var119.r();
                                } else {
                                    iif0Var119.k();
                                }
                                ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var119, true)));
                                ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var119, false)));
                                ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var118.b)));
                            } else if (n6sVar7.a() == ocl.c) {
                                ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var119, true)));
                            }
                            mly mlyVar5 = mlyVar;
                            j4b.f(n6sVar7, ijf0Var118, mlyVar5);
                            vkf0 vkf0VarD2 = n6sVar7.d();
                            if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                ukf0 ukf0Var = vkf0VarD2.a;
                                wff0 wff0Var = new wff0(urrVar);
                                lk40 lk40VarA = z880.a(urrVar);
                                lk40 lk40VarP = urrVar.P(urrVar2, false);
                                if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                    dkf0Var2.b.h(ijf0Var118, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                a8j0Var = a8j0Var2;
                r16.r(function111112);
                objY9 = function111112;
            } else {
                final ijf0 ijf0Var118 = ijf0Var3;
                Function1 function111113 = new Function1() { // from class: u3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        dkf0 dkf0Var2;
                        urr urrVar;
                        urr urrVar2;
                        n6s n6sVar7 = n6sVar4;
                        ytw ytwVar2 = n6sVar7.o;
                        urr urrVar3 = (urr) obj5;
                        n6sVar7.h = urrVar3;
                        vkf0 vkf0VarD = n6sVar7.d();
                        if (vkf0VarD != null) {
                            vkf0VarD.b = urrVar3;
                        }
                        if (z2) {
                            ocl oclVarA = n6sVar7.a();
                            ocl oclVar = ocl.b;
                            iif0 iif0Var119 = iif0Var2;
                            ijf0 ijf0Var119 = ijf0Var118;
                            if (oclVarA == oclVar) {
                                if (((Boolean) ((x5a0) n6sVar7.l).getValue()).booleanValue() && a8j0Var2.b()) {
                                    iif0Var119.r();
                                } else {
                                    iif0Var119.k();
                                }
                                ((x5a0) n6sVar7.m).setValue(Boolean.valueOf(nif0.b(iif0Var119, true)));
                                ((x5a0) n6sVar7.n).setValue(Boolean.valueOf(nif0.b(iif0Var119, false)));
                                ((x5a0) ytwVar2).setValue(Boolean.valueOf(ulf0.c(ijf0Var119.b)));
                            } else if (n6sVar7.a() == ocl.c) {
                                ((x5a0) ytwVar2).setValue(Boolean.valueOf(nif0.b(iif0Var119, true)));
                            }
                            mly mlyVar5 = mlyVar;
                            j4b.f(n6sVar7, ijf0Var119, mlyVar5);
                            vkf0 vkf0VarD2 = n6sVar7.d();
                            if (vkf0VarD2 != null && (dkf0Var2 = n6sVar7.e) != null && n6sVar7.b() && (urrVar = vkf0VarD2.b) != null && urrVar.e() && (urrVar2 = vkf0VarD2.c) != null) {
                                ukf0 ukf0Var = vkf0VarD2.a;
                                wff0 wff0Var = new wff0(urrVar);
                                lk40 lk40VarA = z880.a(urrVar);
                                lk40 lk40VarP = urrVar.P(urrVar2, false);
                                if (Intrinsics.g(dkf0Var2.a.b.get(), dkf0Var2)) {
                                    dkf0Var2.b.h(ijf0Var119, mlyVar5, ukf0Var, wff0Var, lk40VarA, lk40VarP);
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                a8j0Var = a8j0Var2;
                r16.r(function111113);
                objY9 = function111113;
            }
            d dVarA11111117 = v.a(aVar4, (Function1) objY9);
            mlyVar2 = mlyVar;
            n6sVar5 = n6sVar4;
            v5b v5bVar15 = v5bVar2;
            ujf0Var2 = ujf0Var;
            iif0Var3 = iif0Var2;
            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier13 = new CoreTextFieldSemanticsModifier(wsg0Var, ijf0Var, n6sVar5, z3, z2, uni0Var instanceof zwz, mlyVar2, iif0Var3, bcnVar, b5iVar);
            if (!z2) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (z19) {
                dVarA2 = c.a(aVar4, gnn.a, new off0(ya5Var, n6sVar5, ijf0Var, mlyVar2));
            } else {
                dVarA2 = aVar4;
            }
            zA6 = r16.A(iif0Var3);
            objY10 = r16.y();
            if (zA6) {
                objY10 = new v3b(iif0Var3, 0);
                r16.r(objY10);
            } else {
                objY10 = new v3b(iif0Var3, 0);
                r16.r(objY10);
            }
            xvf.c(iif0Var3, (Function1) objY10, r16);
            boolean zA111111113 = r16.A(n6sVar5) | r16.A(ujf0Var2);
            if (i14 == 4) {
                z20 = true;
            } else {
                z20 = false;
            }
            z21 = zA111111113 | z20 | ((i9 <= 32 && r16.M(bcnVar)) || (i13 & 48) == 32);
            objY11 = r16.y();
            if (z21) {
                objY11 = new Function1() { // from class: w3b
                    /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        n6s n6sVar7 = n6sVar5;
                        if (n6sVar7.b()) {
                            osf osfVar2 = n6sVar7.d;
                            l6s l6sVar13 = n6sVar7.v;
                            uhi uhiVar = n6sVar7.w;
                            dq40 dq40Var = new dq40();
                            vff0 vff0Var = new vff0(osfVar2, l6sVar13, dq40Var);
                            ujf0 ujf0Var119 = ujf0Var2;
                            rk10 rk10Var = ujf0Var119.a;
                            rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                            ?? dkf0Var2 = new dkf0(ujf0Var119, rk10Var);
                            ujf0Var119.b.set((dkf0) dkf0Var2);
                            dq40Var.a = dkf0Var2;
                            n6sVar7.e = dkf0Var2;
                        }
                        return new i4b();
                    }
                };
                r16.r(objY11);
            } else {
                objY11 = new Function1() { // from class: w3b
                    /* JADX WARN: Type inference failed for: r6v3, types: [T, dkf0, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        n6s n6sVar7 = n6sVar5;
                        if (n6sVar7.b()) {
                            osf osfVar2 = n6sVar7.d;
                            l6s l6sVar13 = n6sVar7.v;
                            uhi uhiVar = n6sVar7.w;
                            dq40 dq40Var = new dq40();
                            vff0 vff0Var = new vff0(osfVar2, l6sVar13, dq40Var);
                            ujf0 ujf0Var119 = ujf0Var2;
                            rk10 rk10Var = ujf0Var119.a;
                            rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
                            ?? dkf0Var2 = new dkf0(ujf0Var119, rk10Var);
                            ujf0Var119.b.set((dkf0) dkf0Var2);
                            dq40Var.a = dkf0Var2;
                            n6sVar7.e = dkf0Var2;
                        }
                        return new i4b();
                    }
                };
                r16.r(objY11);
            }
            xvf.c(bcnVar, (Function1) objY11, r16);
            l6s l6sVar13 = n6sVar5.v;
            if (i == 1) {
                z22 = true;
            } else {
                z22 = false;
            }
            chf0 chf0Var13 = new chf0(n6sVar5, iif0Var3, ijf0Var, z2111111, z22, mlyVar2, odh0Var, l6sVar13, bcnVar.e);
            gnn.a aVar110 = gnn.a;
            d dVarA11111118 = c.a(aVar4, aVar110, chf0Var13);
            i12 = bcnVar.d;
            if (i12 == 7) {
                z23 = false;
            } else {
                z23 = true;
            }
            boolean zBooleanValue13 = ((Boolean) ytwVar.getValue()).booleanValue();
            zB = r16.b(z23) | r16.A(x5sVar);
            objY12 = r16.y();
            if (zB) {
                objY12 = new Function0() { // from class: j3b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z23) {
                            x5sVar.i();
                        }
                        return Unit.a;
                    }
                };
                r16.r(objY12);
            } else {
                objY12 = new Function0() { // from class: j3b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z23) {
                            x5sVar.i();
                        }
                        return Unit.a;
                    }
                };
                r16.r(objY12);
            }
            d dVarA11111119 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue13, z23, (Function0) objY12);
            j2 = ((j58) r16.O(vl1.a)).a;
            zA7 = r16.A(n6sVar5) | r16.e(j2);
            objY13 = r16.y();
            if (zA7) {
                objY13 = new Function1() { // from class: i3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        tcf tcfVar = (tcf) obj5;
                        n6s n6sVar7 = n6sVar5;
                        if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                            tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                        }
                        return Unit.a;
                    }
                };
                r16.r(objY13);
            } else {
                objY13 = new Function1() { // from class: i3b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        tcf tcfVar = (tcf) obj5;
                        n6s n6sVar7 = n6sVar5;
                        if (((Boolean) ((x5a0) n6sVar7.s).getValue()).booleanValue() || ((Boolean) ((x5a0) n6sVar7.t).getValue()).booleanValue()) {
                            tcf.m0(tcfVar, j2, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                        }
                        return Unit.a;
                    }
                };
                r16.r(objY13);
            }
            yhf0 yhf0Var14 = yhf0Var;
            z24 = false;
            d dVarA111111110 = androidx.compose.foundation.text.contextmenu.modifier.b.a(v.a(c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.n(androidx.compose.ui.draw.a.a(aVar4, (Function1) objY13)), x5sVar, n6sVar5, iif0Var3).n(dVarA11111119).n(dVarA11111115), new zff0(k4iVar, n6sVar5)), new l4b(n6sVar5, iif0Var3)).n(dVarA11111118), aVar110, new uhf0(yhf0Var14, z2, pswVar)).n(dVarC13).n(coreTextFieldSemanticsModifier13), new f4b(n6sVar5)), new qif0(0, iif0Var3, v5bVar15));
            if (z2) {
                z24 = true;
            }
            if (z24) {
                dVarA3 = aVar4;
            } else {
                dVarA3 = aVar4;
            }
            ?? r111112 = r16;
            b(dVarA111111110, iif0Var3, pp8.b(-814563849, new e4b(gajVar, n6sVar5, imf0Var, i2, i, yhf0Var14, ijf0Var, uni0Var, dVarA2, dVarA11111116, dVarA11111117, dVarA3, ia5Var2, iif0Var3, z24, z3, function2, mlyVar2, mmdVar2), r111112), r111112, 384);
            r15 = r111112;
        } else {
            ?? r120 = I;
            r120.G();
            r15 = r120;
        }
        e eVarZ = r15.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: o3b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iA = qj40.a(i3 | 1);
                    int iA2 = qj40.a(i4);
                    j4b.a(ijf0Var, function1, dVar, imf0Var, uni0Var, function2, pswVar, ya5Var, z, i, i2, bcnVar, tnpVar, z2, z3, gajVar, (a) obj5, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, iif0 iif0Var, op8 op8Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(2036174316);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.A(iif0Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            aiv aivVarC = g75.c(ht.a.a, true);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
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
            i1b.a(iif0Var, op8Var, bVarI, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new k3b(dVar, iif0Var, op8Var, i, 0);
        }
    }

    public static final void c(final iif0 iif0Var, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        vkf0 vkf0VarD;
        androidx.compose.runtime.b bVarI = aVar.i(626339208);
        int i2 = (bVarI.A(iif0Var) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16);
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.G();
        } else if (z) {
            bVarI.N(1529773841);
            n6s n6sVar = iif0Var.d;
            ukf0 ukf0Var = null;
            if (n6sVar != null && (vkf0VarD = n6sVar.d()) != null) {
                ukf0 ukf0Var2 = vkf0VarD.a;
                n6s n6sVar2 = iif0Var.d;
                if (!(n6sVar2 != null ? n6sVar2.p : true)) {
                    ukf0Var = ukf0Var2;
                }
            }
            if (ukf0Var == null) {
                bVarI.N(1530097387);
            } else {
                bVarI.N(1530097388);
                if (ulf0.c(iif0Var.j().b)) {
                    bVarI.N(2110860558);
                    bVarI.X(false);
                } else {
                    bVarI.N(2109807302);
                    int iB = iif0Var.b.b((int) (iif0Var.j().b >> 32));
                    int iB2 = iif0Var.b.b((int) (iif0Var.j().b & 4294967295L));
                    lg50 lg50VarA = ukf0Var.a(iB);
                    lg50 lg50VarA2 = ukf0Var.a(Math.max(iB2 - 1, 0));
                    n6s n6sVar3 = iif0Var.d;
                    if (n6sVar3 == null || !((Boolean) ((x5a0) n6sVar3.m).getValue()).booleanValue()) {
                        bVarI.N(2110490542);
                        bVarI.X(false);
                    } else {
                        bVarI.N(2110225306);
                        nif0.a(true, lg50VarA, iif0Var, bVarI, ((i2 << 6) & 896) | 6);
                        bVarI.X(false);
                    }
                    n6s n6sVar4 = iif0Var.d;
                    if (n6sVar4 == null || !((Boolean) ((x5a0) n6sVar4.n).getValue()).booleanValue()) {
                        bVarI.N(2110838734);
                        bVarI.X(false);
                    } else {
                        bVarI.N(2110574459);
                        nif0.a(false, lg50VarA2, iif0Var, bVarI, ((i2 << 6) & 896) | 6);
                        bVarI.X(false);
                    }
                    bVarI.X(false);
                }
                n6s n6sVar5 = iif0Var.d;
                if (n6sVar5 != null) {
                    ytw ytwVar = n6sVar5.l;
                    if (!Intrinsics.g(iif0Var.v.a.b, iif0Var.j().a.b)) {
                        ((x5a0) ytwVar).setValue(Boolean.FALSE);
                    }
                    if (n6sVar5.b()) {
                        if (((Boolean) ((x5a0) ytwVar).getValue()).booleanValue()) {
                            iif0Var.r();
                        } else {
                            iif0Var.k();
                        }
                    }
                    Unit unit = Unit.a;
                }
            }
            bVarI.X(false);
            bVarI.X(false);
        } else {
            bVarI.N(1989076778);
            bVarI.X(false);
            iif0Var.k();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, i) { // from class: n3b
                public final /* synthetic */ boolean b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j4b.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final iif0 iif0Var, androidx.compose.runtime.a aVar, final int i) {
        nk0 nk0VarI;
        androidx.compose.runtime.b bVarI = aVar.i(-1436003720);
        int i2 = (bVarI.A(iif0Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            n6s n6sVar = iif0Var.d;
            if (n6sVar == null || !((Boolean) ((x5a0) n6sVar.o).getValue()).booleanValue() || (nk0VarI = iif0Var.i()) == null || nk0VarI.b.length() <= 0) {
                bVarI.N(-2111021718);
                bVarI.X(false);
            } else {
                bVarI.N(-2112330600);
                boolean zM = bVarI.M(iif0Var);
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (zM || objY == c0042a) {
                    objY = new fif0(iif0Var);
                    bVarI.r(objY);
                }
                fff0 fff0Var = (fff0) objY;
                mmd mmdVar = (mmd) bVarI.O(kna.h);
                mly mlyVar = iif0Var.b;
                long j = iif0Var.j().b;
                int i3 = ulf0.c;
                int iB = mlyVar.b((int) (j >> 32));
                n6s n6sVar2 = iif0Var.d;
                vkf0 vkf0VarD = n6sVar2 != null ? n6sVar2.d() : null;
                vkf0VarD.getClass();
                ukf0 ukf0Var = vkf0VarD.a;
                lk40 lk40VarC = ukf0Var.c(f.e(iB, 0, ukf0Var.a.a.b.length()));
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((mmdVar.C1(2.0f) / 2.0f) + lk40VarC.a)) << 32) | (((long) Float.floatToRawIntBits(lk40VarC.d)) & 4294967295L);
                boolean zE = bVarI.e(jFloatToRawIntBits);
                Object objY2 = bVarI.y();
                if (zE || objY2 == c0042a) {
                    objY2 = new a(jFloatToRawIntBits);
                    bVarI.r(objY2);
                }
                ply plyVar = (ply) objY2;
                boolean zA = bVarI.A(fff0Var) | bVarI.A(iif0Var);
                Object objY3 = bVarI.y();
                if (zA || objY3 == c0042a) {
                    objY3 = new b(fff0Var, iif0Var);
                    bVarI.r(objY3);
                }
                d dVarA = wje0.a(d.a.b, fff0Var, (PointerInputEventHandler) objY3);
                boolean zE2 = bVarI.e(jFloatToRawIntBits);
                Object objY4 = bVarI.y();
                if (zE2 || objY4 == c0042a) {
                    objY4 = new Function1() { // from class: l3b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((pb80) obj).b(r880.a, new q880(lcl.a, jFloatToRawIntBits, p880.b, true));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                s60.a(plyVar, xa80.b(dVarA, false, (Function1) objY4), 0L, bVarI, 0);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: m3b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j4b.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(n6s n6sVar) {
        dkf0 dkf0Var = n6sVar.e;
        if (dkf0Var != null) {
            n6sVar.v.invoke(ijf0.a(n6sVar.d.a, null, 0L, 3));
            ujf0 ujf0Var = dkf0Var.a;
            AtomicReference<dkf0> atomicReference = ujf0Var.b;
            while (!atomicReference.compareAndSet(dkf0Var, null)) {
                if (atomicReference.get() != dkf0Var) {
                }
            }
            ujf0Var.a.b();
        }
        n6sVar.e = null;
    }

    public static final void f(n6s n6sVar, ijf0 ijf0Var, mly mlyVar) {
        c5a0.e.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            vkf0 vkf0VarD = n6sVar.d();
            if (vkf0VarD == null) {
                return;
            }
            dkf0 dkf0Var = n6sVar.e;
            if (dkf0Var == null) {
                return;
            }
            urr urrVarC = n6sVar.c();
            if (urrVarC == null) {
                return;
            }
            xff0.a(ijf0Var, n6sVar.a, vkf0VarD.a, urrVarC, dkf0Var, n6sVar.b(), mlyVar);
            Unit unit = Unit.a;
        } finally {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, dkf0, java.lang.Object] */
    public static final void g(ujf0 ujf0Var, n6s n6sVar, ijf0 ijf0Var, bcn bcnVar, mly mlyVar) {
        osf osfVar = n6sVar.d;
        l6s l6sVar = n6sVar.v;
        uhi uhiVar = n6sVar.w;
        dq40 dq40Var = new dq40();
        vff0 vff0Var = new vff0(osfVar, l6sVar, dq40Var);
        rk10 rk10Var = ujf0Var.a;
        rk10Var.c(ijf0Var, bcnVar, vff0Var, uhiVar);
        ?? dkf0Var = new dkf0(ujf0Var, rk10Var);
        ujf0Var.b.set((dkf0) dkf0Var);
        dq40Var.a = dkf0Var;
        n6sVar.e = dkf0Var;
        f(n6sVar, ijf0Var, mlyVar);
    }
}
