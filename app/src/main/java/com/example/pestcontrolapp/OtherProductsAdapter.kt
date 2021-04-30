package com.example.pestcontrolapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.other_products.view.*

class OtherProductsAdapter(
    var products: List<OtherProducts>
) : RecyclerView.Adapter<OtherProductsAdapter.ProductsViewHolder>()
{
    inner class ProductsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.other_products,parent,false)
        return ProductsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        holder.itemView.apply {
            tvView.text = products[position].services
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}