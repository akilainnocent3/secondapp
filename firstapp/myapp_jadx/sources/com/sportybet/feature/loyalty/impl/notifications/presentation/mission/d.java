package com.sportybet.feature.loyalty.impl.notifications.presentation.mission;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.vch0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface d {

    public interface a extends d {

        /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d$a$a, reason: collision with other inner class name */
        public static final class C0390a implements a {
            public final UiText a;
            public final StringUiText b;
            public final ResourceUiText c;

            public C0390a(UiText uiText, StringUiText stringUiText) {
                uiText.getClass();
                this.a = uiText;
                this.b = stringUiText;
                StringUiText stringUiText2 = vch0.a;
                this.c = new ResourceUiText(R.string.page_loyalty__join_mission);
            }

            @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a
            public final UiText e() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0390a)) {
                    return false;
                }
                C0390a c0390a = (C0390a) obj;
                return Intrinsics.g(this.a, c0390a.a) && this.b.equals(c0390a.b);
            }

            public final int hashCode() {
                return this.b.a.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Invitation(startBefore=" + this.a + ", giftAmount=" + this.b + ")";
            }
        }

        public interface b extends a {

            /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d$a$b$a, reason: collision with other inner class name */
            public static final class C0391a implements b {
                public static final C0391a a = new C0391a();
                public static final ResourceUiText b = new ResourceUiText(R.string.page_loyalty__popup_mission_complete_title);
                public static final ResourceUiText c = new ResourceUiText(R.string.page_loyalty__popup_mission_complete_img);
                public static final ResourceUiText d = new ResourceUiText(R.string.page_loyalty__popup_mission_complete_content);
                public static final ResourceUiText e = new ResourceUiText(R.string.page_loyalty__claim_reward);

                @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a.b
                public final ResourceUiText a() {
                    return d;
                }

                @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a.b
                public final ResourceUiText c() {
                    return c;
                }

                @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a
                public final UiText e() {
                    return e;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0391a);
                }

                @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a.b
                public final ResourceUiText getTitle() {
                    return b;
                }

                public final int hashCode() {
                    return -2019712792;
                }

                public final String toString() {
                    return "MissionCompleted";
                }
            }

            /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d$a$b$b, reason: collision with other inner class name */
            public static final class C0392b implements b {
                public static final C0392b a = new C0392b();
                public static final ResourceUiText b = new ResourceUiText(R.string.page_loyalty__popup_mission_invite_title);
                public static final ResourceUiText c = new ResourceUiText(R.string.page_loyalty__popup_mission_invite_img);
                public static final ResourceUiText d = new ResourceUiText(R.string.page_loyalty__popup_mission_invite_content);
                public static final ResourceUiText e = new ResourceUiText(R.string.page_loyalty__activate_mission);

                @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a.b
                public final ResourceUiText a() {
                    return d;
                }

                @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a.b
                public final ResourceUiText c() {
                    return c;
                }

                @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a
                public final UiText e() {
                    return e;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0392b);
                }

                @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.a.b
                public final ResourceUiText getTitle() {
                    return b;
                }

                public final int hashCode() {
                    return 1863349589;
                }

                public final String toString() {
                    return "NewMission";
                }
            }

            ResourceUiText a();

            ResourceUiText c();

            ResourceUiText getTitle();
        }

        UiText e();
    }

    public interface b extends d {

        public static final class a implements b {
            public final String a;
            public final String b;
            public final String c;
            public final ArrayList d;

            public a(String str, String str2, String str3, ArrayList arrayList) {
                str.getClass();
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = arrayList;
            }

            @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.b
            public final String b() {
                return this.a;
            }

            @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.b
            public final String d() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
            }

            @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.b
            public final String getSource() {
                return this.c;
            }

            public final int hashCode() {
                return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("Loaded(currency=", this.a, ", amount=", this.b, ", source=");
                sbA.append(this.c);
                sbA.append(", games=");
                sbA.append(this.d);
                sbA.append(")");
                return sbA.toString();
            }
        }

        /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d$b$b, reason: collision with other inner class name */
        public static final class C0393b implements b {
            public final String a;
            public final String b;
            public final String c;

            public C0393b(String str, String str2, String str3) {
                str.getClass();
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.b
            public final String b() {
                return this.a;
            }

            @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.b
            public final String d() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0393b)) {
                    return false;
                }
                C0393b c0393b = (C0393b) obj;
                return Intrinsics.g(this.a, c0393b.a) && this.b.equals(c0393b.b) && this.c.equals(c0393b.c);
            }

            @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d.b
            public final String getSource() {
                return this.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return uf80.a(ux5.a("Loading(currency=", this.a, ", amount=", this.b, ", source="), this.c, ")");
            }
        }

        String b();

        String d();

        String getSource();
    }

    public static final class c implements d {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1158696056;
        }

        public final String toString() {
            return "Hidden";
        }
    }
}
