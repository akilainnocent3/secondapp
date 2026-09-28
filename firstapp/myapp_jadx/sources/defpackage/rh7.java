package defpackage;

import com.sportygames.compose.chat.data.model.ChatErrorResponse;
import com.sportygames.compose.chat.data.model.SendMessageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$sendMessage$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class rh7 extends tje0 implements Function2<jj50<? extends SendMessageResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hh7 b;

    @c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$sendMessage$1$1", f = "ChatViewModel.kt", l = {135}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ hh7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hh7 hh7Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = hh7Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = this.b.J;
                zg7.a aVar = new zg7.a(true);
                this.a = 1;
                if (b390Var.emit(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$sendMessage$1$2", f = "ChatViewModel.kt", l = {141}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ hh7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hh7 hh7Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = hh7Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = this.b.J;
                zg7.a aVar = new zg7.a(false);
                this.a = 1;
                if (b390Var.emit(aVar, this) == y5bVar) {
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
    public rh7(hh7 hh7Var, v1b<? super rh7> v1bVar) {
        super(2, v1bVar);
        this.b = hh7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rh7 rh7Var = new rh7(this.b, v1bVar);
        rh7Var.a = obj;
        return rh7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jj50<? extends SendMessageResponse> jj50Var, v1b<? super Unit> v1bVar) {
        return ((rh7) create(jj50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Integer errorCode;
        Integer errorCode2;
        jj50 jj50Var = (jj50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(jj50Var instanceof jj50.c)) {
            if (jj50Var instanceof jj50.a) {
                ChatErrorResponse chatErrorResponse = ((jj50.a) jj50Var).b;
                hh7 hh7Var = this.b;
                if ((chatErrorResponse == null || (errorCode2 = chatErrorResponse.getErrorCode()) == null || errorCode2.intValue() != 19003 || !c.l(chatErrorResponse.getErrorName(), "Set nickname to chat", false)) && (chatErrorResponse == null || (errorCode = chatErrorResponse.getErrorCode()) == null || errorCode.intValue() != 42001 || !c.l(chatErrorResponse.getErrorName(), "Only active users can access the feature", false))) {
                    if (c.l(chatErrorResponse != null ? chatErrorResponse.getErrorName() : null, "User is not a member of the group", false)) {
                        ej5.c(o8i0.d(hh7Var), null, null, new b(hh7Var, null), 3);
                    }
                } else {
                    ej5.c(o8i0.d(hh7Var), null, null, new a(hh7Var, null), 3);
                }
            } else if (!(jj50Var instanceof jj50.b)) {
                uhc.a();
                return null;
            }
        }
        return Unit.a;
    }
}
