package com.yandex.div.storage.templates;

import cs.h;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
interface TemplateHashIds {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h
    public static final class Collection implements TemplateHashIds {

        @l
        private final List<String> ids;

        private /* synthetic */ Collection(List list) {
            this.ids = list;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Collection m3361boximpl(List list) {
            return new Collection(list);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3363equalsimpl(List<String> list, Object obj) {
            return (obj instanceof Collection) && m0.g(list, ((Collection) obj).m3367unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3364equalsimpl0(List<String> list, List<String> list2) {
            return m0.g(list, list2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3365hashCodeimpl(List<String> list) {
            return list.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3366toStringimpl(List<String> list) {
            return "Collection(ids=" + list + ')';
        }

        public boolean equals(Object obj) {
            return m3363equalsimpl(this.ids, obj);
        }

        @l
        public final List<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return m3365hashCodeimpl(this.ids);
        }

        public String toString() {
            return m3366toStringimpl(this.ids);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ List m3367unboximpl() {
            return this.ids;
        }

        @l
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static List<String> m3362constructorimpl(@l List<String> list) {
            return list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h
    public static final class Single implements TemplateHashIds {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @l
        private final String f76744id;

        private /* synthetic */ Single(String str) {
            this.f76744id = str;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Single m3368boximpl(String str) {
            return new Single(str);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3370equalsimpl(String str, Object obj) {
            return (obj instanceof Single) && m0.g(str, ((Single) obj).m3374unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3371equalsimpl0(String str, String str2) {
            return m0.g(str, str2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3372hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3373toStringimpl(String str) {
            return "Single(id=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m3370equalsimpl(this.f76744id, obj);
        }

        @l
        public final String getId() {
            return this.f76744id;
        }

        public int hashCode() {
            return m3372hashCodeimpl(this.f76744id);
        }

        public String toString() {
            return m3373toStringimpl(this.f76744id);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m3374unboximpl() {
            return this.f76744id;
        }

        @l
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static String m3369constructorimpl(@l String str) {
            return str;
        }
    }
}
