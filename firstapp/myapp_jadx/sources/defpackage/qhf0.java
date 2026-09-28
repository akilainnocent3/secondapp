package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class qhf0 implements PointerInputEventHandler {
    public final /* synthetic */ v5b a;
    public final /* synthetic */ ytw<mp20.b> b;
    public final /* synthetic */ psw c;
    public final /* synthetic */ ytw d;

    @c0d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<ip20, gly, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ ip20 b;
        public /* synthetic */ long c;
        public final /* synthetic */ v5b d;
        public final /* synthetic */ ytw<mp20.b> e;
        public final /* synthetic */ psw f;

        /* JADX INFO: renamed from: qhf0$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend")
        public static final class C1015a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ ytw<mp20.b> c;
            public final /* synthetic */ long d;
            public final /* synthetic */ psw e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1015a(ytw<mp20.b> ytwVar, long j, psw pswVar, v1b<? super C1015a> v1bVar) {
                super(2, v1bVar);
                this.c = ytwVar;
                this.d = j;
                this.e = pswVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1015a(this.c, this.d, this.e, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1015a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0051  */
            /* JADX WARN: Code duplicated, block: B:24:0x005c  */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
            
                if (r3.a(r1, r7) == r0) goto L23;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r7.b
                    r2 = 0
                    psw r3 = r7.e
                    r4 = 2
                    r5 = 1
                    ytw<mp20$b> r6 = r7.c
                    if (r1 == 0) goto L27
                    if (r1 == r5) goto L1f
                    if (r1 != r4) goto L19
                    java.lang.Object r7 = r7.a
                    mp20$b r7 = (mp20.b) r7
                    defpackage.uj50.b(r8)
                    goto L5d
                L19:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r7)
                    return r2
                L1f:
                    java.lang.Object r1 = r7.a
                    ytw r1 = (defpackage.ytw) r1
                    defpackage.uj50.b(r8)
                    goto L45
                L27:
                    defpackage.uj50.b(r8)
                    java.lang.Object r8 = r6.getValue()
                    mp20$b r8 = (mp20.b) r8
                    if (r8 == 0) goto L48
                    mp20$a r1 = new mp20$a
                    r1.<init>(r8)
                    if (r3 == 0) goto L44
                    r7.a = r6
                    r7.b = r5
                    java.lang.Object r8 = r3.a(r1, r7)
                    if (r8 != r0) goto L44
                    goto L5b
                L44:
                    r1 = r6
                L45:
                    r1.setValue(r2)
                L48:
                    mp20$b r8 = new mp20$b
                    long r1 = r7.d
                    r8.<init>(r1)
                    if (r3 == 0) goto L5e
                    r7.a = r8
                    r7.b = r4
                    java.lang.Object r7 = r3.a(r8, r7)
                    if (r7 != r0) goto L5c
                L5b:
                    return r0
                L5c:
                    r7 = r8
                L5d:
                    r8 = r7
                L5e:
                    r6.setValue(r8)
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: qhf0.a.C1015a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public ytw a;
            public int b;
            public final /* synthetic */ ytw<mp20.b> c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ psw e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ytw<mp20.b> ytwVar, boolean z, psw pswVar, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.c = ytwVar;
                this.d = z;
                this.e = pswVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.c, this.d, this.e, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                ytw<mp20.b> ytwVar;
                ytw<mp20.b> ytwVar2;
                y5b y5bVar = y5b.a;
                int i = this.b;
                if (i == 0) {
                    uj50.b(obj);
                    ytwVar = this.c;
                    mp20.b value = ytwVar.getValue();
                    if (value != null) {
                        xxo cVar = this.d ? new mp20.c(value) : new mp20.a(value);
                        psw pswVar = this.e;
                        if (pswVar != null) {
                            this.a = ytwVar;
                            this.b = 1;
                            if (pswVar.a(cVar, this) == y5bVar) {
                                return y5bVar;
                            }
                            ytwVar2 = ytwVar;
                        }
                        ytwVar.setValue(null);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ytwVar2 = this.a;
                uj50.b(obj);
                ytwVar = ytwVar2;
                ytwVar.setValue(null);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v5b v5bVar, ytw<mp20.b> ytwVar, psw pswVar, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.d = v5bVar;
            this.e = ytwVar;
            this.f = pswVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(ip20 ip20Var, gly glyVar, v1b<? super Unit> v1bVar) {
            long j = glyVar.a;
            ytw<mp20.b> ytwVar = this.e;
            psw pswVar = this.f;
            a aVar = new a(this.d, ytwVar, pswVar, v1bVar);
            aVar.b = ip20Var;
            aVar.c = j;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            v5b v5bVar = this.d;
            if (i == 0) {
                uj50.b(obj);
                ip20 ip20Var = this.b;
                ej5.c(v5bVar, null, null, new C1015a(this.e, this.c, this.f, null), 3);
                this.a = 1;
                obj = ip20Var.Y(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ej5.c(v5bVar, null, null, new b(this.e, ((Boolean) obj).booleanValue(), this.f, null), 3);
            return Unit.a;
        }
    }

    public qhf0(v5b v5bVar, ytw ytwVar, psw pswVar, ytw ytwVar2) {
        this.a = v5bVar;
        this.b = ytwVar;
        this.c = pswVar;
        this.d = ytwVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        a aVar = new a(this.a, this.b, this.c, null);
        final ytw ytwVar = this.d;
        Function1 function1 = new Function1() { // from class: phf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Function1) ytwVar.getValue()).invoke((gly) obj);
                return Unit.a;
            }
        };
        u4f0.a aVar2 = u4f0.a;
        Object objD = w5b.d(new x4f0(u020Var, aVar, function1, new lp20(u020Var), null), v1bVar);
        y5b y5bVar = y5b.a;
        if (objD != y5bVar) {
            objD = Unit.a;
        }
        return objD == y5bVar ? objD : Unit.a;
    }
}
