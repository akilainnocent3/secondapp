package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\b\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Ljde;", "", "", "a", "Ljava/lang/String;", "getStatusStr", "()Ljava/lang/String;", "statusStr", "b", "getActionStr", "actionStr", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class jde {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String statusStr = null;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("action")
    private final String actionStr = null;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jde$a[], still in use, count: 1, list:
      (r0v1 jde$a[]) from 0x001e: CONSTRUCTOR (r0v1 jde$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:31) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        /* JADX INFO: Fake field, exist only in values array */
        BLOCK("block"),
        NONE("none");

        public static final C0721a b = new C0721a();
        public static final /* synthetic */ uag e;
        public final String a;

        /* JADX INFO: renamed from: jde$a$a, reason: collision with other inner class name */
        public static final class C0721a {
        }

        static {
            e = new uag(new a[]{r0, r1});
        }

        public a(String str) {
            super(str, i);
            this.a = str;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jde$b[], still in use, count: 1, list:
      (r0v1 jde$b[]) from 0x003c: CONSTRUCTOR (r0v1 jde$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:61) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        /* JADX INFO: Fake field, exist only in values array */
        ENABLED("enabled"),
        /* JADX INFO: Fake field, exist only in values array */
        DISABLED("disabled"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_AVAILABLE("not available"),
        /* JADX INFO: Fake field, exist only in values array */
        ERROR(AnalyticsEvent.BI_TRACKING_KIND_ERROR),
        UNKNOWN("unknown");

        public static final a b = new a();
        public static final /* synthetic */ uag e;
        public final String a;

        public static final class a {
        }

        static {
            e = new uag(new b[]{r0, r1, r2, r3, r4});
        }

        public b(String str) {
            super(str, i);
            this.a = str;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public final a a() {
        Object next;
        a.C0721a c0721a = a.b;
        String str = this.actionStr;
        c0721a.getClass();
        Iterator<T> it = a.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((a) next).a.equalsIgnoreCase(str));
        a aVar = (a) next;
        return aVar == null ? a.NONE : aVar;
    }

    public final b b() {
        Object next;
        b.a aVar = b.b;
        String str = this.statusStr;
        aVar.getClass();
        Iterator<T> it = b.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((b) next).a.equalsIgnoreCase(str));
        b bVar = (b) next;
        return bVar == null ? b.UNKNOWN : bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jde)) {
            return false;
        }
        jde jdeVar = (jde) obj;
        return Intrinsics.g(this.statusStr, jdeVar.statusStr) && Intrinsics.g(this.actionStr, jdeVar.actionStr);
    }

    public final int hashCode() {
        String str = this.statusStr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionStr;
        return (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return tx5.a("DeviceIntegrityAssessmentResponse(statusStr=", this.statusStr, ", actionStr=", this.actionStr, ", message=null, innerMessage=null)");
    }
}
