package defpackage;

import androidx.recyclerview.widget.r;
import com.sportybet.android.router.Sender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
public final class srk implements bum {
    public final azm a;
    public final mpe0 b = hwr.b(new teb(1));

    public static final class a implements c {
        public final mob0 a;

        public a(mob0 mob0Var) {
            mob0Var.getClass();
            this.a = mob0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "GameSDKDestination(gameEntryParameter=" + this.a + ")";
        }
    }

    public interface b {
    }

    public interface c extends b {
    }

    public static final class e implements b {
        public static final e a = new e();
    }

    public srk(azm azmVar) {
        this.a = azmVar;
    }

    public static boolean b(List list, int... iArr) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ay0.E(iArr, ((Number) it.next()).intValue()) >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bum
    public final void a(String str, ArrayList arrayList) {
        b bVar;
        c dVar;
        arrayList.getClass();
        str.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        if (!b(arrayList, 0, 1, 114)) {
            if (!b(arrayList, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS)) {
                if (!b(arrayList, 147)) {
                    if (!b(arrayList, 146)) {
                        if (!b(arrayList, 150)) {
                            if (!b(arrayList, 173)) {
                                if (!b(arrayList, 171)) {
                                    if (!b(arrayList, 152)) {
                                        if (!b(arrayList, 153)) {
                                            if (!b(arrayList, 159)) {
                                                if (!b(arrayList, 3)) {
                                                    if (!b(arrayList, 2, 20, r.d.DEFAULT_DRAG_ANIMATION_DURATION)) {
                                                        if (!b(arrayList, 3)) {
                                                            if (!b(arrayList, 162)) {
                                                                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                                                                int size = arrayList.size();
                                                                int i2 = 0;
                                                                while (true) {
                                                                    bVar = e.a;
                                                                    if (i2 >= size) {
                                                                        break;
                                                                    }
                                                                    Object obj = arrayList.get(i2);
                                                                    i2++;
                                                                    b bVar2 = (c) ((Map) this.b.getValue()).get(Integer.valueOf(((Number) obj).intValue()));
                                                                    if (bVar2 != null) {
                                                                        bVar = bVar2;
                                                                    }
                                                                    arrayList2.add(bVar);
                                                                }
                                                                if (arrayList2.size() != 1) {
                                                                    if (!arrayList2.isEmpty()) {
                                                                        int size2 = arrayList2.size();
                                                                        while (true) {
                                                                            if (i >= size2) {
                                                                                dVar = new d(wae.SPORTS_MENU);
                                                                                break;
                                                                            }
                                                                            Object obj2 = arrayList2.get(i);
                                                                            i++;
                                                                            if (((b) obj2) instanceof c) {
                                                                                dVar = new d(wae.GAMES_LOBBY);
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        dVar = new d(wae.SPORTS_MENU);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    b bVar3 = (b) CollectionsKt.T(arrayList2);
                                                                    if (bVar3 instanceof c) {
                                                                        dVar = (c) bVar3;
                                                                    } else {
                                                                        if (!Intrinsics.g(bVar3, bVar)) {
                                                                            uhc.a();
                                                                            return;
                                                                        }
                                                                        dVar = new d(wae.SPORTS_MENU);
                                                                    }
                                                                }
                                                            } else {
                                                                dVar = new d(wae.LUCKY_NUMBER, c5j0.a("key-lucky-number-gif-id", str));
                                                            }
                                                        } else {
                                                            dVar = new d(wae.JACKPOT);
                                                        }
                                                    } else {
                                                        dVar = new d(wae.VIRTUALS_LOBBY);
                                                    }
                                                } else {
                                                    dVar = new d(wae.JACKPOT);
                                                }
                                            } else {
                                                dVar = new d(wae.SPORTY_INSTANT_WIN, c5j0.a("sportId", "sr:sport:1-3-1"));
                                            }
                                        } else {
                                            dVar = new d(wae.INSTANT_WIN_SPORTY_PENALTY, c5j0.a("sportId", "sr:sport:1-2"));
                                        }
                                    } else {
                                        dVar = new d(wae.INSTANT_WIN_SPORTY_LEGENDS, c5j0.a("sportId", "sr:sport:3"));
                                    }
                                } else {
                                    dVar = new d(wae.INSTANT_WIN_SCHEDULED_FOOTBALL, c5j0.a("sportId", "sr:sport:10000"));
                                }
                            } else {
                                dVar = new d(wae.SPORTY_INSTANT_WIN, c5j0.a("sportId", "sr:sport:1-3-2"));
                            }
                        } else {
                            dVar = new d(wae.INSTANT_WIN_INSTANT_RACING, c5j0.a("sportId", "sr:sport:1000"));
                        }
                    } else {
                        dVar = new d(wae.INSTANT_WIN_BUILD_AND_GO, null);
                    }
                } else {
                    dVar = new d(wae.SPORTY_INSTANT_WIN, c5j0.a("sportId", "sr:sport:2"));
                }
            } else {
                dVar = new d(wae.SPORTY_INSTANT_WIN, c5j0.a("sportId", "sr:sport:1"));
            }
        } else {
            dVar = new d(wae.SPORTS_MENU);
        }
        boolean z = dVar instanceof a;
        azm azmVar = this.a;
        if (z) {
            azmVar.i(wae.GAMES_LOBBY, ((a) dVar).a.a, null, Sender.GIFT);
        } else if (!(dVar instanceof d)) {
            uhc.a();
        } else {
            d dVar2 = (d) dVar;
            azmVar.i(dVar2.a, dVar2.b, null, Sender.GIFT);
        }
    }

    public static final class d implements c {
        public final wae a;
        public final List<Pair<String, String>> b;

        public d(wae waeVar) {
            this.a = waeVar;
            this.b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            List<Pair<String, String>> list = this.b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return "NativeDestination(destination=" + this.a + ", uriQueryParameters=" + this.b + ")";
        }

        public d(wae waeVar, List<Pair<String, String>> list) {
            this.a = waeVar;
            this.b = list;
        }
    }
}
