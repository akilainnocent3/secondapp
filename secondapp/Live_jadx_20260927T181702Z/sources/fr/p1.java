package fr;

import dr.w2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,671:1\n97#1,5:672\n112#1,5:677\n153#1,3:682\n144#1:685\n216#1:686\n217#1:688\n145#1:689\n216#1:690\n217#1:692\n1#2:687\n1#2:691\n1969#3,14:693\n1999#3,14:707\n2393#3,14:721\n2423#3,14:735\n1878#3,3:749\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n77#1:672,5\n90#1:677,5\n126#1:682,3\n136#1:685\n136#1:686\n136#1:688\n136#1:689\n144#1:690\n144#1:692\n136#1:687\n238#1:693,14\n256#1:707,14\n436#1:721,14\n454#1:735,14\n651#1:749,3\n*E\n"})
public class p1 extends o1 {
    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> Float A1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return (Map.Entry) r0.s4(map.entrySet(), comparator);
    }

    @cs.j(name = "minWithOrThrow")
    @dr.l1(version = "1.7")
    @ur.f
    public static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return (Map.Entry) r0.t4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@oy.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @oy.l
    @dr.l1(version = "1.1")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@oy.l M m10, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, w2> action) {
        kotlin.jvm.internal.m0.p(m10, "<this>");
        kotlin.jvm.internal.m0.p(action, "action");
        Iterator<Map.Entry<K, V>> it = m10.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return m10;
    }

    @oy.l
    @dr.l1(version = sc.k.f129877g)
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@oy.l M m10, @oy.l ds.p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, w2> action) {
        kotlin.jvm.internal.m0.p(m10, "<this>");
        kotlin.jvm.internal.m0.p(action, "action");
        Iterator<T> it = m10.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a0.c cVar = (Object) it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                h0.b0();
            }
            action.invoke(Integer.valueOf(i10), cVar);
            i10 = i11;
        }
        return m10;
    }

    @oy.l
    public static <K, V> List<dr.z0<K, V>> J1(@oy.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        if (map.size() == 0) {
            return h0.J();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return h0.J();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return g0.l(new dr.z0(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new dr.z0(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new dr.z0(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@oy.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @ur.f
    public static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.entrySet();
    }

    @oy.l
    public static <K, V> zu.m<Map.Entry<K, V>> T0(@oy.l Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return r0.E1(map.entrySet());
    }

    @ur.f
    public static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        return map.size();
    }

    public static final <K, V> int V0(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        int i10 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    @dr.l1(version = "1.5")
    @ur.f
    public static final <K, V, R> R W0(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @dr.l1(version = "1.5")
    @ur.f
    public static final <K, V, R> R X0(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @oy.l
    public static final <K, V, R> List<R> Y0(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "flatMapSequence")
    @dr.y0
    @oy.l
    public static final <K, V, R> List<R> Z0(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends zu.m<? extends R>> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            m0.t0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @dr.l1(version = sc.k.f129877g)
    @cs.j(name = "flatMapSequenceTo")
    @dr.y0
    @oy.l
    public static final <K, V, R, C extends Collection<? super R>> C a1(@oy.l Map<? extends K, ? extends V> map, @oy.l C destination, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends zu.m<? extends R>> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            m0.t0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @oy.l
    public static final <K, V, R, C extends Collection<? super R>> C b1(@oy.l Map<? extends K, ? extends V> map, @oy.l C destination, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            m0.s0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @ur.e
    public static final <K, V> void c1(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, w2> action) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(action, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @oy.l
    public static final <K, V, R> List<R> d1(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @oy.l
    public static final <K, V, R> List<R> e1(@oy.l Map<? extends K, ? extends V> map, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @oy.l
    public static final <K, V, R, C extends Collection<? super R>> C f1(@oy.l Map<? extends K, ? extends V> map, @oy.l C destination, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @oy.l
    public static final <K, V, R, C extends Collection<? super R>> C g1(@oy.l Map<? extends K, ? extends V> map, @oy.l C destination, @oy.l ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        kotlin.jvm.internal.m0.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @cs.j(name = "maxByOrThrow")
    @dr.l1(version = "1.7")
    @ur.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> double j1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> float k1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> Double n1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> Float o1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return (Map.Entry) r0.a4(map.entrySet(), comparator);
    }

    @cs.j(name = "maxWithOrThrow")
    @dr.l1(version = "1.7")
    @ur.f
    public static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        return (Map.Entry) r0.b4(map.entrySet(), comparator);
    }

    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @cs.j(name = "minByOrThrow")
    @dr.l1(version = "1.7")
    @ur.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> double v1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> float w1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dr.y0
    @dr.l1(version = sc.k.f129877g)
    @ur.f
    public static final <K, V> Double z1(Map<? extends K, ? extends V> map, ds.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }
}
