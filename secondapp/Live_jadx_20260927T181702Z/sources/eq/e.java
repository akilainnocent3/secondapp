package eq;

import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f81530a = a.f81531a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f81531a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f81532b = "SendBeaconPerWorkerLogger";
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final b f81533b = new b();

        @Override // eq.e
        public void a(@oy.l String str) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, a.f81532b, "onSuccessSendUrl: " + str);
            }
        }

        @Override // eq.e
        public void b(@oy.l String str) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, a.f81532b, "onTrySendUrl: " + str);
            }
        }

        @Override // eq.e
        public void c(@oy.l String str, boolean z10) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, a.f81532b, "onFailedSendUrl: " + str);
            }
        }

        @Override // eq.e
        public void d(@oy.l String str) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, a.f81532b, "onFailedSendUrlDueServerError: " + str);
            }
        }
    }

    void a(@oy.l String str);

    void b(@oy.l String str);

    void c(@oy.l String str, boolean z10);

    void d(@oy.l String str);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final c f81534b = new c();

        @Override // eq.e
        public void a(@oy.l String str) {
        }

        @Override // eq.e
        public void b(@oy.l String str) {
        }

        @Override // eq.e
        public void d(@oy.l String str) {
        }

        @Override // eq.e
        public void c(@oy.l String str, boolean z10) {
        }
    }
}
