package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface wqk extends pdd0 {

    public static final class a implements wqk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "giftpopup__betnow__click";
        }

        public final int hashCode() {
            return 2021489251;
        }

        public final String toString() {
            return "GiftReceivedBetNowClickEvent";
        }
    }

    public static final class b implements wqk {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "giftpopup__popup__view";
        }

        public final int hashCode() {
            return -764343443;
        }

        public final String toString() {
            return "GiftReceivedBottomSheetViewEvent";
        }
    }

    public static final class c implements wqk {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "giftpopup__howtouse__click";
        }

        public final int hashCode() {
            return -993219398;
        }

        public final String toString() {
            return "GiftReceivedHowToUseClickEvent";
        }
    }

    public static final class d implements wqk {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "giftpopup__view__click";
        }

        public final int hashCode() {
            return 1499365251;
        }

        public final String toString() {
            return "GiftReceivedViewClickEvent";
        }
    }
}
