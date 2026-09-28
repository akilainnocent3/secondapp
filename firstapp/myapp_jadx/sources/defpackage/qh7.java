package defpackage;

import com.sportygames.compose.chat.data.model.BetHistoryItem;
import com.sportygames.compose.chat.data.model.ChatErrorResponse;
import com.sportygames.compose.chat.data.model.SendMessageRequest;
import com.sportygames.compose.chat.data.model.SendMessageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$sendBetHistoryMessage$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class qh7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ BetHistoryItem a;
    public final /* synthetic */ hh7 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    @c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$sendBetHistoryMessage$1$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<jj50<? extends SendMessageResponse>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ hh7 b;

        /* JADX INFO: renamed from: qh7$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$sendBetHistoryMessage$1$1$1", f = "ChatViewModel.kt", l = {242}, m = "invokeSuspend", v = 1)
        public static final class C1014a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ hh7 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1014a(hh7 hh7Var, v1b<? super C1014a> v1bVar) {
                super(2, v1bVar);
                this.b = hh7Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1014a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1014a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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

        @c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$sendBetHistoryMessage$1$1$2", f = "ChatViewModel.kt", l = {248}, m = "invokeSuspend", v = 1)
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
        public a(hh7 hh7Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = hh7Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jj50<? extends SendMessageResponse> jj50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(jj50Var, v1bVar)).invokeSuspend(Unit.a);
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
                        ej5.c(o8i0.d(hh7Var), null, null, new C1014a(hh7Var, null), 3);
                    }
                } else if (!(jj50Var instanceof jj50.b)) {
                    uhc.a();
                    return null;
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh7(BetHistoryItem betHistoryItem, hh7 hh7Var, String str, String str2, v1b<? super qh7> v1bVar) {
        super(2, v1bVar);
        this.a = betHistoryItem;
        this.b = hh7Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qh7(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qh7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hh7 hh7Var;
        SendMessageRequest.Json json;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.c;
        String strA = "";
        BetHistoryItem betHistoryItem = this.a;
        hh7 hh7Var2 = this.b;
        if (betHistoryItem != null) {
            b5 b5Var = hh7Var2.e;
            String userImage = b5Var.getUserImage();
            String nickName = b5Var.getNickName();
            if (nickName != null && nickName.length() != 0) {
                if (nickName.length() == 1) {
                    strA = tug.a(nickName, "***", nickName);
                } else {
                    strA = nickName.charAt(0) + "***" + nickName.charAt(nickName.length() - 1);
                }
            }
            String str2 = strA;
            if (Intrinsics.g(betHistoryItem.getSideBetType(), "OVER") || Intrinsics.g(betHistoryItem.getSideBetType(), "UNDER")) {
                hh7Var = hh7Var2;
                json = new SendMessageRequest.Json(userImage, Long.valueOf(betHistoryItem.getId()), null, betHistoryItem.getCurrency(), Double.valueOf(betHistoryItem.getHouseCoefficient()), Boolean.FALSE, str, str2, Double.valueOf(betHistoryItem.getPayoutAmount()), StringsKt.s0(betHistoryItem.getRoundId()), Double.valueOf(betHistoryItem.getStakeAmount()), betHistoryItem.getTargetCoefficient(), "over-under", betHistoryItem.getSideBetType(), null, null, null, 114688, null);
            } else if (Intrinsics.g(betHistoryItem.getSideBetType(), "OVER") || Intrinsics.g(betHistoryItem.getSideBetType(), "UNDER") || (!Intrinsics.g(betHistoryItem.getSideBetType(), "RANGE") && (betHistoryItem.getStartCoefficient() == null || betHistoryItem.getEndCoefficient() == null || betHistoryItem.getTargetCoefficient() != null))) {
                hh7Var = hh7Var2;
                json = new SendMessageRequest.Json(userImage, Long.valueOf(betHistoryItem.getId()), betHistoryItem.getCashoutCoefficient(), betHistoryItem.getCurrency(), Double.valueOf(betHistoryItem.getHouseCoefficient()), Boolean.FALSE, str, str2, Double.valueOf(betHistoryItem.getPayoutAmount()), StringsKt.s0(betHistoryItem.getRoundId()), Double.valueOf(betHistoryItem.getStakeAmount()), null, null, null, null, null, null, 129024, null);
            } else {
                hh7Var = hh7Var2;
                json = new SendMessageRequest.Json(userImage, Long.valueOf(betHistoryItem.getId()), null, betHistoryItem.getCurrency(), Double.valueOf(betHistoryItem.getHouseCoefficient()), Boolean.FALSE, str, str2, Double.valueOf(betHistoryItem.getPayoutAmount()), StringsKt.s0(betHistoryItem.getRoundId()), Double.valueOf(betHistoryItem.getStakeAmount()), null, "range", "RANGE", betHistoryItem.getStartCoefficient(), betHistoryItem.getEndCoefficient(), null, 67584, null);
            }
        } else {
            String userImage2 = hh7Var2.e.getUserImage();
            Boolean bool = Boolean.FALSE;
            String nickName2 = hh7Var2.e.getNickName();
            if (nickName2 != null && nickName2.length() != 0) {
                if (nickName2.length() == 1) {
                    strA = tug.a(nickName2, "***", nickName2);
                } else {
                    strA = nickName2.charAt(0) + "***" + nickName2.charAt(nickName2.length() - 1);
                }
            }
            String str3 = strA;
            hh7Var = hh7Var2;
            json = new SendMessageRequest.Json(userImage2, null, null, null, null, bool, str, str3, null, null, null, null, null, null, null, null, null, 129024, null);
        }
        SendMessageRequest sendMessageRequest = new SendMessageRequest(this.d, "JSON", null, null, json);
        mc80 mc80Var = (mc80) hh7Var.y.getValue();
        mc80Var.getClass();
        kzh.d(new g1i(new or60(new lc80(mc80Var, sendMessageRequest, null)), new a(hh7Var, null)), o8i0.d(hh7Var));
        return Unit.a;
    }
}
