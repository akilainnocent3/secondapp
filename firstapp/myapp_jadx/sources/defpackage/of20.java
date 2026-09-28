package defpackage;

import android.text.TextUtils;
import com.sporty.android.book.presentation.eventdetails.header.EventDetailHeaderUiModel;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentResponse;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.UploadImageResponse;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.VoteResponse;
import com.sportybet.plugin.realsports.prematch.data.EventSideMenu;
import com.sportybet.plugin.realsports.prematch.data.NavigationUiEvent;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lof20;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class of20 extends ihb0 {
    public final w1p A;
    public final azy B;
    public final ae20 C;
    public final ssw D;
    public final wwd0 E;
    public final r5b F;
    public final ssw<bi50<PostCommentResponse>> G;
    public final ssw H;
    public final ssw<bi50<PostCommentResponse>> I;
    public final ssw J;
    public final ssw<soi0> K;
    public final ssw L;
    public final ssw<bi50<Void>> M;
    public final ssw N;
    public final ssw<bi50<Void>> O;
    public final ssw P;
    public final ssw<bi50<UploadImageResponse>> Q;
    public final ssw R;
    public final ssw<bi50<VoteResponse>> S;
    public final ssw T;
    public final ssw<bi50<List<CommentsData>>> U;
    public final ssw V;
    public final ssw<bi50<String>> W;
    public final ssw X;
    public final wwd0 Y;
    public final r5b Z;
    public final ssw<EventDetailHeaderUiModel> a0;
    public final ssw b0;
    public final ssw<EventSideMenu> c0;
    public final d6k d;
    public final ssw d0;
    public final psm e;
    public final vu90<NavigationUiEvent> e0;
    public final sd20 f;
    public final vu90<NavigationUiEvent> f0;
    public final ssw<Boolean> g0;
    public final ssw h0;
    public final vxw i;
    public final ssw<Boolean> i0;
    public final ssw j0;
    public Event k0;
    public Event l0;
    public Event m0;
    public List<? extends Event> n0;
    public List<? extends Event> o0;
    public final HashMap<Integer, c9p> p0;
    public final we20 q0;
    public final ayw v;
    public final na20 w;
    public final t8d0 y;
    public final ISocketPushManager z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v13, types: [we20] */
    public of20(d6k d6kVar, psm psmVar, sd20 sd20Var, vxw vxwVar, ayw aywVar, na20 na20Var, t8d0 t8d0Var, ISocketPushManager iSocketPushManager, w1p w1pVar, azy azyVar) {
        super(0);
        psmVar.getClass();
        vxwVar.getClass();
        aywVar.getClass();
        na20Var.getClass();
        t8d0Var.getClass();
        iSocketPushManager.getClass();
        this.d = d6kVar;
        this.e = psmVar;
        this.f = sd20Var;
        this.i = vxwVar;
        this.v = aywVar;
        this.w = na20Var;
        this.y = t8d0Var;
        this.z = iSocketPushManager;
        this.A = w1pVar;
        this.B = azyVar;
        ae20 ae20Var = ae20.c;
        if (ae20Var == null) {
            synchronized (ae20.class) {
                try {
                    ae20Var = ae20.c;
                    if (ae20Var == null) {
                        ae20Var = new ae20();
                        ae20.c = ae20Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.C = ae20Var;
        ssw<e880> sswVar = ae20Var.a;
        sswVar.getClass();
        this.D = sswVar;
        wwd0 wwd0VarA = xwd0.a(null);
        this.E = wwd0VarA;
        this.F = i2i.c(wwd0VarA, null, 3);
        ssw<bi50<PostCommentResponse>> sswVar2 = new ssw<>();
        this.G = sswVar2;
        this.H = sswVar2;
        ssw<bi50<PostCommentResponse>> sswVar3 = new ssw<>();
        this.I = sswVar3;
        this.J = sswVar3;
        ssw<soi0> sswVar4 = new ssw<>();
        this.K = sswVar4;
        this.L = sswVar4;
        ssw<bi50<Void>> sswVar5 = new ssw<>();
        this.M = sswVar5;
        this.N = sswVar5;
        ssw<bi50<Void>> sswVar6 = new ssw<>();
        this.O = sswVar6;
        this.P = sswVar6;
        ssw<bi50<UploadImageResponse>> sswVar7 = new ssw<>();
        this.Q = sswVar7;
        this.R = sswVar7;
        ssw<bi50<VoteResponse>> sswVar8 = new ssw<>();
        this.S = sswVar8;
        this.T = sswVar8;
        ssw<bi50<List<CommentsData>>> sswVar9 = new ssw<>();
        this.U = sswVar9;
        this.V = sswVar9;
        ssw<bi50<String>> sswVar10 = new ssw<>();
        this.W = sswVar10;
        this.X = sswVar10;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA2 = xwd0.a(bool);
        this.Y = wwd0VarA2;
        this.Z = i2i.c(wwd0VarA2, null, 3);
        ssw<EventDetailHeaderUiModel> sswVar11 = new ssw<>();
        this.a0 = sswVar11;
        this.b0 = sswVar11;
        ssw<EventSideMenu> sswVar12 = new ssw<>();
        this.c0 = sswVar12;
        this.d0 = sswVar12;
        vu90<NavigationUiEvent> vu90Var = new vu90<>();
        this.e0 = vu90Var;
        this.f0 = vu90Var;
        ssw<Boolean> sswVar13 = new ssw<>();
        this.g0 = sswVar13;
        this.h0 = sswVar13;
        ssw<Boolean> sswVar14 = new ssw<>(bool);
        this.i0 = sswVar14;
        this.j0 = sswVar14;
        m2g m2gVar = m2g.a;
        this.n0 = m2gVar;
        this.o0 = m2gVar;
        this.p0 = new HashMap<>();
        this.q0 = new Subscriber() { // from class: we20
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                str.getClass();
                of20 of20Var = this.a;
                Event event = of20Var.k0;
                if (event != null) {
                    event.update(str);
                    if (event.status == 1) {
                        vu90<NavigationUiEvent> vu90Var2 = of20Var.e0;
                        String str2 = event.eventId;
                        str2.getClass();
                        vu90Var2.m(new NavigationUiEvent.LiveNavigation(str2, true));
                    }
                }
            }
        };
    }

    @Override // defpackage.ihb0, defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        Event event = this.k0;
        if (event != null) {
            this.z.unsubscribeTopic(new GroupTopic(event.getTopic()), this.q0);
        }
    }

    public final void z1(Selection selection) {
        String str;
        ae20 ae20Var = this.C;
        HashMap map = ae20Var.b;
        String strE = selection.e();
        String strG = selection.g();
        Market market = selection.b;
        boolean zIsEmpty = TextUtils.isEmpty(market.specifier);
        Event event = selection.a;
        if (zIsEmpty) {
            str = event.eventId + "^" + market.id;
        } else {
            str = event.eventId + "^" + market.id + "^" + market.specifier;
        }
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, selection);
        SocketPushManager.getInstance().subscribeTopic(new GroupTopic(strE), ae20Var);
        SocketPushManager.getInstance().subscribeTopic(new GroupTopic(strG), ae20Var);
    }
}
