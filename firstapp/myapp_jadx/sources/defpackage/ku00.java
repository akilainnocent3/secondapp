package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ku00 {
    public final String a;
    public final String b;
    public final String c;

    public ku00(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku00)) {
            return false;
        }
        ku00 ku00Var = (ku00) obj;
        return this.a.equals(ku00Var.a) && this.b.equals(ku00Var.b) && this.c.equals(ku00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PiggyBashChatData(chatRoomId=");
        sb.append(this.a);
        sb.append(", botUserId=");
        sb.append(this.b);
        sb.append(", userId=");
        return j26.a(sb, this.c, ')');
    }
}
