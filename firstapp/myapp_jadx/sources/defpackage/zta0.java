package defpackage;

import com.sporty.android.core.model.gift.GiftUtil;

/* JADX INFO: loaded from: classes5.dex */
public interface zta0 {

    public interface a extends zta0 {

        /* JADX INFO: renamed from: zta0$a$a, reason: collision with other inner class name */
        public static final class C1422a implements a {
            public static final C1422a a = new C1422a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1422a);
            }

            @Override // defpackage.zta0
            public final String getId() {
                return "1";
            }

            @Override // zta0.a
            public final float getValue() {
                return 1.0f;
            }

            public final int hashCode() {
                return 419130730;
            }

            public final String toString() {
                return "X1";
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            @Override // defpackage.zta0
            public final String getId() {
                return "2";
            }

            @Override // zta0.a
            public final float getValue() {
                return 2.0f;
            }

            public final int hashCode() {
                return 419130731;
            }

            public final String toString() {
                return "X2";
            }
        }

        float getValue();
    }

    public static final class b implements zta0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.zta0
        public final String getId() {
            return "skip";
        }

        public final int hashCode() {
            return -946974277;
        }

        public final String toString() {
            return GiftUtil.CLEARED_GIFT_VALUE;
        }
    }

    String getId();
}
