package com.example.controlgastos.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.PieChart
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.controlgastos.ui.theme.ControlGastosTheme

data class Gasto(val categoria: String, val monto: String, val icono: ImageVector)

private val gastosDemo = listOf(
    Gasto("Comida", "-\$120.00", Icons.Filled.Restaurant),
    Gasto("Transporte", "-\$45.00", Icons.Filled.DirectionsBus),
    Gasto("Ocio", "-\$200.00", Icons.Filled.Movie),
    Gasto("Servicios", "-\$350.00", Icons.Filled.Bolt)
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onLogout: () -> Unit) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Mis gastos") },
                actions = {
                    IconButton(onClick = onLogout) {
                        Icon(Icons.AutoMirrored.Filled.Logout, contentDescription = "Cerrar sesión")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* TODO: agregar gasto */ }) {
                Icon(Icons.Filled.Add, contentDescription = "Agregar gasto")
            }
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true, onClick = {},
                    icon = { Icon(Icons.Filled.Home, contentDescription = null) },
                    label = { Text("Inicio") }
                )
                NavigationBarItem(
                    selected = false, onClick = {},
                    icon = { Icon(Icons.AutoMirrored.Filled.List, contentDescription = null) },
                    label = { Text("Gastos") }
                )
                NavigationBarItem(
                    selected = false, onClick = {},
                    icon = { Icon(Icons.Filled.PieChart, contentDescription = null) },
                    label = { Text("Reportes") }
                )
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                ElevatedCard(
                    colors = CardDefaults.elevatedCardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(Modifier.padding(20.dp)) {
                        Text("Gastado en noviembre", style = MaterialTheme.typography.labelLarge)
                        Text("\$4,250.00", style = MaterialTheme.typography.displaySmall)
                    }
                }
                Spacer(Modifier.height(16.dp))
                Text("Recientes", style = MaterialTheme.typography.titleMedium)
            }
            items(gastosDemo) { g ->
                ListItem(
                    headlineContent = { Text(g.categoria) },
                    leadingContent = { Icon(g.icono, contentDescription = null) },
                    trailingContent = { Text(g.monto, style = MaterialTheme.typography.titleSmall) }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePreview() {
    ControlGastosTheme { HomeScreen(onLogout = {}) }
}
