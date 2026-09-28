package defpackage;

import com.sporty.android.chat.data.SocketStatus;
import com.sporty.android.chat.data.SocketStatusTypeEnum;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class og7 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        pg7.e = false;
        pg7.g.j(new SocketStatus(SocketStatusTypeEnum.CONNECTED, null, 2, null));
    }
}
