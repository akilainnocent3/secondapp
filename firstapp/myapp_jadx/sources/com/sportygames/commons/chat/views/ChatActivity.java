package com.sportygames.commons.chat.views;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.chat.remote.models.LeaveRequest;
import com.sportygames.chat.remote.models.OnlineCountResponse;
import com.sportygames.chat.remote.models.SendMessageResponse;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.chat.remote.models.SendMessageRequest;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.chat.views.ChatActivity.d;
import com.sportygames.commons.chat.views.ChatActivity.f;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.models.ToastCommonModel;
import com.sportygames.commons.remote.model.ChatErrorResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.ResultChatWrapper;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.remote.model.StatusChat;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pingpong.remote.models.MultiplierResponse;
import com.sportygames.sportyherov2.components.SHToastContainer;
import com.sportygames.sportyherov2.remote.models.BetHistoryItem;
import com.sportygames.sportyherov2.remote.models.TopWinResponse;
import com.twilio.voice.EventKeys;
import defpackage.a1s;
import defpackage.a6b;
import defpackage.a72;
import defpackage.b72;
import defpackage.b92;
import defpackage.bbs;
import defpackage.bk60;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.c28;
import defpackage.c77;
import defpackage.cj5;
import defpackage.cyb;
import defpackage.d77;
import defpackage.dik;
import defpackage.dq40;
import defpackage.dq7;
import defpackage.e1e0;
import defpackage.e72;
import defpackage.e80;
import defpackage.e97;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.elf;
import defpackage.ema;
import defpackage.fdt;
import defpackage.fse;
import defpackage.g6i0;
import defpackage.gh7;
import defpackage.gku;
import defpackage.goj;
import defpackage.gr60;
import defpackage.h5e;
import defpackage.ha7;
import defpackage.hkd;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.inm;
import defpackage.j1b;
import defpackage.jbh;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.kc6;
import defpackage.koj;
import defpackage.l87;
import defpackage.lqw;
import defpackage.lrn;
import defpackage.lu10;
import defpackage.m28;
import defpackage.m87;
import defpackage.mpa0;
import defpackage.mqw;
import defpackage.mz1;
import defpackage.nas;
import defpackage.np80;
import defpackage.nqw;
import defpackage.o72;
import defpackage.o87;
import defpackage.o8i0;
import defpackage.oa7;
import defpackage.op5;
import defpackage.op8;
import defpackage.oxy;
import defpackage.p87;
import defpackage.pfd;
import defpackage.ph7;
import defpackage.prr;
import defpackage.pya;
import defpackage.q8i0;
import defpackage.qi8;
import defpackage.qlf;
import defpackage.qlr;
import defpackage.qm70;
import defpackage.r2i;
import defpackage.r58;
import defpackage.r8i0;
import defpackage.rk60;
import defpackage.s87;
import defpackage.s8i0;
import defpackage.s97;
import defpackage.sgk;
import defpackage.sh7;
import defpackage.slr;
import defpackage.t97;
import defpackage.taj;
import defpackage.tb5;
import defpackage.tgp;
import defpackage.tje0;
import defpackage.tn80;
import defpackage.ttr;
import defpackage.tug;
import defpackage.u62;
import defpackage.u6i0;
import defpackage.u87;
import defpackage.uj50;
import defpackage.uke;
import defpackage.uy1;
import defpackage.v1b;
import defpackage.v2i;
import defpackage.v5b;
import defpackage.v87;
import defpackage.v8i0;
import defpackage.v97;
import defpackage.va0;
import defpackage.vij;
import defpackage.w5b;
import defpackage.w87;
import defpackage.wcl;
import defpackage.wf40;
import defpackage.wm70;
import defpackage.x5a0;
import defpackage.x87;
import defpackage.xag0;
import defpackage.xbg;
import defpackage.xjj;
import defpackage.xjo;
import defpackage.y5b;
import defpackage.y62;
import defpackage.y720;
import defpackage.y87;
import defpackage.ycv;
import defpackage.yg7;
import defpackage.yp40;
import defpackage.ypa0;
import defpackage.ytw;
import defpackage.z2i;
import defpackage.z62;
import defpackage.z87;
import defpackage.zj60;
import defpackage.zo80;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportygames/commons/chat/views/ChatActivity;", "Luy1;", "Lha7;", "Lxjj;", "Landroid/view/View$OnKeyListener;", "", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatActivity extends uy1<ha7> implements xjj, View.OnKeyListener {
    public static final /* synthetic */ int B0 = 0;
    public xbg A;
    public final v87 A0;
    public LinearLayoutManager I;
    public oa7 J;
    public jvd0 K;
    public dik M;
    public g N;
    public Rect O;
    public int P;
    public ViewGroup.LayoutParams Q;
    public ViewGroup.LayoutParams R;
    public rk60 S;
    public boolean T;
    public double U;
    public int V;
    public String W;
    public k X;
    public Handler Y;
    public final Handler Z;
    public TopWinResponse a0;
    public com.sportygames.pingpong.remote.models.TopWinResponse b0;
    public BetHistoryItem c0;
    public com.sportygames.pingpong.remote.models.BetHistoryItem d0;
    public com.sportygames.crash.remote.models.BetHistoryItem e0;
    public com.sportygames.pocketrocket.model.response.BetHistoryItem f0;
    public tb5 g0;
    public boolean h0;
    public final String i0;
    public j1b j0;
    public boolean k0;
    public int l0;
    public int m0;
    public long n0;
    public long o0;
    public final ytw<Boolean> p0;
    public final ytw<Boolean> q0;
    public final ytw<Boolean> r0;
    public final q8i0 s0;
    public mz1 t0;
    public cj5 u0;
    public StompClient v;
    public float v0;
    public float w0;
    public float x0;
    public final q8i0 y0;
    public ema z;
    public boolean z0;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean i = true;
    public final q8i0 w = new q8i0(jq40.a(ypa0.class), new d0(), new x(), new e0());
    public final q8i0 y = new q8i0(jq40.a(yg7.class), new g0(), new f0(), new h0());
    public final q8i0 B = new q8i0(jq40.a(oxy.class), new j0(), new i0(), new k0());
    public final q8i0 C = new q8i0(jq40.a(sh7.class), new o(), new n(), new p());
    public final q8i0 D = new q8i0(jq40.a(c28.class), new r(), new q(), new s());
    public final ttr E = hwr.a(a1s.c, new m());
    public final q8i0 F = new q8i0(jq40.a(y720.class), new u(), new t(), new v());
    public List<ChatListResponse> G = new ArrayList();
    public final HashMap<String, String> H = new HashMap<>();
    public String L = "";

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[StatusChat.values().length];
            try {
                iArr[StatusChat.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusChat.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusChat.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[bbs.a.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[0] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a0 extends qlr implements Function0<r8i0.c> {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChatActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$observeCrashMultiplier$1$1", f = "ChatActivity.kt", l = {2575}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ChatActivity.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0 && i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            do {
                ChatActivity chatActivity = ChatActivity.this;
                int i2 = chatActivity.l0;
                if (i2 <= 0) {
                    return Unit.a;
                }
                int i3 = i2 - 100;
                chatActivity.l0 = i3;
                ha7 ha7Var = (ha7) chatActivity.a;
                if (ha7Var != null) {
                    ha7Var.U.setProgress(i3);
                }
                this.a = 1;
            } while (hkd.b(100L, this) != y5bVar);
            return y5bVar;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b0 extends qlr implements Function0<v8i0> {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChatActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$observeMultiplier$1$1", f = "ChatActivity.kt", l = {2396}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ChatActivity.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0 && i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            do {
                ChatActivity chatActivity = ChatActivity.this;
                int i2 = chatActivity.l0;
                if (i2 <= 0) {
                    return Unit.a;
                }
                int i3 = i2 - 100;
                chatActivity.l0 = i3;
                ha7 ha7Var = (ha7) chatActivity.a;
                if (ha7Var != null) {
                    ha7Var.U.setProgress(i3);
                }
                this.a = 1;
            } while (hkd.b(100L, this) != y5bVar);
            return y5bVar;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c0 extends qlr implements Function0<cyb> {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChatActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$observePpMultiplier$1$1", f = "ChatActivity.kt", l = {2484}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public ChatActivity c;
        public int d;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ChatActivity.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        /* JADX WARN: Code duplicated, block: B:14:0x0039  */
        /* JADX WARN: Code duplicated, block: B:17:0x004e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x0039
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r8.d
                r2 = 50
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 != r3) goto L15
                int r1 = r8.b
                int r4 = r8.a
                com.sportygames.commons.chat.views.ChatActivity r5 = r8.c
                defpackage.uj50.b(r9)
                goto L4f
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                r8 = 0
                return r8
            L1c:
                defpackage.uj50.b(r9)
                com.sportygames.commons.chat.views.ChatActivity r9 = com.sportygames.commons.chat.views.ChatActivity.this
                int r1 = r9.m0
                int r1 = r1 / r2
                r4 = 0
                r5 = r4
                r4 = r1
                r1 = r5
                r5 = r9
            L29:
                if (r1 >= r4) goto L51
                int r9 = r5.l0
                if (r9 <= r2) goto L3e
                int r9 = r9 + (-50)
                r5.l0 = r9
                B extends g6i0 r6 = r5.a
                ha7 r6 = (defpackage.ha7) r6
                if (r6 == 0) goto L3e
                android.widget.SeekBar r6 = r6.U
                r6.setProgress(r9)
            L3e:
                r8.c = r5
                r8.a = r4
                r8.b = r1
                r8.d = r3
                r6 = 50
                java.lang.Object r9 = defpackage.hkd.b(r6, r8)
                if (r9 != r0) goto L4f
                return r0
            L4f:
                int r1 = r1 + r3
                goto L29
            L51:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.commons.chat.views.ChatActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d0 extends qlr implements Function0<v8i0> {
        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChatActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Editable text;
            Editable text2;
            ChatActivity chatActivity = ChatActivity.this;
            ha7 ha7Var = (ha7) chatActivity.a;
            if (ha7Var != null && (text2 = ha7Var.K.getText()) != null && text2.length() == 0) {
                ha7 ha7Var2 = (ha7) chatActivity.a;
                if (ha7Var2 != null) {
                    ha7Var2.V.setAlpha(0.5f);
                    return;
                }
                return;
            }
            ha7 ha7Var3 = (ha7) chatActivity.a;
            if (ha7Var3 != null) {
                ha7Var3.V.setAlpha(1.0f);
            }
            ha7 ha7Var4 = (ha7) chatActivity.a;
            if (ha7Var4 != null) {
                ha7Var4.D.setText(((ha7Var4 == null || (text = ha7Var4.K.getText()) == null) ? null : Integer.valueOf(text.length())) + "/160");
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e0 extends qlr implements Function0<cyb> {
        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChatActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = ChatActivity.B0;
            ChatActivity chatActivity = ChatActivity.this;
            chatActivity.F1().x1(chatActivity.e);
            chatActivity.P1();
            Handler handler = chatActivity.Y;
            if (handler != null) {
                handler.postDelayed(this, 15000L);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f0 extends qlr implements Function0<r8i0.c> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChatActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g implements TextWatcher {
        public String a = "";

        @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$onCreate$20$onTextChanged$1", f = "ChatActivity.kt", l = {844}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String b;
            public final /* synthetic */ g c;
            public final /* synthetic */ ChatActivity d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, g gVar, ChatActivity chatActivity, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = str;
                this.c = gVar;
                this.d = chatActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, this.d, v1bVar);
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
                    this.a = 1;
                    if (hkd.b(500L, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                String str = this.c.a;
                String str2 = this.b;
                boolean zG = Intrinsics.g(str2, str);
                ChatActivity chatActivity = this.d;
                if (zG) {
                    if (chatActivity.M == null) {
                        Intrinsics.n("gifViewModel");
                        throw null;
                    }
                    str2.getClass();
                }
                if (str2.length() != 0 || chatActivity.M != null) {
                    return Unit.a;
                }
                Intrinsics.n("gifViewModel");
                throw null;
            }
        }

        public g() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String string = StringsKt.t0(String.valueOf(charSequence)).toString();
            boolean zG = Intrinsics.g(string, this.a);
            ChatActivity chatActivity = ChatActivity.this;
            if (!zG) {
                this.a = string;
                jvd0 jvd0Var = chatActivity.K;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                pfd pfdVar = fse.a;
                chatActivity.K = ej5.c(w5b.a(gku.a), null, null, new a(string, this, chatActivity, null), 3);
            }
            if (string.length() == 0 && chatActivity.M == null) {
                Intrinsics.n("gifViewModel");
                throw null;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g0 extends qlr implements Function0<v8i0> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChatActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h extends RecyclerView.s {
        public h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void a(RecyclerView recyclerView, int i) {
            ha7 ha7Var;
            ChatActivity chatActivity = ChatActivity.this;
            LinearLayoutManager linearLayoutManager = chatActivity.I;
            if (linearLayoutManager == null) {
                Intrinsics.n("linearLayoutManager");
                throw null;
            }
            if (linearLayoutManager.f1() != 0 || (ha7Var = (ha7) chatActivity.a) == null) {
                return;
            }
            ha7Var.M.setVisibility(8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h0 extends qlr implements Function0<cyb> {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChatActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$onCreate$24$1", f = "ChatActivity.kt", l = {2768, 1164}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wf40 a;
        public c77 b;
        public int c;
        public int d;
        public int e;
        public int f;
        public final /* synthetic */ tb5 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tb5 tb5Var, v1b v1bVar) {
            super(2, v1bVar);
            this.i = tb5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new i(this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0063 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0042, B:22:0x005b, B:24:0x0063, B:27:0x007c, B:14:0x0031, B:17:0x003a), top: B:36:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007c A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0042, B:22:0x005b, B:24:0x0063, B:27:0x007c, B:14:0x0031, B:17:0x003a), top: B:36:0x0007 }] */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r11.join(r10) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:8:0x001a). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r10.f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L35
                if (r1 == r3) goto L27
                if (r1 != r2) goto L21
                int r1 = r10.e
                int r5 = r10.d
                int r6 = r10.c
                c77 r7 = r10.b
                wf40 r8 = r10.a
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L1f
            L1a:
                r11 = r6
                r6 = r1
                r1 = r11
                r11 = r7
                goto L42
            L1f:
                r10 = move-exception
                goto L84
            L21:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                return r4
            L27:
                int r1 = r10.e
                int r5 = r10.d
                int r6 = r10.c
                c77 r7 = r10.b
                wf40 r8 = r10.a
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L1f
                goto L5b
            L35:
                defpackage.uj50.b(r11)
                tb5 r8 = r10.i
                tb5$a r11 = new tb5$a     // Catch: java.lang.Throwable -> L1f
                r11.<init>()     // Catch: java.lang.Throwable -> L1f
                r1 = 0
                r5 = r1
                r6 = r5
            L42:
                r10.a = r8     // Catch: java.lang.Throwable -> L1f
                r10.b = r11     // Catch: java.lang.Throwable -> L1f
                r10.c = r1     // Catch: java.lang.Throwable -> L1f
                r10.d = r5     // Catch: java.lang.Throwable -> L1f
                r10.e = r6     // Catch: java.lang.Throwable -> L1f
                r10.f = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r7 = r11.b(r10)     // Catch: java.lang.Throwable -> L1f
                if (r7 != r0) goto L55
                goto L7b
            L55:
                r9 = r7
                r7 = r11
                r11 = r9
                r9 = r6
                r6 = r1
                r1 = r9
            L5b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1f
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r11 == 0) goto L7c
                java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L1f
                c9p r11 = (defpackage.c9p) r11     // Catch: java.lang.Throwable -> L1f
                r10.a = r8     // Catch: java.lang.Throwable -> L1f
                r10.b = r7     // Catch: java.lang.Throwable -> L1f
                r10.c = r6     // Catch: java.lang.Throwable -> L1f
                r10.d = r5     // Catch: java.lang.Throwable -> L1f
                r10.e = r1     // Catch: java.lang.Throwable -> L1f
                r10.f = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r11 = r11.join(r10)     // Catch: java.lang.Throwable -> L1f
                if (r11 != r0) goto L1a
            L7b:
                return r0
            L7c:
                kotlin.Unit r10 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L1f
                r8.cancel(r4)
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            L84:
                throw r10     // Catch: java.lang.Throwable -> L85
            L85:
                r11 = move-exception
                defpackage.ry60.a(r8, r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.commons.chat.views.ChatActivity.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i0 extends qlr implements Function0<r8i0.c> {
        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChatActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$onCreate$25$1", f = "ChatActivity.kt", l = {2768, 1170}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wf40 a;
        public c77 b;
        public int c;
        public int d;
        public int e;
        public int f;
        public final /* synthetic */ tb5 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tb5 tb5Var, v1b v1bVar) {
            super(2, v1bVar);
            this.i = tb5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new j(this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0063 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0042, B:22:0x005b, B:24:0x0063, B:27:0x007c, B:14:0x0031, B:17:0x003a), top: B:36:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007c A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0042, B:22:0x005b, B:24:0x0063, B:27:0x007c, B:14:0x0031, B:17:0x003a), top: B:36:0x0007 }] */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r11.join(r10) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:8:0x001a). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r10.f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L35
                if (r1 == r3) goto L27
                if (r1 != r2) goto L21
                int r1 = r10.e
                int r5 = r10.d
                int r6 = r10.c
                c77 r7 = r10.b
                wf40 r8 = r10.a
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L1f
            L1a:
                r11 = r6
                r6 = r1
                r1 = r11
                r11 = r7
                goto L42
            L1f:
                r10 = move-exception
                goto L84
            L21:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                return r4
            L27:
                int r1 = r10.e
                int r5 = r10.d
                int r6 = r10.c
                c77 r7 = r10.b
                wf40 r8 = r10.a
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L1f
                goto L5b
            L35:
                defpackage.uj50.b(r11)
                tb5 r8 = r10.i
                tb5$a r11 = new tb5$a     // Catch: java.lang.Throwable -> L1f
                r11.<init>()     // Catch: java.lang.Throwable -> L1f
                r1 = 0
                r5 = r1
                r6 = r5
            L42:
                r10.a = r8     // Catch: java.lang.Throwable -> L1f
                r10.b = r11     // Catch: java.lang.Throwable -> L1f
                r10.c = r1     // Catch: java.lang.Throwable -> L1f
                r10.d = r5     // Catch: java.lang.Throwable -> L1f
                r10.e = r6     // Catch: java.lang.Throwable -> L1f
                r10.f = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r7 = r11.b(r10)     // Catch: java.lang.Throwable -> L1f
                if (r7 != r0) goto L55
                goto L7b
            L55:
                r9 = r7
                r7 = r11
                r11 = r9
                r9 = r6
                r6 = r1
                r1 = r9
            L5b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1f
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r11 == 0) goto L7c
                java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L1f
                c9p r11 = (defpackage.c9p) r11     // Catch: java.lang.Throwable -> L1f
                r10.a = r8     // Catch: java.lang.Throwable -> L1f
                r10.b = r7     // Catch: java.lang.Throwable -> L1f
                r10.c = r6     // Catch: java.lang.Throwable -> L1f
                r10.d = r5     // Catch: java.lang.Throwable -> L1f
                r10.e = r1     // Catch: java.lang.Throwable -> L1f
                r10.f = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r11 = r11.join(r10)     // Catch: java.lang.Throwable -> L1f
                if (r11 != r0) goto L1a
            L7b:
                return r0
            L7c:
                kotlin.Unit r10 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L1f
                r8.cancel(r4)
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            L84:
                throw r10     // Catch: java.lang.Throwable -> L85
            L85:
                r11 = move-exception
                defpackage.ry60.a(r8, r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.commons.chat.views.ChatActivity.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j0 extends qlr implements Function0<v8i0> {
        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChatActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k extends BroadcastReceiver {

        @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$onCreate$6$onReceive$1", f = "ChatActivity.kt", l = {461}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ dq40<String> A;
            public final /* synthetic */ dq40<String> B;
            public final /* synthetic */ dq40<String> C;
            public final /* synthetic */ yp40 D;
            public final /* synthetic */ dq40<String> E;
            public final /* synthetic */ yp40 F;
            public final /* synthetic */ dq40<String> G;
            public int a;
            public final /* synthetic */ ChatActivity b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ String e;
            public final /* synthetic */ Context f;
            public final /* synthetic */ dq40<String> i;
            public final /* synthetic */ dq40<String> v;
            public final /* synthetic */ dq40<String> w;
            public final /* synthetic */ dq40<String> y;
            public final /* synthetic */ dq40<String> z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChatActivity chatActivity, String str, String str2, String str3, Context context, dq40<String> dq40Var, dq40<String> dq40Var2, dq40<String> dq40Var3, dq40<String> dq40Var4, dq40<String> dq40Var5, dq40<String> dq40Var6, dq40<String> dq40Var7, dq40<String> dq40Var8, yp40 yp40Var, dq40<String> dq40Var9, yp40 yp40Var2, dq40<String> dq40Var10, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = chatActivity;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = context;
                this.i = dq40Var;
                this.v = dq40Var2;
                this.w = dq40Var3;
                this.y = dq40Var4;
                this.z = dq40Var5;
                this.A = dq40Var6;
                this.B = dq40Var7;
                this.C = dq40Var8;
                this.D = yp40Var;
                this.E = dq40Var9;
                this.F = yp40Var2;
                this.G = dq40Var10;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, v1bVar);
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
                    String str = this.c;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = this.i.a;
                    String str3 = this.v.a;
                    String str4 = this.w.a;
                    String str5 = this.y.a;
                    String str6 = this.z.a;
                    String str7 = this.A.a;
                    String str8 = this.B.a;
                    String str9 = this.C.a;
                    boolean z = this.D.a;
                    String str10 = this.E.a;
                    boolean z2 = this.F.a;
                    String str11 = this.G.a;
                    this.a = 1;
                    int i2 = ChatActivity.B0;
                    if (this.b.Z1(str, this.d, this.e, this.f, str2, str3, str4, str5, str6, str7, str8, str9, z, str10, z2, str11, this) == y5bVar) {
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

        @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$onCreate$6$onReceive$2", f = "ChatActivity.kt", l = {527}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String b;
            public final /* synthetic */ ChatActivity c;
            public final /* synthetic */ String d;
            public final /* synthetic */ dq40<String> e;
            public final /* synthetic */ Context f;
            public final /* synthetic */ dq40<String> i;
            public final /* synthetic */ dq40<String> v;
            public final /* synthetic */ dq40<String> w;
            public final /* synthetic */ dq40<String> y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, ChatActivity chatActivity, String str2, dq40<String> dq40Var, Context context, dq40<String> dq40Var2, dq40<String> dq40Var3, dq40<String> dq40Var4, dq40<String> dq40Var5, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = str;
                this.c = chatActivity;
                this.d = str2;
                this.e = dq40Var;
                this.f = context;
                this.i = dq40Var2;
                this.v = dq40Var3;
                this.w = dq40Var4;
                this.y = dq40Var5;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
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
                    String str = this.b;
                    if (str != null) {
                        String str2 = this.d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = this.e.a;
                        String str4 = this.i.a;
                        String str5 = this.v.a;
                        String str6 = this.w.a;
                        String str7 = this.y.a;
                        this.a = 1;
                        int i2 = ChatActivity.B0;
                        if (this.c.Z1(str2, str3, str, this.f, str3, str4, str3, str5, "CLASSIC", str6, str, "", false, str7, false, "", this) == y5bVar) {
                            return y5bVar;
                        }
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

        public k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v4, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v8, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v10, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v6, types: [T, java.lang.String] */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z;
            boolean zM;
            ha7 ha7Var;
            T t;
            yp40 yp40Var;
            T t2;
            T t3;
            T t4;
            intent.getClass();
            boolean zHasExtra = intent.hasExtra("cashoutErr");
            ChatActivity chatActivity = ChatActivity.this;
            if (zHasExtra) {
                String stringExtra = intent.getStringExtra("cashoutErr");
                if (stringExtra != null) {
                    int i = ChatActivity.B0;
                    ha7 ha7Var2 = (ha7) chatActivity.a;
                    if (ha7Var2 != null) {
                        ha7Var2.X.setVisibility(0);
                    }
                    ha7 ha7Var3 = (ha7) chatActivity.a;
                    if (ha7Var3 != null) {
                        ha7Var3.X.setMessageandBG(R.color.error_toast, stringExtra);
                    }
                    nas nasVarA = ebs.a(chatActivity.getLifecycle());
                    pfd pfdVar = fse.a;
                    ej5.c(nasVarA, gku.a, null, new s97(chatActivity, null), 2);
                    return;
                }
                return;
            }
            if (intent.hasExtra("cashoutAmount")) {
                String stringExtra2 = intent.getStringExtra("currency");
                String stringExtra3 = intent.getStringExtra("cashoutAmount");
                String stringExtra4 = intent.getStringExtra("cashoutCoeff");
                dq40 dq40Var = new dq40();
                dq40Var.a = "";
                dq40 dq40Var2 = new dq40();
                dq40Var2.a = "";
                dq40 dq40Var3 = new dq40();
                dq40Var3.a = "";
                dq40 dq40Var4 = new dq40();
                dq40Var4.a = "";
                dq40 dq40Var5 = new dq40();
                dq40Var5.a = "";
                dq40 dq40Var6 = new dq40();
                dq40Var6.a = "";
                yp40 yp40Var2 = new yp40();
                yp40 yp40Var3 = new yp40();
                dq40 dq40Var7 = new dq40();
                dq40Var7.a = "";
                dq40 dq40Var8 = new dq40();
                dq40Var8.a = intent.getStringExtra("betType");
                dq40 dq40Var9 = new dq40();
                if (intent.hasExtra("rocketType")) {
                    dq40Var9.a = intent.getStringExtra("rocketType");
                }
                dq40 dq40Var10 = new dq40();
                dq40Var10.a = intent.getStringExtra("massageType");
                if (intent.hasExtra("giftAmount")) {
                    String stringExtra5 = intent.getStringExtra("winAmount");
                    if (stringExtra5 == null) {
                        t4 = stringExtra5;
                        t4 = "";
                    }
                    t4 = stringExtra5;
                    dq40Var.a = t4;
                    String stringExtra6 = intent.getStringExtra("payoutAmount");
                    T t5 = stringExtra6;
                    if (stringExtra6 == null) {
                        t5 = "";
                    }
                    dq40Var2.a = t5;
                    String stringExtra7 = intent.getStringExtra("totalAmount");
                    T t6 = stringExtra7;
                    if (stringExtra7 == null) {
                        t6 = "";
                    }
                    dq40Var3.a = t6;
                    String stringExtra8 = intent.getStringExtra("giftAmount");
                    T t7 = stringExtra8;
                    if (stringExtra8 == null) {
                        t7 = "";
                    }
                    dq40Var4.a = t7;
                    String stringExtra9 = intent.getStringExtra("amount");
                    T t8 = stringExtra9;
                    if (stringExtra9 == null) {
                        t8 = "";
                    }
                    dq40Var6.a = t8;
                }
                if (intent.hasExtra("cashoutEndCoeff")) {
                    String stringExtra10 = intent.getStringExtra("cashoutEndCoeff");
                    if (stringExtra10 == null) {
                        t3 = stringExtra10;
                        t3 = "";
                    }
                    t3 = stringExtra10;
                    dq40Var5.a = t3;
                }
                if (intent.hasExtra("showGiftLayout1")) {
                    yp40Var2.a = intent.getBooleanExtra("showGiftLayout1", false);
                }
                if (intent.hasExtra("bonusAmount")) {
                    String stringExtra11 = intent.getStringExtra("winAmount");
                    if (stringExtra11 == null) {
                        t2 = stringExtra11;
                        t2 = "";
                    }
                    t2 = stringExtra11;
                    dq40Var.a = t2;
                    String stringExtra12 = intent.getStringExtra("payoutAmount");
                    T t9 = stringExtra12;
                    if (stringExtra12 == null) {
                        t9 = "";
                    }
                    dq40Var2.a = t9;
                    String stringExtra13 = intent.getStringExtra("totalAmount");
                    T t10 = stringExtra13;
                    if (stringExtra13 == null) {
                        t10 = "";
                    }
                    dq40Var3.a = t10;
                    String stringExtra14 = intent.getStringExtra("bonusAmount");
                    T t11 = stringExtra14;
                    if (stringExtra14 == null) {
                        t11 = "";
                    }
                    dq40Var7.a = t11;
                }
                if (intent.hasExtra("showBonusLayout1")) {
                    yp40Var = yp40Var3;
                    yp40Var.a = intent.getBooleanExtra("showBonusLayout1", false);
                } else {
                    yp40Var = yp40Var3;
                }
                if (stringExtra3 == null || stringExtra4 == null) {
                    return;
                }
                nas nasVarA2 = ebs.a(chatActivity.getLifecycle());
                pfd pfdVar2 = fse.a;
                ej5.c(nasVarA2, gku.a, null, new a(chatActivity, stringExtra2, stringExtra3, stringExtra4, context, dq40Var, dq40Var2, dq40Var3, dq40Var4, dq40Var8, dq40Var10, dq40Var5, dq40Var9, yp40Var2, dq40Var6, yp40Var, dq40Var7, null), 2);
                return;
            }
            if (intent.hasExtra("enable button")) {
                boolean zL = kotlin.text.c.l(intent.getStringExtra("number"), "1", false);
                B b2 = chatActivity.a;
                if (zL) {
                    ha7 ha7Var4 = (ha7) b2;
                    if (ha7Var4 != null) {
                        ha7Var4.d.setClickable(true);
                    }
                    ha7 ha7Var5 = (ha7) chatActivity.a;
                    if (ha7Var5 != null) {
                        ha7Var5.d.setAlpha(1.0f);
                    }
                    ha7 ha7Var6 = (ha7) chatActivity.a;
                    if (ha7Var6 != null) {
                        ha7Var6.d.setVisibility(8);
                        return;
                    }
                    return;
                }
                ha7 ha7Var7 = (ha7) b2;
                if (ha7Var7 != null) {
                    ha7Var7.e.setClickable(true);
                }
                ha7 ha7Var8 = (ha7) chatActivity.a;
                if (ha7Var8 != null) {
                    ha7Var8.e.setAlpha(1.0f);
                }
                ha7 ha7Var9 = (ha7) chatActivity.a;
                if (ha7Var9 != null) {
                    ha7Var9.e.setVisibility(8);
                    return;
                }
                return;
            }
            String stringExtra15 = intent.getStringExtra(EventKeys.ERROR_MESSAGE);
            if (intent.getIntExtra("betIndex", 0) == 1) {
                if (stringExtra15 == null || stringExtra15.length() != 0) {
                    ha7 ha7Var10 = (ha7) chatActivity.a;
                    if (ha7Var10 != null) {
                        ha7Var10.d.setVisibility(0);
                    }
                    ha7 ha7Var11 = (ha7) chatActivity.a;
                    if (ha7Var11 != null) {
                        ha7Var11.i.setText(stringExtra15);
                    }
                } else {
                    ha7 ha7Var12 = (ha7) chatActivity.a;
                    if (ha7Var12 != null) {
                        ha7Var12.d.setVisibility(8);
                    }
                }
            }
            String stringExtra16 = intent.getStringExtra("calledFrom");
            if (stringExtra16 != null) {
                z = false;
                zM = StringsKt.M(stringExtra16, "punch", false);
            } else {
                z = false;
                zM = false;
            }
            if (zM) {
                if (kotlin.text.c.l(intent.getStringExtra("massageType"), "ONE_PUNCH_RECORD", z)) {
                    String stringExtra17 = intent.getStringExtra("currency");
                    String stringExtra18 = intent.getStringExtra("cashoutCoeff");
                    dq40 dq40Var11 = new dq40();
                    dq40Var11.a = "";
                    dq40 dq40Var12 = new dq40();
                    dq40Var12.a = "";
                    dq40 dq40Var13 = new dq40();
                    dq40Var13.a = "";
                    dq40 dq40Var14 = new dq40();
                    dq40Var14.a = "";
                    dq40 dq40Var15 = new dq40();
                    dq40Var15.a = intent.getStringExtra("massageType");
                    if (intent.hasExtra("giftAmount")) {
                        String stringExtra19 = intent.getStringExtra("payoutAmount");
                        if (stringExtra19 == null) {
                            t = stringExtra19;
                            t = "";
                        }
                        t = stringExtra19;
                        dq40Var11.a = t;
                        String stringExtra20 = intent.getStringExtra("totalAmount");
                        T t12 = stringExtra20;
                        if (stringExtra20 == null) {
                            t12 = "";
                        }
                        dq40Var12.a = t12;
                        String stringExtra21 = intent.getStringExtra("giftAmount");
                        T t13 = stringExtra21;
                        if (stringExtra21 == null) {
                            t13 = "";
                        }
                        dq40Var13.a = t13;
                        String stringExtra22 = intent.getStringExtra("amount");
                        T t14 = stringExtra22;
                        if (stringExtra22 == null) {
                            t14 = "";
                        }
                        dq40Var14.a = t14;
                    }
                    nas nasVarA3 = ebs.a(chatActivity.getLifecycle());
                    pfd pfdVar3 = fse.a;
                    wcl wclVar = gku.a;
                    b bVar = new b(stringExtra18, chatActivity, stringExtra17, dq40Var12, context, dq40Var11, dq40Var13, dq40Var15, dq40Var14, null);
                    chatActivity = chatActivity;
                    ej5.c(nasVarA3, wclVar, null, bVar, 2);
                }
            } else if (intent.getIntExtra("betIndex", z ? 1 : 0) == 2) {
                if (stringExtra15 == null || stringExtra15.length() != 0) {
                    ha7 ha7Var13 = (ha7) chatActivity.a;
                    if (ha7Var13 != null) {
                        ha7Var13.e.setVisibility(0);
                    }
                    ha7 ha7Var14 = (ha7) chatActivity.a;
                    if (ha7Var14 != null) {
                        ha7Var14.v.setText(stringExtra15);
                    }
                } else {
                    ha7 ha7Var15 = (ha7) chatActivity.a;
                    if (ha7Var15 != null) {
                        ha7Var15.e.setVisibility(8);
                    }
                }
            }
            ha7 ha7Var16 = (ha7) chatActivity.a;
            if ((ha7Var16 == null || ha7Var16.d.getVisibility() != 0) && ((ha7Var = (ha7) chatActivity.a) == null || ha7Var.e.getVisibility() != 0)) {
                ha7 ha7Var17 = (ha7) chatActivity.a;
                if (ha7Var17 != null) {
                    ha7Var17.f.setVisibility(8);
                    return;
                }
                return;
            }
            ha7 ha7Var18 = (ha7) chatActivity.a;
            if (ha7Var18 != null) {
                ha7Var18.f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k0 extends qlr implements Function0<cyb> {
        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChatActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$onStop$1", f = "ChatActivity.kt", l = {1618}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public l(v1b<? super l> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ChatActivity.this.new l(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(500L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ChatActivity.this.finish();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m implements Function0<m28> {
        public m() {
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [j8i0, m28] */
        @Override // kotlin.jvm.functions.Function0
        public final m28 invoke() {
            ChatActivity chatActivity = ChatActivity.this;
            return sgk.a(jq40.a(m28.class), chatActivity.getViewModelStore(), chatActivity.getDefaultViewModelCreationExtras(), null, e80.a(chatActivity), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n extends qlr implements Function0<r8i0.c> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChatActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o extends qlr implements Function0<v8i0> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChatActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p extends qlr implements Function0<cyb> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChatActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q extends qlr implements Function0<r8i0.c> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChatActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r extends qlr implements Function0<v8i0> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChatActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s extends qlr implements Function0<cyb> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChatActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t extends qlr implements Function0<r8i0.c> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChatActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u extends qlr implements Function0<v8i0> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChatActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class v extends qlr implements Function0<cyb> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChatActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w extends qlr implements Function0<r8i0.c> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChatActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x extends qlr implements Function0<r8i0.c> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChatActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y extends qlr implements Function0<v8i0> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChatActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z extends qlr implements Function0<cyb> {
        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChatActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [v87] */
    public ChatActivity() {
        new DisplayMetrics();
        this.U = 1.7d;
        this.V = 27;
        this.W = "";
        this.Z = new Handler(Looper.getMainLooper());
        String lowerCase = "Hero".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.i0 = lowerCase;
        pfd pfdVar = fse.a;
        this.j0 = w5b.a(gku.a);
        Boolean bool = Boolean.FALSE;
        this.p0 = androidx.compose.runtime.m.b(bool);
        this.q0 = androidx.compose.runtime.m.b(bool);
        this.r0 = androidx.compose.runtime.m.b(bool);
        this.s0 = new q8i0(jq40.a(goj.class), new y(), new w(), new z());
        SportyGamesManager.getInstance().getUserId();
        this.v0 = 100.0f;
        this.w0 = 1.7878f;
        this.x0 = 0.065f;
        this.y0 = new q8i0(jq40.a(koj.class), new b0(), new a0(), new c0());
        this.z0 = true;
        this.A0 = new Runnable() { // from class: v87
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = ChatActivity.B0;
                ChatActivity chatActivity = this.a;
                chatActivity.F1().x1(chatActivity.e);
                chatActivity.P1();
                Handler handler = chatActivity.Z;
                if (handler != null) {
                    handler.postDelayed(chatActivity.A0, 15000L);
                }
            }
        };
    }

    public static boolean I1(ChatListResponse chatListResponse) {
        try {
            JSONObject jSONObject = new JSONObject(chatListResponse.getJsonBody());
            if (jSONObject.has("jsonBody")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString("jsonBody"));
                if (jSONObject2.has("text")) {
                    return true;
                }
                if (jSONObject2.has("json")) {
                    return true;
                }
                if (jSONObject2.has("gif")) {
                    return true;
                }
            } else if (jSONObject.has("text") || jSONObject.has("json") || jSONObject.has("gif")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final Unit O1(final ChatActivity chatActivity, final Dialog dialog, LoadingState loadingState) {
        String message;
        HTTPResponse<Object> error;
        HTTPResponse<Object> error2;
        Integer bizCode;
        int i2 = a.b[loadingState.getStatus().ordinal()];
        if (i2 == 1) {
            chatActivity.i = true;
            ha7 ha7Var = (ha7) chatActivity.a;
            if (ha7Var != null) {
                ha7Var.K.setFocusableInTouchMode(true);
            }
            ha7 ha7Var2 = (ha7) chatActivity.a;
            if (ha7Var2 != null) {
                ha7Var2.K.setFocusable(true);
            }
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        } else if (i2 == 2) {
            ResultWrapper.GenericError error3 = loadingState.getError();
            int iIntValue = (error3 == null || (error2 = error3.getError()) == null || (bizCode = error2.getBizCode()) == null) ? 0 : bizCode.intValue();
            if (iIntValue == 10000) {
                chatActivity.i = true;
                ha7 ha7Var3 = (ha7) chatActivity.a;
                if (ha7Var3 != null) {
                    ha7Var3.K.setFocusableInTouchMode(true);
                }
                ha7 ha7Var4 = (ha7) chatActivity.a;
                if (ha7Var4 != null) {
                    ha7Var4.K.setFocusable(true);
                }
                ha7 ha7Var5 = (ha7) chatActivity.a;
                if (ha7Var5 != null) {
                    ha7Var5.K.setFocusable(1);
                }
                dialog.dismiss();
            } else {
                if (iIntValue == 11000 || iIntValue == 11011) {
                    ResultWrapper.GenericError error4 = loadingState.getError();
                    if (error4 == null || (error = error4.getError()) == null || (message = error.getMessage()) == null) {
                        message = "";
                    }
                } else {
                    message = chatActivity.getString(R.string.error_set_nickname);
                    message.getClass();
                }
                String str = message;
                xbg xbgVar = new xbg(chatActivity, chatActivity.d);
                chatActivity.A = xbgVar;
                String string = chatActivity.getString(R.string.label_dialog_ok);
                string.getClass();
                xbg.c(xbgVar, str, string, new Function0() { // from class: j97
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        xbg xbgVar2 = this.a.A;
                        if (xbgVar2 != null) {
                            xbgVar2.dismiss();
                        }
                        dialog.show();
                        return Unit.a;
                    }
                }, new b92(1), 0, 240);
                xbgVar.a();
                dialog.dismiss();
            }
        }
        return Unit.a;
    }

    public final void A1(float f2) {
        ha7 ha7Var = (ha7) this.a;
        ViewGroup.LayoutParams layoutParams = ha7Var != null ? ha7Var.c.f.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = f2;
        ha7 ha7Var2 = (ha7) this.a;
        if (ha7Var2 != null) {
            ha7Var2.c.f.setLayoutParams(layoutParams2);
        }
    }

    public final void B1(float f2) {
        ha7 ha7Var = (ha7) this.a;
        ViewGroup.LayoutParams layoutParams = ha7Var != null ? ha7Var.X.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = f2;
        ha7 ha7Var2 = (ha7) this.a;
        if (ha7Var2 != null) {
            ha7Var2.X.setLayoutParams(layoutParams2);
        }
    }

    public final cj5 C1() {
        cj5 cj5Var = this.u0;
        if (cj5Var != null) {
            return cj5Var;
        }
        Intrinsics.n("buildVariantColors");
        throw null;
    }

    public final koj D1() {
        return (koj) this.y0.getValue();
    }

    public final goj E1() {
        return (goj) this.s0.getValue();
    }

    public final oxy F1() {
        return (oxy) this.B.getValue();
    }

    public final sh7 G1() {
        return (sh7) this.C.getValue();
    }

    public final boolean H1() {
        if (StringsKt.M(this.d, this.i0, false)) {
            return true;
        }
        String str = this.d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = "Jet".toLowerCase(locale);
        lowerCase2.getClass();
        if (StringsKt.M(lowerCase, lowerCase2, false)) {
            return true;
        }
        String lowerCase3 = this.d.toLowerCase(locale);
        lowerCase3.getClass();
        String lowerCase4 = "Pong".toLowerCase(locale);
        lowerCase4.getClass();
        if (StringsKt.M(lowerCase3, lowerCase4, false)) {
            return true;
        }
        String lowerCase5 = this.d.toLowerCase(locale);
        lowerCase5.getClass();
        String lowerCase6 = "Rocket".toLowerCase(locale);
        lowerCase6.getClass();
        if (StringsKt.M(lowerCase5, lowerCase6, false)) {
            return true;
        }
        String lowerCase7 = this.d.toLowerCase(locale);
        lowerCase7.getClass();
        String lowerCase8 = "GO".toLowerCase(locale);
        lowerCase8.getClass();
        if (StringsKt.M(lowerCase7, lowerCase8, false)) {
            return true;
        }
        String lowerCase9 = this.d.toLowerCase(locale);
        lowerCase9.getClass();
        String lowerCase10 = "kick".toLowerCase(locale);
        lowerCase10.getClass();
        if (StringsKt.M(lowerCase9, lowerCase10, false)) {
            return true;
        }
        String lowerCase11 = this.d.toLowerCase(locale);
        lowerCase11.getClass();
        String lowerCase12 = "skills".toLowerCase(locale);
        lowerCase12.getClass();
        if (StringsKt.M(lowerCase11, lowerCase12, false)) {
            return true;
        }
        String lowerCase13 = this.d.toLowerCase(locale);
        lowerCase13.getClass();
        String lowerCase14 = "Rider".toLowerCase(locale);
        lowerCase14.getClass();
        return StringsKt.M(lowerCase13, lowerCase14, false);
    }

    public final void J1() {
        Fragment tn80Var;
        ConstraintLayout constraintLayout;
        if (getIntent().hasExtra("fragment_to_load")) {
            ha7 ha7Var = (ha7) this.a;
            if (ha7Var != null && (constraintLayout = ha7Var.b) != null) {
                constraintLayout.setBackground(null);
            }
            ha7 ha7Var2 = (ha7) this.a;
            if (ha7Var2 != null) {
                ha7Var2.G.setVisibility(0);
            }
            String stringExtra = getIntent().getStringExtra("fragment_to_load");
            Bundle bundle = new Bundle();
            bundle.putString("currency", getIntent().getStringExtra("currency"));
            if (kotlin.text.c.l(stringExtra, "fragment_rush_component", false)) {
                tn80Var = new np80();
                bundle.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, this.d);
                bundle.putString("autobetCount", getIntent().getStringExtra("autobetCount"));
            } else if (kotlin.text.c.l(stringExtra, "fragment_one_punch_component", false)) {
                tn80Var = new tn80();
                bundle.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, this.d);
                bundle.putString("autobetCount", getIntent().getStringExtra("autobetCount"));
            } else {
                tn80Var = null;
            }
            if (tn80Var != null) {
                tn80Var.setArguments(bundle);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f(R.id.fl_content, tn80Var, null);
                aVar.d();
            }
        }
    }

    public final void K1() {
        lu10 lu10Var;
        ConstraintLayout constraintLayout;
        String stringExtra = getIntent().getStringExtra("fragment_to_load");
        Bundle bundle = new Bundle();
        bundle.putString("currency", getIntent().getStringExtra("currency"));
        if (kotlin.text.c.l(stringExtra, "fragment_pocket_rocket_component", false)) {
            ha7 ha7Var = (ha7) this.a;
            if (ha7Var != null && (constraintLayout = ha7Var.b) != null) {
                constraintLayout.setBackground(null);
            }
            ha7 ha7Var2 = (ha7) this.a;
            if (ha7Var2 != null) {
                ha7Var2.G.setVisibility(0);
            }
            lu10Var = new lu10();
        } else {
            lu10Var = null;
        }
        if (lu10Var != null) {
            lu10Var.setArguments(bundle);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.f(R.id.fl_content, lu10Var, null);
            aVar.d();
        }
    }

    public final void L1() {
        nqw.a.f(this, new v97(new u87(this, 0)));
    }

    public final void M1() {
        jbh.a.f(this, new v97(new x87(this, 0)));
        jbh.b.f(this, new v97(new y87(this, 0)));
    }

    public final void N1() {
        mqw.a.f(this, new v97(new e97(this, 0)));
    }

    public final void P1() {
        try {
            F1().b.f(this, new v97(new Function1() { // from class: g97
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int iNextInt;
                    List list;
                    OnlineCountResponse onlineCountResponse;
                    List list2;
                    int iNextInt2;
                    LoadingState loadingState = (LoadingState) obj;
                    int i2 = ChatActivity.B0;
                    int i3 = ChatActivity.a.b[loadingState.getStatus().ordinal()];
                    ChatActivity chatActivity = this.a;
                    int onlineUserCount = 0;
                    try {
                        if (i3 == 1) {
                            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                            if (((hTTPResponse == null || (list2 = (List) hTTPResponse.getData()) == null) ? 0 : list2.size()) > 0) {
                                HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                                if (hTTPResponse2 != null && (list = (List) hTTPResponse2.getData()) != null && (onlineCountResponse = (OnlineCountResponse) list.get(0)) != null) {
                                    onlineUserCount = onlineCountResponse.getOnlineUserCount();
                                }
                                double dFloor = Math.floor(new SecureRandom().nextDouble() * ((double) ((onlineUserCount * 10) / 100)));
                                ha7 ha7Var = (ha7) chatActivity.a;
                                if (ha7Var != null) {
                                    ha7Var.R.setText(String.valueOf(onlineUserCount + ((int) dFloor)));
                                }
                                chatActivity.F1().b.l(chatActivity);
                            } else {
                                List list3 = (List) sva.a.get(SportyGamesManager.getInstance().getCountry());
                                SecureRandom secureRandom = new SecureRandom();
                                if (list3 != null) {
                                    iNextInt = secureRandom.nextInt(((Number) list3.get(1)).intValue() - ((Number) list3.get(0)).intValue()) + ((Number) list3.get(0)).intValue();
                                } else {
                                    iNextInt = secureRandom.nextInt(0) + 20;
                                    ha7 ha7Var2 = (ha7) chatActivity.a;
                                    if (ha7Var2 != null) {
                                        ha7Var2.R.setText(String.valueOf(iNextInt));
                                    }
                                }
                                ha7 ha7Var3 = (ha7) chatActivity.a;
                                if (ha7Var3 != null) {
                                    ha7Var3.R.setText(String.valueOf(iNextInt));
                                }
                            }
                        } else if (i3 == 2) {
                            List list4 = (List) sva.a.get(SportyGamesManager.getInstance().getCountry());
                            SecureRandom secureRandom2 = new SecureRandom();
                            if (list4 != null) {
                                iNextInt2 = secureRandom2.nextInt(((Number) list4.get(1)).intValue() - ((Number) list4.get(0)).intValue()) + ((Number) list4.get(0)).intValue();
                            } else {
                                iNextInt2 = secureRandom2.nextInt(0) + 20;
                                ha7 ha7Var4 = (ha7) chatActivity.a;
                                if (ha7Var4 != null) {
                                    ha7Var4.R.setText(String.valueOf(iNextInt2));
                                }
                            }
                            ha7 ha7Var5 = (ha7) chatActivity.a;
                            if (ha7Var5 != null) {
                                ha7Var5.R.setText(String.valueOf(iNextInt2));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void Q1() {
        lqw.a.f(this, new v97(new Function1() { // from class: n87
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ha7 ha7Var;
                ha7 ha7Var2;
                ha7 ha7Var3;
                ha7 ha7Var4;
                ha7 ha7Var5;
                int i2 = ChatActivity.B0;
                MultiplierResponse multiplierResponse = (MultiplierResponse) q97.a(MultiplierResponse.class, (String) obj);
                long roundId = multiplierResponse.getRoundId();
                ChatActivity chatActivity = this.a;
                chatActivity.n0 = roundId;
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_WAITING")) {
                    oa7 oa7Var = chatActivity.J;
                    if (oa7Var != null) {
                        oa7Var.notifyDataSetChanged();
                    }
                    if (!chatActivity.T && (ha7Var5 = (ha7) chatActivity.a) != null) {
                        ha7Var5.a0.setVisibility(0);
                    }
                    ha7 ha7Var6 = (ha7) chatActivity.a;
                    if (ha7Var6 != null) {
                        ha7Var6.P.setVisibility(8);
                    }
                    ha7 ha7Var7 = (ha7) chatActivity.a;
                    if (ha7Var7 != null) {
                        ha7Var7.U.setMax(10000);
                    }
                    if (!chatActivity.k0) {
                        if (!chatActivity.T && (ha7Var4 = (ha7) chatActivity.a) != null) {
                            ha7Var4.a0.setVisibility(0);
                        }
                        ha7 ha7Var8 = (ha7) chatActivity.a;
                        if (ha7Var8 != null) {
                            ha7Var8.P.setVisibility(8);
                        }
                        chatActivity.k0 = true;
                        pfd pfdVar = fse.a;
                        chatActivity.j0 = w5b.a(gku.a);
                        Integer millisLeft = multiplierResponse.getMillisLeft();
                        chatActivity.l0 = millisLeft != null ? millisLeft.intValue() : 0;
                        Integer millisLeft2 = multiplierResponse.getMillisLeft();
                        chatActivity.m0 = millisLeft2 != null ? millisLeft2.intValue() : 0;
                        ej5.c(chatActivity.j0, null, null, chatActivity.new d(null), 3);
                    }
                }
                if (c.l(multiplierResponse.getMessageType(), "ROUND_PRE_START", false)) {
                    chatActivity.k0 = false;
                    ha7 ha7Var9 = (ha7) chatActivity.a;
                    if (ha7Var9 != null) {
                        ha7Var9.a0.setVisibility(8);
                    }
                    if (!chatActivity.T && (ha7Var3 = (ha7) chatActivity.a) != null) {
                        ha7Var3.P.setVisibility(0);
                    }
                    ha7 ha7Var10 = (ha7) chatActivity.a;
                    if (ha7Var10 != null) {
                        ha7Var10.C.setVisibility(8);
                    }
                    ha7 ha7Var11 = (ha7) chatActivity.a;
                    if (ha7Var11 != null) {
                        ha7Var11.H.setVisibility(8);
                    }
                }
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING")) {
                    chatActivity.k0 = false;
                    ha7 ha7Var12 = (ha7) chatActivity.a;
                    if (ha7Var12 != null) {
                        ha7Var12.C.setVisibility(0);
                    }
                    ha7 ha7Var13 = (ha7) chatActivity.a;
                    if (ha7Var13 != null) {
                        ha7Var13.a0.setVisibility(8);
                    }
                    if (!chatActivity.T && (ha7Var2 = (ha7) chatActivity.a) != null) {
                        ha7Var2.P.setVisibility(0);
                    }
                    ha7 ha7Var14 = (ha7) chatActivity.a;
                    if (ha7Var14 != null) {
                        ha7Var14.H.setVisibility(8);
                    }
                    ha7 ha7Var15 = (ha7) chatActivity.a;
                    if (ha7Var15 != null) {
                        r97.a(ha7Var15.C, multiplierResponse.getMultiplier(), "x");
                    }
                    ha7 ha7Var16 = (ha7) chatActivity.a;
                    if (ha7Var16 != null) {
                        ha7Var16.C.setTextColor(chatActivity.getColor(R.color.white));
                    }
                }
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
                    chatActivity.k0 = false;
                    ha7 ha7Var17 = (ha7) chatActivity.a;
                    if (ha7Var17 != null) {
                        r97.a(ha7Var17.C, multiplierResponse.getMultiplier(), "x");
                    }
                    ha7 ha7Var18 = (ha7) chatActivity.a;
                    if (ha7Var18 != null) {
                        ha7Var18.C.setVisibility(0);
                    }
                    ha7 ha7Var19 = (ha7) chatActivity.a;
                    if (ha7Var19 != null) {
                        ha7Var19.a0.setVisibility(8);
                    }
                    if (!chatActivity.T && (ha7Var = (ha7) chatActivity.a) != null) {
                        ha7Var.P.setVisibility(0);
                    }
                    ha7 ha7Var20 = (ha7) chatActivity.a;
                    if (ha7Var20 != null) {
                        ha7Var20.C.setTextColor(chatActivity.getColor(R.color.sh_seekbar));
                    }
                    ha7 ha7Var21 = (ha7) chatActivity.a;
                    if (ha7Var21 != null) {
                        ha7Var21.H.setVisibility(0);
                    }
                }
                return Unit.a;
            }
        }));
    }

    public final void R1() {
        G1().e.f(this, new v97(new Function1() { // from class: k97
            /* JADX WARN: Code duplicated, block: B:29:0x007d A[Catch: Exception -> 0x01ca, TryCatch #1 {Exception -> 0x01ca, blocks: (B:7:0x001d, B:9:0x0024, B:11:0x002a, B:14:0x0031, B:16:0x0039, B:29:0x007d, B:18:0x004d, B:20:0x0053, B:22:0x0059, B:25:0x0060, B:27:0x0069, B:30:0x00b3, B:32:0x00b9, B:34:0x00bf, B:36:0x00c5, B:38:0x00cd, B:39:0x0103, B:41:0x011b, B:42:0x0121), top: B:83:0x001d }] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ChatErrorResponse errorName;
                ChatErrorResponse errorName2;
                Integer errorCode;
                ChatErrorResponse errorName3;
                Integer errorCode2;
                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                int i2 = ChatActivity.B0;
                int i3 = ChatActivity.a.a[loadingStateChat.getStatus().ordinal()];
                ChatActivity chatActivity = this.a;
                String string = null;
                string = null;
                if (i3 == 1) {
                    chatActivity.G1().e.l(chatActivity);
                    SendMessageResponse sendMessageResponse = (SendMessageResponse) loadingStateChat.getData();
                    if (sendMessageResponse != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(sendMessageResponse.getJsonBody());
                            if (jSONObject.has("messageNo")) {
                                string = jSONObject.get("messageNo").toString();
                            }
                        } catch (Exception unused) {
                        }
                        if (string != null) {
                            String str = chatActivity.L;
                            String userImage = SportyGamesManager.getInstance().getUserImage();
                            if (userImage == null) {
                                userImage = "";
                            }
                            String nickName = SportyGamesManager.getInstance().getNickName();
                            if (nickName == null) {
                                nickName = "";
                            }
                            String country = SportyGamesManager.getInstance().getCountry();
                            ChatListResponse chatListResponse = new ChatListResponse(str, string, new ChatListResponse.UserInfo(userImage, nickName, country != null ? country : ""), sendMessageResponse.getJsonBody());
                            if (ChatActivity.I1(chatListResponse)) {
                                List<ChatListResponse> list = chatActivity.G;
                                if (list != null && list.isEmpty()) {
                                    chatActivity.z1(chatListResponse);
                                    break;
                                }
                                Iterator<T> it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        chatActivity.z1(chatListResponse);
                                        break;
                                    }
                                } while (!Intrinsics.g(((ChatListResponse) it.next()).getMessageNo(), string));
                            }
                        }
                    }
                    chatActivity.G1().x1();
                } else if (i3 == 2) {
                    try {
                        ResultChatWrapper.GenericError error = loadingStateChat.getError();
                        if (error == null || (errorName3 = error.getErrorName()) == null || (errorCode2 = errorName3.getErrorCode()) == null || errorCode2.intValue() != 19003 || !c.l(loadingStateChat.getError().getErrorName().getErrorName(), "Set nickname to chat", false)) {
                            ResultChatWrapper.GenericError error2 = loadingStateChat.getError();
                            if (error2 == null || (errorName2 = error2.getErrorName()) == null || (errorCode = errorName2.getErrorCode()) == null || errorCode.intValue() != 42001 || !c.l(loadingStateChat.getError().getErrorName().getErrorName(), "Only active users can access the feature", false)) {
                                ResultChatWrapper.GenericError error3 = loadingStateChat.getError();
                                if (c.l((error3 == null || (errorName = error3.getErrorName()) == null) ? null : errorName.getErrorName(), "User is not a member of the group", false)) {
                                    chatActivity.G1().e.l(chatActivity);
                                    op5 op5Var = op5.a;
                                    String string2 = chatActivity.getString(R.string.error_message_send_cms);
                                    string2.getClass();
                                    String string3 = chatActivity.getString(R.string.error_sending_message);
                                    string3.getClass();
                                    op5Var.getClass();
                                    Toast.makeText(chatActivity, op5.b(string2, string3, null), 1).show();
                                    chatActivity.G1().x1();
                                } else {
                                    chatActivity.G1().e.l(chatActivity);
                                    Object systemService = chatActivity.getSystemService("input_method");
                                    systemService.getClass();
                                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                                    ha7 ha7Var = (ha7) chatActivity.a;
                                    inputMethodManager.hideSoftInputFromWindow(ha7Var != null ? ha7Var.K.getWindowToken() : null, 0);
                                    chatActivity.S1();
                                    chatActivity.a2();
                                    chatActivity.G1().x1();
                                }
                            } else {
                                chatActivity.G1().e.l(chatActivity);
                                op5 op5Var2 = op5.a;
                                String string4 = chatActivity.getString(R.string.nickname_validate_message_cms);
                                string4.getClass();
                                String string5 = chatActivity.getString(R.string.allow_time);
                                string5.getClass();
                                op5Var2.getClass();
                                Toast.makeText(chatActivity, op5.b(string4, string5, null), 1).show();
                                chatActivity.G1().x1();
                            }
                        } else {
                            chatActivity.G1().e.l(chatActivity);
                            op5 op5Var3 = op5.a;
                            String string6 = chatActivity.getString(R.string.nickname_validate_message_cms);
                            string6.getClass();
                            String string7 = chatActivity.getString(R.string.allow_time);
                            string7.getClass();
                            op5Var3.getClass();
                            Toast.makeText(chatActivity, op5.b(string6, string7, null), 1).show();
                            chatActivity.G1().x1();
                        }
                    } catch (Exception unused2) {
                    }
                }
                return Unit.a;
            }
        }));
    }

    public final void S1() {
        ha7 ha7Var = (ha7) this.a;
        if (ha7Var != null) {
            ha7Var.B.setPadding(0, 0, 0, 0);
        }
        ha7 ha7Var2 = (ha7) this.a;
        if (ha7Var2 != null) {
            ha7Var2.A.o0(0);
        }
        ViewGroup.LayoutParams layoutParams = this.R;
        if (layoutParams == null) {
            Intrinsics.n("params");
            throw null;
        }
        layoutParams.height = ycv.a(((double) this.P) / 1.73d);
        ha7 ha7Var3 = (ha7) this.a;
        if (ha7Var3 != null) {
            RecyclerView recyclerView = ha7Var3.A;
            ViewGroup.LayoutParams layoutParams2 = this.R;
            if (layoutParams2 == null) {
                Intrinsics.n("params");
                throw null;
            }
            recyclerView.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.Q;
        if (layoutParams3 == null) {
            Intrinsics.n("params1");
            throw null;
        }
        layoutParams3.height = ycv.a(((double) this.P) / 1.73d);
        ha7 ha7Var4 = (ha7) this.a;
        if (ha7Var4 != null) {
            ConstraintLayout constraintLayout = ha7Var4.B;
            ViewGroup.LayoutParams layoutParams4 = this.Q;
            if (layoutParams4 != null) {
                constraintLayout.setLayoutParams(layoutParams4);
            } else {
                Intrinsics.n("params1");
                throw null;
            }
        }
    }

    public final void T1(cj5 cj5Var) {
        this.u0 = cj5Var;
    }

    public final void U1(HashMap map) {
        String userId;
        this.d.getClass();
        map.getClass();
        StompClient stompClientA = xjo.a(SportyGamesManager.getInstance().getBaseUrlChat() + "chat/websocket/webchat", map, null);
        this.v = stompClientA;
        stompClientA.withClientHeartbeat(1000).withServerHeartbeat(1000);
        ArrayList arrayList = new ArrayList();
        if (H1()) {
            arrayList.add(new e1e0("x-queue-name", inm.a("user.", SportyGamesManager.getInstance().getPatronId())));
        } else {
            arrayList.add(new e1e0("x-queue-name", inm.a("user.", SportyGamesManager.getInstance().getUserId())));
        }
        ema emaVar = this.z;
        if (emaVar != null) {
            emaVar.dispose();
        }
        this.z = new ema();
        StompClient stompClient = this.v;
        if (stompClient == null) {
            Intrinsics.n("mStompClient");
            throw null;
        }
        r2i<bbs> r2iVarLifecycle = stompClient.lifecycle();
        qm70 qm70Var = wm70.c;
        v2i v2iVar = new v2i(r2iVarLifecycle.j(qm70Var).f(wm70.b).e(5000000L), new o87());
        int i2 = 0;
        final p87 p87Var = new p87(0);
        pya pyaVar = new pya() { // from class: q87
            @Override // defpackage.pya
            public final void accept(Object obj) {
                int i3 = ChatActivity.B0;
                p87Var.invoke(obj);
            }
        };
        taj.j jVar = taj.e;
        taj.d dVar = taj.c;
        slr slrVar = new slr(pyaVar, jVar, dVar);
        v2iVar.h(slrVar);
        ema emaVar2 = this.z;
        if (emaVar2 != null) {
            emaVar2.b(slrVar);
        }
        ArrayList arrayList2 = new ArrayList();
        if (H1()) {
            arrayList2.add(new e1e0("x-queue-name", inm.a("user.", SportyGamesManager.getInstance().getPatronId())));
        } else {
            arrayList2.add(new e1e0("x-queue-name", inm.a("user.", SportyGamesManager.getInstance().getUserId())));
        }
        if (H1()) {
            userId = SportyGamesManager.getInstance().getPatronId();
            userId.getClass();
        } else {
            userId = SportyGamesManager.getInstance().getUserId();
            userId.getClass();
        }
        StompClient stompClient2 = this.v;
        if (stompClient2 == null) {
            Intrinsics.n("mStompClient");
            throw null;
        }
        z2i z2iVarE = stompClient2.topic("/topic/user.".concat(userId), arrayList2).j(qm70Var).f(va0.a()).e(500000L);
        final o72 o72Var = new o72(this, 1);
        pya pyaVar2 = new pya() { // from class: r87
            @Override // defpackage.pya
            public final void accept(Object obj) {
                int i3 = ChatActivity.B0;
                o72Var.invoke(obj);
            }
        };
        final s87 s87Var = new s87(0);
        slr slrVar2 = new slr(pyaVar2, new pya() { // from class: t87
            @Override // defpackage.pya
            public final void accept(Object obj) {
                int i3 = ChatActivity.B0;
                s87Var.invoke(obj);
            }
        }, dVar);
        z2iVarE.h(slrVar2);
        ema emaVar3 = this.z;
        if (emaVar3 != null) {
            emaVar3.b(slrVar2);
        }
        StompClient stompClient3 = this.v;
        if (stompClient3 == null) {
            Intrinsics.n("mStompClient");
            throw null;
        }
        stompClient3.connect(arrayList);
        ((yg7) this.y.getValue()).a.f(this, new v97(new w87(this, i2)));
    }

    public final void V1(mz1 mz1Var) {
        this.t0 = mz1Var;
    }

    public final void W1() {
        HashMap map = new HashMap();
        GameDetails gameDetails = (GameDetails) getIntent().getParcelableExtra("sound");
        List<String> commonSounds = gameDetails != null ? gameDetails.getCommonSounds() : null;
        commonSounds.getClass();
        for (String str : commonSounds) {
            mpa0 mpa0Var = new mpa0();
            mpa0Var.a = this;
            map.put(mpa0Var.a(str), new rk60.a(str, StringsKt.k0(str, "common/", str), false, rk60.b.b, null));
        }
        String string = getString(R.string.evenodd_name);
        string.getClass();
        String lowerCase = string.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.S = new rk60(this, lowerCase, map, getIntent().getBooleanExtra("soundOn", false));
        ypa0 ypa0Var = (ypa0) this.w.getValue();
        rk60 rk60Var = this.S;
        if (rk60Var == null) {
            Intrinsics.n("soundManager");
            throw null;
        }
        ypa0.E1(ypa0Var, rk60Var);
    }

    public final void X1() {
        int intExtra = getIntent().getIntExtra("color", 0);
        qlf.d(this);
        Window window = getWindow();
        window.getClass();
        qlf.c(window, getColor(intExtra));
    }

    public final Object Z1(String str, String str2, String str3, Context context, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z2, String str12, boolean z3, String str13, tje0 tje0Var) {
        tb5 tb5Var = this.g0;
        if (tb5Var == null) {
            return Unit.a;
        }
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        Object objJ = tb5Var.j(tje0Var, ej5.b(nasVarA, gku.a, a6b.b, new t97(this, context, str9, str3, str2, str8, str10, z3, str6, str12, str, str5, str7, str13, str4, z2, str11, null)));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    public final void a2() {
        ha7 ha7Var = (ha7) this.a;
        if (ha7Var != null) {
            ha7Var.I.d.setNestedScrollingEnabled(false);
        }
        ha7 ha7Var2 = (ha7) this.a;
        if (ha7Var2 != null) {
            ha7Var2.A.setNestedScrollingEnabled(true);
        }
        ha7 ha7Var3 = (ha7) this.a;
        if (ha7Var3 != null) {
            ha7Var3.L.setVisibility(0);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 5.0f);
        translateAnimation.setDuration(100L);
        translateAnimation.setFillAfter(false);
        translateAnimation.setFillEnabled(false);
        ha7 ha7Var4 = (ha7) this.a;
        if (ha7Var4 != null) {
            ha7Var4.I.a.startAnimation(translateAnimation);
        }
        ha7 ha7Var5 = (ha7) this.a;
        if (ha7Var5 != null) {
            ha7Var5.I.a.setVisibility(8);
        }
    }

    public final void b2() {
        op5 op5Var = op5.a;
        ha7 ha7Var = (ha7) this.a;
        op5.r(op5Var, kotlin.collections.b.f(ha7Var != null ? ha7Var.T : null, ha7Var != null ? ha7Var.Q : null, ha7Var != null ? ha7Var.y : null, ha7Var != null ? ha7Var.K : null, ha7Var != null ? ha7Var.H : null, ha7Var != null ? ha7Var.I.e : null, ha7Var != null ? ha7Var.I.c : null, ha7Var != null ? ha7Var.V : null), null, 6);
    }

    @Override // defpackage.uy1
    public final boolean onBackPressedCompat() {
        this.z0 = false;
        overridePendingTransition(R.anim.slide_stay, R.anim.slide_out_up);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:224:0x0636  */
    /* JADX WARN: Code duplicated, block: B:227:0x0644 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x064b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0664 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x066a A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x0670 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x067c A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x0683  */
    /* JADX WARN: Code duplicated, block: B:242:0x069c A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x06a2 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x06a8 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x06b6 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x06f7 A[Catch: Exception -> 0x0a33, TRY_LEAVE, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x070b A[Catch: Exception -> 0x0a33, TRY_ENTER, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x0714 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0718 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0725 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0733 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x073c  */
    /* JADX WARN: Code duplicated, block: B:266:0x0746 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:290:0x07b1 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x07b5 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:293:0x07c2 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:296:0x07d0 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:297:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:300:0x07e5 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x07f5 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x07f9 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x0806 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x081f  */
    /* JADX WARN: Code duplicated, block: B:323:0x084a A[Catch: Exception -> 0x081d, TryCatch #0 {Exception -> 0x081d, blocks: (B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:405:0x0814, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:325:0x084e A[Catch: Exception -> 0x081d, TryCatch #0 {Exception -> 0x081d, blocks: (B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:405:0x0814, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:329:0x085a  */
    /* JADX WARN: Code duplicated, block: B:330:0x085b A[Catch: Exception -> 0x081d, TryCatch #0 {Exception -> 0x081d, blocks: (B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:405:0x0814, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x0867 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0870 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x0874 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0881 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:342:0x088f A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x0894  */
    /* JADX WARN: Code duplicated, block: B:345:0x089d A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:347:0x08a1 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:348:0x08ae A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x08bc A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:352:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:362:0x08e5 A[Catch: Exception -> 0x0a33, TRY_ENTER, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:363:0x08f1 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x0905 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:370:0x0918 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:373:0x092d A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:376:0x0940 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:379:0x0953 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:382:0x0966 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:385:0x0978 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:388:0x098c A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:391:0x09a6 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:394:0x09bd A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:397:0x09d0 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:405:0x0814 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0192 A[Catch: Exception -> 0x0a33, TryCatch #1 {Exception -> 0x0a33, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0018, B:8:0x001d, B:10:0x0026, B:12:0x002a, B:13:0x002f, B:15:0x0065, B:17:0x006c, B:19:0x0078, B:21:0x0080, B:23:0x008c, B:25:0x0094, B:27:0x00c8, B:30:0x00d5, B:32:0x00e7, B:35:0x00f4, B:37:0x00fd, B:39:0x0105, B:40:0x0116, B:43:0x011f, B:44:0x0134, B:46:0x013a, B:47:0x014f, B:49:0x0177, B:51:0x0188, B:54:0x0199, B:57:0x01b1, B:193:0x0535, B:195:0x053e, B:196:0x0547, B:198:0x0554, B:199:0x0561, B:201:0x0567, B:202:0x0574, B:204:0x05a0, B:206:0x05c9, B:208:0x05e1, B:209:0x05e4, B:211:0x05fe, B:219:0x0625, B:221:0x062f, B:225:0x0638, B:227:0x0644, B:229:0x064d, B:231:0x0664, B:233:0x066a, B:234:0x0670, B:235:0x0675, B:236:0x0676, B:238:0x067c, B:240:0x0685, B:242:0x069c, B:244:0x06a2, B:245:0x06a8, B:246:0x06ad, B:247:0x06ae, B:249:0x06b6, B:250:0x06d9, B:252:0x06f7, B:255:0x070b, B:257:0x0714, B:259:0x0718, B:261:0x072f, B:263:0x0733, B:265:0x073d, B:299:0x07e1, B:260:0x0725, B:266:0x0746, B:268:0x074f, B:270:0x0757, B:272:0x075f, B:274:0x0767, B:276:0x076f, B:278:0x0777, B:281:0x0780, B:283:0x0784, B:285:0x079b, B:287:0x079f, B:289:0x07a9, B:284:0x0791, B:290:0x07b1, B:292:0x07b5, B:294:0x07cc, B:296:0x07d0, B:298:0x07da, B:293:0x07c2, B:300:0x07e5, B:302:0x07f5, B:304:0x07f9, B:306:0x0810, B:333:0x0861, B:305:0x0806, B:334:0x0867, B:336:0x0870, B:338:0x0874, B:340:0x088b, B:342:0x088f, B:344:0x0895, B:354:0x08c9, B:339:0x0881, B:345:0x089d, B:347:0x08a1, B:349:0x08b8, B:351:0x08bc, B:353:0x08c2, B:348:0x08ae, B:355:0x08cb, B:357:0x08d1, B:359:0x08db, B:362:0x08e5, B:364:0x08fc, B:363:0x08f1, B:365:0x08ff, B:367:0x0905, B:368:0x0912, B:370:0x0918, B:371:0x0927, B:373:0x092d, B:374:0x093a, B:376:0x0940, B:377:0x094d, B:379:0x0953, B:380:0x0960, B:382:0x0966, B:383:0x0972, B:385:0x0978, B:386:0x0986, B:388:0x098c, B:389:0x0998, B:391:0x09a6, B:392:0x09b0, B:394:0x09bd, B:395:0x09ca, B:397:0x09d0, B:398:0x09dc, B:215:0x060c, B:217:0x0617, B:399:0x0a23, B:400:0x0a2a, B:401:0x0a2b, B:402:0x0a32, B:58:0x01c1, B:60:0x01d1, B:62:0x01e3, B:63:0x01ee, B:65:0x01f4, B:66:0x0202, B:68:0x0208, B:69:0x0216, B:71:0x021c, B:72:0x022a, B:74:0x0230, B:76:0x0234, B:77:0x023f, B:80:0x024c, B:82:0x025e, B:83:0x0269, B:85:0x026f, B:86:0x027a, B:88:0x0280, B:89:0x0287, B:91:0x028d, B:92:0x029d, B:94:0x02a6, B:96:0x02b8, B:97:0x02c3, B:99:0x02c9, B:100:0x02d7, B:102:0x02dd, B:103:0x02e4, B:105:0x02ea, B:106:0x02fa, B:108:0x0306, B:110:0x0318, B:111:0x0323, B:113:0x0329, B:114:0x0337, B:116:0x033d, B:117:0x0346, B:119:0x034c, B:120:0x035c, B:122:0x0365, B:124:0x0377, B:125:0x0382, B:127:0x0388, B:128:0x0396, B:130:0x039c, B:131:0x03a5, B:133:0x03ab, B:134:0x03bb, B:136:0x03c4, B:138:0x03d6, B:139:0x03e4, B:141:0x03ea, B:142:0x03f8, B:144:0x03fe, B:145:0x0405, B:147:0x040b, B:148:0x0419, B:150:0x041f, B:152:0x0423, B:153:0x0431, B:155:0x043a, B:157:0x044c, B:158:0x0457, B:160:0x045d, B:161:0x046b, B:163:0x0471, B:164:0x047f, B:166:0x0485, B:167:0x048d, B:169:0x0493, B:170:0x04a3, B:172:0x04ac, B:174:0x04be, B:175:0x04cc, B:177:0x04d2, B:178:0x04e0, B:180:0x04e6, B:181:0x04f4, B:183:0x04fa, B:184:0x0502, B:186:0x0508, B:187:0x0516, B:189:0x051c, B:191:0x0520, B:192:0x052d, B:53:0x0192, B:34:0x00ef, B:29:0x00d0, B:308:0x0814, B:313:0x0822, B:315:0x0826, B:318:0x0831, B:320:0x0835, B:322:0x083f, B:323:0x084a, B:325:0x084e, B:327:0x0854, B:331:0x085e, B:330:0x085b), top: B:406:0x000b, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [a6b, kotlin.coroutines.CoroutineContext, v1b] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.view.ViewGroup$LayoutParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewGroup$LayoutParams, java.lang.Object] */
    @Override // defpackage.uy1, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        mz1 mz1Var;
        cj5 cj5Var;
        Throwable th;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        double d2;
        double d3;
        int i2;
        ha7 ha7Var;
        ?? layoutParams;
        ha7 ha7Var2;
        ha7 ha7Var3;
        ?? layoutParams2;
        ha7 ha7Var4;
        ha7 ha7Var5;
        ha7 ha7Var6;
        ha7 ha7Var7;
        ha7 ha7Var8;
        ha7 ha7Var9;
        ha7 ha7Var10;
        ha7 ha7Var11;
        ha7 ha7Var12;
        ha7 ha7Var13;
        ha7 ha7Var14;
        ha7 ha7Var15;
        boolean zH1;
        HashMap<String, String> map;
        TopWinResponse topWinResponse;
        String betId;
        com.sportygames.pingpong.remote.models.TopWinResponse topWinResponse2;
        String betId2;
        com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem;
        Long lValueOf;
        com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem2;
        String betId3;
        com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem3;
        com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem4;
        Long lValueOf2;
        com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem5;
        Long lValueOf3;
        ConstraintLayout constraintLayout4;
        ViewGroup.LayoutParams layoutParams3;
        RecyclerView recyclerView;
        ViewGroup.LayoutParams layoutParams4;
        Drawable progressDrawable;
        ConstraintLayout constraintLayout5;
        ConstraintLayout constraintLayout6;
        String str = this.i0;
        super.onCreate(bundle);
        try {
            elf.b(this, null, 3);
            ha7 ha7Var16 = (ha7) this.a;
            if (ha7Var16 != null && (constraintLayout6 = ha7Var16.a) != null) {
                qlf.b(constraintLayout6);
                Unit unit = Unit.a;
            }
            X1();
            ha7 ha7Var17 = (ha7) this.a;
            if (ha7Var17 != null && (constraintLayout5 = ha7Var17.b) != null) {
                qlf.a(constraintLayout5);
                Unit unit2 = Unit.a;
            }
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            float f2 = getResources().getConfiguration().screenWidthDp * displayMetrics.density;
            final View viewFindViewById = findViewById(android.R.id.content);
            Map mapC = qi8.c(getIntent().getIntExtra("availableHeight", 0), f2);
            Float f3 = (Float) mapC.get("ChatActivityHeightParam");
            this.v0 = f3 != null ? f3.floatValue() : 100.0f;
            Float f4 = (Float) mapC.get("heightMultiplier");
            this.w0 = f4 != null ? f4.floatValue() : 1.8f;
            Float f5 = (Float) mapC.get("cashoutToastHeight");
            this.x0 = f5 != null ? f5.floatValue() : 0.065f;
            viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l97
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    int i3 = ChatActivity.B0;
                    Rect rect = new Rect();
                    View view = viewFindViewById;
                    view.getWindowVisibleDisplayFrame(rect);
                    int height = view.getRootView().getHeight();
                    view.getRootView().getWidth();
                    int i4 = height - rect.bottom;
                    ChatActivity chatActivity = this;
                    ha7 ha7Var18 = (ha7) chatActivity.a;
                    ViewGroup.LayoutParams layoutParams5 = ha7Var18 != null ? ha7Var18.w.getLayoutParams() : null;
                    layoutParams5.getClass();
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                    if (i4 > ((double) height) * 0.15d) {
                        layoutParams6.S = 0.1f;
                    } else {
                        layoutParams6.S = chatActivity.x0;
                    }
                    ha7 ha7Var19 = (ha7) chatActivity.a;
                    if (ha7Var19 != null) {
                        ha7Var19.w.setLayoutParams(layoutParams6);
                    }
                }
            });
            this.O = new Rect();
            String strValueOf = String.valueOf(getIntent().getStringExtra(getString(R.string.colors_game_name)));
            this.f = strValueOf;
            Function0<mz1> function0 = vij.a.get(strValueOf);
            if (function0 == null || (mz1Var = function0.invoke()) == null) {
                mz1Var = new mz1();
            }
            V1(mz1Var);
            String str2 = this.f;
            str2.getClass();
            Function0<cj5> function1 = vij.b.get(str2);
            if (function1 == null || (cj5Var = function1.invoke()) == null) {
                cj5Var = new cj5();
            }
            T1(cj5Var);
            ha7 ha7Var18 = (ha7) this.a;
            if (ha7Var18 != null && (progressDrawable = ha7Var18.U.getProgressDrawable()) != null) {
                progressDrawable.setTint(r58.l(C1().q()));
                Unit unit3 = Unit.a;
            }
            ha7 ha7Var19 = (ha7) this.a;
            u6i0.c cVar = u6i0.c.a;
            if (ha7Var19 != null) {
                ComposeView composeView = ha7Var19.b0;
                composeView.setViewCompositionStrategy(cVar);
                composeView.setContent(new op8(-1906935108, new Function2() { // from class: j87
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i3 = ChatActivity.B0;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final ChatActivity chatActivity = this.a;
                            if (((Boolean) ((x5a0) chatActivity.p0).getValue()).booleanValue()) {
                                aVar.N(28679984);
                                m28 m28Var = (m28) chatActivity.E.getValue();
                                String strValueOf2 = String.valueOf(chatActivity.o0);
                                mz1 mz1Var2 = chatActivity.t0;
                                if (mz1Var2 == null) {
                                    Intrinsics.n("gameColors");
                                    throw null;
                                }
                                boolean zA = aVar.A(chatActivity);
                                Object objY = aVar.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new Function0() { // from class: a97
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ((x5a0) chatActivity.p0).setValue(Boolean.FALSE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar.r(objY);
                                }
                                ida.c(m28Var, strValueOf2, mz1Var2, null, (Function0) objY, aVar, 0, 8);
                            } else {
                                aVar.N(15922182);
                            }
                            aVar.H();
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            }
            ha7 ha7Var20 = (ha7) this.a;
            if (ha7Var20 != null) {
                ComposeView composeView2 = ha7Var20.w;
                composeView2.setViewCompositionStrategy(cVar);
                composeView2.setContent(new op8(1868739901, new Function2() { // from class: k87
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ChatActivity chatActivity;
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i3 = ChatActivity.B0;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ChatActivity chatActivity2 = this.a;
                            if (((Boolean) ((x5a0) chatActivity2.q0).getValue()).booleanValue()) {
                                aVar.N(264395607);
                                chatActivity = chatActivity2;
                                g9a.c(((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).b, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).a, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).c, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).h, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).e, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).k ? ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).g : ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).f, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).i, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).j, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).k, (mz1) ((x5a0) chatActivity2.E1().e0).getValue(), (cj5) ((x5a0) chatActivity2.E1().f0).getValue(), true, ((goj.a) ((x5a0) chatActivity2.E1().w0).getValue()).l, null, null, aVar, 0, 24576);
                            } else {
                                chatActivity = chatActivity2;
                                aVar.N(250945637);
                            }
                            aVar.H();
                            ChatActivity chatActivity3 = chatActivity;
                            z7a.a(((Boolean) ((x5a0) chatActivity3.r0).getValue()).booleanValue(), ((ToastCommonModel) ((x5a0) chatActivity3.D1().U).getValue()).getGiftVal() > 0.0d, ((ToastCommonModel) ((x5a0) chatActivity3.D1().U).getValue()).getText(), ((ToastCommonModel) ((x5a0) chatActivity3.D1().U).getValue()).getCurrency(), ((ToastCommonModel) ((x5a0) chatActivity3.D1().U).getValue()).getAt(), ((ToastCommonModel) ((x5a0) chatActivity3.D1().U).getValue()).getCoeff(), ((ToastCommonModel) ((x5a0) chatActivity3.D1().U).getValue()).getBgColor(), ((ToastCommonModel) ((x5a0) chatActivity3.D1().U).getValue()).getGiftAmount(), ((ToastCommonModel) ((x5a0) chatActivity3.D1().U).getValue()).getActualUsedAmount(), (mz1) ((x5a0) chatActivity3.D1().M).getValue(), (cj5) ((x5a0) chatActivity3.D1().N).getValue(), true, aVar, 0);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            }
            String strValueOf2 = String.valueOf(getIntent().getStringExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT));
            Locale locale = Locale.ROOT;
            String lowerCase = strValueOf2.toLowerCase(locale);
            lowerCase.getClass();
            this.e = lowerCase;
            String lowerCase2 = lowerCase.toLowerCase(locale);
            lowerCase2.getClass();
            this.d = lowerCase2;
            if (StringsKt.M(lowerCase2, str, false)) {
                SportyGamesManager.getInstance().getPatronId();
            } else {
                String str3 = this.d;
                String lowerCase3 = "Pong".toLowerCase(locale);
                lowerCase3.getClass();
                if (StringsKt.M(str3, lowerCase3, false) || StringsKt.M(this.d, "Pocket Rockets", true)) {
                    SportyGamesManager.getInstance().getPatronId();
                }
            }
            String str4 = "sporty cars";
            String str5 = "sporty kick";
            if (StringsKt.M(this.d, str, false)) {
                N1();
                op5.a.getClass();
                op5.c = "sg_sporty_hero";
                th = null;
            } else {
                th = null;
                if (kotlin.text.c.l(this.d, "ping pong", true)) {
                    Q1();
                    op5.a.getClass();
                    op5.c = "sg_ping_pong";
                    ha7 ha7Var21 = (ha7) this.a;
                    if (ha7Var21 != null) {
                        ha7Var21.T.setText(getString(R.string.preparing_for_next_round));
                        Unit unit4 = Unit.a;
                    }
                    ha7 ha7Var22 = (ha7) this.a;
                    if (ha7Var22 != null) {
                        ha7Var22.T.setTag(getString(R.string.preparing_next_round));
                        Unit unit5 = Unit.a;
                    }
                    ha7 ha7Var23 = (ha7) this.a;
                    if (ha7Var23 != null) {
                        ha7Var23.H.setText(getString(R.string.pp_round_ended));
                        Unit unit6 = Unit.a;
                    }
                    ha7 ha7Var24 = (ha7) this.a;
                    if (ha7Var24 != null) {
                        ha7Var24.H.setTag(getString(R.string.round_ended_pp));
                        Unit unit7 = Unit.a;
                    }
                    ha7 ha7Var25 = (ha7) this.a;
                    if (ha7Var25 != null && (constraintLayout3 = ha7Var25.b) != null) {
                        constraintLayout3.setBackground(getDrawable(R.color.trans_black_90));
                        Unit unit8 = Unit.a;
                    }
                } else if (kotlin.text.c.l(this.d, "sporty jet", true)) {
                    L1();
                    op5.a.getClass();
                    op5.c = "sg_sporty_jet";
                    ha7 ha7Var26 = (ha7) this.a;
                    if (ha7Var26 != null) {
                        ha7Var26.T.setText(getString(R.string.preparing_for_next_round));
                        Unit unit9 = Unit.a;
                    }
                    ha7 ha7Var27 = (ha7) this.a;
                    if (ha7Var27 != null) {
                        ha7Var27.T.setTag(getString(R.string.power_up_next_round_cms));
                        Unit unit10 = Unit.a;
                    }
                    ha7 ha7Var28 = (ha7) this.a;
                    if (ha7Var28 != null) {
                        ha7Var28.H.setText("VANISHED!");
                        Unit unit11 = Unit.a;
                    }
                    ha7 ha7Var29 = (ha7) this.a;
                    if (ha7Var29 != null) {
                        ha7Var29.H.setTag(getString(R.string.flew_away_cms));
                        Unit unit12 = Unit.a;
                    }
                } else if (kotlin.text.c.l(this.d, "galaxy go", true)) {
                    L1();
                    op5.a.getClass();
                    op5.c = "sg_galaxy_go";
                    ha7 ha7Var30 = (ha7) this.a;
                    if (ha7Var30 != null) {
                        ha7Var30.T.setText(getString(R.string.preparing_for_next_round));
                        Unit unit13 = Unit.a;
                    }
                    ha7 ha7Var31 = (ha7) this.a;
                    if (ha7Var31 != null) {
                        ha7Var31.T.setTag(getString(R.string.power_up_next_round_cms));
                        Unit unit14 = Unit.a;
                    }
                    ha7 ha7Var32 = (ha7) this.a;
                    if (ha7Var32 != null) {
                        ha7Var32.H.setText("VANISHED!");
                        Unit unit15 = Unit.a;
                    }
                    ha7 ha7Var33 = (ha7) this.a;
                    if (ha7Var33 != null) {
                        ha7Var33.H.setTag(getString(R.string.flew_away_cms));
                        Unit unit16 = Unit.a;
                    }
                } else if (kotlin.text.c.l(this.d, "sporty kick", true)) {
                    L1();
                    op5.a.getClass();
                    op5.c = "sg_sporty_kick";
                    ha7 ha7Var34 = (ha7) this.a;
                    if (ha7Var34 != null) {
                        ha7Var34.T.setText(getString(R.string.powering_up_for_next_round));
                        Unit unit17 = Unit.a;
                    }
                    ha7 ha7Var35 = (ha7) this.a;
                    if (ha7Var35 != null) {
                        ha7Var35.T.setTag(getString(R.string.power_up_next_round_cms));
                        Unit unit18 = Unit.a;
                    }
                    ha7 ha7Var36 = (ha7) this.a;
                    if (ha7Var36 != null) {
                        ha7Var36.H.setText("CRASHED!");
                        Unit unit19 = Unit.a;
                    }
                    ha7 ha7Var37 = (ha7) this.a;
                    if (ha7Var37 != null) {
                        ha7Var37.H.setTag(getString(R.string.flew_away_cms));
                        Unit unit20 = Unit.a;
                    }
                } else if (kotlin.text.c.l(this.d, "sporty cars", true)) {
                    L1();
                    op5.a.getClass();
                    op5.c = "sg_sporty_cars";
                    ha7 ha7Var38 = (ha7) this.a;
                    if (ha7Var38 != null) {
                        ha7Var38.T.setText(getString(R.string.powering_up_for_next_round));
                        Unit unit21 = Unit.a;
                    }
                    ha7 ha7Var39 = (ha7) this.a;
                    if (ha7Var39 != null) {
                        ha7Var39.T.setTag(getString(R.string.power_up_next_round_cms));
                        Unit unit22 = Unit.a;
                    }
                    ha7 ha7Var40 = (ha7) this.a;
                    if (ha7Var40 != null) {
                        ha7Var40.H.setText("SPED AWAY!");
                        Unit unit23 = Unit.a;
                    }
                    ha7 ha7Var41 = (ha7) this.a;
                    if (ha7Var41 != null) {
                        ha7Var41.H.setTag(getString(R.string.flew_away_cms));
                        Unit unit24 = Unit.a;
                    }
                } else if (kotlin.text.c.l(this.d, "one-punch", true)) {
                    L1();
                    op5.a.getClass();
                    op5.c = "sg_1_punch";
                    ha7 ha7Var42 = (ha7) this.a;
                    if (ha7Var42 != null) {
                        ha7Var42.T.setText(getString(R.string.preparing_for_next_round));
                        Unit unit25 = Unit.a;
                    }
                    ha7 ha7Var43 = (ha7) this.a;
                    if (ha7Var43 != null) {
                        ha7Var43.T.setTag(getString(R.string.power_up_next_round_cms));
                        Unit unit26 = Unit.a;
                    }
                    ha7 ha7Var44 = (ha7) this.a;
                    if (ha7Var44 != null) {
                        ha7Var44.H.setText("VANISHED!");
                        Unit unit27 = Unit.a;
                    }
                    ha7 ha7Var45 = (ha7) this.a;
                    if (ha7Var45 != null) {
                        ha7Var45.H.setTag(getString(R.string.flew_away_cms));
                        Unit unit28 = Unit.a;
                    }
                    ha7 ha7Var46 = (ha7) this.a;
                    if (ha7Var46 != null && (constraintLayout2 = ha7Var46.b) != null) {
                        constraintLayout2.setBackground(getDrawable(R.color.trans_black_90));
                        Unit unit29 = Unit.a;
                    }
                } else if (kotlin.text.c.l(this.d, "crazy rider", true)) {
                    L1();
                    op5.a.getClass();
                    op5.c = "sg_crazy_rider";
                    ha7 ha7Var47 = (ha7) this.a;
                    if (ha7Var47 != null) {
                        ha7Var47.T.setText(getString(R.string.powering_up_for_next_round));
                        Unit unit30 = Unit.a;
                    }
                    ha7 ha7Var48 = (ha7) this.a;
                    if (ha7Var48 != null) {
                        ha7Var48.T.setTag(getString(R.string.power_up_next_round_cms));
                        Unit unit31 = Unit.a;
                    }
                    ha7 ha7Var49 = (ha7) this.a;
                    if (ha7Var49 != null) {
                        ha7Var49.H.setText(getString(R.string.cr_flew_away_text));
                        Unit unit32 = Unit.a;
                    }
                    ha7 ha7Var50 = (ha7) this.a;
                    if (ha7Var50 != null) {
                        ha7Var50.H.setAllCaps(false);
                        Unit unit33 = Unit.a;
                    }
                    ha7 ha7Var51 = (ha7) this.a;
                    if (ha7Var51 != null) {
                        ha7Var51.H.setTag(getString(R.string.flew_away_cms));
                        Unit unit34 = Unit.a;
                    }
                } else if (kotlin.text.c.l(this.d, "sporty skills", true)) {
                    L1();
                    op5.a.getClass();
                    op5.c = "sg_sporty_skills";
                    ha7 ha7Var52 = (ha7) this.a;
                    if (ha7Var52 != null) {
                        ha7Var52.T.setText(getString(R.string.preparing_for_next_round));
                        Unit unit35 = Unit.a;
                    }
                    ha7 ha7Var53 = (ha7) this.a;
                    if (ha7Var53 != null) {
                        ha7Var53.T.setTag(getString(R.string.power_up_next_round_cms));
                        Unit unit36 = Unit.a;
                    }
                    ha7 ha7Var54 = (ha7) this.a;
                    if (ha7Var54 != null) {
                        ha7Var54.H.setText(getString(R.string.ss_flew_away_text));
                        Unit unit37 = Unit.a;
                    }
                    ha7 ha7Var55 = (ha7) this.a;
                    if (ha7Var55 != null) {
                        ha7Var55.H.setAllCaps(false);
                        Unit unit38 = Unit.a;
                    }
                    ha7 ha7Var56 = (ha7) this.a;
                    if (ha7Var56 != null) {
                        ha7Var56.H.setTag(getString(R.string.flew_away_cms));
                        Unit unit39 = Unit.a;
                    }
                    ha7 ha7Var57 = (ha7) this.a;
                    if (ha7Var57 != null && (constraintLayout = ha7Var57.b) != null) {
                        constraintLayout.setBackground(getDrawable(R.color.trans_black_90));
                        Unit unit40 = Unit.a;
                    }
                } else {
                    kotlin.text.c.l(this.d, "Fruit Hunt", true);
                }
            }
            b2();
            ha7 ha7Var58 = (ha7) this.a;
            if (ha7Var58 != null) {
                ha7Var58.a0.setVisibility(8);
                Unit unit41 = Unit.a;
            }
            this.X = new k();
            ha7 ha7Var59 = (ha7) this.a;
            if (ha7Var59 != null) {
                gr60.a(ha7Var59.d, new y62(this, 1));
                Unit unit42 = Unit.a;
            }
            ha7 ha7Var60 = (ha7) this.a;
            if (ha7Var60 != null) {
                gr60.a(ha7Var60.e, new z62(this, 1));
                Unit unit43 = Unit.a;
            }
            this.L = String.valueOf(getIntent().getStringExtra("roomId"));
            this.c = String.valueOf(getIntent().getStringExtra("botId"));
            View decorView = getWindow().getDecorView();
            Rect rect = this.O;
            if (rect == null) {
                Intrinsics.n("rect");
                throw null;
            }
            decorView.getWindowVisibleDisplayFrame(rect);
            v8i0 viewModelStore = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            viewModelStore.getClass();
            defaultViewModelProviderFactory.getClass();
            defaultViewModelCreationExtras.getClass();
            s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
            dq7 dq7VarD = tgp.d(dik.class);
            String strB = kc6.b(dq7VarD);
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.M = (dik) s8i0Var.a(dq7VarD, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            if (!getIntent().hasExtra("share_data_type")) {
                W1();
            }
            this.T = ((Boolean) ((x5a0) xag0.a()).getValue()).booleanValue();
            if (!StringsKt.M(this.d, str, false) || !this.T) {
                if (StringsKt.M(this.d, "punch", true)) {
                    str4 = "sporty cars";
                    str5 = "sporty kick";
                    d3 = this.w0;
                } else {
                    d2 = 1.7d;
                }
                this.U = d3;
                if (StringsKt.M(this.d, str, false) || !this.T) {
                    i2 = 27;
                } else {
                    i2 = 10;
                }
                this.V = i2;
                this.P = displayMetrics.heightPixels;
                ha7Var = (ha7) this.a;
                if (ha7Var != null) {
                    layoutParams = ha7Var.A.getLayoutParams();
                } else {
                    layoutParams = th;
                }
                layoutParams.getClass();
                this.R = layoutParams;
                ((ViewGroup.LayoutParams) layoutParams).height = ycv.a(((double) this.P) / this.U);
                ha7Var2 = (ha7) this.a;
                if (ha7Var2 != null) {
                    recyclerView = ha7Var2.A;
                    layoutParams4 = this.R;
                    if (layoutParams4 != null) {
                        Intrinsics.n("params");
                        throw th;
                    }
                    recyclerView.setLayoutParams(layoutParams4);
                    Unit unit44 = Unit.a;
                }
                ha7Var3 = (ha7) this.a;
                if (ha7Var3 != null) {
                    layoutParams2 = ha7Var3.B.getLayoutParams();
                } else {
                    layoutParams2 = th;
                }
                layoutParams2.getClass();
                this.Q = layoutParams2;
                ((ViewGroup.LayoutParams) layoutParams2).height = ycv.a(((double) this.P) / this.U);
                ha7Var4 = (ha7) this.a;
                if (ha7Var4 != null) {
                    constraintLayout4 = ha7Var4.B;
                    layoutParams3 = this.Q;
                    if (layoutParams3 != null) {
                        Intrinsics.n("params1");
                        throw th;
                    }
                    constraintLayout4.setLayoutParams(layoutParams3);
                    Unit unit45 = Unit.a;
                }
                if (!TextUtils.isEmpty(this.L)) {
                    sh7 sh7VarG1 = G1();
                    String str6 = this.L;
                    String strValueOf3 = String.valueOf(System.currentTimeMillis());
                    str6.getClass();
                    strValueOf3.getClass();
                    ?? r13 = th;
                    ej5.c(o8i0.d(sh7VarG1), r13, r13, new gh7(sh7VarG1, str6, strValueOf3, r13), 3);
                }
                G1().b.f(this, new v97(new z87(this, 0)));
                if (getIntent().hasExtra("share_data_type")) {
                    if (kotlin.text.c.l(getIntent().getStringExtra("share_data_type"), "bet_history", false)) {
                        if (kotlin.text.c.l(this.d, "ping pong", true)) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                betHistoryItem5 = (com.sportygames.pingpong.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject", com.sportygames.pingpong.remote.models.BetHistoryItem.class);
                            } else {
                                betHistoryItem5 = (com.sportygames.pingpong.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject");
                            }
                            this.d0 = betHistoryItem5;
                            if (betHistoryItem5 != null) {
                                lValueOf3 = Long.valueOf(betHistoryItem5.getId());
                            } else {
                                lValueOf3 = null;
                            }
                            Y1(String.valueOf(lValueOf3));
                        } else if (!kotlin.text.c.l(this.d, "sporty jet", true) || kotlin.text.c.l(this.d, "galaxy go", true) || kotlin.text.c.l(this.d, "one-punch", true) || kotlin.text.c.l(this.d, "crazy rider", true) || kotlin.text.c.l(this.d, "sporty skills", true) || kotlin.text.c.l(this.d, str5, true) || kotlin.text.c.l(this.d, str4, true)) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                betHistoryItem4 = (com.sportygames.crash.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject", com.sportygames.crash.remote.models.BetHistoryItem.class);
                            } else {
                                betHistoryItem4 = (com.sportygames.crash.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject");
                            }
                            this.e0 = betHistoryItem4;
                            if (betHistoryItem4 != null) {
                                lValueOf2 = Long.valueOf(betHistoryItem4.getId());
                            } else {
                                lValueOf2 = null;
                            }
                            Y1(String.valueOf(lValueOf2));
                        } else {
                            BetHistoryItem betHistoryItem6 = Build.VERSION.SDK_INT >= 33 ? (BetHistoryItem) getIntent().getParcelableExtra("betObject", BetHistoryItem.class) : (BetHistoryItem) getIntent().getParcelableExtra("betObject");
                            this.c0 = betHistoryItem6;
                            Y1(String.valueOf(betHistoryItem6 != null ? Long.valueOf(betHistoryItem6.getId()) : null));
                        }
                        Unit unit46 = Unit.a;
                    } else if (kotlin.text.c.l(getIntent().getStringExtra("share_data_type"), "bet_history_pocket", false)) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            betHistoryItem = (com.sportygames.pocketrocket.model.response.BetHistoryItem) getIntent().getParcelableExtra("betObject", com.sportygames.pocketrocket.model.response.BetHistoryItem.class);
                        } else {
                            betHistoryItem = (com.sportygames.pocketrocket.model.response.BetHistoryItem) getIntent().getParcelableExtra("betObject");
                        }
                        this.f0 = betHistoryItem;
                        if (betHistoryItem != null) {
                            try {
                                lValueOf = Long.valueOf(betHistoryItem.getId());
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                Unit unit47 = Unit.a;
                            }
                        } else {
                            lValueOf = null;
                        }
                        if (lValueOf != null || ((betHistoryItem3 = this.f0) != null && betHistoryItem3.getId() == 0)) {
                            betHistoryItem2 = this.f0;
                            if (betHistoryItem2 != null && (betId3 = betHistoryItem2.getBetId()) != null) {
                                if (betId3.length() != 0) {
                                    Y1(betId3);
                                }
                                Unit unit48 = Unit.a;
                            }
                        } else {
                            com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem7 = this.f0;
                            Y1(String.valueOf(betHistoryItem7 != null ? Long.valueOf(betHistoryItem7.getId()) : null));
                            Unit unit49 = Unit.a;
                        }
                    } else {
                        if (kotlin.text.c.l(this.d, "ping pong", true)) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                topWinResponse2 = (com.sportygames.pingpong.remote.models.TopWinResponse) getIntent().getParcelableExtra("betObject", com.sportygames.pingpong.remote.models.TopWinResponse.class);
                            } else {
                                topWinResponse2 = (com.sportygames.pingpong.remote.models.TopWinResponse) getIntent().getParcelableExtra("betObject");
                            }
                            this.b0 = topWinResponse2;
                            if (topWinResponse2 != null) {
                                betId2 = topWinResponse2.getBetId();
                            } else {
                                betId2 = null;
                            }
                            Y1(String.valueOf(betId2));
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                topWinResponse = (TopWinResponse) getIntent().getParcelableExtra("betObject", TopWinResponse.class);
                            } else {
                                topWinResponse = (TopWinResponse) getIntent().getParcelableExtra("betObject");
                            }
                            this.a0 = topWinResponse;
                            if (topWinResponse != null) {
                                betId = topWinResponse.getBetId();
                            } else {
                                betId = null;
                            }
                            Y1(String.valueOf(betId));
                        }
                        Unit unit50 = Unit.a;
                    }
                }
                if (SportyGamesManager.getInstance() != null && SportyGamesManager.getInstance().getUserId() != null) {
                    zH1 = H1();
                    map = this.H;
                    if (zH1) {
                        map.put("userId", SportyGamesManager.getInstance().getPatronId());
                    } else {
                        map.put("userId", SportyGamesManager.getInstance().getUserId());
                    }
                    U1(map);
                }
                ha7Var5 = (ha7) this.a;
                if (ha7Var5 != null) {
                    gr60.a(ha7Var5.E, new a72(this, 1));
                    Unit unit51 = Unit.a;
                }
                ha7Var6 = (ha7) this.a;
                if (ha7Var6 != null) {
                    gr60.a(ha7Var6.I.b, new b72(this, 1));
                    Unit unit52 = Unit.a;
                }
                ha7Var7 = (ha7) this.a;
                if (ha7Var7 != null) {
                    gr60.a(ha7Var7.Y, new l87(this, 0));
                    Unit unit53 = Unit.a;
                }
                ha7Var8 = (ha7) this.a;
                if (ha7Var8 != null) {
                    gr60.a(ha7Var8.M, new m87(this, 0));
                    Unit unit54 = Unit.a;
                }
                ha7Var9 = (ha7) this.a;
                if (ha7Var9 != null) {
                    gr60.a(ha7Var9.K, new e72(this, 1));
                    Unit unit55 = Unit.a;
                }
                ha7Var10 = (ha7) this.a;
                if (ha7Var10 != null) {
                    ha7Var10.K.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: m97
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z2) {
                            int i3 = ChatActivity.B0;
                            ChatActivity chatActivity = this.a;
                            B b2 = chatActivity.a;
                            if (z2) {
                                ha7 ha7Var61 = (ha7) b2;
                                if (ha7Var61 != null) {
                                    ha7Var61.z.setBackground(chatActivity.getDrawable(R.drawable.chat_edittext_active));
                                    return;
                                }
                                return;
                            }
                            ha7 ha7Var62 = (ha7) b2;
                            if (ha7Var62 != null) {
                                ha7Var62.z.setBackground(chatActivity.getDrawable(R.drawable.chat_edittext_idle));
                            }
                        }
                    });
                    Unit unit56 = Unit.a;
                }
                ha7Var11 = (ha7) this.a;
                if (ha7Var11 != null) {
                    ha7Var11.I.e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n97
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z2) {
                            int i3 = ChatActivity.B0;
                            ChatActivity chatActivity = this.a;
                            B b2 = chatActivity.a;
                            if (z2) {
                                ha7 ha7Var61 = (ha7) b2;
                                if (ha7Var61 != null) {
                                    ha7Var61.I.f.setBackground(chatActivity.getDrawable(R.drawable.card_gif_search_blue));
                                    return;
                                }
                                return;
                            }
                            ha7 ha7Var62 = (ha7) b2;
                            if (ha7Var62 != null) {
                                ha7Var62.I.f.setBackground(chatActivity.getDrawable(R.drawable.card_gif_search));
                            }
                        }
                    });
                    Unit unit57 = Unit.a;
                }
                ha7Var12 = (ha7) this.a;
                if (ha7Var12 != null) {
                    ha7Var12.K.setOnKeyListener(new View.OnKeyListener() { // from class: o97
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                            Editable text;
                            ChatActivity chatActivity = this.a;
                            if (!TextUtils.isEmpty(chatActivity.L) && keyEvent.getAction() == 0 && i3 == 66) {
                                ha7 ha7Var61 = (ha7) chatActivity.a;
                                if (StringsKt.t0(String.valueOf(ha7Var61 != null ? ha7Var61.K.getText() : null)).toString().length() != 0) {
                                    String str7 = chatActivity.L;
                                    ha7 ha7Var62 = (ha7) chatActivity.a;
                                    SendMessageRequest sendMessageRequest = new SendMessageRequest(str7, "TEXT", String.valueOf(ha7Var62 != null ? ha7Var62.K.getText() : null), null, null);
                                    Object systemService = chatActivity.getSystemService("input_method");
                                    systemService.getClass();
                                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                                    ha7 ha7Var63 = (ha7) chatActivity.a;
                                    inputMethodManager.hideSoftInputFromWindow(ha7Var63 != null ? ha7Var63.K.getWindowToken() : null, 0);
                                    chatActivity.G1().y1(sendMessageRequest);
                                    chatActivity.R1();
                                    ha7 ha7Var64 = (ha7) chatActivity.a;
                                    if (ha7Var64 != null && (text = ha7Var64.K.getText()) != null) {
                                        text.clear();
                                    }
                                    ha7 ha7Var65 = (ha7) chatActivity.a;
                                    if (ha7Var65 == null) {
                                        return true;
                                    }
                                    ha7Var65.D.setText("0/160");
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    Unit unit58 = Unit.a;
                }
                runOnUiThread(new Runnable() { // from class: p97
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = ChatActivity.B0;
                        Handler handler = new Handler(Looper.getMainLooper());
                        ChatActivity chatActivity = this.a;
                        chatActivity.Y = handler;
                        handler.postDelayed(chatActivity.new f(), 15000L);
                    }
                });
                ha7Var13 = (ha7) this.a;
                if (ha7Var13 != null) {
                    ha7Var13.K.addTextChangedListener(new e());
                }
                this.N = new g();
                ha7Var14 = (ha7) this.a;
                if (ha7Var14 != null) {
                    gr60.a(ha7Var14.V, new u62(this, 1));
                    Unit unit59 = Unit.a;
                }
                ha7Var15 = (ha7) this.a;
                if (ha7Var15 != null) {
                    ha7Var15.A.setOnScrollListener(new h());
                    Unit unit60 = Unit.a;
                }
                getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: i87
                    /* JADX WARN: Code duplicated, block: B:110:0x01b4 A[Catch: Exception -> 0x02bc, TryCatch #0 {Exception -> 0x02bc, blocks: (B:3:0x0004, B:5:0x0033, B:7:0x003d, B:10:0x004a, B:12:0x0061, B:13:0x0066, B:18:0x0074, B:23:0x0083, B:25:0x0089, B:27:0x008d, B:28:0x0091, B:29:0x0094, B:30:0x0095, B:35:0x00a5, B:40:0x00b4, B:42:0x00ba, B:44:0x00be, B:46:0x00c2, B:47:0x00c5, B:36:0x00aa, B:37:0x00ad, B:39:0x00b0, B:48:0x00c6, B:49:0x00c9, B:19:0x0079, B:20:0x007c, B:22:0x007f, B:50:0x00ca, B:51:0x00cd, B:52:0x00ce, B:57:0x00e3, B:62:0x00f8, B:64:0x00fe, B:65:0x0108, B:67:0x010e, B:69:0x0114, B:70:0x0118, B:71:0x011b, B:72:0x011c, B:74:0x0122, B:76:0x012a, B:79:0x0134, B:80:0x013c, B:82:0x0142, B:83:0x0148, B:85:0x0158, B:88:0x0168, B:90:0x016e, B:87:0x0160, B:58:0x00ea, B:59:0x00ed, B:61:0x00f0, B:92:0x0174, B:93:0x0177, B:94:0x0178, B:97:0x0185, B:99:0x0189, B:101:0x0191, B:104:0x0199, B:108:0x01ad, B:111:0x01bd, B:113:0x01c3, B:114:0x01c8, B:116:0x01ce, B:118:0x01d6, B:120:0x01dc, B:124:0x01f0, B:133:0x0221, B:135:0x0227, B:136:0x022c, B:126:0x01f7, B:127:0x0200, B:129:0x0206, B:130:0x020c, B:132:0x021c, B:110:0x01b4, B:138:0x0236, B:140:0x023a, B:143:0x0244, B:144:0x024e, B:146:0x0254, B:147:0x0259, B:149:0x025f, B:152:0x0269, B:153:0x0273, B:155:0x0279, B:156:0x027e, B:158:0x0284, B:160:0x028c, B:162:0x0297, B:163:0x029d, B:165:0x02ad, B:166:0x02b2), top: B:171:0x0004 }] */
                    /* JADX WARN: Code duplicated, block: B:126:0x01f7 A[Catch: Exception -> 0x02bc, TryCatch #0 {Exception -> 0x02bc, blocks: (B:3:0x0004, B:5:0x0033, B:7:0x003d, B:10:0x004a, B:12:0x0061, B:13:0x0066, B:18:0x0074, B:23:0x0083, B:25:0x0089, B:27:0x008d, B:28:0x0091, B:29:0x0094, B:30:0x0095, B:35:0x00a5, B:40:0x00b4, B:42:0x00ba, B:44:0x00be, B:46:0x00c2, B:47:0x00c5, B:36:0x00aa, B:37:0x00ad, B:39:0x00b0, B:48:0x00c6, B:49:0x00c9, B:19:0x0079, B:20:0x007c, B:22:0x007f, B:50:0x00ca, B:51:0x00cd, B:52:0x00ce, B:57:0x00e3, B:62:0x00f8, B:64:0x00fe, B:65:0x0108, B:67:0x010e, B:69:0x0114, B:70:0x0118, B:71:0x011b, B:72:0x011c, B:74:0x0122, B:76:0x012a, B:79:0x0134, B:80:0x013c, B:82:0x0142, B:83:0x0148, B:85:0x0158, B:88:0x0168, B:90:0x016e, B:87:0x0160, B:58:0x00ea, B:59:0x00ed, B:61:0x00f0, B:92:0x0174, B:93:0x0177, B:94:0x0178, B:97:0x0185, B:99:0x0189, B:101:0x0191, B:104:0x0199, B:108:0x01ad, B:111:0x01bd, B:113:0x01c3, B:114:0x01c8, B:116:0x01ce, B:118:0x01d6, B:120:0x01dc, B:124:0x01f0, B:133:0x0221, B:135:0x0227, B:136:0x022c, B:126:0x01f7, B:127:0x0200, B:129:0x0206, B:130:0x020c, B:132:0x021c, B:110:0x01b4, B:138:0x0236, B:140:0x023a, B:143:0x0244, B:144:0x024e, B:146:0x0254, B:147:0x0259, B:149:0x025f, B:152:0x0269, B:153:0x0273, B:155:0x0279, B:156:0x027e, B:158:0x0284, B:160:0x028c, B:162:0x0297, B:163:0x029d, B:165:0x02ad, B:166:0x02b2), top: B:171:0x0004 }] */
                    /* JADX WARN: Code duplicated, block: B:129:0x0206 A[Catch: Exception -> 0x02bc, TryCatch #0 {Exception -> 0x02bc, blocks: (B:3:0x0004, B:5:0x0033, B:7:0x003d, B:10:0x004a, B:12:0x0061, B:13:0x0066, B:18:0x0074, B:23:0x0083, B:25:0x0089, B:27:0x008d, B:28:0x0091, B:29:0x0094, B:30:0x0095, B:35:0x00a5, B:40:0x00b4, B:42:0x00ba, B:44:0x00be, B:46:0x00c2, B:47:0x00c5, B:36:0x00aa, B:37:0x00ad, B:39:0x00b0, B:48:0x00c6, B:49:0x00c9, B:19:0x0079, B:20:0x007c, B:22:0x007f, B:50:0x00ca, B:51:0x00cd, B:52:0x00ce, B:57:0x00e3, B:62:0x00f8, B:64:0x00fe, B:65:0x0108, B:67:0x010e, B:69:0x0114, B:70:0x0118, B:71:0x011b, B:72:0x011c, B:74:0x0122, B:76:0x012a, B:79:0x0134, B:80:0x013c, B:82:0x0142, B:83:0x0148, B:85:0x0158, B:88:0x0168, B:90:0x016e, B:87:0x0160, B:58:0x00ea, B:59:0x00ed, B:61:0x00f0, B:92:0x0174, B:93:0x0177, B:94:0x0178, B:97:0x0185, B:99:0x0189, B:101:0x0191, B:104:0x0199, B:108:0x01ad, B:111:0x01bd, B:113:0x01c3, B:114:0x01c8, B:116:0x01ce, B:118:0x01d6, B:120:0x01dc, B:124:0x01f0, B:133:0x0221, B:135:0x0227, B:136:0x022c, B:126:0x01f7, B:127:0x0200, B:129:0x0206, B:130:0x020c, B:132:0x021c, B:110:0x01b4, B:138:0x0236, B:140:0x023a, B:143:0x0244, B:144:0x024e, B:146:0x0254, B:147:0x0259, B:149:0x025f, B:152:0x0269, B:153:0x0273, B:155:0x0279, B:156:0x027e, B:158:0x0284, B:160:0x028c, B:162:0x0297, B:163:0x029d, B:165:0x02ad, B:166:0x02b2), top: B:171:0x0004 }] */
                    /* JADX WARN: Code duplicated, block: B:132:0x021c A[Catch: Exception -> 0x02bc, TryCatch #0 {Exception -> 0x02bc, blocks: (B:3:0x0004, B:5:0x0033, B:7:0x003d, B:10:0x004a, B:12:0x0061, B:13:0x0066, B:18:0x0074, B:23:0x0083, B:25:0x0089, B:27:0x008d, B:28:0x0091, B:29:0x0094, B:30:0x0095, B:35:0x00a5, B:40:0x00b4, B:42:0x00ba, B:44:0x00be, B:46:0x00c2, B:47:0x00c5, B:36:0x00aa, B:37:0x00ad, B:39:0x00b0, B:48:0x00c6, B:49:0x00c9, B:19:0x0079, B:20:0x007c, B:22:0x007f, B:50:0x00ca, B:51:0x00cd, B:52:0x00ce, B:57:0x00e3, B:62:0x00f8, B:64:0x00fe, B:65:0x0108, B:67:0x010e, B:69:0x0114, B:70:0x0118, B:71:0x011b, B:72:0x011c, B:74:0x0122, B:76:0x012a, B:79:0x0134, B:80:0x013c, B:82:0x0142, B:83:0x0148, B:85:0x0158, B:88:0x0168, B:90:0x016e, B:87:0x0160, B:58:0x00ea, B:59:0x00ed, B:61:0x00f0, B:92:0x0174, B:93:0x0177, B:94:0x0178, B:97:0x0185, B:99:0x0189, B:101:0x0191, B:104:0x0199, B:108:0x01ad, B:111:0x01bd, B:113:0x01c3, B:114:0x01c8, B:116:0x01ce, B:118:0x01d6, B:120:0x01dc, B:124:0x01f0, B:133:0x0221, B:135:0x0227, B:136:0x022c, B:126:0x01f7, B:127:0x0200, B:129:0x0206, B:130:0x020c, B:132:0x021c, B:110:0x01b4, B:138:0x0236, B:140:0x023a, B:143:0x0244, B:144:0x024e, B:146:0x0254, B:147:0x0259, B:149:0x025f, B:152:0x0269, B:153:0x0273, B:155:0x0279, B:156:0x027e, B:158:0x0284, B:160:0x028c, B:162:0x0297, B:163:0x029d, B:165:0x02ad, B:166:0x02b2), top: B:171:0x0004 }] */
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        ViewGroup.LayoutParams layoutParams5;
                        ConstraintLayout.LayoutParams layoutParams6;
                        ha7 ha7Var61;
                        ChatActivity chatActivity = this.a;
                        int i3 = ChatActivity.B0;
                        try {
                            Rect rect2 = new Rect();
                            Window window = chatActivity.getWindow();
                            String str7 = chatActivity.i0;
                            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
                            int iHeight = rect2.height();
                            int height = chatActivity.getWindow().getDecorView().getHeight();
                            ha7 ha7Var62 = (ha7) chatActivity.a;
                            if (ha7Var62 == null || ha7Var62.I.a.getVisibility() != 0) {
                                double d4 = height - rect2.bottom;
                                double d5 = ((double) height) * 0.1399d;
                                B b2 = chatActivity.a;
                                if (d4 <= d5) {
                                    ha7 ha7Var63 = (ha7) b2;
                                    ViewGroup.LayoutParams layoutParams7 = ha7Var63 != null ? ha7Var63.A.getLayoutParams() : null;
                                    if (layoutParams7 != null) {
                                        layoutParams7.height = ycv.a(((double) iHeight) / chatActivity.U);
                                    }
                                    ha7 ha7Var64 = (ha7) chatActivity.a;
                                    if (ha7Var64 != null) {
                                        ha7Var64.A.setLayoutParams(layoutParams7);
                                    }
                                    ha7 ha7Var65 = (ha7) chatActivity.a;
                                    ViewGroup.LayoutParams layoutParams8 = ha7Var65 != null ? ha7Var65.B.getLayoutParams() : null;
                                    if (layoutParams8 != null) {
                                        layoutParams8.height = ycv.a(((double) iHeight) / chatActivity.U);
                                    }
                                    ha7 ha7Var66 = (ha7) chatActivity.a;
                                    if (ha7Var66 != null) {
                                        ha7Var66.B.setLayoutParams(layoutParams8);
                                    }
                                    ha7 ha7Var67 = (ha7) chatActivity.a;
                                    ViewGroup.LayoutParams layoutParams9 = ha7Var67 != null ? ha7Var67.f.getLayoutParams() : null;
                                    layoutParams9.getClass();
                                    ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                                    ha7 ha7Var68 = (ha7) chatActivity.a;
                                    layoutParams5 = ha7Var68 != null ? ha7Var68.f.getLayoutParams() : null;
                                    layoutParams5.getClass();
                                    layoutParams10.S = 0.08f;
                                    ha7 ha7Var69 = (ha7) chatActivity.a;
                                    if (ha7Var69 != null) {
                                        ha7Var69.f.setLayoutParams(layoutParams10);
                                    }
                                    chatActivity.A1(0.065f);
                                    chatActivity.B1(0.065f);
                                    return;
                                }
                                ha7 ha7Var70 = (ha7) b2;
                                ViewGroup.LayoutParams layoutParams11 = ha7Var70 != null ? ha7Var70.A.getLayoutParams() : null;
                                if (!chatActivity.H1()) {
                                    String str8 = chatActivity.d;
                                    String lowerCase4 = "punch".toLowerCase(Locale.ROOT);
                                    lowerCase4.getClass();
                                    if (StringsKt.M(str8, lowerCase4, false)) {
                                        if (layoutParams11 != null) {
                                            layoutParams11.height = (chatActivity.V * iHeight) / ((int) chatActivity.v0);
                                        }
                                    } else if (layoutParams11 != null) {
                                        layoutParams11.height = iHeight / 2;
                                    }
                                } else if (layoutParams11 != null) {
                                    layoutParams11.height = (chatActivity.V * iHeight) / ((int) chatActivity.v0);
                                }
                                ha7 ha7Var71 = (ha7) chatActivity.a;
                                if (ha7Var71 != null) {
                                    ha7Var71.A.setLayoutParams(layoutParams11);
                                }
                                ha7 ha7Var72 = (ha7) chatActivity.a;
                                ViewGroup.LayoutParams layoutParams12 = ha7Var72 != null ? ha7Var72.B.getLayoutParams() : null;
                                if (chatActivity.H1()) {
                                    if (layoutParams12 != null) {
                                        layoutParams12.height = (iHeight * chatActivity.V) / ((int) chatActivity.v0);
                                    }
                                    ha7 ha7Var73 = (ha7) chatActivity.a;
                                    if (ha7Var73 != null) {
                                    }
                                    layoutParams5.getClass();
                                    layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                                    layoutParams6.S = 0.17f;
                                    ha7Var61 = (ha7) chatActivity.a;
                                    if (ha7Var61 != null) {
                                        ha7Var61.f.setLayoutParams(layoutParams6);
                                    }
                                } else {
                                    String str9 = chatActivity.d;
                                    String lowerCase5 = "punch".toLowerCase(Locale.ROOT);
                                    lowerCase5.getClass();
                                    if (StringsKt.M(str9, lowerCase5, false)) {
                                        if (layoutParams12 != null) {
                                            layoutParams12.height = (iHeight * chatActivity.V) / ((int) chatActivity.v0);
                                        }
                                        ha7 ha7Var74 = (ha7) chatActivity.a;
                                        layoutParams5 = ha7Var74 != null ? ha7Var74.f.getLayoutParams() : null;
                                        layoutParams5.getClass();
                                        layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                                        layoutParams6.S = 0.17f;
                                        ha7Var61 = (ha7) chatActivity.a;
                                        if (ha7Var61 != null) {
                                            ha7Var61.f.setLayoutParams(layoutParams6);
                                        }
                                    } else if (layoutParams12 != null) {
                                        layoutParams12.height = iHeight / 2;
                                    }
                                }
                                ha7 ha7Var75 = (ha7) chatActivity.a;
                                if (ha7Var75 != null) {
                                    ha7Var75.B.setLayoutParams(layoutParams12);
                                }
                                chatActivity.A1(0.11f);
                                chatActivity.B1(0.11f);
                                return;
                            }
                            if (height - rect2.bottom <= ((double) height) * 0.1399d) {
                                boolean zM = StringsKt.M(chatActivity.d, str7, false);
                                ViewGroup.LayoutParams layoutParams13 = chatActivity.R;
                                if (zM) {
                                    if (layoutParams13 == null) {
                                        Intrinsics.n("params");
                                        throw null;
                                    }
                                    layoutParams13.height = ycv.a(((double) iHeight) / 1.72d);
                                } else {
                                    if (layoutParams13 == null) {
                                        Intrinsics.n("params");
                                        throw null;
                                    }
                                    layoutParams13.height = ycv.a(((double) iHeight) / 1.5d);
                                }
                                ha7 ha7Var76 = (ha7) chatActivity.a;
                                if (ha7Var76 != null) {
                                    ha7Var76.B.setPadding(0, 0, 0, (int) (iHeight / 2.5f));
                                }
                                ha7 ha7Var77 = (ha7) chatActivity.a;
                                if (ha7Var77 != null) {
                                    RecyclerView recyclerView2 = ha7Var77.A;
                                    ViewGroup.LayoutParams layoutParams14 = chatActivity.R;
                                    if (layoutParams14 == null) {
                                        Intrinsics.n("params");
                                        throw null;
                                    }
                                    recyclerView2.setLayoutParams(layoutParams14);
                                }
                                ha7 ha7Var78 = (ha7) chatActivity.a;
                                ViewGroup.LayoutParams layoutParams15 = ha7Var78 != null ? ha7Var78.B.getLayoutParams() : null;
                                if (StringsKt.M(chatActivity.d, str7, false)) {
                                    if (layoutParams15 != null) {
                                        layoutParams15.height = ycv.a(((double) iHeight) / 1.72d);
                                    }
                                    ha7 ha7Var79 = (ha7) chatActivity.a;
                                    layoutParams5 = ha7Var79 != null ? ha7Var79.f.getLayoutParams() : null;
                                    layoutParams5.getClass();
                                    ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams5;
                                    layoutParams16.S = 0.09f;
                                    ha7 ha7Var80 = (ha7) chatActivity.a;
                                    if (ha7Var80 != null) {
                                        ha7Var80.f.setLayoutParams(layoutParams16);
                                    }
                                } else if (layoutParams15 != null) {
                                    layoutParams15.height = ycv.a(((double) iHeight) / 1.5d);
                                }
                                ha7 ha7Var81 = (ha7) chatActivity.a;
                                if (ha7Var81 != null) {
                                    ha7Var81.B.setLayoutParams(layoutParams15);
                                    return;
                                }
                                return;
                            }
                            View decorView2 = chatActivity.getWindow().getDecorView();
                            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                            r6i0.e.a(decorView2).getClass();
                            ha7 ha7Var82 = (ha7) chatActivity.a;
                            if (ha7Var82 != null) {
                                ha7Var82.B.setPadding(0, 0, 0, 0);
                            }
                            boolean zM2 = StringsKt.M(chatActivity.d, str7, false);
                            ViewGroup.LayoutParams layoutParams17 = chatActivity.R;
                            if (zM2) {
                                if (layoutParams17 == null) {
                                    Intrinsics.n("params");
                                    throw null;
                                }
                                layoutParams17.height = (iHeight * 27) / 100;
                            } else {
                                if (layoutParams17 == null) {
                                    Intrinsics.n("params");
                                    throw null;
                                }
                                layoutParams17.height = iHeight / 2;
                            }
                            ha7 ha7Var83 = (ha7) chatActivity.a;
                            if (ha7Var83 != null) {
                                RecyclerView recyclerView3 = ha7Var83.A;
                                if (layoutParams17 == null) {
                                    Intrinsics.n("params");
                                    throw null;
                                }
                                recyclerView3.setLayoutParams(layoutParams17);
                            }
                            boolean zM3 = StringsKt.M(chatActivity.d, str7, false);
                            ViewGroup.LayoutParams layoutParams18 = chatActivity.Q;
                            if (zM3) {
                                if (layoutParams18 == null) {
                                    Intrinsics.n("params1");
                                    throw null;
                                }
                                layoutParams18.height = (iHeight * 27) / 100;
                            } else {
                                if (layoutParams18 == null) {
                                    Intrinsics.n("params1");
                                    throw null;
                                }
                                layoutParams18.height = iHeight / 2;
                            }
                            ha7 ha7Var84 = (ha7) chatActivity.a;
                            if (ha7Var84 != null) {
                                ConstraintLayout constraintLayout7 = ha7Var84.B;
                                if (layoutParams18 != null) {
                                    constraintLayout7.setLayoutParams(layoutParams18);
                                } else {
                                    Intrinsics.n("params1");
                                    throw null;
                                }
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                });
                tb5 tb5VarB = d77.b(2, 6, null);
                nas nasVarB = lrn.b(this);
                pfd pfdVar = fse.a;
                wcl wclVar = gku.a;
                ej5.c(nasVarB, wclVar, null, new i(tb5VarB, null), 2);
                this.g0 = tb5VarB;
                ej5.c(lrn.b(this), wclVar, null, new j(d77.b(2, 6, null), null), 2);
                M1();
                J1();
                K1();
            }
            d2 = 2.2d;
            d3 = d2;
            this.U = d3;
            if (StringsKt.M(this.d, str, false)) {
                i2 = 27;
            } else {
                i2 = 27;
            }
            this.V = i2;
            this.P = displayMetrics.heightPixels;
            ha7Var = (ha7) this.a;
            if (ha7Var != null) {
                layoutParams = ha7Var.A.getLayoutParams();
            } else {
                layoutParams = th;
            }
            layoutParams.getClass();
            this.R = layoutParams;
            ((ViewGroup.LayoutParams) layoutParams).height = ycv.a(((double) this.P) / this.U);
            ha7Var2 = (ha7) this.a;
            if (ha7Var2 != null) {
                recyclerView = ha7Var2.A;
                layoutParams4 = this.R;
                if (layoutParams4 != null) {
                    Intrinsics.n("params");
                    throw th;
                }
                recyclerView.setLayoutParams(layoutParams4);
                Unit unit410 = Unit.a;
            }
            ha7Var3 = (ha7) this.a;
            if (ha7Var3 != null) {
                layoutParams2 = ha7Var3.B.getLayoutParams();
            } else {
                layoutParams2 = th;
            }
            layoutParams2.getClass();
            this.Q = layoutParams2;
            ((ViewGroup.LayoutParams) layoutParams2).height = ycv.a(((double) this.P) / this.U);
            ha7Var4 = (ha7) this.a;
            if (ha7Var4 != null) {
                constraintLayout4 = ha7Var4.B;
                layoutParams3 = this.Q;
                if (layoutParams3 != null) {
                    Intrinsics.n("params1");
                    throw th;
                }
                constraintLayout4.setLayoutParams(layoutParams3);
                Unit unit411 = Unit.a;
            }
            if (!TextUtils.isEmpty(this.L)) {
                sh7 sh7VarG2 = G1();
                String str7 = this.L;
                String strValueOf4 = String.valueOf(System.currentTimeMillis());
                str7.getClass();
                strValueOf4.getClass();
                ?? r14 = th;
                ej5.c(o8i0.d(sh7VarG2), r14, r14, new gh7(sh7VarG2, str7, strValueOf4, r14), 3);
            }
            G1().b.f(this, new v97(new z87(this, 0)));
            if (getIntent().hasExtra("share_data_type")) {
                if (kotlin.text.c.l(getIntent().getStringExtra("share_data_type"), "bet_history", false)) {
                    if (kotlin.text.c.l(this.d, "ping pong", true)) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            betHistoryItem5 = (com.sportygames.pingpong.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject", com.sportygames.pingpong.remote.models.BetHistoryItem.class);
                        } else {
                            betHistoryItem5 = (com.sportygames.pingpong.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject");
                        }
                        this.d0 = betHistoryItem5;
                        if (betHistoryItem5 != null) {
                            lValueOf3 = Long.valueOf(betHistoryItem5.getId());
                        } else {
                            lValueOf3 = null;
                        }
                        Y1(String.valueOf(lValueOf3));
                    } else if (kotlin.text.c.l(this.d, "sporty jet", true)) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            betHistoryItem4 = (com.sportygames.crash.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject", com.sportygames.crash.remote.models.BetHistoryItem.class);
                        } else {
                            betHistoryItem4 = (com.sportygames.crash.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject");
                        }
                        this.e0 = betHistoryItem4;
                        if (betHistoryItem4 != null) {
                            lValueOf2 = Long.valueOf(betHistoryItem4.getId());
                        } else {
                            lValueOf2 = null;
                        }
                        Y1(String.valueOf(lValueOf2));
                    } else {
                        if (Build.VERSION.SDK_INT >= 33) {
                            betHistoryItem4 = (com.sportygames.crash.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject", com.sportygames.crash.remote.models.BetHistoryItem.class);
                        } else {
                            betHistoryItem4 = (com.sportygames.crash.remote.models.BetHistoryItem) getIntent().getParcelableExtra("betObject");
                        }
                        this.e0 = betHistoryItem4;
                        if (betHistoryItem4 != null) {
                            lValueOf2 = Long.valueOf(betHistoryItem4.getId());
                        } else {
                            lValueOf2 = null;
                        }
                        Y1(String.valueOf(lValueOf2));
                    }
                    Unit unit412 = Unit.a;
                } else if (kotlin.text.c.l(getIntent().getStringExtra("share_data_type"), "bet_history_pocket", false)) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        betHistoryItem = (com.sportygames.pocketrocket.model.response.BetHistoryItem) getIntent().getParcelableExtra("betObject", com.sportygames.pocketrocket.model.response.BetHistoryItem.class);
                    } else {
                        betHistoryItem = (com.sportygames.pocketrocket.model.response.BetHistoryItem) getIntent().getParcelableExtra("betObject");
                    }
                    this.f0 = betHistoryItem;
                    if (betHistoryItem != null) {
                        lValueOf = Long.valueOf(betHistoryItem.getId());
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        betHistoryItem2 = this.f0;
                        if (betHistoryItem2 != null) {
                            if (betId3.length() != 0) {
                                Y1(betId3);
                            }
                            Unit unit413 = Unit.a;
                        }
                    } else {
                        betHistoryItem2 = this.f0;
                        if (betHistoryItem2 != null) {
                            if (betId3.length() != 0) {
                                Y1(betId3);
                            }
                            Unit unit414 = Unit.a;
                        }
                    }
                } else {
                    if (kotlin.text.c.l(this.d, "ping pong", true)) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            topWinResponse2 = (com.sportygames.pingpong.remote.models.TopWinResponse) getIntent().getParcelableExtra("betObject", com.sportygames.pingpong.remote.models.TopWinResponse.class);
                        } else {
                            topWinResponse2 = (com.sportygames.pingpong.remote.models.TopWinResponse) getIntent().getParcelableExtra("betObject");
                        }
                        this.b0 = topWinResponse2;
                        if (topWinResponse2 != null) {
                            betId2 = topWinResponse2.getBetId();
                        } else {
                            betId2 = null;
                        }
                        Y1(String.valueOf(betId2));
                    } else {
                        if (Build.VERSION.SDK_INT >= 33) {
                            topWinResponse = (TopWinResponse) getIntent().getParcelableExtra("betObject", TopWinResponse.class);
                        } else {
                            topWinResponse = (TopWinResponse) getIntent().getParcelableExtra("betObject");
                        }
                        this.a0 = topWinResponse;
                        if (topWinResponse != null) {
                            betId = topWinResponse.getBetId();
                        } else {
                            betId = null;
                        }
                        Y1(String.valueOf(betId));
                    }
                    Unit unit510 = Unit.a;
                }
            }
            if (SportyGamesManager.getInstance() != null) {
                zH1 = H1();
                map = this.H;
                if (zH1) {
                    map.put("userId", SportyGamesManager.getInstance().getPatronId());
                } else {
                    map.put("userId", SportyGamesManager.getInstance().getUserId());
                }
                U1(map);
            }
            ha7Var5 = (ha7) this.a;
            if (ha7Var5 != null) {
                gr60.a(ha7Var5.E, new a72(this, 1));
                Unit unit511 = Unit.a;
            }
            ha7Var6 = (ha7) this.a;
            if (ha7Var6 != null) {
                gr60.a(ha7Var6.I.b, new b72(this, 1));
                Unit unit512 = Unit.a;
            }
            ha7Var7 = (ha7) this.a;
            if (ha7Var7 != null) {
                gr60.a(ha7Var7.Y, new l87(this, 0));
                Unit unit513 = Unit.a;
            }
            ha7Var8 = (ha7) this.a;
            if (ha7Var8 != null) {
                gr60.a(ha7Var8.M, new m87(this, 0));
                Unit unit514 = Unit.a;
            }
            ha7Var9 = (ha7) this.a;
            if (ha7Var9 != null) {
                gr60.a(ha7Var9.K, new e72(this, 1));
                Unit unit515 = Unit.a;
            }
            ha7Var10 = (ha7) this.a;
            if (ha7Var10 != null) {
                ha7Var10.K.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: m97
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        int i3 = ChatActivity.B0;
                        ChatActivity chatActivity = this.a;
                        B b2 = chatActivity.a;
                        if (z2) {
                            ha7 ha7Var61 = (ha7) b2;
                            if (ha7Var61 != null) {
                                ha7Var61.z.setBackground(chatActivity.getDrawable(R.drawable.chat_edittext_active));
                                return;
                            }
                            return;
                        }
                        ha7 ha7Var62 = (ha7) b2;
                        if (ha7Var62 != null) {
                            ha7Var62.z.setBackground(chatActivity.getDrawable(R.drawable.chat_edittext_idle));
                        }
                    }
                });
                Unit unit516 = Unit.a;
            }
            ha7Var11 = (ha7) this.a;
            if (ha7Var11 != null) {
                ha7Var11.I.e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n97
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        int i3 = ChatActivity.B0;
                        ChatActivity chatActivity = this.a;
                        B b2 = chatActivity.a;
                        if (z2) {
                            ha7 ha7Var61 = (ha7) b2;
                            if (ha7Var61 != null) {
                                ha7Var61.I.f.setBackground(chatActivity.getDrawable(R.drawable.card_gif_search_blue));
                                return;
                            }
                            return;
                        }
                        ha7 ha7Var62 = (ha7) b2;
                        if (ha7Var62 != null) {
                            ha7Var62.I.f.setBackground(chatActivity.getDrawable(R.drawable.card_gif_search));
                        }
                    }
                });
                Unit unit517 = Unit.a;
            }
            ha7Var12 = (ha7) this.a;
            if (ha7Var12 != null) {
                ha7Var12.K.setOnKeyListener(new View.OnKeyListener() { // from class: o97
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                        Editable text;
                        ChatActivity chatActivity = this.a;
                        if (!TextUtils.isEmpty(chatActivity.L) && keyEvent.getAction() == 0 && i3 == 66) {
                            ha7 ha7Var61 = (ha7) chatActivity.a;
                            if (StringsKt.t0(String.valueOf(ha7Var61 != null ? ha7Var61.K.getText() : null)).toString().length() != 0) {
                                String str8 = chatActivity.L;
                                ha7 ha7Var62 = (ha7) chatActivity.a;
                                SendMessageRequest sendMessageRequest = new SendMessageRequest(str8, "TEXT", String.valueOf(ha7Var62 != null ? ha7Var62.K.getText() : null), null, null);
                                Object systemService = chatActivity.getSystemService("input_method");
                                systemService.getClass();
                                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                                ha7 ha7Var63 = (ha7) chatActivity.a;
                                inputMethodManager.hideSoftInputFromWindow(ha7Var63 != null ? ha7Var63.K.getWindowToken() : null, 0);
                                chatActivity.G1().y1(sendMessageRequest);
                                chatActivity.R1();
                                ha7 ha7Var64 = (ha7) chatActivity.a;
                                if (ha7Var64 != null && (text = ha7Var64.K.getText()) != null) {
                                    text.clear();
                                }
                                ha7 ha7Var65 = (ha7) chatActivity.a;
                                if (ha7Var65 == null) {
                                    return true;
                                }
                                ha7Var65.D.setText("0/160");
                                return true;
                            }
                        }
                        return false;
                    }
                });
                Unit unit518 = Unit.a;
            }
            runOnUiThread(new Runnable() { // from class: p97
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = ChatActivity.B0;
                    Handler handler = new Handler(Looper.getMainLooper());
                    ChatActivity chatActivity = this.a;
                    chatActivity.Y = handler;
                    handler.postDelayed(chatActivity.new f(), 15000L);
                }
            });
            ha7Var13 = (ha7) this.a;
            if (ha7Var13 != null) {
                ha7Var13.K.addTextChangedListener(new e());
            }
            this.N = new g();
            ha7Var14 = (ha7) this.a;
            if (ha7Var14 != null) {
                gr60.a(ha7Var14.V, new u62(this, 1));
                Unit unit519 = Unit.a;
            }
            ha7Var15 = (ha7) this.a;
            if (ha7Var15 != null) {
                ha7Var15.A.setOnScrollListener(new h());
                Unit unit61 = Unit.a;
            }
            getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: i87
                /* JADX WARN: Code duplicated, block: B:110:0x01b4 A[Catch: Exception -> 0x02bc, TryCatch #0 {Exception -> 0x02bc, blocks: (B:3:0x0004, B:5:0x0033, B:7:0x003d, B:10:0x004a, B:12:0x0061, B:13:0x0066, B:18:0x0074, B:23:0x0083, B:25:0x0089, B:27:0x008d, B:28:0x0091, B:29:0x0094, B:30:0x0095, B:35:0x00a5, B:40:0x00b4, B:42:0x00ba, B:44:0x00be, B:46:0x00c2, B:47:0x00c5, B:36:0x00aa, B:37:0x00ad, B:39:0x00b0, B:48:0x00c6, B:49:0x00c9, B:19:0x0079, B:20:0x007c, B:22:0x007f, B:50:0x00ca, B:51:0x00cd, B:52:0x00ce, B:57:0x00e3, B:62:0x00f8, B:64:0x00fe, B:65:0x0108, B:67:0x010e, B:69:0x0114, B:70:0x0118, B:71:0x011b, B:72:0x011c, B:74:0x0122, B:76:0x012a, B:79:0x0134, B:80:0x013c, B:82:0x0142, B:83:0x0148, B:85:0x0158, B:88:0x0168, B:90:0x016e, B:87:0x0160, B:58:0x00ea, B:59:0x00ed, B:61:0x00f0, B:92:0x0174, B:93:0x0177, B:94:0x0178, B:97:0x0185, B:99:0x0189, B:101:0x0191, B:104:0x0199, B:108:0x01ad, B:111:0x01bd, B:113:0x01c3, B:114:0x01c8, B:116:0x01ce, B:118:0x01d6, B:120:0x01dc, B:124:0x01f0, B:133:0x0221, B:135:0x0227, B:136:0x022c, B:126:0x01f7, B:127:0x0200, B:129:0x0206, B:130:0x020c, B:132:0x021c, B:110:0x01b4, B:138:0x0236, B:140:0x023a, B:143:0x0244, B:144:0x024e, B:146:0x0254, B:147:0x0259, B:149:0x025f, B:152:0x0269, B:153:0x0273, B:155:0x0279, B:156:0x027e, B:158:0x0284, B:160:0x028c, B:162:0x0297, B:163:0x029d, B:165:0x02ad, B:166:0x02b2), top: B:171:0x0004 }] */
                /* JADX WARN: Code duplicated, block: B:126:0x01f7 A[Catch: Exception -> 0x02bc, TryCatch #0 {Exception -> 0x02bc, blocks: (B:3:0x0004, B:5:0x0033, B:7:0x003d, B:10:0x004a, B:12:0x0061, B:13:0x0066, B:18:0x0074, B:23:0x0083, B:25:0x0089, B:27:0x008d, B:28:0x0091, B:29:0x0094, B:30:0x0095, B:35:0x00a5, B:40:0x00b4, B:42:0x00ba, B:44:0x00be, B:46:0x00c2, B:47:0x00c5, B:36:0x00aa, B:37:0x00ad, B:39:0x00b0, B:48:0x00c6, B:49:0x00c9, B:19:0x0079, B:20:0x007c, B:22:0x007f, B:50:0x00ca, B:51:0x00cd, B:52:0x00ce, B:57:0x00e3, B:62:0x00f8, B:64:0x00fe, B:65:0x0108, B:67:0x010e, B:69:0x0114, B:70:0x0118, B:71:0x011b, B:72:0x011c, B:74:0x0122, B:76:0x012a, B:79:0x0134, B:80:0x013c, B:82:0x0142, B:83:0x0148, B:85:0x0158, B:88:0x0168, B:90:0x016e, B:87:0x0160, B:58:0x00ea, B:59:0x00ed, B:61:0x00f0, B:92:0x0174, B:93:0x0177, B:94:0x0178, B:97:0x0185, B:99:0x0189, B:101:0x0191, B:104:0x0199, B:108:0x01ad, B:111:0x01bd, B:113:0x01c3, B:114:0x01c8, B:116:0x01ce, B:118:0x01d6, B:120:0x01dc, B:124:0x01f0, B:133:0x0221, B:135:0x0227, B:136:0x022c, B:126:0x01f7, B:127:0x0200, B:129:0x0206, B:130:0x020c, B:132:0x021c, B:110:0x01b4, B:138:0x0236, B:140:0x023a, B:143:0x0244, B:144:0x024e, B:146:0x0254, B:147:0x0259, B:149:0x025f, B:152:0x0269, B:153:0x0273, B:155:0x0279, B:156:0x027e, B:158:0x0284, B:160:0x028c, B:162:0x0297, B:163:0x029d, B:165:0x02ad, B:166:0x02b2), top: B:171:0x0004 }] */
                /* JADX WARN: Code duplicated, block: B:129:0x0206 A[Catch: Exception -> 0x02bc, TryCatch #0 {Exception -> 0x02bc, blocks: (B:3:0x0004, B:5:0x0033, B:7:0x003d, B:10:0x004a, B:12:0x0061, B:13:0x0066, B:18:0x0074, B:23:0x0083, B:25:0x0089, B:27:0x008d, B:28:0x0091, B:29:0x0094, B:30:0x0095, B:35:0x00a5, B:40:0x00b4, B:42:0x00ba, B:44:0x00be, B:46:0x00c2, B:47:0x00c5, B:36:0x00aa, B:37:0x00ad, B:39:0x00b0, B:48:0x00c6, B:49:0x00c9, B:19:0x0079, B:20:0x007c, B:22:0x007f, B:50:0x00ca, B:51:0x00cd, B:52:0x00ce, B:57:0x00e3, B:62:0x00f8, B:64:0x00fe, B:65:0x0108, B:67:0x010e, B:69:0x0114, B:70:0x0118, B:71:0x011b, B:72:0x011c, B:74:0x0122, B:76:0x012a, B:79:0x0134, B:80:0x013c, B:82:0x0142, B:83:0x0148, B:85:0x0158, B:88:0x0168, B:90:0x016e, B:87:0x0160, B:58:0x00ea, B:59:0x00ed, B:61:0x00f0, B:92:0x0174, B:93:0x0177, B:94:0x0178, B:97:0x0185, B:99:0x0189, B:101:0x0191, B:104:0x0199, B:108:0x01ad, B:111:0x01bd, B:113:0x01c3, B:114:0x01c8, B:116:0x01ce, B:118:0x01d6, B:120:0x01dc, B:124:0x01f0, B:133:0x0221, B:135:0x0227, B:136:0x022c, B:126:0x01f7, B:127:0x0200, B:129:0x0206, B:130:0x020c, B:132:0x021c, B:110:0x01b4, B:138:0x0236, B:140:0x023a, B:143:0x0244, B:144:0x024e, B:146:0x0254, B:147:0x0259, B:149:0x025f, B:152:0x0269, B:153:0x0273, B:155:0x0279, B:156:0x027e, B:158:0x0284, B:160:0x028c, B:162:0x0297, B:163:0x029d, B:165:0x02ad, B:166:0x02b2), top: B:171:0x0004 }] */
                /* JADX WARN: Code duplicated, block: B:132:0x021c A[Catch: Exception -> 0x02bc, TryCatch #0 {Exception -> 0x02bc, blocks: (B:3:0x0004, B:5:0x0033, B:7:0x003d, B:10:0x004a, B:12:0x0061, B:13:0x0066, B:18:0x0074, B:23:0x0083, B:25:0x0089, B:27:0x008d, B:28:0x0091, B:29:0x0094, B:30:0x0095, B:35:0x00a5, B:40:0x00b4, B:42:0x00ba, B:44:0x00be, B:46:0x00c2, B:47:0x00c5, B:36:0x00aa, B:37:0x00ad, B:39:0x00b0, B:48:0x00c6, B:49:0x00c9, B:19:0x0079, B:20:0x007c, B:22:0x007f, B:50:0x00ca, B:51:0x00cd, B:52:0x00ce, B:57:0x00e3, B:62:0x00f8, B:64:0x00fe, B:65:0x0108, B:67:0x010e, B:69:0x0114, B:70:0x0118, B:71:0x011b, B:72:0x011c, B:74:0x0122, B:76:0x012a, B:79:0x0134, B:80:0x013c, B:82:0x0142, B:83:0x0148, B:85:0x0158, B:88:0x0168, B:90:0x016e, B:87:0x0160, B:58:0x00ea, B:59:0x00ed, B:61:0x00f0, B:92:0x0174, B:93:0x0177, B:94:0x0178, B:97:0x0185, B:99:0x0189, B:101:0x0191, B:104:0x0199, B:108:0x01ad, B:111:0x01bd, B:113:0x01c3, B:114:0x01c8, B:116:0x01ce, B:118:0x01d6, B:120:0x01dc, B:124:0x01f0, B:133:0x0221, B:135:0x0227, B:136:0x022c, B:126:0x01f7, B:127:0x0200, B:129:0x0206, B:130:0x020c, B:132:0x021c, B:110:0x01b4, B:138:0x0236, B:140:0x023a, B:143:0x0244, B:144:0x024e, B:146:0x0254, B:147:0x0259, B:149:0x025f, B:152:0x0269, B:153:0x0273, B:155:0x0279, B:156:0x027e, B:158:0x0284, B:160:0x028c, B:162:0x0297, B:163:0x029d, B:165:0x02ad, B:166:0x02b2), top: B:171:0x0004 }] */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ViewGroup.LayoutParams layoutParams5;
                    ConstraintLayout.LayoutParams layoutParams6;
                    ha7 ha7Var61;
                    ChatActivity chatActivity = this.a;
                    int i3 = ChatActivity.B0;
                    try {
                        Rect rect2 = new Rect();
                        Window window = chatActivity.getWindow();
                        String str8 = chatActivity.i0;
                        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
                        int iHeight = rect2.height();
                        int height = chatActivity.getWindow().getDecorView().getHeight();
                        ha7 ha7Var62 = (ha7) chatActivity.a;
                        if (ha7Var62 == null || ha7Var62.I.a.getVisibility() != 0) {
                            double d4 = height - rect2.bottom;
                            double d5 = ((double) height) * 0.1399d;
                            B b2 = chatActivity.a;
                            if (d4 <= d5) {
                                ha7 ha7Var63 = (ha7) b2;
                                ViewGroup.LayoutParams layoutParams7 = ha7Var63 != null ? ha7Var63.A.getLayoutParams() : null;
                                if (layoutParams7 != null) {
                                    layoutParams7.height = ycv.a(((double) iHeight) / chatActivity.U);
                                }
                                ha7 ha7Var64 = (ha7) chatActivity.a;
                                if (ha7Var64 != null) {
                                    ha7Var64.A.setLayoutParams(layoutParams7);
                                }
                                ha7 ha7Var65 = (ha7) chatActivity.a;
                                ViewGroup.LayoutParams layoutParams8 = ha7Var65 != null ? ha7Var65.B.getLayoutParams() : null;
                                if (layoutParams8 != null) {
                                    layoutParams8.height = ycv.a(((double) iHeight) / chatActivity.U);
                                }
                                ha7 ha7Var66 = (ha7) chatActivity.a;
                                if (ha7Var66 != null) {
                                    ha7Var66.B.setLayoutParams(layoutParams8);
                                }
                                ha7 ha7Var67 = (ha7) chatActivity.a;
                                ViewGroup.LayoutParams layoutParams9 = ha7Var67 != null ? ha7Var67.f.getLayoutParams() : null;
                                layoutParams9.getClass();
                                ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                                ha7 ha7Var68 = (ha7) chatActivity.a;
                                layoutParams5 = ha7Var68 != null ? ha7Var68.f.getLayoutParams() : null;
                                layoutParams5.getClass();
                                layoutParams10.S = 0.08f;
                                ha7 ha7Var69 = (ha7) chatActivity.a;
                                if (ha7Var69 != null) {
                                    ha7Var69.f.setLayoutParams(layoutParams10);
                                }
                                chatActivity.A1(0.065f);
                                chatActivity.B1(0.065f);
                                return;
                            }
                            ha7 ha7Var70 = (ha7) b2;
                            ViewGroup.LayoutParams layoutParams11 = ha7Var70 != null ? ha7Var70.A.getLayoutParams() : null;
                            if (!chatActivity.H1()) {
                                String str9 = chatActivity.d;
                                String lowerCase4 = "punch".toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                if (StringsKt.M(str9, lowerCase4, false)) {
                                    if (layoutParams11 != null) {
                                        layoutParams11.height = (chatActivity.V * iHeight) / ((int) chatActivity.v0);
                                    }
                                } else if (layoutParams11 != null) {
                                    layoutParams11.height = iHeight / 2;
                                }
                            } else if (layoutParams11 != null) {
                                layoutParams11.height = (chatActivity.V * iHeight) / ((int) chatActivity.v0);
                            }
                            ha7 ha7Var71 = (ha7) chatActivity.a;
                            if (ha7Var71 != null) {
                                ha7Var71.A.setLayoutParams(layoutParams11);
                            }
                            ha7 ha7Var72 = (ha7) chatActivity.a;
                            ViewGroup.LayoutParams layoutParams12 = ha7Var72 != null ? ha7Var72.B.getLayoutParams() : null;
                            if (chatActivity.H1()) {
                                if (layoutParams12 != null) {
                                    layoutParams12.height = (iHeight * chatActivity.V) / ((int) chatActivity.v0);
                                }
                                ha7 ha7Var74 = (ha7) chatActivity.a;
                                if (ha7Var74 != null) {
                                }
                                layoutParams5.getClass();
                                layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                                layoutParams6.S = 0.17f;
                                ha7Var61 = (ha7) chatActivity.a;
                                if (ha7Var61 != null) {
                                    ha7Var61.f.setLayoutParams(layoutParams6);
                                }
                            } else {
                                String str10 = chatActivity.d;
                                String lowerCase5 = "punch".toLowerCase(Locale.ROOT);
                                lowerCase5.getClass();
                                if (StringsKt.M(str10, lowerCase5, false)) {
                                    if (layoutParams12 != null) {
                                        layoutParams12.height = (iHeight * chatActivity.V) / ((int) chatActivity.v0);
                                    }
                                    ha7 ha7Var75 = (ha7) chatActivity.a;
                                    layoutParams5 = ha7Var75 != null ? ha7Var75.f.getLayoutParams() : null;
                                    layoutParams5.getClass();
                                    layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                                    layoutParams6.S = 0.17f;
                                    ha7Var61 = (ha7) chatActivity.a;
                                    if (ha7Var61 != null) {
                                        ha7Var61.f.setLayoutParams(layoutParams6);
                                    }
                                } else if (layoutParams12 != null) {
                                    layoutParams12.height = iHeight / 2;
                                }
                            }
                            ha7 ha7Var76 = (ha7) chatActivity.a;
                            if (ha7Var76 != null) {
                                ha7Var76.B.setLayoutParams(layoutParams12);
                            }
                            chatActivity.A1(0.11f);
                            chatActivity.B1(0.11f);
                            return;
                        }
                        if (height - rect2.bottom <= ((double) height) * 0.1399d) {
                            boolean zM = StringsKt.M(chatActivity.d, str8, false);
                            ViewGroup.LayoutParams layoutParams13 = chatActivity.R;
                            if (zM) {
                                if (layoutParams13 == null) {
                                    Intrinsics.n("params");
                                    throw null;
                                }
                                layoutParams13.height = ycv.a(((double) iHeight) / 1.72d);
                            } else {
                                if (layoutParams13 == null) {
                                    Intrinsics.n("params");
                                    throw null;
                                }
                                layoutParams13.height = ycv.a(((double) iHeight) / 1.5d);
                            }
                            ha7 ha7Var77 = (ha7) chatActivity.a;
                            if (ha7Var77 != null) {
                                ha7Var77.B.setPadding(0, 0, 0, (int) (iHeight / 2.5f));
                            }
                            ha7 ha7Var78 = (ha7) chatActivity.a;
                            if (ha7Var78 != null) {
                                RecyclerView recyclerView2 = ha7Var78.A;
                                ViewGroup.LayoutParams layoutParams14 = chatActivity.R;
                                if (layoutParams14 == null) {
                                    Intrinsics.n("params");
                                    throw null;
                                }
                                recyclerView2.setLayoutParams(layoutParams14);
                            }
                            ha7 ha7Var79 = (ha7) chatActivity.a;
                            ViewGroup.LayoutParams layoutParams15 = ha7Var79 != null ? ha7Var79.B.getLayoutParams() : null;
                            if (StringsKt.M(chatActivity.d, str8, false)) {
                                if (layoutParams15 != null) {
                                    layoutParams15.height = ycv.a(((double) iHeight) / 1.72d);
                                }
                                ha7 ha7Var710 = (ha7) chatActivity.a;
                                layoutParams5 = ha7Var710 != null ? ha7Var710.f.getLayoutParams() : null;
                                layoutParams5.getClass();
                                ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams5;
                                layoutParams16.S = 0.09f;
                                ha7 ha7Var80 = (ha7) chatActivity.a;
                                if (ha7Var80 != null) {
                                    ha7Var80.f.setLayoutParams(layoutParams16);
                                }
                            } else if (layoutParams15 != null) {
                                layoutParams15.height = ycv.a(((double) iHeight) / 1.5d);
                            }
                            ha7 ha7Var81 = (ha7) chatActivity.a;
                            if (ha7Var81 != null) {
                                ha7Var81.B.setLayoutParams(layoutParams15);
                                return;
                            }
                            return;
                        }
                        View decorView2 = chatActivity.getWindow().getDecorView();
                        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                        r6i0.e.a(decorView2).getClass();
                        ha7 ha7Var82 = (ha7) chatActivity.a;
                        if (ha7Var82 != null) {
                            ha7Var82.B.setPadding(0, 0, 0, 0);
                        }
                        boolean zM2 = StringsKt.M(chatActivity.d, str8, false);
                        ViewGroup.LayoutParams layoutParams17 = chatActivity.R;
                        if (zM2) {
                            if (layoutParams17 == null) {
                                Intrinsics.n("params");
                                throw null;
                            }
                            layoutParams17.height = (iHeight * 27) / 100;
                        } else {
                            if (layoutParams17 == null) {
                                Intrinsics.n("params");
                                throw null;
                            }
                            layoutParams17.height = iHeight / 2;
                        }
                        ha7 ha7Var83 = (ha7) chatActivity.a;
                        if (ha7Var83 != null) {
                            RecyclerView recyclerView3 = ha7Var83.A;
                            if (layoutParams17 == null) {
                                Intrinsics.n("params");
                                throw null;
                            }
                            recyclerView3.setLayoutParams(layoutParams17);
                        }
                        boolean zM3 = StringsKt.M(chatActivity.d, str8, false);
                        ViewGroup.LayoutParams layoutParams18 = chatActivity.Q;
                        if (zM3) {
                            if (layoutParams18 == null) {
                                Intrinsics.n("params1");
                                throw null;
                            }
                            layoutParams18.height = (iHeight * 27) / 100;
                        } else {
                            if (layoutParams18 == null) {
                                Intrinsics.n("params1");
                                throw null;
                            }
                            layoutParams18.height = iHeight / 2;
                        }
                        ha7 ha7Var84 = (ha7) chatActivity.a;
                        if (ha7Var84 != null) {
                            ConstraintLayout constraintLayout7 = ha7Var84.B;
                            if (layoutParams18 != null) {
                                constraintLayout7.setLayoutParams(layoutParams18);
                            } else {
                                Intrinsics.n("params1");
                                throw null;
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            });
            tb5 tb5VarB2 = d77.b(2, 6, null);
            nas nasVarB2 = lrn.b(this);
            pfd pfdVar2 = fse.a;
            wcl wclVar2 = gku.a;
            ej5.c(nasVarB2, wclVar2, null, new i(tb5VarB2, null), 2);
            this.g0 = tb5VarB2;
            ej5.c(lrn.b(this), wclVar2, null, new j(d77.b(2, 6, null), null), 2);
            M1();
            J1();
            K1();
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        ha7 ha7Var;
        if (!Intrinsics.g(this.c, SportyGamesManager.getInstance().getUserId())) {
            sh7 sh7VarG1 = G1();
            ej5.c(o8i0.d(sh7VarG1), null, null, new ph7(sh7VarG1, new LeaveRequest(this.L), null), 3);
        }
        g gVar = this.N;
        if (gVar != null && (ha7Var = (ha7) this.a) != null) {
            ha7Var.I.e.removeTextChangedListener(gVar);
        }
        StompClient stompClient = this.v;
        if (stompClient != null) {
            stompClient.disconnect();
        }
        jvd0 jvd0Var = this.K;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        Handler handler = this.Y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        Editable text;
        if (keyEvent == null || keyEvent.getAction() != 0 || i2 != 66) {
            return false;
        }
        ha7 ha7Var = (ha7) this.a;
        if (StringsKt.t0(String.valueOf(ha7Var != null ? ha7Var.K.getText() : null)).toString().length() == 0) {
            return false;
        }
        String str = this.L;
        ha7 ha7Var2 = (ha7) this.a;
        G1().y1(new SendMessageRequest(str, "TEXT", String.valueOf(ha7Var2 != null ? ha7Var2.K.getText() : null), null, null));
        R1();
        ha7 ha7Var3 = (ha7) this.a;
        if (ha7Var3 != null && (text = ha7Var3.K.getText()) != null) {
            text.clear();
        }
        ha7 ha7Var4 = (ha7) this.a;
        if (ha7Var4 == null) {
            return true;
        }
        ha7Var4.D.setText("0/160");
        return true;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        ha7 ha7Var;
        this.h0 = false;
        try {
            getWindow().clearFlags(128);
            overridePendingTransition(0, 0);
        } catch (Exception unused) {
        }
        g gVar = this.N;
        if (gVar != null && (ha7Var = (ha7) this.a) != null) {
            ha7Var.I.e.removeTextChangedListener(gVar);
        }
        fdt fdtVarA = fdt.a(this);
        k kVar = this.X;
        if (kVar == null) {
            Intrinsics.n("mServiceReceiver");
            throw null;
        }
        fdtVarA.d(kVar);
        Handler handler = this.Z;
        if (handler != null) {
            handler.removeCallbacks(this.A0);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        ha7 ha7Var;
        zj60 bridge;
        super.onResume();
        this.h0 = true;
        fdt fdtVarA = fdt.a(this);
        k kVar = this.X;
        if (kVar == null) {
            Intrinsics.n("mServiceReceiver");
            throw null;
        }
        fdtVarA.b(kVar, new IntentFilter("custom-event-name"));
        Intent intent = new Intent("soundOn");
        intent.putExtra("soundOn", true);
        fdt.a(this).c(intent);
        if (SportyGamesManager.getInstance().getCountry() == null) {
            Bundle bundle = new Bundle();
            bundle.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, String.valueOf(intent.getStringExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT)));
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                ((bk60) bridge).a("game_background", bundle);
            }
            finish();
        }
        try {
            getWindow().addFlags(128);
        } catch (Exception unused) {
        }
        F1().x1(this.e);
        g gVar = this.N;
        if (gVar != null && (ha7Var = (ha7) this.a) != null) {
            ha7Var.I.e.addTextChangedListener(gVar);
        }
        P1();
        Handler handler = this.Z;
        if (handler != null) {
            handler.postDelayed(this.A0, 15000L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        if (kotlin.text.c.l(this.d, "Pocket Rockets", true)) {
            if (this.z0) {
                Intent intent = new Intent("appBackground");
                intent.putExtra("appBackground", true);
                fdt.a(this).c(intent);
            }
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new l(null), 3);
        } else {
            String str = this.d;
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.equals("sg_sporty_hero")) {
                if (this.z0) {
                    Intent intent2 = new Intent("appBackground");
                    intent2.putExtra("appBackground", true);
                    fdt.a(this).c(intent2);
                }
                pfd pfdVar2 = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new l(null), 3);
            } else {
                String lowerCase2 = this.d.toLowerCase(locale);
                lowerCase2.getClass();
                if (lowerCase2.equals("sporty hero") || StringsKt.M(this.d, "kick", true) || StringsKt.M(this.d, "GO", true) || StringsKt.M(this.d, "Jet", true) || StringsKt.M(this.d, "Rider", true)) {
                    if (this.z0) {
                        Intent intent3 = new Intent("appBackground");
                        intent3.putExtra("appBackground", true);
                        fdt.a(this).c(intent3);
                    }
                    pfd pfdVar3 = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new l(null), 3);
                }
            }
        }
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027c A[PHI: r2
      0x027c: PHI (r2v17 int) = (r2v16 int), (r2v18 int), (r2v19 int), (r2v20 int) binds: [B:33:0x00d8, B:35:0x00e5, B:37:0x00f0, B:39:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.uy1
    public final g6i0 w1() {
        View viewInflate = getLayoutInflater().inflate(R.layout.chat_fragment, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i2 = R.id.cashOutToastChat;
        View viewA = h5e.a(R.id.cashOutToastChat, viewInflate);
        if (viewA != null) {
            prr prrVarA = prr.a(viewA);
            i2 = R.id.cashout1;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.cashout1, viewInflate);
            if (constraintLayout2 != null) {
                i2 = R.id.cashout2;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.cashout2, viewInflate);
                if (constraintLayout3 != null) {
                    i2 = R.id.cashout_layout;
                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.cashout_layout, viewInflate);
                    if (linearLayout != null) {
                        i2 = R.id.cashout_text1;
                        TextView textView = (TextView) h5e.a(R.id.cashout_text1, viewInflate);
                        if (textView != null) {
                            i2 = R.id.cashout_text2;
                            TextView textView2 = (TextView) h5e.a(R.id.cashout_text2, viewInflate);
                            if (textView2 != null) {
                                i2 = R.id.cashout_view;
                                ComposeView composeView = (ComposeView) h5e.a(R.id.cashout_view, viewInflate);
                                if (composeView != null) {
                                    i2 = R.id.chat;
                                    TextView textView3 = (TextView) h5e.a(R.id.chat, viewInflate);
                                    if (textView3 != null) {
                                        i2 = R.id.chat_layout;
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.chat_layout, viewInflate);
                                        if (constraintLayout4 != null) {
                                            i2 = R.id.chat_list;
                                            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.chat_list, viewInflate);
                                            if (recyclerView != null) {
                                                i2 = R.id.chat_list_layout;
                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.chat_list_layout, viewInflate);
                                                if (constraintLayout5 != null) {
                                                    i2 = R.id.coefficient;
                                                    TextView textView4 = (TextView) h5e.a(R.id.coefficient, viewInflate);
                                                    if (textView4 != null) {
                                                        i2 = R.id.count;
                                                        TextView textView5 = (TextView) h5e.a(R.id.count, viewInflate);
                                                        if (textView5 != null) {
                                                            i2 = R.id.cross_chat;
                                                            ImageView imageView = (ImageView) h5e.a(R.id.cross_chat, viewInflate);
                                                            if (imageView != null) {
                                                                i2 = R.id.error_layout;
                                                                LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.error_layout, viewInflate);
                                                                if (linearLayout2 != null) {
                                                                    int i3 = R.id.fl_content;
                                                                    FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.fl_content, viewInflate);
                                                                    if (frameLayout != null) {
                                                                        i3 = R.id.flew_text;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.flew_text, viewInflate);
                                                                        if (textView6 != null) {
                                                                            i3 = R.id.gif;
                                                                            if (((TextView) h5e.a(R.id.gif, viewInflate)) != null) {
                                                                                i3 = R.id.gif_layout;
                                                                                View viewA2 = h5e.a(R.id.gif_layout, viewInflate);
                                                                                if (viewA2 != null) {
                                                                                    LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.clear, viewA2);
                                                                                    if (linearLayout3 != null) {
                                                                                        TextView textView7 = (TextView) h5e.a(R.id.error_layout, viewA2);
                                                                                        if (textView7 != null) {
                                                                                            i2 = R.id.gif_list;
                                                                                            RecyclerView recyclerView2 = (RecyclerView) h5e.a(R.id.gif_list, viewA2);
                                                                                            if (recyclerView2 != null) {
                                                                                                i2 = R.id.search_gif;
                                                                                                EditText editText = (EditText) h5e.a(R.id.search_gif, viewA2);
                                                                                                if (editText != null) {
                                                                                                    i2 = R.id.search_gif_layout;
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.search_gif_layout, viewA2);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        uke ukeVar = new uke((ScrollView) viewA2, linearLayout3, textView7, recyclerView2, editText, linearLayout4);
                                                                                                        i2 = R.id.gift_toast_bar;
                                                                                                        GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                                                        if (giftToast != null) {
                                                                                                            i2 = R.id.list_layout;
                                                                                                            if (((LinearLayout) h5e.a(R.id.list_layout, viewInflate)) != null) {
                                                                                                                i2 = R.id.message;
                                                                                                                AppCompatEditText appCompatEditText = (AppCompatEditText) h5e.a(R.id.message, viewInflate);
                                                                                                                if (appCompatEditText != null) {
                                                                                                                    i2 = R.id.message_layout;
                                                                                                                    ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.message_layout, viewInflate);
                                                                                                                    if (constraintLayout6 != null) {
                                                                                                                        i2 = R.id.new_message;
                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.new_message, viewInflate);
                                                                                                                        if (linearLayout5 != null) {
                                                                                                                            i2 = R.id.new_message_text;
                                                                                                                            TextView textView8 = (TextView) h5e.a(R.id.new_message_text, viewInflate);
                                                                                                                            if (textView8 != null) {
                                                                                                                                i2 = R.id.no_list;
                                                                                                                                TextView textView9 = (TextView) h5e.a(R.id.no_list, viewInflate);
                                                                                                                                if (textView9 != null) {
                                                                                                                                    i2 = R.id.ongoing;
                                                                                                                                    ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.ongoing, viewInflate);
                                                                                                                                    if (constraintLayout7 != null) {
                                                                                                                                        i2 = R.id.online_iv;
                                                                                                                                        if (((AppCompatImageView) h5e.a(R.id.online_iv, viewInflate)) != null) {
                                                                                                                                            i2 = R.id.online_text;
                                                                                                                                            TextView textView10 = (TextView) h5e.a(R.id.online_text, viewInflate);
                                                                                                                                            if (textView10 != null) {
                                                                                                                                                i2 = R.id.online_tv;
                                                                                                                                                TextView textView11 = (TextView) h5e.a(R.id.online_tv, viewInflate);
                                                                                                                                                if (textView11 != null) {
                                                                                                                                                    i2 = R.id.oops_error;
                                                                                                                                                    TextView textView12 = (TextView) h5e.a(R.id.oops_error, viewInflate);
                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                        i2 = R.id.powering;
                                                                                                                                                        TextView textView13 = (TextView) h5e.a(R.id.powering, viewInflate);
                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                            i2 = R.id.rain_claimed_toast_bar;
                                                                                                                                                            View viewA3 = h5e.a(R.id.rain_claimed_toast_bar, viewInflate);
                                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                                zo80.a(viewA3);
                                                                                                                                                                i2 = R.id.rain_error_toast;
                                                                                                                                                                if (((SHToastContainer) h5e.a(R.id.rain_error_toast, viewInflate)) != null) {
                                                                                                                                                                    i2 = R.id.seekbar;
                                                                                                                                                                    SeekBar seekBar = (SeekBar) h5e.a(R.id.seekbar, viewInflate);
                                                                                                                                                                    if (seekBar != null) {
                                                                                                                                                                        i2 = R.id.send_text;
                                                                                                                                                                        TextView textView14 = (TextView) h5e.a(R.id.send_text, viewInflate);
                                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                                            i2 = R.id.spin_kit;
                                                                                                                                                                            SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit, viewInflate);
                                                                                                                                                                            if (spinKitView != null) {
                                                                                                                                                                                i2 = R.id.toastChat;
                                                                                                                                                                                SHToastContainer sHToastContainer = (SHToastContainer) h5e.a(R.id.toastChat, viewInflate);
                                                                                                                                                                                if (sHToastContainer != null) {
                                                                                                                                                                                    i2 = R.id.try_again;
                                                                                                                                                                                    TextView textView15 = (TextView) h5e.a(R.id.try_again, viewInflate);
                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                        i2 = R.id.view_ongoing;
                                                                                                                                                                                        View viewA4 = h5e.a(R.id.view_ongoing, viewInflate);
                                                                                                                                                                                        if (viewA4 != null) {
                                                                                                                                                                                            i2 = R.id.waiting_text_layout;
                                                                                                                                                                                            ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.waiting_text_layout, viewInflate);
                                                                                                                                                                                            if (constraintLayout8 != null) {
                                                                                                                                                                                                i2 = R.id.whole_view;
                                                                                                                                                                                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.whole_view, viewInflate);
                                                                                                                                                                                                if (composeView2 != null) {
                                                                                                                                                                                                    return new ha7(constraintLayout, constraintLayout, prrVarA, constraintLayout2, constraintLayout3, linearLayout, textView, textView2, composeView, textView3, constraintLayout4, recyclerView, constraintLayout5, textView4, textView5, imageView, linearLayout2, frameLayout, textView6, ukeVar, giftToast, appCompatEditText, constraintLayout6, linearLayout5, textView8, textView9, constraintLayout7, textView10, textView11, textView12, textView13, seekBar, textView14, spinKitView, sHToastContainer, textView15, viewA4, constraintLayout8, composeView2);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i2 = R.id.clear;
                                                                                    }
                                                                                    bmy.a("Missing required view with ID: ".concat(viewA2.getResources().getResourceName(i2)));
                                                                                    return null;
                                                                                }
                                                                                i2 = i3;
                                                                            } else {
                                                                                i2 = i3;
                                                                            }
                                                                        } else {
                                                                            i2 = i3;
                                                                        }
                                                                    } else {
                                                                        i2 = i3;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void z1(ChatListResponse chatListResponse) {
        this.G.add(0, chatListResponse);
        LinearLayoutManager linearLayoutManager = this.I;
        if (linearLayoutManager == null) {
            Intrinsics.n("linearLayoutManager");
            throw null;
        }
        if (linearLayoutManager.f1() != 0) {
            LinearLayoutManager linearLayoutManager2 = this.I;
            if (linearLayoutManager2 == null) {
                Intrinsics.n("linearLayoutManager");
                throw null;
            }
            if (linearLayoutManager2.f1() != -1) {
                oa7 oa7Var = this.J;
                if (oa7Var == null) {
                    Intrinsics.n("chatListAdapter");
                    throw null;
                }
                oa7Var.notifyItemInserted(0);
                ha7 ha7Var = (ha7) this.a;
                if (ha7Var != null) {
                    ha7Var.M.setVisibility(0);
                    return;
                }
                return;
            }
        }
        ha7 ha7Var2 = (ha7) this.a;
        if (ha7Var2 != null) {
            ha7Var2.M.setVisibility(8);
        }
        oa7 oa7Var2 = this.J;
        if (oa7Var2 == null) {
            Intrinsics.n("chatListAdapter");
            throw null;
        }
        oa7Var2.notifyItemInserted(0);
        ha7 ha7Var3 = (ha7) this.a;
        if (ha7Var3 != null) {
            ha7Var3.A.o0(0);
        }
    }

    public final void Y1(String str) {
        String strA = tug.a("<b>[ShareChat:", str, sgwpmp.JIABOlatPceG);
        this.W = strA;
        ha7 ha7Var = (ha7) this.a;
        if (ha7Var != null) {
            ha7Var.D.setText(strA.length() + "/160");
        }
        ha7 ha7Var2 = (ha7) this.a;
        if (ha7Var2 != null) {
            ha7Var2.V.setAlpha(1.0f);
        }
        ha7 ha7Var3 = (ha7) this.a;
        if (ha7Var3 != null) {
            AppCompatEditText appCompatEditText = ha7Var3.K;
            op5 op5Var = op5.a;
            String string = getString(R.string.share_chat_cms);
            string.getClass();
            appCompatEditText.setText(Html.fromHtml("<b>[" + op5.c(op5Var, string, "ShareChat") + ":" + str + "]</b>"));
        }
    }
}
