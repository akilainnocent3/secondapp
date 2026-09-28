package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.sportydesk.activities.SportyDeskActivity;
import com.sportybet.plugin.sportydesk.widgets.SportyDeskButton;
import com.sportybet.plugin.sportydesk.widgets.SportyDeskWebView;
import com.twilio.voice.Call;
import com.twilio.voice.CallException;
import com.twilio.voice.ConnectOptions;
import com.twilio.voice.Voice;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class unb0 implements tce0, gzm {
    public static volatile unb0 w;
    public static final d0n y = (d0n) hwr.b(new dsh0()).getValue();
    public SportyDeskButton d;
    public Call e;
    public SportyDeskWebView f;
    public tnb0 i;
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public final a v = new a();

    public class a implements Call.Listener {
        public a() {
        }

        @Override // com.twilio.voice.Call.Listener
        public final void onConnectFailure(Call call, CallException callException) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.a("Connect failure", new Object[0]);
            Locale locale = Locale.US;
            String str = "Call Error: " + callException.getErrorCode() + ", " + callException.getMessage();
            aVar.q(MyLog.TAG_PLEASED);
            aVar.d(str, new Object[0]);
            unb0.this.b(call, ev5.b, callException);
            hp0 hp0Var = hp0.A;
            hp0Var.getClass();
            new t2y(hp0Var).b.cancel(null, 530000);
        }

        @Override // com.twilio.voice.Call.Listener
        public final void onConnected(Call call) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.a("Connected %s", call.getSid());
            unb0 unb0Var = unb0.this;
            unb0Var.e = call;
            unb0Var.b(call, ev5.c, null);
        }

        @Override // com.twilio.voice.Call.Listener
        public final void onDisconnected(Call call, CallException callException) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.a("Disconnected", new Object[0]);
            if (callException != null) {
                Locale locale = Locale.US;
                String str = "Call Error: " + callException.getErrorCode() + ", " + callException.getMessage();
                aVar.q(MyLog.TAG_PLEASED);
                aVar.d(str, new Object[0]);
            }
            unb0.this.b(call, ev5.f, callException);
            hp0 hp0Var = hp0.A;
            hp0Var.getClass();
            new t2y(hp0Var).b.cancel(null, 530000);
        }

        @Override // com.twilio.voice.Call.Listener
        public final void onReconnected(Call call) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.a("onReconnected", new Object[0]);
            unb0.this.b(call, ev5.e, null);
        }

        @Override // com.twilio.voice.Call.Listener
        public final void onReconnecting(Call call, CallException callException) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.a("onReconnecting", new Object[0]);
            unb0.this.b(call, ev5.d, callException);
        }

        @Override // com.twilio.voice.Call.Listener
        public final void onRinging(Call call) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.a("Ringing", new Object[0]);
            unb0.this.b(call, ev5.a, null);
        }
    }

    public static unb0 c() {
        if (w == null) {
            synchronized (unb0.class) {
                try {
                    if (w == null) {
                        w = new unb0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return w;
    }

    @Override // defpackage.gzm
    public final void a(e eVar, boolean z) {
        if (!z || !this.a) {
            SportyDeskButton sportyDeskButton = this.d;
            if (sportyDeskButton != null) {
                sportyDeskButton.setVisibility(8);
                this.d = null;
                return;
            }
            return;
        }
        if (eVar != null) {
            b3.b = eVar.getClass().getSimpleName();
        }
        Activity activityE = oti.c().e();
        if (this.d == null) {
            SportyDeskButton sportyDeskButton2 = new SportyDeskButton(activityE);
            this.d = sportyDeskButton2;
            sportyDeskButton2.setNewMessageHintVisibility(this.b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            layoutParams.bottomMargin = zch0.a(hp0.A, 128);
            if (activityE != null) {
                activityE.addContentView(this.d, layoutParams);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tce0
    public final void a0(hqc hqcVar) {
        if (hqcVar instanceof nqc) {
            try {
                if (j88.valueOf(((i88) ((nqc) hqcVar).a).b) == j88.a) {
                    this.b = true;
                    SportyDeskButton sportyDeskButton = this.d;
                    if (sportyDeskButton != null) {
                        sportyDeskButton.setNewMessageHintVisibility(true);
                    }
                }
            } catch (Exception e) {
                itf0.a.f(e, "onReceive: ", new Object[0]);
            }
        }
    }

    public final void b(Call call, ev5 ev5Var, CallException callException) {
        SportyDeskWebView sportyDeskWebView = this.f;
        if (sportyDeskWebView == null) {
            return;
        }
        sportyDeskWebView.setCallState(call, ev5Var, callException);
    }

    public final void d(SportyDeskActivity sportyDeskActivity, doi0 doi0Var) {
        HashMap map = new HashMap();
        map.put("voiceChatId", doi0Var.c.a);
        map.put("requesterId", doi0Var.c.b);
        this.e = Voice.connect(sportyDeskActivity, new ConnectOptions.Builder(doi0Var.b).params(map).build(), this.v);
        h0y h0yVar = doi0Var.d;
        String str = h0yVar.a;
        String str2 = h0yVar.b;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.l("show pleased notification by Notification Manager", new Object[0]);
        Intent intent = new Intent(sportyDeskActivity, (Class<?>) SportyDeskActivity.class);
        intent.setFlags(67108864);
        intent.setAction("action_sporty_desk_main");
        PendingIntent activity = PendingIntent.getActivity(sportyDeskActivity, 530000, intent, Build.VERSION.SDK_INT < 31 ? 0 : 67108864);
        g1y g1yVarB = b5y.b(sportyDeskActivity, "PLEASED_VOICE");
        g1yVarB.g = activity;
        g1yVarB.e = g1y.b(str);
        g1yVarB.f = g1y.b(str2);
        g1yVarB.d(16, false);
        g1yVarB.d(2, true);
        g1yVarB.x = true;
        Notification notificationA = g1yVarB.a();
        notificationA.getClass();
        p32.h(sportyDeskActivity, 530000, notificationA);
    }
}
