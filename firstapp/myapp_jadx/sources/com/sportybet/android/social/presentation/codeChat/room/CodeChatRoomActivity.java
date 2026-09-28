package com.sportybet.android.social.presentation.codeChat.room;

import android.accounts.Account;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomActivity;
import defpackage.ad7;
import defpackage.be7;
import defpackage.c7i0;
import defpackage.cyb;
import defpackage.haj;
import defpackage.hsx;
import defpackage.ib5;
import defpackage.ja7;
import defpackage.jq40;
import defpackage.jv7;
import defpackage.lfy;
import defpackage.mv7;
import defpackage.oke;
import defpackage.op8;
import defpackage.paj;
import defpackage.pol;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.saj;
import defpackage.str;
import defpackage.td7;
import defpackage.tit;
import defpackage.u6i0;
import defpackage.v8i0;
import defpackage.w8;
import defpackage.wwd0;
import defpackage.zc7;
import defpackage.zyf0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/social/presentation/codeChat/room/CodeChatRoomActivity;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CodeChatRoomActivity extends pol {
    public static final /* synthetic */ int f = 0;
    public str<hsx> b;
    public hsx c;
    public final q8i0 d = new q8i0(jq40.a(be7.class), new e(), new d(), new f());
    public String e = "";

    public static final /* synthetic */ class a extends saj implements Function1<ad7, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ad7 ad7Var) {
            ad7 ad7Var2 = ad7Var;
            ad7Var2.getClass();
            CodeChatRoomActivity codeChatRoomActivity = (CodeChatRoomActivity) this.receiver;
            int i = CodeChatRoomActivity.f;
            codeChatRoomActivity.A1(ad7Var2);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            zyf0.d(str);
            return Unit.a;
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return CodeChatRoomActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return CodeChatRoomActivity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return CodeChatRoomActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final void A1(ad7 ad7Var) {
        int iOrdinal = ad7Var.ordinal();
        if (iOrdinal == 0) {
            getAccountHelper().demandAccount(this, new tit() { // from class: kv7
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    int i = CodeChatRoomActivity.f;
                    if (account != null) {
                        CodeChatRoomActivity codeChatRoomActivity = this.a;
                        codeChatRoomActivity.B1();
                        codeChatRoomActivity.A1(ad7.d);
                    }
                }
            });
            return;
        }
        if (iOrdinal == 2) {
            finish();
            return;
        }
        if (iOrdinal == 3) {
            if (getAccountHelper().isLogin()) {
                String lastNickName = getAccountHelper().getLastNickName();
                if (lastNickName == null || StringsKt.U(lastNickName)) {
                    wwd0 wwd0Var = z1().e;
                    wwd0Var.getClass();
                    wwd0Var.k(null, 0);
                    getAccountHelper().loadAccountInfo(new w8() { // from class: lv7
                        @Override // defpackage.w8
                        public final void a(AccountInfo accountInfo, String str, String str2) {
                            int i = CodeChatRoomActivity.f;
                            CodeChatRoomActivity codeChatRoomActivity = this.a;
                            codeChatRoomActivity.B1();
                            String lastNickName2 = codeChatRoomActivity.getAccountHelper().getLastNickName();
                            if (lastNickName2 == null || StringsKt.U(lastNickName2)) {
                                hsx hsxVar = codeChatRoomActivity.c;
                                if (hsxVar == null) {
                                    str<hsx> strVar = codeChatRoomActivity.b;
                                    if (strVar == null) {
                                        Intrinsics.n("nickNameDialogLazy");
                                        throw null;
                                    }
                                    hsxVar = strVar.get();
                                    codeChatRoomActivity.c = hsxVar;
                                    if (hsxVar != null) {
                                        hsxVar.y = new ov7(codeChatRoomActivity);
                                    }
                                }
                                if (hsxVar != null) {
                                    hsxVar.b();
                                }
                            }
                            kd2.a(8, codeChatRoomActivity.z1().e, null);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal == 6) {
            getAccountHelper().demandAccount(this, new mv7(this));
            return;
        }
        if (iOrdinal == 7) {
            new ja7().show(getSupportFragmentManager(), "chat_guideline");
        } else if (iOrdinal == 9) {
            zyf0.c(1, getCMSString(R.string.common_feedback__please_write_a_comment, new Object[0]));
        } else {
            if (iOrdinal != 10) {
                return;
            }
            zyf0.c(1, getCMSString(R.string.component_wap_share_bet__try_later_to_share_code, new Object[0]));
        }
    }

    public final void B1() {
        String userId = getAccountHelper().getUserId();
        if (userId == null) {
            userId = "";
        }
        String lastNickName = getAccountHelper().getLastNickName();
        z1().D1(userId, getCountryManager().getCountryCode(), lastNickName != null ? lastNickName : "");
        z1().D.m(ad7.f);
    }

    @Override // defpackage.r1k, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        Fragment fragmentH = getSupportFragmentManager().H("chat_room_fragment");
        td7 td7Var = fragmentH instanceof td7 ? (td7) fragmentH : null;
        if (td7Var != null) {
            td7Var.j0(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String userId;
        super.onCreate(bundle);
        setContentView(R.layout.activity_chat_room);
        String stringExtra = getIntent().getStringExtra("extra_booking_code");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (StringsKt.U(stringExtra)) {
            finish();
            return;
        }
        this.e = stringExtra;
        z1().B1("1.82.2", c7i0.AllCountries, zc7.b);
        be7 be7VarZ1 = z1();
        String str = this.e;
        str.getClass();
        be7VarZ1.V = str;
        if (getAccountHelper().isLogin() && (userId = getAccountHelper().getUserId()) != null) {
            if (StringsKt.U(userId)) {
                userId = null;
            }
            if (userId != null) {
                String lastNickName = getAccountHelper().getLastNickName();
                z1().D1(userId, getCountryManager().getCountryCode(), lastNickName != null ? lastNickName : "");
            }
        }
        ComposeView composeView = (ComposeView) findViewById(R.id.codeChatHeaderCompose);
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(-1280616202, new jv7(this, 0), true));
        if (bundle == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.r = true;
            td7 td7Var = new td7();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("arg_hide_share_button", true);
            bundle2.putBoolean("arg_force_dark_mode", false);
            td7Var.setArguments(bundle2);
            aVarA.f(R.id.chatRoomFragmentContainer, td7Var, "chat_room_fragment");
            aVarA.l();
        }
        z1().E.f(this, new c(new a(1, this, CodeChatRoomActivity.class, "onChatRoomEvent", "onChatRoomEvent(Lcom/sporty/android/chat/ChatRoomEvent;)V", 0)));
        z1().C.f(this, new c(new b(1, zyf0.a, zyf0.class, "showError", "showError(Ljava/lang/String;)V", 0)));
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (isFinishing()) {
            Fragment fragmentH = getSupportFragmentManager().H("chat_room_fragment");
            td7 td7Var = fragmentH instanceof td7 ? (td7) fragmentH : null;
            if (td7Var != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.o(td7Var);
                if (aVar.i) {
                    ib5.a("This transaction is already being added to the back stack");
                } else {
                    aVar.j = false;
                    aVar.t.D(aVar, true);
                }
            }
        }
    }

    public final be7 z1() {
        return (be7) this.d.getValue();
    }
}
