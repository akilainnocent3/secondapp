package defpackage;

import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o7h implements id90 {

    public static final class a extends o7h {
        public final FacialRecognitionResult a;

        public a(FacialRecognitionResult facialRecognitionResult) {
            this.a = facialRecognitionResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "EndFacialRecognition(result=" + this.a + ")";
        }
    }

    public static final class b extends o7h {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LaunchCustomTab(url=", this.a, ")");
        }
    }

    public static final class c extends o7h {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LaunchFacialRecognitionSdk(jsCode=", this.a, ")");
        }
    }

    public static final class d extends o7h {
        public final j6c a;

        public d(j6c j6cVar) {
            this.a = j6cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PreloadCloudflare(captchaAction=" + this.a + ")";
        }
    }

    public static final class e extends o7h {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 301120580;
        }

        public final String toString() {
            return "ShowRecoveryDialog";
        }
    }
}
