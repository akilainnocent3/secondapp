package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.config.VersionData;
import com.sporty.android.core.model.patron.KycSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface iev {

    public static final class a implements iev {
        public final VersionData a;

        public a(VersionData versionData) {
            versionData.getClass();
            this.a = versionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ForceUpdate(data=" + this.a + ")";
        }
    }

    public static final class a0 implements iev {
        public final ftp a;

        public a0(ftp ftpVar) {
            this.a = ftpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.a == ((a0) obj).a;
        }

        public final int hashCode() {
            ftp ftpVar = this.a;
            if (ftpVar == null) {
                return 0;
            }
            return ftpVar.hashCode();
        }

        public final String toString() {
            return "OpenVerificationInProgressBottomSheet(action=" + this.a + ")";
        }
    }

    public static final class b implements iev {
        public final VersionData a;
        public final VersionAutoUpdateConfig b;
        public final Function0<Unit> c;

        public b(VersionAutoUpdateConfig versionAutoUpdateConfig, VersionData versionData, Function0 function0) {
            versionData.getClass();
            versionAutoUpdateConfig.getClass();
            this.a = versionData;
            this.b = versionAutoUpdateConfig;
            this.c = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "NewVersionDialog(data=" + this.a + ", autoUpdateConfig=" + this.b + ", callback=" + this.c + ")";
        }
    }

    public static final class b0 implements iev {
        public static final b0 a = new b0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b0);
        }

        public final int hashCode() {
            return 278334416;
        }

        public final String toString() {
            return "OpenWithdraw";
        }
    }

    public static final class c implements iev {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -537787081;
        }

        public final String toString() {
            return "OpenAppGallery";
        }
    }

    public static final class c0 implements iev {
        public static final c0 a = new c0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c0);
        }

        public final int hashCode() {
            return -452530877;
        }

        public final String toString() {
            return "OpenWorldCupPass";
        }
    }

    public static final class d implements iev {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 815792556;
        }

        public final String toString() {
            return "OpenBetsHistory";
        }
    }

    public static final class e implements iev {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 712691850;
        }

        public final String toString() {
            return "OpenChangeRegion";
        }
    }

    public static final class f implements iev {
        public f() {
            snb0 snb0Var = snb0.DEPP_LINK;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            snb0 snb0Var = snb0.DEPP_LINK;
            return true;
        }

        public final int hashCode() {
            return snb0.ME.hashCode();
        }

        public final String toString() {
            return "OpenCustomerService(destination=" + snb0.ME + ")";
        }
    }

    public static final class g implements iev {
        public final Boolean a;

        public g(Boolean bool) {
            this.a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return "OpenDailyStreak(showNewBadgeOnAlert=" + this.a + ")";
        }
    }

    public static final class h implements iev {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1593763096;
        }

        public final String toString() {
            return "OpenDeposit";
        }
    }

    public static final class i implements iev {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1027075147;
        }

        public final String toString() {
            return "OpenFeedback";
        }
    }

    public static final class j implements iev {
        public final long a;

        public j(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "OpenGameInfoDialog(days=", ")");
        }
    }

    public static final class k implements iev {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 384426557;
        }

        public final String toString() {
            return "OpenGifts";
        }
    }

    public static final class l implements iev {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1051489465;
        }

        public final String toString() {
            return "OpenHowToPlay";
        }
    }

    public static final class m implements iev {
        public final KycSource a;
        public final zsp b;

        public m(KycSource kycSource, zsp zspVar) {
            kycSource.getClass();
            this.a = kycSource;
            this.b = zspVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.a == mVar.a && Intrinsics.g(this.b, mVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            zsp zspVar = this.b;
            return iHashCode + (zspVar == null ? 0 : zspVar.hashCode());
        }

        public final String toString() {
            return "OpenKyc(source=" + this.a + ", kycHintState=" + this.b + ")";
        }
    }

    public static final class n implements iev {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 389223523;
        }

        public final String toString() {
            return "OpenLogin";
        }
    }

    public static final class o implements iev {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 398037696;
        }

        public final String toString() {
            return "OpenLoyalty";
        }
    }

    public static final class p implements iev {
        public static final p a = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 99149414;
        }

        public final String toString() {
            return "OpenNotificationCenter";
        }
    }

    public static final class q implements iev {
        public final String a;

        public q(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.g(this.a, ((q) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("OpenPalmStore(url=", this.a, ")");
        }
    }

    public static final class r implements iev {
        public final String a;

        public r(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Intrinsics.g(this.a, ((r) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("OpenPlayStore(url=", this.a, ")");
        }
    }

    public static final class s implements iev {
        public final AccountInfo a;

        public s(AccountInfo accountInfo) {
            this.a = accountInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.a.equals(((s) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenProfile(accountInfo=" + this.a + ")";
        }
    }

    public static final class t implements iev {
        public static final t a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -479756426;
        }

        public final String toString() {
            return "OpenPromotions";
        }
    }

    public static final class u implements iev {
        public static final u a = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 1022744475;
        }

        public final String toString() {
            return "OpenRateApp";
        }
    }

    public static final class v implements iev {
        public static final v a = new v();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 394462649;
        }

        public final String toString() {
            return "OpenRecap";
        }
    }

    public static final class w implements iev {
        public final boolean a;

        public w(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.a == ((w) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("OpenSettings(showTfa=", ")", this.a);
        }
    }

    public static final class x implements iev {
        public final String a;
        public final boolean b;

        public x(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.a.equals(xVar.a) && this.b == xVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("OpenSocial(nickname=", this.a, ", isNicknameVerified=", ")", this.b);
        }
    }

    public static final class y implements iev {
        public static final y a = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -581031206;
        }

        public final String toString() {
            return "OpenTaxReports";
        }
    }

    public static final class z implements iev {
        public static final z a = new z();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -1493059813;
        }

        public final String toString() {
            return "OpenTransactions";
        }
    }
}
