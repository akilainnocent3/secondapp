package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.sportygames.featuredGames.view.FeaturedGames;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class eeh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eeh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:112:0x0192 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:7:0x001d, B:9:0x002a, B:12:0x0030, B:13:0x0034, B:16:0x003a, B:18:0x0040, B:21:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0060, B:28:0x006e, B:30:0x007d, B:33:0x0083, B:35:0x0087, B:37:0x0091, B:42:0x009e, B:44:0x00a2, B:46:0x00ad, B:48:0x00ba, B:56:0x00d6, B:103:0x0169, B:105:0x016d, B:107:0x0175, B:110:0x018d, B:112:0x0192, B:113:0x0195, B:115:0x0199, B:116:0x01a6, B:117:0x01a9, B:118:0x01aa, B:119:0x01ad, B:120:0x01ae, B:122:0x01c2, B:124:0x01c6, B:51:0x00cd, B:52:0x00d0, B:53:0x00d1, B:54:0x00d4, B:60:0x00e6, B:61:0x00e9, B:62:0x00ea, B:63:0x00ed, B:65:0x00f0, B:66:0x00f3, B:68:0x00f7, B:70:0x00fb, B:72:0x0105, B:77:0x0112, B:79:0x0116, B:81:0x0121, B:83:0x012e, B:91:0x014a, B:86:0x0141, B:87:0x0144, B:88:0x0145, B:89:0x0148, B:96:0x015b, B:97:0x015e, B:98:0x0161, B:99:0x0162, B:100:0x0165, B:125:0x01ca, B:126:0x01cd, B:127:0x01d0, B:128:0x01d1, B:129:0x01d4, B:130:0x01d7), top: B:134:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0195 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:7:0x001d, B:9:0x002a, B:12:0x0030, B:13:0x0034, B:16:0x003a, B:18:0x0040, B:21:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0060, B:28:0x006e, B:30:0x007d, B:33:0x0083, B:35:0x0087, B:37:0x0091, B:42:0x009e, B:44:0x00a2, B:46:0x00ad, B:48:0x00ba, B:56:0x00d6, B:103:0x0169, B:105:0x016d, B:107:0x0175, B:110:0x018d, B:112:0x0192, B:113:0x0195, B:115:0x0199, B:116:0x01a6, B:117:0x01a9, B:118:0x01aa, B:119:0x01ad, B:120:0x01ae, B:122:0x01c2, B:124:0x01c6, B:51:0x00cd, B:52:0x00d0, B:53:0x00d1, B:54:0x00d4, B:60:0x00e6, B:61:0x00e9, B:62:0x00ea, B:63:0x00ed, B:65:0x00f0, B:66:0x00f3, B:68:0x00f7, B:70:0x00fb, B:72:0x0105, B:77:0x0112, B:79:0x0116, B:81:0x0121, B:83:0x012e, B:91:0x014a, B:86:0x0141, B:87:0x0144, B:88:0x0145, B:89:0x0148, B:96:0x015b, B:97:0x015e, B:98:0x0161, B:99:0x0162, B:100:0x0165, B:125:0x01ca, B:126:0x01cd, B:127:0x01d0, B:128:0x01d1, B:129:0x01d4, B:130:0x01d7), top: B:134:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0199 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:7:0x001d, B:9:0x002a, B:12:0x0030, B:13:0x0034, B:16:0x003a, B:18:0x0040, B:21:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0060, B:28:0x006e, B:30:0x007d, B:33:0x0083, B:35:0x0087, B:37:0x0091, B:42:0x009e, B:44:0x00a2, B:46:0x00ad, B:48:0x00ba, B:56:0x00d6, B:103:0x0169, B:105:0x016d, B:107:0x0175, B:110:0x018d, B:112:0x0192, B:113:0x0195, B:115:0x0199, B:116:0x01a6, B:117:0x01a9, B:118:0x01aa, B:119:0x01ad, B:120:0x01ae, B:122:0x01c2, B:124:0x01c6, B:51:0x00cd, B:52:0x00d0, B:53:0x00d1, B:54:0x00d4, B:60:0x00e6, B:61:0x00e9, B:62:0x00ea, B:63:0x00ed, B:65:0x00f0, B:66:0x00f3, B:68:0x00f7, B:70:0x00fb, B:72:0x0105, B:77:0x0112, B:79:0x0116, B:81:0x0121, B:83:0x012e, B:91:0x014a, B:86:0x0141, B:87:0x0144, B:88:0x0145, B:89:0x0148, B:96:0x015b, B:97:0x015e, B:98:0x0161, B:99:0x0162, B:100:0x0165, B:125:0x01ca, B:126:0x01cd, B:127:0x01d0, B:128:0x01d1, B:129:0x01d4, B:130:0x01d7), top: B:134:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:7:0x001d, B:9:0x002a, B:12:0x0030, B:13:0x0034, B:16:0x003a, B:18:0x0040, B:21:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0060, B:28:0x006e, B:30:0x007d, B:33:0x0083, B:35:0x0087, B:37:0x0091, B:42:0x009e, B:44:0x00a2, B:46:0x00ad, B:48:0x00ba, B:56:0x00d6, B:103:0x0169, B:105:0x016d, B:107:0x0175, B:110:0x018d, B:112:0x0192, B:113:0x0195, B:115:0x0199, B:116:0x01a6, B:117:0x01a9, B:118:0x01aa, B:119:0x01ad, B:120:0x01ae, B:122:0x01c2, B:124:0x01c6, B:51:0x00cd, B:52:0x00d0, B:53:0x00d1, B:54:0x00d4, B:60:0x00e6, B:61:0x00e9, B:62:0x00ea, B:63:0x00ed, B:65:0x00f0, B:66:0x00f3, B:68:0x00f7, B:70:0x00fb, B:72:0x0105, B:77:0x0112, B:79:0x0116, B:81:0x0121, B:83:0x012e, B:91:0x014a, B:86:0x0141, B:87:0x0144, B:88:0x0145, B:89:0x0148, B:96:0x015b, B:97:0x015e, B:98:0x0161, B:99:0x0162, B:100:0x0165, B:125:0x01ca, B:126:0x01cd, B:127:0x01d0, B:128:0x01d1, B:129:0x01d4, B:130:0x01d7), top: B:134:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        ssw<Integer> sswVar;
        ArrayList arrayList;
        boolean z2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FeaturedGames featuredGames = (FeaturedGames) obj2;
                Integer num = (Integer) obj;
                int i2 = FeaturedGames.C;
                try {
                    RecyclerView.o layoutManager = featuredGames.binding.c.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null) {
                        return Unit.a;
                    }
                    ArrayList arrayList2 = featuredGames.y;
                    if (arrayList2 == null) {
                        Intrinsics.n("allGamesWithCategory");
                        throw null;
                    }
                    if (!arrayList2.isEmpty()) {
                        int size = featuredGames.w.size();
                        num.getClass();
                        int iIntValue = num.intValue();
                        if (iIntValue >= 0 && iIntValue < size) {
                            int iF1 = linearLayoutManager.f1();
                            int i3 = -1;
                            if (iF1 == -1) {
                                return Unit.a;
                            }
                            ArrayList arrayList3 = featuredGames.y;
                            if (arrayList3 == null) {
                                Intrinsics.n("allGamesWithCategory");
                                throw null;
                            }
                            Pair pair = (Pair) CollectionsKt.V(iF1 % arrayList3.size(), arrayList3);
                            if (pair == null) {
                                return Unit.a;
                            }
                            if (num.intValue() < ((Number) pair.a).intValue()) {
                                int i4 = iF1 - 200;
                                if (i4 <= iF1) {
                                    while (true) {
                                        if (iF1 >= 0) {
                                            ArrayList arrayList4 = featuredGames.y;
                                            if (arrayList4 == null) {
                                                Intrinsics.n("allGamesWithCategory");
                                                throw null;
                                            }
                                            int size2 = iF1 % arrayList4.size();
                                            ArrayList arrayList5 = featuredGames.y;
                                            if (arrayList5 == null) {
                                                Intrinsics.n("allGamesWithCategory");
                                                throw null;
                                            }
                                            Pair pair2 = (Pair) CollectionsKt.V(size2, arrayList5);
                                            if (pair2 != null) {
                                                A a = pair2.a;
                                                if (size2 == 0) {
                                                    z2 = true;
                                                } else {
                                                    ArrayList arrayList6 = featuredGames.y;
                                                    if (arrayList6 == null) {
                                                        Intrinsics.n("allGamesWithCategory");
                                                        throw null;
                                                    }
                                                    int size3 = (size2 - 1) + arrayList6.size();
                                                    ArrayList arrayList7 = featuredGames.y;
                                                    if (arrayList7 == null) {
                                                        Intrinsics.n("allGamesWithCategory");
                                                        throw null;
                                                    }
                                                    Pair pair3 = (Pair) CollectionsKt.V(size3 % arrayList7.size(), arrayList6);
                                                    if (pair3 == null || ((Number) pair3.a).intValue() != ((Number) a).intValue()) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                }
                                                if (((Number) a).intValue() != num.intValue() || !z2) {
                                                }
                                            }
                                        }
                                        if (iF1 != i4) {
                                            iF1--;
                                        } else {
                                            iF1 = -1;
                                        }
                                    }
                                } else {
                                    iF1 = -1;
                                }
                            } else {
                                int i5 = iF1 + r.d.DEFAULT_DRAG_ANIMATION_DURATION;
                                if (iF1 <= i5) {
                                    while (true) {
                                        ArrayList arrayList8 = featuredGames.y;
                                        if (arrayList8 == null) {
                                            Intrinsics.n("allGamesWithCategory");
                                            throw null;
                                        }
                                        int size4 = iF1 % arrayList8.size();
                                        ArrayList arrayList9 = featuredGames.y;
                                        if (arrayList9 == null) {
                                            Intrinsics.n("allGamesWithCategory");
                                            throw null;
                                        }
                                        Pair pair4 = (Pair) CollectionsKt.V(size4, arrayList9);
                                        if (pair4 != null) {
                                            A a2 = pair4.a;
                                            if (size4 == 0) {
                                                z = true;
                                            } else {
                                                ArrayList arrayList10 = featuredGames.y;
                                                if (arrayList10 == null) {
                                                    Intrinsics.n("allGamesWithCategory");
                                                    throw null;
                                                }
                                                int size5 = (size4 - 1) + arrayList10.size();
                                                ArrayList arrayList11 = featuredGames.y;
                                                if (arrayList11 == null) {
                                                    Intrinsics.n("allGamesWithCategory");
                                                    throw null;
                                                }
                                                Pair pair5 = (Pair) CollectionsKt.V(size5 % arrayList11.size(), arrayList10);
                                                if (pair5 == null || ((Number) pair5.a).intValue() != ((Number) a2).intValue()) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                            }
                                            if (((Number) a2).intValue() != num.intValue() || !z) {
                                            }
                                        }
                                        if (iF1 != i5) {
                                            iF1++;
                                        } else {
                                            iF1 = -1;
                                        }
                                    }
                                } else {
                                    iF1 = -1;
                                }
                            }
                            if (iF1 == -1) {
                                ArrayList arrayList12 = featuredGames.y;
                                if (arrayList12 == null) {
                                    Intrinsics.n("allGamesWithCategory");
                                    throw null;
                                }
                                int size6 = arrayList12.size();
                                int i6 = 0;
                                int i7 = 0;
                                while (i7 < size6) {
                                    Object obj3 = arrayList12.get(i7);
                                    i7++;
                                    if (((Number) ((Pair) obj3).a).intValue() == num.intValue()) {
                                        i3 = i6;
                                        if (i3 < 0) {
                                            return Unit.a;
                                        }
                                        arrayList = featuredGames.y;
                                        if (arrayList != null) {
                                            Intrinsics.n("allGamesWithCategory");
                                            throw null;
                                        }
                                        iF1 = (1073741823 - (1073741823 % arrayList.size())) + i3;
                                    } else {
                                        i6++;
                                    }
                                }
                                if (i3 < 0) {
                                    return Unit.a;
                                }
                                arrayList = featuredGames.y;
                                if (arrayList != null) {
                                    Intrinsics.n("allGamesWithCategory");
                                    throw null;
                                }
                                iF1 = (1073741823 - (1073741823 % arrayList.size())) + i3;
                            }
                            featuredGames.z = true;
                            ieh iehVar = new ieh(featuredGames, featuredGames.getContext());
                            iehVar.a = iF1;
                            linearLayoutManager.S0(iehVar);
                            qch qchVar = featuredGames.f;
                            if (qchVar != null && (sswVar = qchVar.f) != null) {
                                sswVar.j(num);
                            }
                            return Unit.a;
                        }
                    }
                    return Unit.a;
                } catch (Exception unused) {
                    featuredGames.z = false;
                }
                break;
            default:
                kl00 kl00Var = (kl00) obj;
                kl00Var.getClass();
                ((Function2) obj2).invoke(kl00Var, Boolean.TRUE);
                return Unit.a;
        }
    }
}
