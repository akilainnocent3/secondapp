package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class rza {
    public final e a;

    public static final class a implements b {
        public final ContentInfo.Builder a;

        public a(ClipData clipData, int i) {
            this.a = qza.a(clipData, i);
        }

        @Override // rza.b
        public final void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // rza.b
        public final void b(int i) {
            this.a.setFlags(i);
        }

        @Override // rza.b
        public final rza build() {
            return new rza(new d(this.a.build()));
        }

        @Override // rza.b
        public final void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    public interface b {
        void a(Uri uri);

        void b(int i);

        rza build();

        void setExtras(Bundle bundle);
    }

    public static final class c implements b {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        @Override // rza.b
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // rza.b
        public final void b(int i) {
            this.c = i;
        }

        @Override // rza.b
        public final rza build() {
            return new rza(new f(this));
        }

        @Override // rza.b
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    public static final class d implements e {
        public final ContentInfo a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.a = contentInfo;
        }

        @Override // rza.e
        public final ClipData a() {
            return this.a.getClip();
        }

        @Override // rza.e
        public final ContentInfo b() {
            return this.a;
        }

        @Override // rza.e
        public final int c() {
            return this.a.getFlags();
        }

        @Override // rza.e
        public final int getSource() {
            return this.a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    public interface e {
        ClipData a();

        ContentInfo b();

        int c();

        int getSource();
    }

    public static final class f implements e {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public f(c cVar) {
            ClipData clipData = cVar.a;
            clipData.getClass();
            this.a = clipData;
            int i = cVar.b;
            km20.d(i, 0, 5, "source");
            this.b = i;
            int i2 = cVar.c;
            if ((i2 & 1) != i2) {
                sza.a(Integer.toHexString(i2), "Requested flags 0x", ", but only 0x", Integer.toHexString(1), " are allowed");
                throw null;
            }
            this.c = i2;
            this.d = cVar.d;
            this.e = cVar.e;
        }

        @Override // rza.e
        public final ClipData a() {
            return this.a;
        }

        @Override // rza.e
        public final ContentInfo b() {
            return null;
        }

        @Override // rza.e
        public final int c() {
            return this.c;
        }

        @Override // rza.e
        public final int getSource() {
            return this.b;
        }

        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            int i = this.b;
            if (i == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i != 4) {
                strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb.append(strValueOf);
            sb.append(", flags=");
            int i2 = this.c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return uf80.a(sb, this.e != null ? ", hasExtras" : "", "}");
        }
    }

    public rza(e eVar) {
        this.a = eVar;
    }

    public final String toString() {
        return this.a.toString();
    }
}
