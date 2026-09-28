package defpackage;

import android.view.View;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.ChatMessageStatus;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.LiveShareBetData;
import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import com.sporty.android.chat.data.MsgType;
import com.sporty.android.chat.data.SendMessageData;
import com.sporty.android.chat.data.UploadImageResponse;
import com.sporty.android.common.data.CustomException;
import com.sporty.android.common.data.CustomExceptionType;
import com.sporty.android.common.data.ErrorResponse;
import com.sporty.android.core.model.service.CountryCodeName;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lbe7;", "Lj8i0;", "a", "f", "d", "e", "c", "b", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class be7 extends j8i0 {
    public final ssw<Boolean> A;
    public final ssw<Boolean> B;
    public final ssw<String> C;
    public final ssw<ad7> D;
    public final ssw E;
    public final ssw<LiveShareBetData> F;
    public final ssw G;
    public final ssw<ux4> H;
    public final ssw I;
    public final a J;
    public final f K;
    public final d L;
    public final e M;
    public final c N;
    public final ssw<List<ChatMessage>> O;
    public final b P;
    public final ema Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public int X;
    public int Y;
    public String Z;
    public final kc7 a;
    public String a0;
    public final bnh0 b;
    public final ssw<CountryCodeName> b0;
    public final ysm c;
    public boolean c0;
    public jc7 d;
    public boolean d0;
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 i;
    public final wwd0 v;
    public final ssw<c7i0> w;
    public final ssw<String> y;
    public final ssw<Boolean> z;

    public final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            view.getClass();
            be7 be7Var = be7.this;
            be7Var.D.m(ad7.c);
            be7Var.d0 = true;
        }
    }

    public final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            view.getClass();
            Object tag = view.getTag();
            tag.getClass();
            c7i0 c7i0Var = (c7i0) tag;
            be7 be7Var = be7.this;
            ssw<c7i0> sswVar = be7Var.w;
            if (sswVar.d() != c7i0Var) {
                sswVar.m(c7i0Var);
            }
            kd2.a(8, be7Var.f, null);
        }
    }

    public final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            view.getClass();
            be7.this.D.m(ad7.v);
        }
    }

    public final class d implements View.OnClickListener {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String string;
            File originalFile;
            view.getClass();
            be7 be7Var = be7.this;
            ssw sswVar = be7Var.G;
            ssw<ad7> sswVar2 = be7Var.D;
            String strD = be7Var.y.d();
            if (strD == null || (string = StringsKt.t0(strD).toString()) == null) {
                string = "";
            }
            if (string.length() == 0) {
                sswVar2.m(ad7.y);
                return;
            }
            if (sswVar.d() != 0) {
                LiveShareBetData liveShareBetData = (LiveShareBetData) sswVar.d();
                if (liveShareBetData != null && liveShareBetData.getOriginalFile() != null && liveShareBetData.getUri() != null && (originalFile = liveShareBetData.getOriginalFile()) != null) {
                    MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", originalFile.getName(), RequestBody.INSTANCE.create(MediaType.INSTANCE.parse("image/png"), originalFile));
                    ema emaVar = be7Var.Q;
                    jc7 jc7Var = be7Var.d;
                    if (jc7Var == null) {
                        Intrinsics.n("chatRepo");
                        throw null;
                    }
                    ct90<bi50<UploadImageResponse>> ct90VarA = jc7Var.a(partCreateFormData);
                    qm70 qm70Var = wm70.c;
                    ct90<bi50<UploadImageResponse>> ct90VarB = ct90VarA.d(qm70Var).b(qm70Var);
                    ie7 ie7Var = new ie7(be7Var, liveShareBetData);
                    ct90VarB.a(ie7Var);
                    emaVar.b(ie7Var);
                }
                sswVar2.m(ad7.A);
            } else {
                be7Var.C1(string, "");
            }
            be7Var.A1();
        }
    }

    public final class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            view.getClass();
            be7 be7Var = be7.this;
            be7Var.A1();
            be7Var.D.m(ad7.i);
        }
    }

    public final class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            view.getClass();
            wwd0 wwd0Var = be7.this.f;
            if (((Number) wwd0Var.getValue()).intValue() == 8) {
                kd2.a(0, wwd0Var, null);
            } else {
                kd2.a(8, wwd0Var, null);
            }
        }
    }

    public static final class g extends fte<bi50<DefaultCommand>> {
        public g() {
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            th.getClass();
            itf0.a aVar = itf0.a;
            aVar.q("SPORTY_CHAT");
            aVar.p(th, "Failed to send a message", new Object[0]);
            mpe0 mpe0Var = ljs.a;
            LogProcess logProcess = LogProcess.SENDING_MESSAGE;
            be7 be7Var = be7.this;
            ljs.c(logProcess, be7Var.V, null, th, 12);
            be7Var.y1();
            be7Var.E1(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.zu90
        public final void onSuccess(Object obj) {
            ErrorResponse errorResponse;
            ChatMessage chatMessageE;
            bi50 bi50Var = (bi50) obj;
            bi50Var.getClass();
            be7 be7Var = be7.this;
            be7Var.y1();
            if (bi50Var.a.getIsSuccessful()) {
                DefaultCommand defaultCommand = (DefaultCommand) bi50Var.b;
                mpe0 mpe0Var = ljs.a;
                ljs.b(LogProcess.SENDING_MESSAGE, LogStatus.SUCCESS, be7Var.V);
                if (defaultCommand != null && MsgType.TEXT.getType() == defaultCommand.getMsgType() && (chatMessageE = ljs.e(defaultCommand.getJsonBody())) != null) {
                    itf0.a aVar = itf0.a;
                    aVar.q("SPORTY_CHAT");
                    aVar.g("sendMessage result: %s", chatMessageE);
                    be7Var.x1(be7Var.z1(kotlin.collections.b.l(chatMessageE), true), false);
                    be7Var.y.j("");
                    return;
                }
            }
            ResponseBody responseBody = bi50Var.c;
            if (responseBody == null || (errorResponse = ErrorResponse.INSTANCE.getErrorResponse(responseBody)) == null) {
                return;
            }
            if (errorResponse.getErrorCode() != 50203) {
                onError(new CustomException(CustomExceptionType.ERROR, errorResponse.getCauseMsg()));
                return;
            }
            mpe0 mpe0Var2 = ljs.a;
            ljs.c(LogProcess.SENDING_MESSAGE, be7Var.V, null, new CustomException(null, "Error code: $50203", 1, null), 12);
            be7Var.D.j(ad7.z);
        }
    }

    public be7(kc7 kc7Var, bnh0 bnh0Var, ysm ysmVar) {
        bnh0Var.getClass();
        ysmVar.getClass();
        this.a = kc7Var;
        this.b = bnh0Var;
        this.c = ysmVar;
        this.e = xwd0.a(8);
        this.f = xwd0.a(8);
        this.i = xwd0.a(4);
        this.v = xwd0.a(8);
        this.w = new ssw<>();
        this.y = new ssw<>();
        this.z = new ssw<>();
        this.A = new ssw<>();
        this.B = new ssw<>();
        this.C = new ssw<>();
        ssw<ad7> sswVar = new ssw<>();
        this.D = sswVar;
        this.E = sswVar;
        ssw<LiveShareBetData> sswVar2 = new ssw<>();
        this.F = sswVar2;
        this.G = sswVar2;
        ssw<ux4> sswVar3 = new ssw<>();
        this.H = sswVar3;
        this.I = sswVar3;
        this.J = new a();
        this.K = new f();
        this.L = new d();
        this.M = new e();
        this.N = new c();
        this.O = new ssw<>();
        this.P = new b();
        this.Q = new ema();
        this.R = "";
        this.S = "";
        this.T = "";
        this.U = "";
        this.V = "";
        zc7 zc7Var = zc7.a;
        this.W = "";
        this.Z = "";
        this.a0 = "";
        this.b0 = new ssw<>();
        this.d0 = true;
    }

    public final void A1() {
        this.D.m(ad7.e);
    }

    public final void B1(String str, c7i0 c7i0Var, zc7 zc7Var) {
        jc7 jc7Var;
        str.getClass();
        zc7Var.getClass();
        this.R = this.b.a("wss", new String[]{"chat", "websocket", "webchat"});
        this.S = "android";
        this.T = str;
        this.U = this.c.c((3 & 1) != 0 ? "not_started" : "");
        this.w.m(c7i0Var);
        kc7 kc7Var = this.a;
        kc7Var.getClass();
        int iOrdinal = zc7Var.ordinal();
        if (iOrdinal == 0) {
            jc7Var = kc7Var.a;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            jc7Var = kc7Var.b;
        }
        this.d = jc7Var;
    }

    public final void C1(String str, String str2) {
        if (this.W.length() == 0) {
            E1(null);
            return;
        }
        SendMessageData sendMessageData = new SendMessageData(str, this.W, "TEXT", str2);
        jc7 jc7Var = this.d;
        if (jc7Var == null) {
            Intrinsics.n("chatRepo");
            throw null;
        }
        ct90<bi50<DefaultCommand>> ct90VarB = jc7Var.b(sendMessageData);
        qm70 qm70Var = wm70.c;
        ct90<bi50<DefaultCommand>> ct90VarB2 = ct90VarB.d(qm70Var).b(qm70Var);
        g gVar = new g();
        ct90VarB2.a(gVar);
        this.Q.b(gVar);
    }

    public final void D1(String str, CountryCodeName countryCodeName, String str2) {
        this.Z = str;
        this.a0 = str2;
        this.b0.m(countryCodeName);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        this.Q.d();
        super.onCleared();
    }

    public final synchronized void x1(ArrayList arrayList, boolean z) {
        try {
            List<ChatMessage> listD = this.O.d();
            if (listD == null) {
                listD = m2g.a;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listD);
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ChatMessage chatMessage = (ChatMessage) obj;
                    if (ChatMessageStatus.SHOW.getType() == chatMessage.getStatus()) {
                        if (arrayList2.isEmpty()) {
                            arrayList2.add(chatMessage);
                        } else if (chatMessage.getMessageNo() < ((ChatMessage) CollectionsKt.T(arrayList2)).getMessageNo()) {
                            arrayList2.add(0, chatMessage);
                        } else if (chatMessage.getMessageNo() > ((ChatMessage) CollectionsKt.b0(arrayList2)).getMessageNo()) {
                            arrayList2.add(chatMessage);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                int messageNo = ((ChatMessage) CollectionsKt.T(arrayList2)).getMessageNo();
                int messageNo2 = ((ChatMessage) CollectionsKt.b0(arrayList2)).getMessageNo();
                this.Y = messageNo;
                this.X = messageNo2;
            }
            if (z || arrayList2.size() > listD.size()) {
                this.O.j(arrayList2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void y1() {
        this.F.j(null);
        this.D.j(ad7.B);
    }

    public final ArrayList z1(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ChatMessage chatMessage = (ChatMessage) obj;
            if (chatMessage.getChatRoomId().length() > 0 && Intrinsics.g(chatMessage.getChatRoomId(), this.W) && chatMessage.getMessageNo() > 0 && ChatMessageStatus.SHOW.getType() == chatMessage.getStatus()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.size() >= 2) {
            if (z && ((ChatMessage) CollectionsKt.T(arrayList2)).getMessageNo() > ((ChatMessage) CollectionsKt.b0(arrayList2)).getMessageNo()) {
                Collections.reverse(arrayList2);
                return arrayList2;
            }
            if (!z && ((ChatMessage) CollectionsKt.T(arrayList2)).getMessageNo() < ((ChatMessage) CollectionsKt.b0(arrayList2)).getMessageNo()) {
                Collections.reverse(arrayList2);
            }
        }
        return arrayList2;
    }

    public final void E1(Throwable th) {
        this.C.j(th instanceof CustomException ? ((CustomException) th).getMessage() : LhMGMAwwhzjwfz.KzQFNLGraI);
    }
}
