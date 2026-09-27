package com.bytedance.adsdk.hww.tq.hv;

import com.bytedance.adsdk.hww.tq.tq.hww.bs;
import com.bytedance.adsdk.hww.tq.tq.hww.ed;
import com.bytedance.adsdk.hww.tq.tq.hww.hu;
import com.bytedance.adsdk.hww.tq.tq.hww.hv;
import com.bytedance.adsdk.hww.tq.tq.hww.jpb;
import com.bytedance.adsdk.hww.tq.tq.hww.khx;
import com.bytedance.adsdk.hww.tq.tq.hww.mrs;
import com.bytedance.adsdk.hww.tq.tq.hww.ny;
import com.bytedance.adsdk.hww.tq.tq.hww.ok;
import com.bytedance.adsdk.hww.tq.tq.hww.rs;
import com.bytedance.adsdk.hww.tq.tq.hww.vhb;
import com.bytedance.adsdk.hww.tq.vy.sd;
import com.bytedance.adsdk.hww.tq.vy.vy;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq {

    /* JADX INFO: renamed from: com.bytedance.adsdk.hww.tq.hv.tq$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hww;

        static {
            int[] iArr = new int[sd.values().length];
            hww = iArr;
            try {
                iArr[sd.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hww[sd.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hww[sd.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hww[sd.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hww[sd.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hww[sd.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                hww[sd.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                hww[sd.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                hww[sd.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                hww[sd.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                hww[sd.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                hww[sd.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                hww[sd.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static com.bytedance.adsdk.hww.tq.tq.hww hww(List<com.bytedance.adsdk.hww.tq.tq.hww> list, String str, int i10) {
        sd(list, str, i10);
        Deque<com.bytedance.adsdk.hww.tq.tq.hww> dequeHww = hww(tq(list, str, i10));
        if (dequeHww.size() == 1) {
            return dequeHww.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void sd(List<com.bytedance.adsdk.hww.tq.tq.hww> list, String str, int i10) {
        Iterator<com.bytedance.adsdk.hww.tq.tq.hww> it = list.iterator();
        while (it.hasNext()) {
            if (vy.hww(it.next().hww())) {
                throw new IllegalArgumentException(str.substring(0, i10));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.hww.tq.tq.hww> tq(List<com.bytedance.adsdk.hww.tq.tq.hww> list, String str, int i10) {
        LinkedList<com.bytedance.adsdk.hww.tq.tq.hww> linkedList = new LinkedList(list);
        int i11 = 5;
        while (i11 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.hww.tq.tq.hww hwwVar : linkedList) {
                if (!linkedList2.isEmpty() && sd.hww(((com.bytedance.adsdk.hww.tq.tq.hww) linkedList2.peekLast()).hww()) && ((sd) ((com.bytedance.adsdk.hww.tq.tq.hww) linkedList2.peekLast()).hww()).tq() == i11) {
                    com.bytedance.adsdk.hww.tq.tq.hww hwwVar2 = (com.bytedance.adsdk.hww.tq.tq.hww) linkedList2.pollLast();
                    com.bytedance.adsdk.hww.tq.tq.hww hwwVar3 = (com.bytedance.adsdk.hww.tq.tq.hww) linkedList2.pollLast();
                    if (sd.hww(hwwVar3.hww()) || sd.hww(hwwVar.hww())) {
                        throw new IllegalArgumentException(str.substring(0, i10));
                    }
                    linkedList2.addLast(hww(hwwVar3, hwwVar2, hwwVar));
                } else {
                    linkedList2.addLast(hwwVar);
                }
            }
            i11--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.hww.tq.tq.hww> hww(Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.hww.tq.tq.hww hwwVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.hww.tq.tq.hww) linkedList.peekLast()).hww() == sd.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.hww.tq.tq.hww hwwVar2 = (com.bytedance.adsdk.hww.tq.tq.hww) linkedList.pollLast();
                if (((com.bytedance.adsdk.hww.tq.tq.hww) linkedList.pollLast()).hww() == sd.QUESTION) {
                    com.bytedance.adsdk.hww.tq.tq.hww hwwVar3 = (com.bytedance.adsdk.hww.tq.tq.hww) linkedList.pollLast();
                    mrs mrsVar = new mrs();
                    mrsVar.hww(hwwVar3);
                    mrsVar.tq(hwwVar2);
                    mrsVar.sd(hwwVar);
                    linkedList.addLast(mrsVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(hwwVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.hww.tq.tq.hww hww(com.bytedance.adsdk.hww.tq.tq.hww hwwVar, com.bytedance.adsdk.hww.tq.tq.hww hwwVar2, com.bytedance.adsdk.hww.tq.tq.hww hwwVar3) {
        bs vhbVar;
        switch (AnonymousClass1.hww[((sd) hwwVar2.hww()).ordinal()]) {
            case 1:
                vhbVar = new vhb();
                break;
            case 2:
                vhbVar = new jpb();
                break;
            case 3:
                vhbVar = new com.bytedance.adsdk.hww.tq.tq.hww.hww();
                break;
            case 4:
                vhbVar = new ed();
                break;
            case 5:
                vhbVar = new ny();
                break;
            case 6:
                vhbVar = new com.bytedance.adsdk.hww.tq.tq.hww.vy();
                break;
            case 7:
                vhbVar = new khx();
                break;
            case 8:
                vhbVar = new hu();
                break;
            case 9:
                vhbVar = new rs();
                break;
            case 10:
                vhbVar = new hv();
                break;
            case 11:
                vhbVar = new ok();
                break;
            case 12:
                vhbVar = new com.bytedance.adsdk.hww.tq.tq.hww.tq();
                break;
            case 13:
                vhbVar = new com.bytedance.adsdk.hww.tq.tq.hww.sd();
                break;
            default:
                throw new UnsupportedOperationException(hwwVar2.hww().toString());
        }
        vhbVar.hww(hwwVar);
        vhbVar.tq(hwwVar3);
        return vhbVar;
    }

    public static boolean hww(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
