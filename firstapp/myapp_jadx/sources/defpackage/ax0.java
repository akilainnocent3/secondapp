package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ax0 {
    public final ArrayList a = new ArrayList();

    public final ax0 a(w1h w1hVar, Object obj) {
        if (w1hVar != null && !w1hVar.getKey().isEmpty() && obj != null) {
            a2h type = w1hVar.getType();
            ArrayList arrayList = this.a;
            a2h a2hVar = a2h.w;
            if (type == a2hVar && (obj instanceof ruh0)) {
                ruh0 ruh0Var = (ruh0) obj;
                String key = w1hVar.getKey();
                switch (ruh0Var.getType().ordinal()) {
                    case 0:
                        a(syo.e(kyo.a(g21.a, key)), (String) ruh0Var.getValue());
                        return this;
                    case 1:
                        a(syo.e(kyo.a(g21.b, key)), (Boolean) ruh0Var.getValue());
                        return this;
                    case 2:
                        a(syo.e(kyo.a(g21.c, key)), (Long) ruh0Var.getValue());
                        return this;
                    case 3:
                        a(syo.e(kyo.a(g21.d, key)), (Double) ruh0Var.getValue());
                        return this;
                    case 4:
                        List list = (List) ruh0Var.getValue();
                        if (!list.isEmpty()) {
                            evh0 type2 = ((ruh0) list.get(0)).getType();
                            Iterator it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    switch (type2.ordinal()) {
                                        case 0:
                                            a2hVar = a2h.e;
                                            break;
                                        case 1:
                                            a2hVar = a2h.f;
                                            break;
                                        case 2:
                                            a2hVar = a2h.i;
                                            break;
                                        case 3:
                                            a2hVar = a2h.v;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            break;
                                        default:
                                            z9l.a(type2, "Unsupported element type: ");
                                            return null;
                                    }
                                }
                            } while (((ruh0) it.next()).getType() == type2);
                        }
                        switch (a2hVar.ordinal()) {
                            case 4:
                                ArrayList arrayList2 = new ArrayList(list.size());
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add((String) ((ruh0) it2.next()).getValue());
                                }
                                a(syo.e(kyo.a(g21.e, key)), arrayList2);
                                return this;
                            case 5:
                                ArrayList arrayList3 = new ArrayList(list.size());
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add((Boolean) ((ruh0) it3.next()).getValue());
                                }
                                a(syo.e(kyo.a(g21.f, key)), arrayList3);
                                return this;
                            case 6:
                                ArrayList arrayList4 = new ArrayList(list.size());
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    arrayList4.add((Long) ((ruh0) it4.next()).getValue());
                                }
                                a(syo.e(kyo.a(g21.i, key)), arrayList4);
                                return this;
                            case 7:
                                ArrayList arrayList5 = new ArrayList(list.size());
                                Iterator it5 = list.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.add((Double) ((ruh0) it5.next()).getValue());
                                }
                                a(syo.e(kyo.a(g21.v, key)), arrayList5);
                                return this;
                            case 8:
                                arrayList.add(w1hVar);
                                arrayList.add(ruh0Var);
                                return this;
                            case 9:
                                arrayList.add(w1hVar);
                                arrayList.add(ruh0Var);
                                return this;
                            default:
                                z9l.a(a2hVar, "Unexpected array attribute type: ");
                                return null;
                        }
                    case 5:
                    case 6:
                        arrayList.add(w1hVar);
                        arrayList.add(ruh0Var);
                        return this;
                }
            }
            arrayList.add(w1hVar);
            arrayList.add(obj);
        }
        return this;
    }
}
