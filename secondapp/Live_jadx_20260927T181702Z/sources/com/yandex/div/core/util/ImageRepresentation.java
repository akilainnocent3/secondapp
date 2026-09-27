package com.yandex.div.core.util;

import cs.h;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ImageRepresentation {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h
    public static final class Bitmap implements ImageRepresentation {

        @l
        private final android.graphics.Bitmap value;

        private /* synthetic */ Bitmap(android.graphics.Bitmap bitmap) {
            this.value = bitmap;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bitmap m3258boximpl(android.graphics.Bitmap bitmap) {
            return new Bitmap(bitmap);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3260equalsimpl(android.graphics.Bitmap bitmap, Object obj) {
            return (obj instanceof Bitmap) && m0.g(bitmap, ((Bitmap) obj).m3264unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3261equalsimpl0(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
            return m0.g(bitmap, bitmap2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3262hashCodeimpl(android.graphics.Bitmap bitmap) {
            return bitmap.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3263toStringimpl(android.graphics.Bitmap bitmap) {
            return "Bitmap(value=" + bitmap + ')';
        }

        public boolean equals(Object obj) {
            return m3260equalsimpl(this.value, obj);
        }

        @l
        public final android.graphics.Bitmap getValue() {
            return this.value;
        }

        public int hashCode() {
            return m3262hashCodeimpl(this.value);
        }

        public String toString() {
            return m3263toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.Bitmap m3264unboximpl() {
            return this.value;
        }

        @l
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.Bitmap m3259constructorimpl(@l android.graphics.Bitmap bitmap) {
            return bitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h
    public static final class PictureDrawable implements ImageRepresentation {

        @l
        private final android.graphics.drawable.PictureDrawable value;

        private /* synthetic */ PictureDrawable(android.graphics.drawable.PictureDrawable pictureDrawable) {
            this.value = pictureDrawable;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PictureDrawable m3265boximpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return new PictureDrawable(pictureDrawable);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3267equalsimpl(android.graphics.drawable.PictureDrawable pictureDrawable, Object obj) {
            return (obj instanceof PictureDrawable) && m0.g(pictureDrawable, ((PictureDrawable) obj).m3271unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3268equalsimpl0(android.graphics.drawable.PictureDrawable pictureDrawable, android.graphics.drawable.PictureDrawable pictureDrawable2) {
            return m0.g(pictureDrawable, pictureDrawable2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3269hashCodeimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3270toStringimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return "PictureDrawable(value=" + pictureDrawable + ')';
        }

        public boolean equals(Object obj) {
            return m3267equalsimpl(this.value, obj);
        }

        @l
        public final android.graphics.drawable.PictureDrawable getValue() {
            return this.value;
        }

        public int hashCode() {
            return m3269hashCodeimpl(this.value);
        }

        public String toString() {
            return m3270toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.drawable.PictureDrawable m3271unboximpl() {
            return this.value;
        }

        @l
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.drawable.PictureDrawable m3266constructorimpl(@l android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable;
        }
    }
}
