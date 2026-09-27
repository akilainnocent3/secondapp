package q4;

import android.content.Context;
import android.media.session.MediaSessionManager;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(28)
public class p extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaSessionManager f121505h;

    public p(Context context) {
        super(context);
        this.f121505h = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // q4.k, q4.q, q4.j.a
    public boolean a(j.c cVar) {
        return super.a(cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static final class a extends q.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaSessionManager.RemoteUserInfo f121506d;

        public a(String str, int i10, int i11) {
            super(str, i10, i11);
            this.f121506d = o.a(str, i10, i11);
        }

        public static String b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }

        public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.f121506d = remoteUserInfo;
        }
    }
}
