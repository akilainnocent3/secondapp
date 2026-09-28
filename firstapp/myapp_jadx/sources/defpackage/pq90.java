package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface pq90 {

    public static final class a implements pq90 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 969538835;
        }

        public final String toString() {
            return "Close";
        }
    }

    public interface b extends pq90 {

        public static final class a implements b {
            public final ucn<String> a;

            public a(ucn<String> ucnVar) {
                this.a = ucnVar;
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
                return "ToggleAll(collapsedEventIds=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: pq90$b$b, reason: collision with other inner class name */
        public static final class C0981b implements b {
            public final String a;
            public final String b;

            public C0981b(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0981b)) {
                    return false;
                }
                C0981b c0981b = (C0981b) obj;
                return this.a.equals(c0981b.a) && this.b.equals(c0981b.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("ToggleSingle(ticketId=", this.a, ", eventId=", this.b, ")");
            }
        }
    }

    public static final class c implements pq90 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 745001372;
        }

        public final String toString() {
            return "SkipToResult";
        }
    }

    public static final class d implements pq90 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ToggleTicket(ticketId=", this.a, ")");
        }
    }

    public interface e extends pq90 {

        public static final class a implements e {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1547365833;
            }

            public final String toString() {
                return "DismissTooltip";
            }
        }

        public static final class b implements e {
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
                return tug.a("ShowTooltip(selectionId=", this.a, ")");
            }
        }
    }

    public static final class f implements pq90 {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("UpdateCurrentTicketId(ticketId=", this.a, ")");
        }
    }

    public static final class g implements pq90 {
        public final zji a;

        public g(zji zjiVar) {
            this.a = zjiVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateLeadingEventScore(attackStep=" + this.a + ")";
        }
    }
}
